import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a altura da pessoa 1");
		double alturaPessoa1 = input.nextDouble();
		System.out.println("Insira a altura da pessoa 2");
		double alturaPessoa2 = input.nextDouble();
		System.out.println("Insira a altura da pessoa 3");
		double alturaPessoa3 = input.nextDouble();
		System.out.println("Insira a altura da pessoa 4");
		double alturaPessoa4 = input.nextDouble();
		System.out.println("Insira a altura da pessoa 5");
		double alturaPessoa5 = input.nextDouble();
		
		for (int i = 1; i <= 6; i++) {
			if (i == 1) {
				System.out.println("A altura da primeira pessoa é: "+alturaPessoa1);
			} else if (i == 2) {
				System.out.println("A altura da segunda pessoa é: "+alturaPessoa2);
			} else if (i == 3) {
				System.out.println("A altura da terceira pessoa é: "+alturaPessoa3);
			} else if (i == 4) {
				System.out.println("A altura da quarta pessoa é: "+alturaPessoa4);
			} else if (i == 5) {
				System.out.println("A altura da quinta pessoa é: "+alturaPessoa5);
			} else if (i == 6) {
				System.out.println("E a altura média deles é de: "+((alturaPessoa1+alturaPessoa2+alturaPessoa3+alturaPessoa4+alturaPessoa5)/5));
			}
		}
		
		
	}

}
