package Entities;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 altura y largo. La clase edificio tendrá como métodos: 
 * • Método calcularSuperficie(): calcula la superficie del edificio. 
 * • Método calcularVolumen(): calcula el volumen del edifico. 
 * Estos métodos serán abstractos
 *
 * @author facun
 */
public abstract class Edificio {
    protected double ancho;
    protected double altura;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.altura = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();

    @Override
    public String toString() {
        return "ancho=" + ancho + ", alto=" + altura + ", largo=" + largo + '}';
    }
    
    
}
