
package ej1_extras;

import Entities.Alquiler;
import Services.AlquilerService;
import java.util.ArrayList;

/**
 *
 * @author facun
 */
public class Ej1_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Alquiler> amarres = new ArrayList<>();
        AlquilerService service = new AlquilerService();
        service.menu(amarres);
        
        
    }
    
}
