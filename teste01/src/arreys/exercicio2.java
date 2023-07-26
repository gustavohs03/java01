package arreys;

public class exercicio2 {

    public static void main(String[] args) {
        // Sequência a) 1, -2, 3, -4, 5, -6, ..., 29, -30
        int[] sequenciaA = new int[30];

        for (int i = 0; i < sequenciaA.length; i++) {
            sequenciaA[i] = (i % 2 == 0) ? (i + 1) : (i + 1) * -1;
        }

        System.out.println("Sequência a):");
        for (int valor : sequenciaA) {
            System.out.print(valor + ", ");
        }
        System.out.println();

        // Sequência b) 1, 1, 2, 2, 3, 3, ..., 15, 15
        int[] sequenciaB = new int[30];

        for (int i = 0; i < sequenciaB.length; i++) {
            sequenciaB[i] = (i / 2) + 1;
        }

        System.out.println("Sequência b):");
        for (int valor : sequenciaB) {
            System.out.print(valor + ", ");
        }
        System.out.println();

        // Sequência c) 1, 2, 4, 8, 16, ...
        int[] sequenciaC = new int[10];

        for (int i = 0; i < sequenciaC.length; i++) {
            sequenciaC[i] = (int) Math.pow(2, i);
        }

        System.out.println("Sequência c):");
        for (int valor : sequenciaC) {
            System.out.print(valor + ", ");
        }
        System.out.println();

        // Sequência d) 1, 1, 2, 3, 5, 8, 13, ...
        int[] sequenciaD = new int[20];
        sequenciaD[0] = 1;
        sequenciaD[1] = 1;

        for (int i = 2; i < sequenciaD.length; i++) {
            sequenciaD[i] = sequenciaD[i - 1] + sequenciaD[i - 2];
        }

        System.out.println("Sequência");
    }
}
