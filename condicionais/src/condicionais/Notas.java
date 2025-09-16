package condicionais;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		System.out.println("Digite a 1º nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a 2º nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a 3º nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a 4º nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7) {
			System.out.println("Aluno foi aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em recuperação (exame)!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		leia.close();

	}

}
