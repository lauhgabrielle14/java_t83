package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio02_IF {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int sair = 1;
		
		do {
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.printf("O Numero %d é par e positivo!", numero);
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.printf("O Numero %d é impar e negativo!", numero);
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.printf("O Numero %d é par e negativo!", numero);
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.printf("O Numero %d é impar e positivo!", numero);
		}
		System.out.print("\nPara sair digite 0 | Para ficar digite 1 : ");
		sair = leia.nextInt();
		} while (sair == 1);

		leia.close();
	}

}
