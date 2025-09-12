package atividadesLauren;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
			
		float salario;
		float abono;
						
		System.out.println("Exercicio 1 \n");
		
		System.out.print("Salario: ");
		salario = leia.nextFloat();
		System.out.print("Abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("Novo salario: %.2f %n%n", salario + abono);
		
	}

}
