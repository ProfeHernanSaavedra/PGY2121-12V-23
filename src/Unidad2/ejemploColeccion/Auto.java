
package Unidad2.ejemploColeccion;

/**
 *
 * @author Profe Hernan
 */
public class Auto {
    
    private String marca,modelo;
    private int anno;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + '}';
    }
    
    
    
}
