package java03e04_Variaveis_Operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Exercicio 4 \n");
		
		System.out.print("numero1: ");
		n1 = leia.nextFloat();
		System.out.print("numero2: ");
		n2 = leia.nextFloat();
		System.out.print("numero3: ");
		n3 = leia.nextFloat();
		System.out.print("numero4: ");
		n4 = leia.nextFloat();
		
		System.out.printf("Diferenca: %.1f", (n1 * n2) - (n3 * n4));
	}

}
