package atividadesLauren;

import java.util.Scanner;

public class Atv_java03_java04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Variáveis exercício 1		
		float salario;
		float abono;
		//Variáveis exercício 2
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		//Variáveis exercício 3
		float salarioBruto;
		float adicionalNoturno;
		float horasExtra;
		float desconto;
		//Variáveis exercício 4
		float n1;
		float n2;
		float n3;
		float n4;
		
		//Exercício 1
		
		System.out.println("Exercicio 1 \n");
		
		System.out.print("Salario: ");
		salario = leia.nextFloat();
		System.out.print("Abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("Novo salario: %.2f %n%n", salario + abono);
		
		//Exercício 2
		
		System.out.println("Exercicio 2 \n");
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("Media final: %.1f %n%n", (nota1 + nota2 + nota3 + nota4)/4);
		
		//Exercício 3
		
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
		
		//Exercício 4
		
		System.out.println("Exercicio 4 \n");
		
		System.out.print("numero1: ");
		n1 = leia.nextFloat();
		System.out.print("numero2: ");
		n2 = leia.nextFloat();
		System.out.print("numero3: ");
		n3 = leia.nextFloat();
		System.out.print("numero4: ");
		n4 = leia.nextFloat();
		
		System.out.printf("Diferenca: %.1f", (n1 * n2) - (n3 * n4));
	}

}
