
package ejercicio132;

/**
 *
 * @author Profe Hernán
 * @version 29-08-2023
 */
public class Cliente {
    
    private int rut,telefono;
    private char dv;
    private String nombre,mail,direccion;

    public Cliente() {
    }

    public Cliente(int rut, int telefono, char dv, String nombre, String mail, String direccion) {
        this.rut = rut;
        this.telefono = telefono;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", telefono=" + telefono + ", dv=" + dv + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + '}';
    }
    
    
    
}
