import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a temparatura Celsius:");
        
        double C = sc.nextDouble();
        double F= (9*C/5)+32;
        System.out.println(F);
        System.out.print("deseja repetir (s/n)?:");
        char r= sc.next().charAt(0);
        while(r != 'n'){
            System.out.println("digite a temparatura Celsius:");
        
             C = sc.nextDouble();
             F= (9*C/5)+32;
            System.out.print( F);
            System.out.print("deseja repetir (s/n)?:");
             r= sc.next().charAt(0);
            
        }
        sc.close();

        



        
    }
}
