import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double altura;
		double somaAlturas = 0;
		int contador = 0;
		
		System.out.println("Insira uma altura: ou digite 0 para terminar");
		
		while (true) {
			altura = input.nextDouble();
			
			if (altura == 0) {
				break;
			}
			
			somaAlturas += altura;
			contador++;
		}
		
		if (contador >0) {
			double media = somaAlturas/contador;
			System.out.println("A altura média é: "+media);
		} else {
			System.out.println("Sem altura válida");
		}
	}

}
