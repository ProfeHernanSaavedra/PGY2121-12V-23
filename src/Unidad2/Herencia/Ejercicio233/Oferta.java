
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Oferta extends Producto{
    
    private double descuento;

    public Oferta() {
        super();
    }

    public Oferta(double descuento, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Oferta{" + "descuento=" + descuento + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Descuento: " + this.getDescuento());
    }
    
    @Override
    public void comentarios(String comentario) {
        double ivaPrecio = super.getPrecio() * IComentario.IVA;
        System.out.println("El iva del precio: " + super.getPrecio()+ " es: $"+ ivaPrecio);
        System.out.println("Comentario de Oferta: " + comentario);
        
    }
    
    
    
    
    
    
    
}
