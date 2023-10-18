import java.util.Scanner;

public class exe3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double perimetro = calcularPerimetro(lado);

        System.out.println("Perímetro do quadrado: " + perimetro);

        scanner.close();
    }

    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }
}
