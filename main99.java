import java.util.Scanner;

public class main99 {
    public static float calc(int z, int x, int y) {
        return x / (y - z) * z;

    }

    public static void main(String[] args) {
        int y = 6;
        int x = 9;
        int z = 3;
        System.out.println(calc(z, x, y));

    }

}
