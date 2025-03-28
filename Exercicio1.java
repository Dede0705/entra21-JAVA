import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
        for (int i = 0; i < 5; i++) {
        	int numero = input.nextInt();
        	if (numero % 2 == 0) {
        		System.out.println("Número " + numero + " é par");
        	}else {
        		System.out.println("Número " + numero + " é impar");
        	}
        }
	}
}