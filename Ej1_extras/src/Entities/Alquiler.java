package Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de
 * alquiler, fecha de devolución, la posición del amarre y el barco que lo
 * ocupará.
 *
 * @author facun
 */
public class Alquiler {

    private String nombre;
    private String DNI;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String nombre, String DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    /**
     * Un alquiler se calcula multiplicando el número de días de ocupación
     * (calculado con la fecha de alquiler y devolución), por un valor módulo de
     * cada barco (obtenido simplemente multiplicando por 10 los metros de
     * eslora).
     *
     * En los barcos de tipo especial el módulo de cada barco se calcula sacando
     * el módulo normal y sumándole el atributo particular de cada barco. En los
     * veleros se suma el número de mástiles, en los barcos a motor se le suma
     * la potencia en CV y en los yates se suma la potencia en CV y el número de
     * camarotes.
     */
    
    public void calcularPrecioAlquiler(){
        
        long diasOcupacion = fechaAlquiler.until(fechaDevolucion, ChronoUnit.DAYS);
        
        precio = diasOcupacion * (barco.eslora*10);
        
        if (barco instanceof Velero) {
            Velero velero = (Velero) barco;      
            precio += velero.getNumeroMastiles();
        }else if(barco instanceof Motorizado) {
            Motorizado motor = (Motorizado) barco;
            precio += motor.getCV();
        }else if (barco instanceof Yate) {
            Yate yate = (Yate) barco;
            precio += yate.getCamarotes()+yate.getCV();
        }
        
    }
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco +" precio :"+precio;
    }

}
