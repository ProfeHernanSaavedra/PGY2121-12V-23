/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 22-08-2023
 */
public class Principal {
    //main + tab
    public static void main(String[] args) {
        
        //construir objetos
        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Suave", "Luis Miguel", 217, true, 'N');
        
        //asignar (mutar-cambiar) valores de la canción 1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        //cancion1.setFavorita(true);
        //si no asigno favorita, por defecto es false
        
        //metodos
        System.out.println(cancion1.getTitulo() + " se adelanto " + cancion1.adelantarCancion(10, 0) + " segundos" );
        System.out.println("**************");
        System.out.println(cancion1.obtenerTipoCancion());
        System.out.println("*************");
        cancion1.imprimirCancion();
        System.out.println("************");
        cancion2.imprimirCancion();
        System.out.println(cancion2);
        System.out.println(cancion1);
    }
    
}
