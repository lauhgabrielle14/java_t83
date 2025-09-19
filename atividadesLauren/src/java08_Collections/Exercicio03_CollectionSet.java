package java08_Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio03_CollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new TreeSet<>();

		System.out.println("Digite 10 números inteiros (valores repetidos serão ignorados):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d: ", (i + 1));
            int valor = leia.nextInt();
            numeros.add(valor);
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        leia.close();

	}

}
