package arreys;

public class mediav2 {
    public static void main(String[] args) {
        // declaração e inicialização

        double valores[] = { 75.45, 55.46, 37.85, 38.22, 45.22, 34.22, 55.88, 88.55, 99.45, 44.66 };

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