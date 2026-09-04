import java.util.Scanner;

public class DezNumerosInteiros {
    public static void main(String[] args) {
        // Cria o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        int soma_numeros = 0;
        double media = 0;
        int numero_par = 0;
        int numero_impar = 0;

        // Estrutura de repetição for para capturar os 10 números digitados pelo usuário
        for (int i = 0; i < 10; i++) {
            System.out.print(" Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma_numeros += numero;
            
            if (numero % 2 == 0) {
                numero_par++;
            } else {
                numero_impar++;
            }
        }
        media = soma_numeros / 10.0;
        System.out.println("A soma dos 10 números digitados é: "+ soma_numeros);
        System.out.println("A média dos 10 números digitados é: "+ media);
        System.out.println("O número de pares digitados é: "+ numero_par);
        System.out.println("O número de ímpares digitados é: "+ numero_impar);

        // Fecha o scanner
        scanner.close();
    }
}