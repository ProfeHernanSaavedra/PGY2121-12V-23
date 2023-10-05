
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Abarrote extends Producto{
    
    private int peso;

    public Abarrote() {
        super();
    }

    public Abarrote(int peso, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "peso=" + peso + '}' + " " +super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Peso: " + this.getPeso());
    }

    @Override
    public void comentarios(String comentario) {
        System.out.println("Comentario de Abarrote: " + comentario);
    }
    
    
    
    
    
}
