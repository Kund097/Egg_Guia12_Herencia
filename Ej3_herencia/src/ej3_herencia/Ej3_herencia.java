package ej3_herencia;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ElectrodomesticosService;
import java.util.ArrayList;

/**
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 * televisores, con valores ya asignados. Luego, recorrer este array y ejecutar
 * el método precioFinal() en cada electrodoméstico. Se deberá también mostrar
 * el precio de cada tipo de objeto, es decir, el precio de todos los
 * televisores y el de las lavadoras. Una vez hecho eso, también deberemos
 * mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
 * tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
 * resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
 * lavadora y 5000 para televisor.
 *
 * @author facun
 */
public class Ej3_herencia {

    public static void main(String[] args) {
        ElectrodomesticosService service = new ElectrodomesticosService();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        Electrodomestico lavadora1 = new Lavadora();
        Electrodomestico lavadora2 = new Lavadora();
        Electrodomestico televisor1 = new Televisor();
        Electrodomestico televisor2 = new Televisor();
        
        service.crearLavadora((Lavadora) lavadora1);
        service.crearLavadora((Lavadora) lavadora2);
        service.crearTelevisor((Televisor) televisor1);
        service.crearTelevisor((Televisor) televisor2);
        
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        service.mostrarLista(electrodomesticos);
        service.totalVentas(electrodomesticos);
        
    }

    
}
