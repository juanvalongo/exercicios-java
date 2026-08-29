import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();       
      
        if (numero > 0) { // Verifica se o número é maior que Zero (positivo)
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) { // Verifica se o  número é menor que Zero (negativo)
            System.out.println("O número " + numero + " é negativo.");    
        } else {
            System.out.println("O número " + numero + " é zero."); // Terceira condição só ocorre se as duas anteriores forem falsas, ou seja, o número for zero.
        }
       
        scanner.close();
       
    }
}
