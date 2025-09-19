package java08_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01_CollectionList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a %dª cor: ", (i+1));
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();

	}

}
