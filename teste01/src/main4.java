import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        int n = 5; // número de linhas a serem impressas
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}
