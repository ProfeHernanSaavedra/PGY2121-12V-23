
package Unidad2.Herencia.ejercicio232;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Musica mus = new Musica("ROCK", "admin", "admin", 120, 1000);
        Television tv = new Television("SUSPENSO", "jmaureira", "teamo", 300, 20);
        RedSocial rs = new RedSocial("Instagram","letelier", "cotito", 450, 5);
        
        Coleccion col = new Coleccion();
        col.agregarInteres(mus);
        col.agregarInteres(tv);
        col.agregarInteres(rs);
        
        col.listarIntereses();
        
        col.masLikes();
        col.masTiempoConectado();
        
        
    }
    
}
