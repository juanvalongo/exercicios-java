import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        // Cria o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // Estrutura de decisão para verificar a maioridade
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Fecha o scanner
        scanner.close();
    }
}

