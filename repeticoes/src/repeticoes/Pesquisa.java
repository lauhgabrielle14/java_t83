package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		 int idade;
		 int esporte;
		 String continua = "S";
		 int somaIdades = 0;
		 int totalRespostas = 0;
		 int futebol = 0;
		 int voleiM18 = 0;
		 int basquetem18 = 0;
		 double mediaIdades = 0;
		 
		 
		 while (continua.equalsIgnoreCase("S")) {
			 System.out.println("Pesquisa - Esporte Favorito");
			 
			 System.out.println("Digite a sua idade: ");
			 idade = leia.nextInt();
			 
			 System.out.println("1 - Futebol");
			 System.out.println("2 - Vôlei");
			 System.out.println("3 - Basquete");
			 
			 System.out.println("Digite o seu  esporte  favorito: ");
			 esporte = leia.nextInt();
			 
			 if (esporte == 1) {
				 futebol++;
			 }
			 
			 if (esporte == 2 && idade >= 18) {
				 voleiM18 ++;
			 }
			 
			 if (esporte == 3 && idade < 18) {
				 basquetem18 ++;
			 }
			 
			 somaIdades += idade;
			 
			 totalRespostas ++;
			 
			 System.out.println("Deseja continuar (S/N) ? ");
			 leia.skip("\\R");
			 continua = leia.nextLine().toUpperCase();
		}
		 mediaIdades = Math.round(somaIdades / totalRespostas);
		 System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		 System.out.printf("Total de pessoas que gostam de vôlei maiores de 18 anos: %d%n", voleiM18);
		 System.out.printf("Total de pessoas que gostam de basquete menores de 18 anos: %d%n", basquetem18);
		 System.out.printf("Média das idades: %.2f%n", mediaIdades );
		 
		leia.close();
	}

}
