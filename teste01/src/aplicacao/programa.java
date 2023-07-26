
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import aplicacao.entities.triangulo;

public class programa {
    public static void main(String[] args) {
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;
        System.out.println("enter the measures of triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("repete te novo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.b) / 2.0;
        double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c);
        double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        System.out.printf("triangulo x é:%.4f%n", areax);
        System.out.printf("triangulo y é:%.4f%n", areay);

        if (areax > areay) {
            System.out.println("areA X E MAIOR");

        } else {
            System.out.println("area y e maior");
        }

        sc.close();

    }

}
