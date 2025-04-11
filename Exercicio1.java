import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro lado do triângulo");
		int lado1 = input.nextInt();
		
		System.out.println("Insira o segundo lado do triângulo");
		int lado2 = input.nextInt();
		
		System.out.println("Insira o terceiro lado do triângulo");
		int lado3 = input.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilatero");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("O triângulo é isósceles");
		} else {
			System.out.println("O triângulo é escaleno");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
