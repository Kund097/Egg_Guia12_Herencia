
package Entities;

/**
 ** Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. 
 * @author facun
 */
public class Circulo implements CalculosFormas{
    private double radio;
    private double diametro;

    @Override
    public double calcularArea() {
        return PI * radio * 2;
    }


    @Override
    public double calcularPerimetro() {
        return PI * diametro;
    }

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    
    
}
