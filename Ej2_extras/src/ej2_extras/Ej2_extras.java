package ej2_extras;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;

/**
 * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El
 * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
 * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
 * calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
 * volumen de cada edificio.
 *
 * Además de esto, para la clase Polideportivo nos interesa saber cuántos
 * polideportivos son techados y cuantos abiertos. Y para la clase
 * EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los
 * resultados de cada edificio de oficinas.
 *
 * @author facun
 */
public class Ej2_extras {

    public static void main(String[] args) {
        int conTecho = 0;
        int sinTecho = 0;
        ArrayList<Edificio> edificios = new ArrayList<>();
        Polideportivo poli1 = new Polideportivo("asd", true, 200, 40, 300);
        Polideportivo poli2 = new Polideportivo("asda", false, 100, 40, 400);
        EdificioDeOficinas ofi1 = new EdificioDeOficinas(10, 3, 3, 80, 35, 100);
        EdificioDeOficinas ofi2 = new EdificioDeOficinas(21, 3, 4, 80, 54, 150);
        edificios.add(ofi2);
        edificios.add(ofi1);
        edificios.add(poli1);
        edificios.add(poli2);

        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;

                if (poli.isTechado()) {
                    conTecho++;
                }else{
                    sinTecho++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas ediOfi = (EdificioDeOficinas) edificio;
                ediOfi.cantPersonas();
            }
        }
        
    }

}
