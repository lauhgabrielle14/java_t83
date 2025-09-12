package operadores;

public class Unario {

	public static void main(String[] args) {
		int preIncrementoOriginal = 8;
		int preIncrementoResultado;
		int posIncrementoOriginal = 8;
		int posIncrementoResultado;
		
		//Pre Incremento
		System.out.printf("Pre Incremento: Valor original = %d %n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Apos pre incrementar a variavel original: Resultado = %d, Valor atualizado = %d %n %n", preIncrementoResultado, preIncrementoOriginal);
		//Aqui ele incrementa a original e só depois atribui a resultado, ou seja, ambas são alteradas e ficam iguais
		
		//Pos Incremento
		System.out.printf("Pos Incremento: Valor original = %d %n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Apos pos incrementar a variavel original: Resultado = %d, Valor atualizado = %d %n", posIncrementoResultado, posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal +1;

	}

}
