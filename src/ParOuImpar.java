import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) { // Verifica se o resto da divisão por 2 é igual a zero
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
       
        scanner.close();
    }
}