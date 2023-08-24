/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionClases;

/**
 *
 * @author USRVI-LC7
 */
public class Conductor {
    
    private String nombre;
    private int rut,edad;
    private boolean casado;

    public Conductor() {
    }

    public Conductor(String nombre, int rut, int edad, boolean casado) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", casado=" + casado + '}';
    }
    
        
}
