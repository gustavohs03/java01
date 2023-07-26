import java.util.Locale;
import java.util.Scanner;
public class demo {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double Janeiro = sc.nextDouble();
        double fevereiro = sc.nextDouble();
        double marco = sc.nextDouble();
        double media = (Janeiro + fevereiro + marco) / 3;
        
        System.out.printf("a sua media trimestral é R$: %.2f%n",media);
        
        sc.close();
}
}



