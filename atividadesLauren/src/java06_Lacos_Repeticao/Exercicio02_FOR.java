package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio02_FOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: %n", i);
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("\nTotal de números pares: %d%n", pares);
        System.out.printf("Total de números ímpares: %d%n", impares);

        leia.close();

	}

}
