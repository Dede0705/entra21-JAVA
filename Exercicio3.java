import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[8];

        System.out.println("Digite 8 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        int inicio = -1;
        int tamanho = 1;

        for (int i = 0; i < vetor.length - 1; i++) {
            int inicio1 = i;
            int tamanho1 = 1;

            while (i < vetor.length - 1 && vetor[i + 1] == vetor[i] + 1) {
                tamanho1++;
                i++;
            }

            if (tamanho1 > 1) {
                inicio = inicio1;
                tamanho = tamanho1;
                break; 
            }
        }

        if (inicio != -1) {
            System.out.print("Primeira sequência consecutiva encontrada:  ");
            for (int i = inicio; i < inicio + tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
        } else {
            System.out.println("Nenhuma sequência consecutiva encontrada.");
        }
	}
	
}
      
	


