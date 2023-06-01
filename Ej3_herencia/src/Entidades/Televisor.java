package Entidades;

import Enumeraciones.Color;
import Enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor() {

    }

    public Televisor(int resolucion, boolean TDT, double precio, Color color, ConsumoEnergetico consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        resolucion = input.nextInt();
        System.out.println("Tiene TDT?(si/no)");
        String respuesta = input.next();
        TDT = respuesta.equalsIgnoreCase("si");
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (TDT) {
            precio += 500;
        }
        if (resolucion > 40) {
            precio += precio * 0.30;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + " " + super.toString();
    }

}
