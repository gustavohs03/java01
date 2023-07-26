import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite três numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = max(a, b, c);
        showresult(maior);
        sc.close();

    }

    public static int max(int x, int y, int z) {
        int aux;
        if (y > x && z > x) {
            aux = x;
        } else if (z > y) {
            aux = y;

        } else {
            aux = z;
        }
        return aux;

    }

    public static void showresult(int value) {
        System.out.println("menor =" + value);
    }

}
