package java08_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02_CollectionList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

        System.out.println("List: " + numeros);

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int num = leia.nextInt();

        int posicao = numeros.indexOf(num);

        if (posicao != -1) {
            System.out.println("\nO número " + num + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + num + " não foi encontrado!");
        }

        leia.close();

	}

}
