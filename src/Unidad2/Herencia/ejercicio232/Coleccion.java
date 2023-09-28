package Unidad2.Herencia.ejercicio232;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Coleccion {

    private ArrayList<Interes> listaIntereses;

    public Coleccion() {
        listaIntereses = new ArrayList<>();
    }

    public boolean agregarInteres(Interes interes) {
        return listaIntereses.add(interes);
    }

    public void listarIntereses() {
        for (Interes interes : listaIntereses) {
            System.out.println(interes);
        }
    }

    public void masLikes() {
        int mayor = 0;
        String mayorInteres = "";

        for (Interes interes : listaIntereses) {
            if (interes.getLike() > mayor ) {
                mayor = interes.getLike();
                mayorInteres = interes.getClass().getName();
            }
        }

        switch (mayorInteres) {
            case "Unidad2.Herencia.ejercicio232.Musica":
                System.out.print("El mayor interes es: Musica");
                break;
            case "Unidad2.Herencia.ejercicio232.Television":
                System.out.print("El mayor interes es: Television");
                break;
            case "Unidad2.Herencia.ejercicio232.RedSocial":
                System.out.print("El mayor interes es: Red Social");
                break;
           
        }

    }
    
    public void masTiempoConectado() {
        int mayor = 0;
        String mayorInteres = "";

        for (Interes interes : listaIntereses) {
            if (interes.getTiempoConectado() > mayor ) {
                mayor = interes.getTiempoConectado();
                mayorInteres = interes.getClass().getName();
            }
        }

        switch (mayorInteres) {
            case "Unidad2.Herencia.ejercicio232.Musica":
                System.out.println(" y El mayor tiempo de conexion de interes es: Musica");
                break;
            case "Unidad2.Herencia.ejercicio232.Television":
                System.out.println(" y El mayor tiempo de conexion de interes es: Television");
                break;
            case "Unidad2.Herencia.ejercicio232.RedSocial":
                System.out.println(" y El mayor tiempo de conexion de interes es: Red Social");
                break;
           
        }

    }

}
