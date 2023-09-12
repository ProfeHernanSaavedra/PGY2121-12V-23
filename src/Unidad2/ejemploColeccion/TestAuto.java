
package Unidad2.ejemploColeccion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USRVI-LC4
 */
public class TestAuto {
    
    public static void main(String[] args) {
        ArrayList<Auto> listaAutos = new ArrayList<>();
       
        Auto auto1 = new Auto("MAZDA", "3", 2006);
        Auto auto2 = new Auto("KIA", "MORNING", 2023);
        Auto auto3 = new Auto("MERCEDES", "A200", 2020);
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        
        System.out.println(listaAutos);
        
        for (Auto auto : listaAutos) {
            System.out.println(auto);
        }
        
        System.out.println("MODELOS:");
        for (Auto auto : listaAutos) {
            System.out.println(auto.getModelo());
        }

        
        
        
        
    }
    
    
    
}
