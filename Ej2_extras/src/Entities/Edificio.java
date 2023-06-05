package Entities;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: 
 * • Método calcularSuperficie(): calcula la superficie del edificio. 
 * • Método calcularVolumen(): calcula el volumen del edifico. 
 * Estos métodos serán abstractos
 *
 * @author facun
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();

    @Override
    public String toString() {
        return "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    
}
