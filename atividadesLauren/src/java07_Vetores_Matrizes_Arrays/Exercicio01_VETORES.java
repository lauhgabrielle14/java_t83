package java07_Vetores_Matrizes_Arrays;

import java.util.Scanner;

public class Exercicio01_VETORES {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;
        boolean encontrado = false;

        System.out.print("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.printf("O número %d está localizado na posição: %d%n", numero, i);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.printf("O número %d não foi encontrado!", numero);
        }

        leia.close();

	}

}
