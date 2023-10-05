
package Unidad2.Herencia.Ejercicio233;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Producto> listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
    }
    
    public boolean agregarProducto(Producto prod)
    {
        return listaProductos.add(prod);
    }
    
    public void listarProductos()
    {
        int suma = 0;
        System.out.println("Codigo\t Precio\t Cantidad\t Total");
        for (Producto prod : listaProductos) {
            System.out.println(prod.getCodigo()+"\t"+prod.getPrecio()+"\t\t"+prod.getCantidad()+"\t"+prod.getCantidad()*prod.getPrecio());
            suma = suma + prod.getCantidad()* prod.getPrecio();
        }
        System.out.println("                              --------------------");
        System.out.println("                                 Tota: $" + suma);
    }
    
    public void listarOfertas()
    {
        String clase = "";
        int suma = 0; 
        for (Producto prod : listaProductos) {
//            clase = prod.getClass().getName(); 
//            System.out.println(clase);
            if (prod.getClass().getName().equalsIgnoreCase("Unidad2.Herencia.Ejercicio233.Oferta")) {
                suma = suma + prod.getPrecio()*prod.getCantidad();
            }
        }
        System.out.println("La suma de las ofertas es $" + suma);
    }
    
    
    
}
