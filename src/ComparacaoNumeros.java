import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
      
        System.out.print("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2) { // Verifica se o primeiro número é maior que o segundo
            System.out.println("O primeiro número é maior.");
        } else if (numero1 < numero2) { // Verifica se o primeiro número é menor que o segundo
            System.out.println("O segundo número é maior.");    
        } else {
            System.out.println("Os números são iguais."); // Terceira condição só ocorre se as duas anteriores forem falsas, ou seja, se os números forem iguais.
        }
       
        scanner.close();
       
    }
}
