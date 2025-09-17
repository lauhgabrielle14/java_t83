package java07_Vetores_Matrizes_Arrays;

import java.util.Scanner;

public class Exercicio03_MATRIZES {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Digite o elemento [%d] [%d]: ", i , j);
                matriz[i][j] = leia.nextInt();
            }
        }

        System.out.print("\nElementos da Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf(" %d", matriz[i][i]);
            somaPrincipal += matriz[i][i];
        }

        System.out.print("\nElementos da Diagonal Secundária: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf(" %d", matriz[i][2 - i]);
            somaSecundaria += matriz[i][2 - i];
        }

        System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: %d%n", somaPrincipal);
        System.out.printf("Soma dos Elementos da Diagonal Secundária: %d%n", somaSecundaria);

        leia.close();

	}

}
