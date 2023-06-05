package Entities;

/**
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 * @author facun
 */
public class EdificioDeOficinas extends Edificio {

    private int numerosDeOficinas;
    private int cantidadPersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numerosDeOficinas, int cantidadPersonasPorOficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numerosDeOficinas = numerosDeOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumerosDeOficinas() {
        return numerosDeOficinas;
    }

    public int getCantidadPersonasPorOficina() {
        return cantidadPersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumerosDeOficinas(int numerosDeOficinas) {
        this.numerosDeOficinas = numerosDeOficinas;
    }

    public void setCantidadPersonasPorOficina(int cantidadPersonasPorOficina) {
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public void calcularSuperficie() {
        double superficie;
        superficie = 2 * (largo * ancho) + 2 * (largo * altura) + 2 * (ancho * altura);
        System.out.println("La superficie del " + this.getClass().getSimpleName() + " es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = largo * ancho * altura;
        System.out.println("El volumen del " + this.getClass().getSimpleName() + " es: " + volumen);
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numerosDeOficinas=" + numerosDeOficinas + ", cantidadPersonasPorOficina=" + cantidadPersonasPorOficina + ", numeroDePisos=" + numeroDePisos + " " + super.toString();
    }

    /**
     * método cantPersonas(), que muestre cuantas personas entrarían en un piso
     * y cuantas en todo el edificio.
     */
    public void cantPersonas() {
        final int PERSONAS_POR_PISO;
        final int PERSONAS_EDIFICIO;
        PERSONAS_POR_PISO = getCantidadPersonasPorOficina() * getNumerosDeOficinas();
        PERSONAS_EDIFICIO = PERSONAS_POR_PISO * getNumeroDePisos();
        System.out.println("Cantidad de personas por piso: " + PERSONAS_POR_PISO + ""
                + "\nCantidad de personas que entrarian en el edifico: " + PERSONAS_EDIFICIO);
    }
}
