package arreys;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de cinco números inteiros:");

        // Solicitar números ao usuário e armazená-los no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean ordenado = true;

        // Verificar se o array está ordenado do maior para o menor
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("Os números estão ordenados.");
        } else {
            System.out.println("Os números não estão ordenados.");
        }
    }
}
