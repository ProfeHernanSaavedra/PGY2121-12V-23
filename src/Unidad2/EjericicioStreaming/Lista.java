
package Unidad2.EjericicioStreaming;

import java.util.ArrayList;

/**
 *
 * @author Profe Hernán
 */
public class Lista {
    
    
    private ArrayList<Cancion> listaCanciones;

    public Lista() {
        listaCanciones = new ArrayList<>();
    }
    
    public boolean agregarCancion(Cancion can)
    {
        return listaCanciones.add(can);
    }
    
    public void listarCanciones()
    {
        for (Cancion cancion : listaCanciones) {
            //System.out.println(cancion); //aca estoy llamando al toString(), metodo en clase cancion
            System.out.println(cancion.getTitulo() + " de " + cancion.getArtista());
        }
    }
    
    
    
    
    
}
