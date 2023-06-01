
package Entidades;

import Enumeraciones.Color;
import Enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

/**
 * 
 * @author facun
 */

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, Color color, ConsumoEnergetico consumo, int peso,int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        carga = input.nextInt();        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga +" "+ super.toString();
    }
    
}
