package Services;

import Entities.Alquiler;
import Entities.Barco;
import Entities.Motorizado;
import Entities.Velero;
import Entities.Yate;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class AlquilerService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void precioFinal(ArrayList<Alquiler> amarres) {

        for (Alquiler amarre : amarres) {
            amarre.calcularPrecioAlquiler();
        }

    }

    public void crearNuevoAlquiler(ArrayList<Alquiler> amarres) {

        String nombre = "Facundo";
        String DNI = "6556415";
        LocalDate fechaAlquiler = LocalDate.now();
        LocalDate fechaDevolucion = LocalDate.of(2023, Month.AUGUST, 2);
        Barco barco = agregarBarco();
        Alquiler nuevoAlquiler = new Alquiler(nombre, DNI, fechaAlquiler, fechaDevolucion, 0, barco);
        amarres.add(nuevoAlquiler);
        nuevoAlquiler.setPosicionAmarre(amarres.size() - 1);
    }

    public Barco agregarBarco() {
        Barco nuevoBarco = new Barco();
        nuevoBarco.setMatricula("ABC123");
        nuevoBarco.setAnioFabricacion(LocalDate.of(2010, 8, 23));
        int op;
        double eslora;
        System.out.println("ELIJA TIPO DE BARCO"
                + "\n1-Velero"
                + "\n2-Motorizado"
                + "\n3-Yate");
        op = input.nextInt();
        switch (op) {
            case 1:
                nuevoBarco = crearVelero();
                break;
            case 2:
                nuevoBarco = crearMotorizado();
                break;
            case 3:
                nuevoBarco = crearYate();
                break;
            default:
                System.out.println("xd");
        }
        System.out.println("Ingrese eslora del "+nuevoBarco.getClass().getSimpleName());
        eslora = input.nextDouble();
        nuevoBarco.setEslora(eslora);
        return nuevoBarco;
    }

    public Velero crearVelero() {
        int cantMastiles;
        System.out.println("Ingrese cantidad de mastiles");
        cantMastiles = input.nextInt();
        return new Velero(cantMastiles);
    }

    public Motorizado crearMotorizado() {
        double CV;
        System.out.println("Ingrese potencia del motor (CV)");
        CV = input.nextDouble();
        return new Motorizado(CV);
    }

    public Yate crearYate() {
        double CV;
        int cantCamarotes;
        System.out.println("Ingrese potencia del motor (CV)");
        CV = input.nextDouble();
        System.out.println("Ingrese cantidad de camarotes");
        cantCamarotes = input.nextInt();
        return new Yate(CV, cantCamarotes);
    }


    public void mostrarAmarres(ArrayList<Alquiler> amarres) {
        for (Alquiler amarre : amarres) {
            System.out.println(amarre);
        }
    }

    public void menu(ArrayList<Alquiler> amarres) {
        int op;

        do {
            System.out.println("---MENU---"
                    + "\n1-Nuevo alquiler"
                    + "\n2-Ver amarres"
                    + "\n3-Calcular precios"
                    + "\n0-Terminar");
            op = input.nextInt();

            switch (op) {
                case 1:
                    crearNuevoAlquiler(amarres);
                    break;
                case 2:
                    mostrarAmarres(amarres);
                    break;
                case 3:
                    precioFinal(amarres);
                    break;
                case 0:
                    System.out.println("chau loco");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (op != 0);

    }

}
