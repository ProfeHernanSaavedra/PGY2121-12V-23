
package Unidad2.EjercicioScootin;

import java.util.ArrayList;

/**
 *
 * @author Profe Hernán
 */
public class Empresa {
    
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }
    
    //agregar
    public boolean agregarEmpleado(Empleado emp)
    {
        return listaEmpleados.add(emp);
    }
    
    //buscar
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getRut().equals(rut)) { // empleado.getRut() != rut ---> !empleado.getRut().equals(rut)
                return true;
            }
        }
        return false;
    }
    
    //listar
    public void listaEmpleado()
    {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }
    
    public void eliminarEmpleado(String rut)
    {
        //fore+tab
        for (Empleado empleado : listaEmpleados) {
            if (this.buscarEmpleado(rut)) {
                listaEmpleados.remove(empleado);
                System.out.println("Empleado eliminado!");
            }
            else{
                System.out.println("Empleado no existe!");
            }
            
        }
        
        
    }
    
}
    
    
    
    

