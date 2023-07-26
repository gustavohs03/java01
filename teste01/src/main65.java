import java.util.Scanner;

public class main65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê e armazena o nome do usuário
        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        // Lê e armazena o endereço do usuário
        System.out.print("Digite o endereço do usuário: ");
        String endereco = sc.nextLine();

        // Lê e armazena a idade do usuário
        System.out.print("Digite a idade do usuário: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado

        // Lê e armazena o estado civil do usuário
        System.out.print("Digite o estado civil do usuário (S, C, D, V ou O): ");
        char estadoCivil = sc.nextLine().charAt(0);

        // Lê e armazena o salário do usuário
        System.out.print("Digite o salário do usuário: ");
        double salario = sc.nextDouble();

        // Imprime os dados do usuário
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Salário: " + salario);

        sc.close();
    }
}
