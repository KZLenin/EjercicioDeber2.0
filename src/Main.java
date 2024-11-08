import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formulas formulas = new Formulas();
        System.out.println("Ingrese el tiempo en el que desea calcular el desplazamiento");
        double tiempo = sc.nextDouble();

        formulas.desplazamientoConGravedadDouble(75,tiempo,9.8);
        formulas.desplazamientoConGravedadInt(75,tiempo,10);
    }
}