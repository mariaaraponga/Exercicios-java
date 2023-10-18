import java.util.Scanner;

public class exe5 {
    public static boolean divisivelPor4e7(int numero) {
        if (numero % 4 == 0 && numero % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (divisivelPor4e7(numero)) {
                System.out.println("O número é divisível por 4 e 7.");
            } else {
                System.out.println("O número não é divisível por 4 e 7.");
            }
        }
    }
}

