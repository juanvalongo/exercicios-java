import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt(); //Crie uma variável inteira chamada idade e coloque nela o próximo número inteiro que o usuário digitar.
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        scanner.close();
    }
}

