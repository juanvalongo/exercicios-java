import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o resto da divisão por 2 é igual a zero
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        // Fecha o scanner para liberar os recursos do sistema
        scanner.close();
    }
}