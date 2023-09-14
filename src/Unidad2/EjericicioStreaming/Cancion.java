
package Unidad2.EjericicioStreaming;

/**
 *
 * @author
 */
public class Cancion {

    //es una buena práctica realizar comentarios de los atributos y sus posibles valores
    private String titulo, artista;
    private int tiempoDuracion; // en segundos
    private boolean favorita; // true:favorita, false:no es favorita
    private char descargada; // 'S':si, 'N':no

    //constructores sin y con parámetros
    public Cancion() {
    }

    public Cancion(String titulo, String artista, int tiempoDuracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    //accesadores y mutadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }

    //customer
    public int adelantarCancion(int segundosAdd, int segundosActuales) {
        segundosActuales = segundosActuales + segundosAdd;
        return segundosActuales;
    }

    public void imprimirCanciones() {
        //las variables locales se deben inicializar para que compile el programa
        int minutos = 0, segundos = 0;

        minutos = this.tiempoDuracion / 60;
        segundos = this.tiempoDuracion - minutos * 60;

        System.out.println("Canción: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + minutos + ":" + segundos);
    }

    public String obtenerTipoCancion() {
        //5 minutos * 60 segundos
        if (this.tiempoDuracion >= 300) {
            return "larga";
        } else {
            return "normal";
        }
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", tiempoDuracion=" + tiempoDuracion + ", favorita=" + favorita + ", descargada=" + descargada + '}';
    }
    
    
}
