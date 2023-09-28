
package Unidad2.Herencia.ejercicio232;

/**
 *
 * @author 
 */
public class RedSocial extends Interes implements ILike{
    
    private String nombreRedSocial;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRedSocial, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRedSocial=" + nombreRedSocial + '}' + " "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Red Social: " + this.getNombreRedSocial());
    }

    @Override
    public void likes() {
        System.out.println("Likes: " + super.getLike());
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }
    
    
}
