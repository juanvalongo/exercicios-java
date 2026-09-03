import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
        // Cria o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        

        // Estrutura de repetição for para multiplicar o número digitado de 1 a 10
        for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o scanner
        scanner.close();
    }
}