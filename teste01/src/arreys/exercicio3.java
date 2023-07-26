package arreys;

public class exercicio3 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int tamanho = array.length;

        System.out.println("Array original:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // Inverter a ordem dos elementos
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = array[i];
            array[i] = array[tamanho - 1 - i];
            array[tamanho - 1 - i] = temp;
        }

        System.out.println("Array invertido:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
