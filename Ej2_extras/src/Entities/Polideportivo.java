
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
        double superficie;
        superficie = 2 * (largo * ancho) + 2 * (largo * altura) + 2 * (ancho * altura);
        System.out.println("La superficie del "+this.getClass().getSimpleName()+" es: "+superficie);
    }
    //Fórmula: Volumen = Largo x Ancho x Altura
    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = largo * ancho * altura;
        System.out.println("El volumen del "+this.getClass().getSimpleName()+" es: "+volumen);
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
