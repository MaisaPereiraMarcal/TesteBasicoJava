import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Insira seu salário: ");
        double salario = sc.nextDouble();

        // Saída de dados formatada
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Salário: %.2f%n", salario);

        sc.close();
    }
}
