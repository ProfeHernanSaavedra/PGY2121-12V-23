/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosCiclosCondiciones;

import java.util.Scanner;

/**
 *
 * @author Profe Hernan
 * @version 23-08-23
 */
public class Condiciones {
    
    public static void main(String[] args) {
        int dia = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero del dia de la semana: ");
        dia = leer.nextInt();
        
        //sw+tab
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No coincide");
        }
        
        System.out.println("Fin");   
    }
    
}
