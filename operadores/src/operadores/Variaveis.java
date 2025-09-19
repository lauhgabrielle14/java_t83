package operadores;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		//Testando exibições de váriaveis definidas
		int peso = 60;
		char opcao = 'S';
		float valor = 100.00f;
		
		System.out.println("O valor da variavel peso eh: " + peso);
		System.out.println("O valor da variavel opcao eh: " + opcao);
		System.out.println("O valor da variavel valor eh: " + valor);
		System.out.printf("O valor da variavel opcao eh %.2f: \n", valor); //Print com formatação. .2 = duas casas decimais. E a sintaxe muda porque se usa ",". Aqui ele considera a formatação do sistema operacional e coloca uma virgula ao invés de ponto.
		
		//Agora vamos receber valores do usuário e printar eles
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digte o peso: ");
		int peso_usuario = leia.nextInt();
		System.out.println("Digte o caractere: ");
		char opcao_usuario = leia.next().charAt(0);
		System.out.println("Digte o valor: ");
		float valor_usuario = leia.nextFloat();
		leia.close();
		
		System.out.println("O valor da variavel peso eh: " + peso_usuario);
		System.out.println("O valor da variavel opcao eh: " + opcao_usuario);
		System.out.println("O valor da variavel valor eh: " + valor_usuario);
		System.out.printf("O valor da variavel opcao eh %.2f: \n", valor_usuario); //Print com formatação. .2 = duas casas decimais. E a sintaxe muda porque se usa ",". Aqui ele considera a formatação do sistema operacional e coloca uma virgula ao invés de ponto.
		
	}

}
