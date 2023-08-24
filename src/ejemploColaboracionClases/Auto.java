/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionClases;

/**
 *
 * @author USRVI-LC7
 */
public class Auto {
    
    private String color,patente;
    private int cilindrada;
    private Conductor conductor;
    

    public Auto() {
    }

    public Auto(String color, String patente, int cilindrada, Conductor conductor) {
        this.color = color;
        this.patente = patente;
        this.cilindrada = cilindrada;
        this.conductor = conductor;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", patente=" + patente + ", cilindrada=" + cilindrada + '}';
    }
    
    
    
    
}
