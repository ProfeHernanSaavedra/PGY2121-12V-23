package Unidad2.EjercicioScootin;

/**
 *
 * @author Profe Hernán
 */
public class TestEmpresa {

    public static void main(String[] args) {

        Puesto puesto1 = new Puesto(1, "Programador Junior");
        Puesto puesto2 = new Puesto(2, "Programador Senior");

        Empleado empleado1 = new Empleado("1-1", "Armando Casas", 'M', 5, 28, puesto1);
        Empleado empleado2 = new Empleado("2-2", "Soy La", 'F', 10, 34, puesto2);

        Empresa empresa = new Empresa(); //aca se crea la lista

        if (empresa.buscarEmpleado(empleado1.getRut()) == false) {
            empresa.agregarEmpleado(empleado1);
            System.out.println("Empleado " + empleado1.getNombreEmpleado() + " agregado");
        } else {
            System.out.println("Empleado ya existe");
        }

//        if (empresa.buscarEmpleado(empleado1.getRut())== false) {
//            empresa.agregarEmpleado(empleado1);
//            System.out.println("Empleado "+ empleado1.getNombreEmpleado()+ " agregado");
//        }
//        else{
//            System.out.println("Empleado ya existe");
//        }
        if (empresa.buscarEmpleado(empleado2.getRut()) == false) {
            empresa.agregarEmpleado(empleado2);
            System.out.println("Empleado " + empleado2.getNombreEmpleado() + " agregado");
        } else {
            System.out.println("Empleado ya existe");
        }

        empresa.listaEmpleado();
        
        empresa.eliminarEmpleado(empleado1.getRut());
        empresa.listaEmpleado();

    }

}
