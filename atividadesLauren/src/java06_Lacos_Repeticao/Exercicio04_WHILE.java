package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio04_WHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int backend = 0;
        int mulheresFrontend = 0;
        int homensMobile40 = 0;
        int nbFullstack30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Idade: ");
            int idade = leia.nextInt();

            System.out.print("Identidade de Gênero (1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros): ");
            int genero = leia.nextInt();

            System.out.print("Pessoa Desenvolvedora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            int dev = leia.nextInt();

            if (dev == 1) {
                backend++;
            }

            if (dev == 2 && (genero == 1 || genero == 4)) {
                mulheresFrontend++;
            }

            if (dev == 3 && (genero == 2 || genero == 5) && idade > 40) {
                homensMobile40++;
            }

            if (dev == 4 && genero == 3 && idade < 30) {
                nbFullstack30++;
            }

            totalPessoas++;
            somaIdades += idade;

            System.out.print("\nDeseja continuar (S/N): ");
            continuar = leia.next().charAt(0);
            System.out.println();
        }

        double media = (totalPessoas > 0) ? (double) somaIdades / totalPessoas : 0;

        System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFullstack30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", media);

        leia.close();

	}

}
