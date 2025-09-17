package java05_Lacos_Condicionais;

import java.util.Scanner;

public class Exercicio04_IF {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String dica1;
		String dica2;
		String dica3;
		
		System.out.println("De a primeira dica (Vertebrado/Invertebrado) : ");
		dica1 = leia.next();
		
		if (dica1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("De a segunda dica: (Ave/Manifero) : ");
			dica2 = leia.next();
			if	(dica2.equalsIgnoreCase("Ave")) {
				System.out.println("De a terceira dica: (Carnivoro/Onivoro) : ");
				dica3 = leia.next();
				if (dica3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Águia");
				} else if (dica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Pomba");
				}
			} else if (dica2.equalsIgnoreCase("Mamifero")) {
				System.out.println("De a terceira dica: (Onivoro/Herbivoro) : ");
				dica3 = leia.next();
				if (dica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				} else if (dica3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Vaca");
				}
			}
		} else if (dica1.equalsIgnoreCase("Invertebrado")) {
			System.out.println("De a segunda dica: (Inseto/Anelideo) : ");
			dica2 = leia.next();
			if	(dica2.equalsIgnoreCase("Inseto")) {
				System.out.println("De a terceira dica: (Herbivoro/Hematofago) : ");
				dica3 = leia.next();
				if (dica3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				} else if (dica3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Lagarta");
				}
			} else if (dica2.equalsIgnoreCase("Anelideo")) {
				System.out.println("De a terceira dica: (Onivoro/Herbivoro) : ");
				dica3 = leia.next();
				if (dica3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				} else if (dica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Minhoca");
				}
			}
		}
		
		leia.close();
	}

}
