import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        String resposta;
       
        	do {
                System.out.print("Digite o nome do vendedor: ");
                String nome = input.nextLine();

                System.out.print("Digite o total de vendas (R$): ");
                double vendas = input.nextDouble();
                input.nextLine();

                double salario = vendas * 0.17;

                System.out.println("Nome: " + nome);
                System.out.println("Total de vendas: R$ " + vendas);
                System.out.println("Salário: R$ " + salario);
                System.out.println();

                System.out.print("Deseja digitar os dados de mais um vendedor? (sim/nao): ");
                resposta = input.nextLine().toLowerCase();
                System.out.println();

            } while (resposta.equals("sim"));

            input.close();
        }
	}



