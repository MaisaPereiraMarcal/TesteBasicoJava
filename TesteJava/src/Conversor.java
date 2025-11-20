 import java.util.Scanner;

public class Conversor {
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira a temperatura em celcius: ");
        Double temperatura = sc.nextDouble();

        Double fahrenheit = temperatura * 1.8 + 32;
        
        

        // Saída de dados formatada
        System.out.println("\n--- Coversao ---");
        System.out.printf("Temperatura: %.2f%n", fahrenheit);

        sc.close();
    }
}

