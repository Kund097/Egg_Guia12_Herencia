package Entities;

/**
 *
 * @author facun
 */
public class Motorizado extends Barco {

    private double CV;

    public Motorizado() {
    }

    public Motorizado(double CV) {
        this.CV = CV;
    }

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "CV=" + CV +" "+super.toString();
    }

}
