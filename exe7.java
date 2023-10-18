import java.util.Scanner;

public class exe7 {
      public static double calcularVolumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o raio da esfera: ");
            double raio = scanner.nextDouble();

            double volume = calcularVolumeEsfera(raio);
            System.out.println("Volume da esfera: " + volume);
        }
    }
}

