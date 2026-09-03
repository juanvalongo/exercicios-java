
public class NumerosPares {
    
public static void main(String[] args) {
        // Cria o scanner para capturar a entrada do usuário
        int totalPares = 0;
     
        // Estrutura de repetição for para contar de 1 até a idade digitada
        for (int i = 1; i <= 50; i++) {
        if (i % 2 == 0) {
            System.out.println("Número par: " + i);
            totalPares++;
        }
        }

        System.out.println("Total de números pares: " + totalPares);
    }
}