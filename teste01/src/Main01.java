import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(); // lê o valor inicial de x
        input.close();

        while (x != 1) { // continua enquanto x não for igual a 1
            if (x % 2 == 0) { // se x é par
                x = x / 2;
            } else { // se x é ímpar
                x = 3 * x + 1;
            }
            System.out.print(x + " -> "); // imprime o valor atual de x seguido de uma seta
        }

        System.out.print("1"); // imprime o valor final de x (1)
    }
}
