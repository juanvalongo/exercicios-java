import java.util.Scanner;

public class NotaAprovacao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0.0 a 10.0): ");
        double nota = scanner.nextDouble(); //Leia o próximo valor digitado pelo usuário e interprete-o como um número decimal (double).
        
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
