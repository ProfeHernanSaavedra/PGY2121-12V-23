
package Unidad2.Herencia.ejercicio232;

/**
 *
 * @author 
 */
public class Television extends Interes implements ILike{
    
    private String generoTelevision;

    public Television() {
        super();
    }

    public Television(String generoTelevision, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.generoTelevision = generoTelevision;
    }

    public String getGeneroTelevision() {
        return generoTelevision;
    }

    public void setGeneroTelevision(String generoTelevision) {
        this.generoTelevision = generoTelevision;
    }

    @Override
    public String toString() {
        return "Television{" + "generoTelevision=" + generoTelevision + '}' + " "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Genero de TV: " + this.getGeneroTelevision());
    }

   @Override
    public void likes() {
        System.out.println("Likes: " + super.getLike());
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }
    
    
    
    
}
