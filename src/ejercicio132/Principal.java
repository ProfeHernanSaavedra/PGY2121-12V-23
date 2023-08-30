
package ejercicio132;

import java.util.Scanner;

/**
 *
 * @author profeh hernan
 * @version 29-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion; //menu
        boolean flag; //validaciones
        //cliente
        int rut,telefono;
         String nombre,mail,direccion;
         char dv;
         //producto
         int codigo,precio,cantidad,totalProductos;
         String subcategoria,descripcion;
         char medida;
         //solicitud
         int numero;
         String fecha;
         int porcentaje;
         int descuento;
         
         Valida valida = new Valida();
         Cliente cliente = new Cliente();
         Solicitud sol = new Solicitud();
         
         do {
             System.out.println("*****MENU******");
             System.out.println("1. Ingresar Cliente");
             System.out.println("2. Ingresar Solicitud y sus Productos");
             System.out.println("3. Aplicar descuento");
             System.out.println("4. Salir (Ver Solicitud)");
             opcion = leer.nextInt();
             
             switch (opcion) {
                 case 1:
                     do {
                         System.out.println("Ingrese rut");
                         rut = leer.nextInt();
                         System.out.println("Ingrese DV");
                         dv = leer.next().charAt(0);
                         flag = valida.validarRut(rut, dv);
                         if (flag == false) {
                             System.out.println("Ingrese rut valido");
                         }                         
                     } while (flag == false);
                     
                     System.out.println("Ingrese nombre");
                     nombre = leer.next();
                     
                     do {
                         System.out.println("Ingerse telefono");
                         telefono = leer.nextInt();
                         flag = valida.validarLargo8(telefono);
                         if (flag == false) {
                             System.out.println("Telefono invalido (largo 8)");
                         }
                     } while (flag == false);
                     
                     do {
                         System.out.println("Ingrese correo");
                         mail = leer.next();
                         flag = valida.validarCorreo(mail);
                         if (flag == false) {
                             System.out.println("correo invalido (largo 6)");
                         }
                     } while (flag==false);
                     
                     System.out.println("Ingrese Direccion");
                     direccion = leer.next();
                     
                     //guardar datos
                     cliente.setRut(rut);
                     cliente.setNombre(nombre);
                     cliente.setDv(dv);
                     cliente.setTelefono(telefono);
                     cliente.setMail(mail);
                     cliente.setDireccion(direccion);
                     
                     System.out.println("****CLIENTE GUARDADO****");
                     System.out.println(cliente);
                     break;
             
                    
             }
             
             
             
        } while (opcion != 4);
        
        
        
    }
    
}
