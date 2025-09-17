package java07_Vetores_Matrizes_Arrays;

import java.util.Scanner;

public class Exercicio04_MATRIZES {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
             
        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        double soma;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite as 4 notas do participante %d :", (i + 1));
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leia.nextDouble();
            }
        }
        
        for (int i = 0; i < 10; i++) {
            soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }	
        
        
        System.out.println("Médias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %.1f |", medias[i]);
        }


	}

}
