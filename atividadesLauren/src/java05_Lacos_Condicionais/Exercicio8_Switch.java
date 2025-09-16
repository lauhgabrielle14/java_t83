package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio8_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float saldo = 1000;
		float valor;
		int operacao;
				
		System.out.println("Operação: ");
		operacao = leia.nextInt();
		
		
		switch (operacao) {
			case 1:
				System.out.println("Operação - Saldo");
				System.out.printf("Saldo: R$ %.2f\n", saldo);
				break;
			case 2:
				System.out.println("Valor: R$ ");
				valor = leia.nextFloat();
				if (valor > saldo) {
					System.out.println("Saldo Insuficiente!");
				} else {
					saldo -= valor;
					System.out.printf("Novo Saldo: R$ %.2f", saldo);
				}
				break;
			case 3:
				System.out.println("Operação - Depósito");
				System.out.println("Valor: R$ ");
				valor = leia.nextFloat();
				saldo += valor;
				System.out.printf("Novo Saldo: %.2f %n", saldo);
				break;
			default: 
				System.out.println("Operação Inválida!");
		}
			leia.close();
		
	}

}
