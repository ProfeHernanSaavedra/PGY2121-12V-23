/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionClases;

/**
 *
 * @author USRVI-LC7
 */
public class ProbarColaboracion {
    
    public static void main(String[] args) {
         String casado = "";
        Conductor conductor1 = new Conductor("Jaime",2045658, 42, true);
        Auto auto1 = new Auto("gris","XCYY25", 2500, conductor1);
        
        if (auto1.getConductor().isCasado()) {
            casado = "si";
        }
        else
        {
            casado = "no";
        }
        
        System.out.println(auto1.getConductor().getNombre()+ " Es casado? "+ casado);
        
        
        
    }
    
}
