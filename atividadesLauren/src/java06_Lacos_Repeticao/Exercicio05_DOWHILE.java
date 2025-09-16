package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio05_DOWHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero; 
            }

        } while (numero != 0); 

        System.out.printf("\nA soma dos números positivos é: %d%n", soma);

        leia.close();

	}

}
