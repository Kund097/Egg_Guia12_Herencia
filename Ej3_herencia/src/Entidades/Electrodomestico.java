package Entidades;

import Enumeraciones.Color;
import Enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

/**
 * 2. Crear una superclase llamada Electrodoméstico con los siguientes
 * atributos: precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes:
 *
 *
 * @author facun
 */
public class Electrodomestico {

    /**
     * Atributos
     */
    protected double precio;
    protected Color color;
    protected ConsumoEnergetico consumo;
    protected int peso;

    /**
     * Constructores
     */
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, ConsumoEnergetico consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    /**
     * Getters y Setters
     */
    public double getPrecio() {
        return precio;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setConsumo(ConsumoEnergetico consumo) {
        this.consumo = consumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    /**
     * ----------------Metodos------------------
     */
    /**
     * * • Método comprobarConsumoEnergetico(char letra): comprueba que la
     * letra es correcta, sino es correcta usara la letra F por defecto. Este
     * método se debe invocar al crear el objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letraActual) {
        letraActual = Character.toUpperCase(letraActual);
        for (ConsumoEnergetico letra : ConsumoEnergetico.values()) {
            if (letra.toString().charAt(0) == letraActual) {
                consumo = letra;
                return;
            }
        }

        consumo = ConsumoEnergetico.F;

    }

    /**
     *  * • Método comprobarColor(String color): comprueba que el color es
     * correcto, y si no lo es, usa el color blanco por defecto. Los colores
     * disponibles para los electrodomésticos son blanco, negro, rojo, azul y
     * gris. No importa si el nombre está en mayúsculas o en minúsculas. Este
     * método se invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(String colorActual) {

        for (Color elemento : Color.values()) {
            if (elemento.toString().equalsIgnoreCase(colorActual)) {
                color = elemento;
                return;
            }
        }

        color = Color.BLANCO;
    }

    /**
     *  * • Metodo crearElectrodomestico(): le pide la información al usuario y
     * llena el electrodoméstico, también llama los métodos para comprobar el
     * color y el consumo. Al precio se le da un valor base de $1000. *
     */
    public void crearElectrodomestico() {
        String colorActual;
        char consumoActual;
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el color del/la " + this.getClass().getSimpleName());
        colorActual = input.next();
        comprobarColor(colorActual);
        System.out.println("Ingrese consumo del/la " + this.getClass().getSimpleName());
        consumoActual = input.next().charAt(0);
        comprobarConsumoEnergetico(consumoActual);
        System.out.println("Ingrese el peso del/la " + this.getClass().getSimpleName());
        peso = input.nextInt();
        precio = 1000;
    }

    /**
     * • Método precioFinal(): según el consumo energético y su tamaño,
     * aumentará el valor del precio. Esta es la lista de precios:
     */
    public void precioFinal() {
        switch (consumo.toString()) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
        }

        if (peso >= 80) {
            precio += 1000;
        }

        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }

        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }
    }
}
