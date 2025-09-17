package java03e04_Variaveis_O;

import java.util.Scanner;

public class Exercicio02_VARIAVEIS {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
			
		System.out.println("Exercicio 2 \n");
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("Media final: %.1f %n%n", (nota1 + nota2 + nota3 + nota4)/4);
		
	}

}
