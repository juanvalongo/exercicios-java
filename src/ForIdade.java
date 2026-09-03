import java.util.Scanner;

public class ForIdade {
    public static void main(String[] args) {
        // Cria o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        while (idade <= 0) {
        System.out.println("Idade inválida. Por favor, digite uma idade maior que zero.");
        System.out.print("Digite a idade da pessoa: ");
        idade = scanner.nextInt();
        }

        // Estrutura de repetição for para contar de 1 até a idade digitada
        for (int i = 1; i <= idade; i++) {
        System.out.println("Contagem: " + i);
        }

        // Fecha o scanner
        scanner.close();
    }
}


