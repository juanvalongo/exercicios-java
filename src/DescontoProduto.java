import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();
                
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        
        if (preco > 100) { // Verifica se o preço é maior que 100, se for maior aplica um desconto, caso contrário vai ser o valor original.
            System.out.println("O produto " + nomeProduto + " está com desconto de 10% aproveite e adquira por apenas R$" + (preco * 0.9));
        } else {
            System.out.println("O produto " + nomeProduto + " está por apenas R$" + preco);
        }
       
        scanner.close();
        
    }
}