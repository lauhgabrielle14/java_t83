package java03e04_Variaveis_O;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtra;
		float desconto;
		
		System.out.println("Exercicio 3 \n");
		
		System.out.print("Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("Horas Extras: ");
		horasExtra = leia.nextFloat();
		System.out.print("Descontos: ");
		desconto = leia.nextFloat();
		
		System.out.printf("Salario Liquido: %.2f %n %n", salarioBruto + adicionalNoturno + (horasExtra * 5) - desconto);
		
	}

}
