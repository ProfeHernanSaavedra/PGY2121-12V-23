
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Abarrote aceite = new Abarrote(1, 1, 5000, 2, "el va al jumbo");
        Aseo ariel = new Aseo(true, 2, 100, 2, "entero cochinos");
        Congelado camaron = new Congelado(-2, 3, 3500, 2, "el cuico");
        Liquido corona = new Liquido(7, 4,12000, 18,"entera rica");
        Oferta hugommm = new Oferta(10,5, 1000, 2,"master");
        Oferta jaimemmm = new Oferta(1,6, 10, 3,"UDS");
        
        Coleccion col = new Coleccion();
        col.agregarProducto(aceite);
        col.agregarProducto(ariel);
        col.agregarProducto(camaron);
        col.agregarProducto(corona);
        col.agregarProducto(hugommm);
        col.agregarProducto(jaimemmm);
        
        col.listarOfertas();
        System.out.println("******");
        col.listarProductos();
        
        aceite.comentarios("de oliva");
        hugommm.comentarios("mmmm");
        
        
    }
    
}
