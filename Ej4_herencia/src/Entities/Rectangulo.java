
package Entities;

/**
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 * @author facun
 */
public class Rectangulo implements CalculosFormas{

    private double base;
    private double altura;
    
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public static double getPI() {
        return PI;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
      
}
