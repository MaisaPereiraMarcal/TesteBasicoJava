import java.util.Scanner;

public class IMC {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira seu peso: ");
        Double peso = sc.nextDouble();

        System.out.print("Insira sua altura: ");
        double altura = sc.nextDouble();

       double resultado = peso/ (altura * altura);

        // Saída de dados formatada
        System.out.println("\n--- Dados do IMC ---");
        System.out.printf("Peso: %.2f kg\n", peso); 
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("IMC: %.2f\n", resultado);

        sc.close();
     }}
