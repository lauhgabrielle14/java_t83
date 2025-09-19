package js_08_Java8_EstruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02_Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        Stack<String> pilhaDeLivros = new Stack<>();
        int opcao;

        do {
            System.out.println("\n***************************************************");
            System.out.println("\nMenu:");
            System.out.println("\n1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("\n***************************************************");
            System.out.print("\nEntre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String nomeLivro = leia.nextLine();
                    pilhaDeLivros.push(nomeLivro);
                    System.out.println("\nLivro adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:");
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        for (String livro : pilhaDeLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        pilhaDeLivros.pop();
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, digite uma opção válida (0, 1, 2 ou 3).");
                    break;
            }
        } while (opcao != 0);

        leia.close();

	}

}
