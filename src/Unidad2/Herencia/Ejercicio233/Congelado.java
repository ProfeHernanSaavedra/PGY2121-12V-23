
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Congelado extends Producto{
    
    private double grados;

    public Congelado() {
        super();
    }

    public Congelado(double grados, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "Congelado{" + "grados=" + grados + '}'+ " "+super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Grados bajo cero: " + this.getGrados());
    }
    
    @Override
    public void comentarios(String comentario) {
        System.out.println("Comentario de Congelado: " + comentario);
    }
    
}
