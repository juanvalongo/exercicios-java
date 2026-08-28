import java.util.Scanner;

public class NotaAprovacao {
    public static void main(String[] args) {
        // Cria o scanner para capturar a nota (usando localização padrão para aceitar pontos decimais)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0.0 a 10.0): ");
        double nota = scanner.nextDouble();

        // Estrutura de decisão encadeada
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Fecha o scanner
        scanner.close();
    }
}
