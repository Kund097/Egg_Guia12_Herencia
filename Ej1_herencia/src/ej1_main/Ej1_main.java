
package ej1_main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author facun
 */
public class Ej1_main {

    
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        Animal caballo1 = new Caballo(30, "Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
    
}
