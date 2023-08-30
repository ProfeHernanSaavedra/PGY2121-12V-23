package ejercicio132;

import java.util.Date;

/**
 *
 * @author USRVI-LC4
 */
public class Valida {

    public Valida() {
    }
    
    public boolean validarNumeroPositivo(int valor)
    {
        if (valor >0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarLargo4(int valor)
    {
        if (valor >= 1000 && valor <= 9999) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarLargo8(int valor)
    {
        if (valor >= 10000000 && valor <= 99999999) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarSubcategoria(String subcategoria)
    {
        if (subcategoria.equalsIgnoreCase("FRUTA") || subcategoria.equalsIgnoreCase("VERDURA")) {
            return true;
            
        } else {
            return false;
        }
    }
    
    public boolean validarCorreo(String correo)
    {
        if (correo.length() >=6) {
            return true;
        } else {
            return false;
        }
    }
    
     //validar rut
    public boolean validarRut(int rut, char dv) {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;

        }
        return Character.toUpperCase(dv) == (char) (s != 0 ? s + 47 : 75);
    }
    
    public boolean validarFecha(Date fechaSolicitud)
    {
        Date fecha = new Date();
        if (fechaSolicitud.compareTo(fecha) <= 0 ) {
            return true;
        } else {
            return false;
        }
        
    }
}
