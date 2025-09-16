package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio01_FOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int inicio;
		int fim;

        System.out.print("Digite o primeiro número do intervalo: ");
        inicio = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        fim = leia.nextInt();

        if (inicio >= fim) {
            System.out.println("Intervalo inválido!");
        } else {
            System.out.printf("No Intervalo entre %d e %d: %n", inicio, fim);

            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d é múltiplo de 3 e 5%n", i);
                }
            }
        }

	}

}
