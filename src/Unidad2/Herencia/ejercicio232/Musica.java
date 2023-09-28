
package Unidad2.Herencia.ejercicio232;

/**
 *
 * @author 
 */
public class Musica extends Interes implements ILike{
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica {" + "tipoMusica=" + tipoMusica + '}' + " " + super.toString();
    }
    
    public void listarMusica()
    {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tipo Musica:  " + this.getTipoMusica());
    }

    @Override
    public void likes() {
        System.out.println("Likes: " + super.getLike());
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }
    
    
    
    
}
