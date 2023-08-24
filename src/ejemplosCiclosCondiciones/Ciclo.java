/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosCiclosCondiciones;

import java.util.Scanner;

/**
 *
 * @author USRVI-LC7
 */
public class Ciclo {

    private Scanner leer;
    private int opcion;

    public Ciclo() {

        leer = new Scanner(System.in);
    }

 
    public void mientras() {

        //wh+tab
        while (opcion != 4) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 2");
            System.out.println("4. Salir");
            System.out.println("Ingrese opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lo que se haga en la opcion 1");
                    break;
                case 2:
                    System.out.println("Lo que se haga en la opcion 2");
                    break;
                case 3:
                    System.out.println("Lo que se haga en la opcion 3");
                    break;
                default:
                    System.out.println("");
            }

        }

    }

    public void repetir() {
        //do + tab
        do {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 2");
            System.out.println("4. Salir");
            System.out.println("Ingrese opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lo que se haga en la opcion 1");
                    break;
                case 2:
                    System.out.println("Lo que se haga en la opcion 2");
                    break;
                case 3:
                    System.out.println("Lo que se haga en la opcion 3");
                    break;
                default:
                    System.out.println("");
            }
        } while (opcion != 4);

    }
    
    public void para()
    {
        //for + tab
        System.out.println("Donde termina?: ");
        int fin = leer.nextInt();
        for (int i = 0; i < fin; i++) {
            System.out.println("hola");
        }
        
    }

}
