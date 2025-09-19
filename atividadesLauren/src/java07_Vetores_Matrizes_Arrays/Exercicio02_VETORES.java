	package java07_Vetores_Matrizes_Arrays;

import java.util.Scanner;

public class Exercicio02_VETORES {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10];
        double soma = 0;
        double media;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", (i+1));
            vetor[i] = leia.nextInt();
            soma += vetor[i];
        }

        System.out.println("\nElementos nos índices ímpares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %d", vetor[i]);
            }
        }

        System.out.print("\n\nElementos pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { 
                System.out.printf(" %d" , vetor[i]);
            }
        }

        System.out.println("\n\nSoma: " + soma);

        media = (soma / vetor.length);
        System.out.printf("Média: %.2f\n", media);
        leia.close();

	}

}
