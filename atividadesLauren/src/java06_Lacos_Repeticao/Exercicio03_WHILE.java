package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio03_WHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int idade;
        int menores21 = 0;
        int maiores50 = 0;

        System.out.print("Digite uma idade: ");
        idade = leia.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
                menores21++;
            } else if (idade > 50) {
                maiores50++;
            }

            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
        }

        System.out.printf("\nTotal de pessoas menores de 21 anos: %d%n", menores21);
        System.out.printf("Total de pessoas maiores de 50 anos: %d%n", maiores50);

        leia.close();

	}

}
