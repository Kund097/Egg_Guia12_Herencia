package Services;

import Entities.Circulo;
import Entities.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class CalculoService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Circulo crearCirculo() {
        System.out.println("Ingrese radio");
        double radio = input.nextDouble();
        System.out.println("Ingrese diametro");
        double diametro = input.nextDouble();
        return new Circulo(radio, diametro);
    }

    public void calcularCirculo(Circulo nuevoCirculo) {
        System.out.println("Area del circulo: "+nuevoCirculo.calcularArea());
        System.out.println("Perimetro del circulo"+nuevoCirculo.calcularPerimetro());
    }

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese base");
        double base = input.nextDouble();
        System.out.println("Ingrese altura");
        double altura = input.nextDouble();
        return new Rectangulo(base, altura);
    }

    public void calcularRectangulo(Rectangulo nuevoRectangulo) {
        System.out.println("Area del rectangulo"+nuevoRectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo"+nuevoRectangulo.calcularPerimetro());
    }

    public void menu() {
        int op;
        do {
            
            System.out.println("--CALCULAR AREA Y PERIMETRO--"
                    + "\n1-Circulo"
                    + "\n2-Rectangulo"
                    + ""
                    + "");
            op = input.nextInt();
            switch (op) {
                case 1:
                    Circulo nuevoCirculo = crearCirculo();
                    calcularCirculo(nuevoCirculo);
                    break;
                case 2:
                    Rectangulo nuevoRectangulo = crearRectangulo();
                    calcularRectangulo(nuevoRectangulo);

                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (op != 0);

    }

}
