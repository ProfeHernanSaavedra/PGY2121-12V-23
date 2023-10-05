
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Liquido extends Producto{
    
    private double gradoAlc;

    public Liquido() {
        super();
    }

    public Liquido(double gradoAlc, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradoAlc = gradoAlc;
    }

    public double getGradoAlc() {
        return gradoAlc;
    }

    public void setGradoAlc(double gradoAlc) {
        this.gradoAlc = gradoAlc;
    }

    @Override
    public String toString() {
        return "Liquido{" + "gradoAlc=" + gradoAlc + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Grados Alcohol: " + this.getGradoAlc());
    }

   @Override
    public void comentarios(String comentario) {
        System.out.println("Comentario de Liquido: " + comentario);
    }
    
    
    
}
