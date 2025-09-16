package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio6_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int codigo;
		float salario;
		float reajuste;
		
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("Cargo: ");
		codigo = leia.nextInt();
		System.out.println("Salário: R$ ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		case 1:
			reajuste = salario + (10*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Gerente%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		case 2:
			reajuste = salario + (7*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Vendedor%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		case 3:
			reajuste = salario + (9*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Supervisor%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		case 4:
			reajuste = salario + (6*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Motorista%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		case 5:
			reajuste = salario + (5*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Estoquista%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		case 6:
			reajuste = salario + (8*salario);
			System.out.printf("Nome do colaborador: %s%n", nome);
			System.out.printf("Cargo: Técnico de TI%n");
			System.out.printf("Salário: R$ %.2f", reajuste);
			break;
		default:
			System.out.println("Você digitou uma opção inválida.");
	}
		

	}

}
