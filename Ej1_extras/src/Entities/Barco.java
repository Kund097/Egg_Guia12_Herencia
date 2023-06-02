package Entities;

import java.time.LocalDate;

/**
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación.
 *
 * @author facun
 */
public class Barco {

    protected String matricula;
    protected double eslora;
    protected LocalDate anioFabricacion;

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }

}
