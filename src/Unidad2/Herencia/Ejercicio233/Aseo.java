package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author
 */
public class Aseo extends Producto {

    private boolean toxico;

    public Aseo() {
        super();
    }

    public Aseo(boolean toxico, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.toxico = toxico;
    }

    public boolean isToxico() {
        return toxico;
    }

    public void setToxico(boolean toxico) {
        this.toxico = toxico;
    }

    @Override
    public String toString() {
        return "Aseo{" + "toxico=" + toxico + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        String toxicoStr = "";

        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripcion: " + super.getDescripcion());
        if (toxico) {
            toxicoStr = "si";
        } else {
            toxicoStr = "no";
        }

        System.out.println("Es Toxico: " + toxicoStr);
    }

    @Override
    public void comentarios(String comentario) {
        System.out.println("Comentario de Aseo: " + comentario);
    }
    
}
