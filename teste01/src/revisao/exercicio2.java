package revisao;

public class exercicio2 {
    public static void main(String[] args) {
        int livrosDisponiveis[] = { 555, 562, 885, 457, 657, 152, 118 };

        System.out.println(livrosDisponiveis[0]);
        if (estaDisponivel(livrosDisponiveis, 555)) {
            System.out.println("livro disponivel");
        } else {
            System.out.println("livro não disponivel");
        }
        System.out.println(livrosDisponiveis[0]);

    }

    private static boolean estaDisponivel(int livros[], int livro) {
        boolean resposta = false;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == livro) {
                resposta = true;
                livros[i] = -1;

            }
        }
        return resposta;

    }

}
