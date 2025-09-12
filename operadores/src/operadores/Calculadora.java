package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		//Objetos e Variáveis:
		
		//Instânciar um objeto da Classe Scanner. Criando um objeto da forma Scanner para receber informações do usuário.
		Scanner leia = new Scanner (System.in);
		
		//Declaração de variáveis
		double numero1;
		double numero2;
		
		//Entrada de dados
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		//Efetuar os cálculos (%n é uma alternativa para pular linha, assim como \n)
		System.out.printf("%.2f + %.2f = %.2f \n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f \n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f x %.2f = %.2f %n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f %n", numero1, numero2, numero1 / numero2);
		
		//Mais operações, utilizando a biblioteca Math que já facilita (Detalhes importantes: Não é necessário importar,
		//porém ela devolve valores do tipo double, por isso é interessante já antecipar isso e declara-los como double)
		System.out.printf("%.2f ^ %.2f = %.2f %n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("A raiz quadrada de %.2f eh %.2f %n", numero1, Math.sqrt(numero1));
		System.out.printf("A raiz quadrada de %.2f eh %.2f %n", numero2, Math.sqrt(numero2));
	}

}
