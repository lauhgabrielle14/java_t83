package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio03_IF {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		boolean doacao;
		int sair = 1;
		do {
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.println("Primeira doação de sangue? ");
		doacao = leia.nextBoolean();
		leia.nextLine();
		
		if (doacao)
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (doacao == true) {
					System.out.printf("%s não está apto(a) a doar sangue!", nome);
				} else {
					System.out.printf("%s está apto(a) a doar sangue!", nome);
				}
			} else {
				System.out.printf("%s está apto(a) a doar sangue!", nome);
			}
			
		} else {
			System.out.printf("%s não está apto a doar sangue!", nome);
		}
		System.out.print("\nPara sair digite 0 | Para ficar digite 1 : ");
		sair = leia.nextInt();
		leia.nextLine();
		} while (sair == 1);

	}

}
