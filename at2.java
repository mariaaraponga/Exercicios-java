

public class at2 {
     public static void main(String[] args) {

        int soma = 0;
        int[] array = {2, 3, 6, 8, 10, 11};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                soma += array[i];
            }
        }

        System.out.println("A soma dos numeros é de: " + soma);
        }

}


