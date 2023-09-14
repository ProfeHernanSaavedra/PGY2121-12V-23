
package Unidad2.EjericicioStreaming;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Streaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Ya No", "Lucero", 217, true, 'N');

        //modificar atributos de la canción 1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        //sino se inicializa favorita asume el valor false 

        //métodos que retornan: se obtienen sus retornos
//        System.out.println(cancion1.getTitulo() + " " + cancion1.adelantarCancion(10, 0) + " segundos");
//        System.out.println("*********************************************");
//        System.out.println(cancion1.obtenerTipoCancion());
//        //método que no retorna: no se obtiene su retorno
//        cancion1.imprimirCanciones();
//        System.out.println("*********************************************");
//        cancion2.imprimirCanciones();

        Lista lista1 = new Lista(); //instancie la clase y al mismo tiempo cree una ArrayList
        Lista lista2 = new Lista();
        
        lista1.agregarCancion(cancion1);
        lista1.agregarCancion(cancion2);
        
        lista2.agregarCancion(cancion2);
        lista2.agregarCancion(cancion1);
        
        do {
            
            System.out.println("1. Lista 1");
            System.out.println("2. Lista 2");
            System.out.println("3. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    lista1.listarCanciones();
                    break;
                case 2:
                    lista2.listarCanciones();
                    break;
                
            }
            
        } while (opcion != 3);
        

    }

}
