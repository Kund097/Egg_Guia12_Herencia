package Entities;


/**
 *
 * @author facun
 */
public class Yate extends Barco {

    private double CV;
    private int camarotes;

    public Yate() {
    }

    public Yate(double CV, int camarotes) {
        this.CV = CV;
        this.camarotes = camarotes;
    }

    public double getCV() {
        return CV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "CV=" + CV + ", camarotes=" + camarotes +" "+super.toString();
    }

}
