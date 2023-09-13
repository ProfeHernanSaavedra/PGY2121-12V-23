
package Unidad2.EjercicioScootin;

/**
 *
 * @author Profe Hernán
 */
public class Puesto {
    
    private int codigo;
    private String nombrePuesto;

    public Puesto() {
    }

    public Puesto(int codigo, String nombrePuesto) {
        this.codigo = codigo;
        this.nombrePuesto = nombrePuesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "codigo=" + codigo + ", nombrePuesto=" + nombrePuesto + '}';
    }
    
    
    
}
