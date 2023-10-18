import java.util.Scanner;

public class exe6 {
     public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int fatorial = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + ": " + fatorial);
        }
    }
}
