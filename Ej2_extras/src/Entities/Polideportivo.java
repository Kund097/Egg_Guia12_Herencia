
package Entities;

/**
 *
 * @author facun
 */
public class Polideportivo extends Edificio{

    private String nombre;
    private boolean techado;
    
    @Override
    public void calcularSuperficie() {
    }

    @Override
    public void calcularVolumen() {
    }

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado +" "+super.toString();
    }
    
    
    
}
