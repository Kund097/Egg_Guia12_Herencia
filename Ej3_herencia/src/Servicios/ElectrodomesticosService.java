
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;


public class ElectrodomesticosService {

    public ElectrodomesticosService() {
    }
    
    public void crearLavadora(Lavadora nuevaLavadora) {
        nuevaLavadora.crearLavadora();
        nuevaLavadora.precioFinal();
    }
    
    public void crearTelevisor(Televisor nuevoTv) {
        nuevoTv.crearTelevisor();
        nuevoTv.precioFinal();
    }
    public void mostrarLista(ArrayList<Electrodomestico> lista) {
        
        for (Electrodomestico electrodomestico : lista) {
            System.out.println(electrodomestico);
        }
        
    }
    public void totalVentas(ArrayList<Electrodomestico> lista) {
        double total = 0;
        for (Electrodomestico electrodomestico : lista) {
            total += electrodomestico.getPrecio();
        }
        System.out.println("Precio total "+total);
    }
    
}
