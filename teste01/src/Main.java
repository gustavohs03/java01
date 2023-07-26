import java.util.Locale;
import java.util.Scanner;

public class Main {





/**
 * @param args
 */
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String dia;

    switch(x) {
        case 1:
        dia = "domingo";
        break;
        case 2:
        dia = "segunda";
        break;
        case 3:
        dia = "terça-feira";
        break;
        case 4:
        dia = "quarta-feira";
        break;
        case 5:
        dia = "quinta-feira";
        break;
        case 6:
        dia = "sexta-feira";
        break;
        case 7:
        dia = "sabado";
        break;
        default:
        dia ="invalido";
        break;
    }


System.out.println("dia da semana:" + dia);
sc.close();



    
}


}

