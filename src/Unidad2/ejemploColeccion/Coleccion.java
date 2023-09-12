
package Unidad2.ejemploColeccion;

import java.util.ArrayList;

/**
 *
 * @author Profe Hernan
 * 
 */
public class Coleccion {
    
    public static void main(String[] args) {
        
        //declarar el ArrayList
        //List<String> listas = new ArrayList<>();
        ArrayList<String> listas = new ArrayList<>();
        
        listas.add("Juan");
        listas.add("Pedro");
        listas.add("Maria");
        
        System.out.println(listas);
        
        //fore + tab
        for (String dato : listas) {
            System.out.println(dato);
        }
        
    }
    
}
