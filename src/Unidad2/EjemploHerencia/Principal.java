
package Unidad2.EjemploHerencia;

import java.util.Date;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //Date fecha = new Date();
       // RedSocial rs = new RedSocial();
        Instagram insta = new Instagram(100, "la mejor clase", true, "admin", "admin");
//        Twitter twit = new Twitter(200, "balacera en bellavista", fecha, usuario, password);
        Twitter twit = new Twitter(200, "balacera en bellavista", new Date(), "adm", "1234");
        
        System.out.println("******************");
        System.out.println(insta.toString());
        insta.listarInstagram();
        System.out.println(twit.toString());
        System.out.println("******************");
        System.out.println(insta.visualizar());
        System.out.println(twit.visualizar());
        
    }
    
    
}
