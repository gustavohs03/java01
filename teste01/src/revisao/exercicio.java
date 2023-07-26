package revisao;

public class exercicio {
    public static void main(String[] args) {
        double pesos[] = { 85, 92.5, 75, 50, 60 };
        double total = 0;
        double media;

        for (int index = 0; index < pesos.length; index++) {
            total = total + pesos[index];

        }
        media = total / pesos.length;
        System.out.println("media:" + media);
    }

}
