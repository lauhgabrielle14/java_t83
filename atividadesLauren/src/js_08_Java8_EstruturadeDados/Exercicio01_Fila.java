package js_08_Java8_EstruturadeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01_Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("**************************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("**************************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();
            leia.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    filaClientes.add(nome);
                    System.out.println("Fila:");
                    for(String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    if(filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila:");
                        for(String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if(filaClientes.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        String chamado = filaClientes.poll();
                        System.out.println("Fila:");
                        for(String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("O Cliente foi Chamado: " + chamado);
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 0);

        leia.close();
	}

}
