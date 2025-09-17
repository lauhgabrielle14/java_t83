package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio07_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float numero1;
		float numero2;
		int operacao;
		
		System.out.println("Digite o 1º numero: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2º numero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Operação: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.printf("%.1f + %.1f = %.1f \n", numero1, numero2, numero1 + numero2);
			break;
		case 2:
			System.out.printf("%.1f - %.1f = %.1f \n", numero1, numero2, numero1 - numero2);
			break;
		case 3:
			System.out.printf("%.1f x %.1f = %.1f %n", numero1, numero2, numero1 * numero2);
			break;
		case 4:
			System.out.printf("%.1f / %.1f = %.1f %n", numero1, numero2, numero1 / numero2);
			break;
		default:
			System.out.println("Operação Inválida!");
		}
	}

}
