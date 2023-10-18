import java.util.Scanner;

public class exe8 {
    public static boolean verificarNumeroPerfeito(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (verificarNumeroPerfeito(numero)) {
                System.out.println("O número é perfeito.");
            } else {
                System.out.println("O número não é perfeito.");
            }
        }
    }
}

