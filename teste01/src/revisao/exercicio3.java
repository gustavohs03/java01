package revisao;

public class exercicio3 {
    private static void imprimeLista(int c[], int d[], int e[]) {
        for (int i = 0; i < c.length; index++) {
            System.out.println(c[i] + "-" + d[i] + "-" + e[i]);
        }

    }

    public static void main(String[] args) {
        int cogigo[] = {};
        String descricao[] = { "Iphone", "TV", "XBOX", "PS5", "alexa" };
        int estoque[] = { 50, 20, 25, 12, 3 };

        imprimeLista(cogigo, cogigo, estoque);

        estoque[0] = estoque[0] - 15;
        System.out.println("apos venda");
        imprimeLista(cogigo, cogigo, estoque);
    }

}
