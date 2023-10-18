import java.util.Scanner;

public class exe2 {
    public static void main(String[] aStrings) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite os elementos da matriz 2x2:");
            System.out.println("Elementos a:");
            double a = scanner. nextDouble();
            System.out.println("elementos b:");
            double b = scanner.nextDouble();
            System.out.println("Elementos c:");
            double c = scanner.nextDouble();
            System.out.println("Elementos d:");
            double d = scanner.nextDouble();

            double determinantes = calcularDeterminante(a , b , c , d);

            System.out.println("\nMatriz fornecida:");
            System.out.println(a +" " +b);
            System.out.println(c +" " + d);

            System.out.println("detereminante: " + determinantes);
        }
    }

    public static double 
    calcularDeterminante(double a, double b, double c, double d) {
        return(a * d) - (b * c);
    }
}
