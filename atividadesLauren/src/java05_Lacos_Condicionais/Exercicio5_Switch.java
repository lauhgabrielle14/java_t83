package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio5_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int codigo;
		int quantidade;
		int valor;
		
		System.out.println("Código do produto: ");
		codigo = leia.nextInt();
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		
		switch (codigo) {
			case 1:
				valor = 10 * quantidade;
				System.out.println("Produto: Cachorro Quente");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			case 2:
				valor = 15 * quantidade;
				System.out.println("Produto: X-Salada");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			case 3:
				valor = 18 * quantidade;
				System.out.println("Produto: X-Bacon");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			case 4:
				valor = 12 * quantidade;
				System.out.println("Produto: Bauru");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			case 5:
				valor = 8 * quantidade;
				System.out.println("Produto: Refrigerante");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			case 6:
				valor = 13 * quantidade;
				System.out.println("Produto: Suco de Laranja");
				System.out.printf("Valor total: R$ %d.00%n", valor);
				break;
			default:
				System.out.println("Você digitou uma opção inválida.");
		}
			
		leia.close();
	}

}
