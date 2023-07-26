package arreys;

public class media {
    public static void main(String[] args) {
        // declaração e inicialização

        double valores[] = new double[10];
        valores[0] = 75.45;
        valores[1] = 55.46;
        valores[2] = 37.85;
        valores[3] = 38.22;
        valores[4] = 45.22;
        valores[5] = 34.22;
        valores[6] = 55.88;
        valores[7] = 88.55;
        valores[8] = 99.45;
        valores[9] = 44.66;

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
