
package ejercicio132;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Profe Hernán
 * @version 29-08-2023
 */
public class Solicitud {
    
    private int numero,total;
    private Date fecha;
    private Cliente cliente;
    private String productos="";

    public Solicitud() {
    }

    public Solicitud(int numero, int total, Date fecha, Cliente cliente) {
        this.numero = numero;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "numero=" + numero + ", total=" + total + ", fecha=" + fecha + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    
    //agregar prodcutos a la solicitud
    public void agregarProductos(Producto producto)
    {
        String unidadMedida = "";
        
        if (producto.getMedida() == 'U') 
        {
            unidadMedida = "unidades";
        } else 
        {
            unidadMedida = "gramos";
        }
        this.total = this.total + producto.getPrecio(); //acumulador
        this.productos = this.productos + producto.getDescripcion()+
                " "+producto.getCantidad()+" "+unidadMedida+"$"+
                producto.getPrecio()+";\n";
        
    }
    
    public void verSolicitud()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Solicitud: " + this.numero);
        System.out.println("***************************");
        System.out.println("Cliente: " + this.getCliente().getNombre());
        System.out.println("Fecha: " + formato.format(fecha));
        System.out.println(productos);
        System.out.println("***************************");
        System.out.println("Total: $"+this.total);
        System.out.println("");
    }
    
    //descontar
    public int descontar(int porcentaje)
    {
        int descuento = this.total * porcentaje /100;
        return descuento;
    }
    
    public int obtenerNumeroSolicitud()
    {
        this.numero = this.numero + 1; // return this.numero++
        return this.numero;
    }
    
}
