
package ej2_herencia;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author facun
 */
public class Ej2_herencia {

    public static void main(String[] args) {
        Electrodomestico nuevoElectrodomestico = new Electrodomestico();
        nuevoElectrodomestico.crearElectrodomestico();
        nuevoElectrodomestico.precioFinal();
        System.out.println(nuevoElectrodomestico);
        
        Lavadora nuevaLavadora = new Lavadora();
        nuevaLavadora.crearLavadora();
        nuevaLavadora.precioFinal();
      System.out.println(nuevaLavadora);
        
        Televisor nuevoTv = new Televisor();
        nuevoTv.crearTelevisor();
        nuevoTv.precioFinal();
        System.out.println(nuevoTv);
    }
    
}
