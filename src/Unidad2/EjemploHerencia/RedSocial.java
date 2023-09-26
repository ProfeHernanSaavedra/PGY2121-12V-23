
package Unidad2.EjemploHerencia;

/**
 *
 * @author 
 */
public class RedSocial {
    
    protected String usuario,password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "usuario=" + usuario +'}';//+ ", password=" + password + '}';
    }
    
    public String visualizar()
    {
        return this.getUsuario();
    }
    
}
