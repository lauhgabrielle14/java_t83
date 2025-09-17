package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio01_IF {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
				
		int valorA;
		int valorB;
		int valorC;
		int soma;
		int sair = 1;
		
		do {
		
		System.out.print("Digite o numero A: ");
		valorA = leia.nextInt();
		System.out.print("\nDigite o numero B: ");
		valorB = leia.nextInt();
		System.out.print("\nDigite o numero C: ");
		valorC = leia.nextInt();
		
		soma = valorA + valorB;
		
		if (soma > valorC) {
			System.out.printf("\n%d + %d = %d > %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é Maior que C");
		} else if (soma < valorC) {
			System.out.printf("\n%d + %d = %d < %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é Menor que C");
		} else if (soma == valorC) {
			System.out.printf("\n%d + %d = %d = %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é Igual a C");
		}
		System.out.print("\nPara sair digite 0 | Para ficar digite 1 : ");
		sair = leia.nextInt();
		} while (sair == 1);
		leia.close();
	}

}
