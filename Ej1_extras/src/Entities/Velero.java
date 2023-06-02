package Entities;


/**
 *
 * @author facun
 */
public class Velero extends Barco {

    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles +" "+ super.toString();
    }

}
