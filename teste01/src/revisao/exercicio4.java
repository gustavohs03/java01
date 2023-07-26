package revisao;

public class exercicio4 {
    public static void main(String[] args) {
        double notas[][] = { { 8, 7, 8, 8.5 }, { 5, 5.5, 7, 5.8 }, { 7, 8, 7, 6 } };

        double soma, somaGeral = 0, media, mediaGeral;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            soma = 0;
            for (int avaliacao = 0; avaliacao < notas[aluno].length; avaliacao++) {
                soma += notas[aluno][avaliacao];

            }
            media = soma / notas[aluno].length;
            somaGeral += soma;
            System.out.printf("media do aluno é %d:%.2f%n", aluno, media);
            mediaGeral = somaGeral / (notas.length * notas[0].length);
            System.out.printf("geral da turma:%.2f%n", mediaGeral);

        }
    }

}
