package java06_Lacos_Repeticao;

import java.util.Scanner;

public class Exercicio06_DOWHILE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int cont = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                cont++;
            }

        } while (numero != 0); 

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f\n", media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado!");
        }

        leia.close();

	}

}
