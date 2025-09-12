package operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int numero = 4;
		
		//Forma mais usada: A variável é igual ela mesma, somando dois
		System.out.println(numero += 2);
		//Outra forma de fazer a mesma atribuição com soma
		System.out.println(numero = numero + 2);
	}

}
