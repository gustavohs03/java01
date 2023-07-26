package arreys;

public class mediav3 {
    public static void main(String[] args) {
        // declaração e inicialização

        double valores[] = new double[10];
        for (int i = 0; i < 10; i++) {
            double x = i * 5.21 + 7.63;
            valores[i] = i * 2 + 1;
        }

        // calcular a media
        // double soma=0;
        double media = 0;
        for (int i = 0; i < 10; i++) {
            media += valores[i] / 10;

        }
        // media = soma/10;
        System.out.printf("media é %.2f\n", media);

    }

}
