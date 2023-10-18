import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int somaDigitos = calcularSomaDigitos(numero);

        System.out.println("Soma dos dígitos: " + somaDigitos);

        scanner.close();
    }

    public static int calcularSomaDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }
        return soma;
    }
}

