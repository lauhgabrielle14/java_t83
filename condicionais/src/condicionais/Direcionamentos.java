package condicionais;

import java.util.Scanner;

public class Direcionamentos {

	public static void main(String[] args) {
		int direcionamento;
		
		Scanner leia = new Scanner (System.in);
				
		System.out.println("====================");
		System.out.println("   Direcionamentos  ");
		System.out.println("====================");
		System.out.println("====================");
		System.out.println("0 - Aleatório");
		System.out.println("1 - Tristeza");
		System.out.println("2 - Medo");
		System.out.println("3 - Fé");
		System.out.println("4 - Perseverança");
		System.out.println("5 - Perda");
		System.out.println("6 - Solidão");
		System.out.println("7 - Cansaço");
		System.out.println("8 - Dúvida");
		System.out.println("9 - Cuidado");
		System.out.println("10 - Ansiedade");
		System.out.println("11 - Depressão");
		System.out.println("12 - Promessa\n");
		System.out.println("====================");
		System.out.println("Pelo o que você está passando?");
		System.out.println("Qual dessas palavras faz mais sentido neste momento?");
		System.out.println("====================\n");
		System.out.println("Digite a opção desejada: ");
		direcionamento = leia.nextInt();
		
		switch (direcionamento) {
		case 0:
			System.out.println("0 - Aleatório: \"Tudo posso naquele que me fortalece.\" (Filipenses 4:13)");
			System.out.println("\"Deixo-lhes a paz; a minha paz lhes dou. Não a dou como o mundo a dá.\" (João 14:27)");
			System.out.println("O Senhor tem grandes coisas para a sua vida! :)");
			break;
		case 1:
			System.out.println("1 - Tristeza: \"O choro pode durar uma noite, mas a alegria vem pela manhã.\" (Salmos 30:5)");
			System.out.println("\"Perto está o Senhor dos que têm o coração quebrantado.\" (Salmos 34:18)");
			System.out.println("Entregue ao Senhor tudo o que está sentindo, Ele é contigo! :)");
			break;
		case 2:
			System.out.println("2 - Medo: \"No amor não há medo; ao contrário, o perfeito amor expulsa o medo.\" (1 João 4:18)");
			System.out.println("\"Não temas, porque eu sou contigo; não te assombres, porque eu sou o teu Deus.\" (Isaías 41:10)");
			System.out.println("Você é vencedor em Jesus, não se esqueça disso! :)");
			break;
		case 3:
			System.out.println("3 - Fé: \"Ora, a fé é a certeza daquilo que esperamos e a prova das coisas que não vemos.\" (Hebreus 11:1)");
			System.out.println("\"Se tiverdes fé como um grão de mostarda, nada vos será impossível.\" (Mateus 17:20)");
			System.out.println("A palavra diz que a fé vem pelo ouvir da palavra, leia a palavra e toda convicção o Espítiro Santo trará ao seu coração! :)");
			break;
		case 4:
			System.out.println("4 - Perseverança: \"Mas aquele que perseverar até o fim será salvo.\" (Mateus 24:13)");
			System.out.println("\"Não nos cansemos de fazer o bem, pois no tempo próprio colheremos, se não desanimarmos.\" (Gálatas 6:9)");
			System.out.println("Não desanime! Vidas serão incrivelmente transformadas através da sua! :)");
			break;
		case 5:
			System.out.println("5 - Perda: \"Ele enxugará dos seus olhos toda lágrima, e não haverá mais morte, nem tristeza, nem choro, nem dor.\" (Apocalipse 21:4)");
			System.out.println("\"O Senhor o deu, o Senhor o levou; bendito seja o nome do Senhor.\" (Jó 1:21)");
			System.out.println("O Senhor conhece seu coração e Ele cuidará de tudo neste momento difícil! Descanse no Senhor! :)");
			break;
		case 6:
			System.out.println("6 - Solidão: \"Eis que estou convosco todos os dias, até a consumação dos séculos.\" (Mateus 28:20)");
			System.out.println("\"Ainda que meu pai e minha mãe me abandonem, o Senhor me acolherá.\" (Salmos 27:10)");
			System.out.println("O Senhor NUNCA te abandonará! Busque Nele ser completo, só assim entenderá que independente de pessoas...você tem tudo o que mais precisa! :)");
			break;
		case 7:
			System.out.println("7 - Cansaço: \"Vinde a mim todos os que estais cansados e sobrecarregados, e eu vos aliviarei.\" (Mateus 11:28)");
			System.out.println("\"Ele fortalece o cansado e dá grande vigor ao que está sem forças.\" (Isaías 40:29)");
			System.out.println("Entregue ao Senhor seus fardos, Ele te suprirá e cuidará de você a todo momento! :)");
			break;
		case 8:
			System.out.println("8 - Dúvida: \"Confia no Senhor de todo o teu coração e não te apoies em teu próprio entendimento.\" (Provérbios 3:5)");
			System.out.println("\"Se algum de vocês tem falta de sabedoria, peça-a a Deus, que a todos dá livremente.\" (Tiago 1:5)");
			System.out.println("Busque a Deus no seu secreto e Ele trará a convicção e a Paz ao seu coração e mente! :)");
			break;
		case 9:
			System.out.println("9 - Cuidado: \"Lançai sobre ele toda a vossa ansiedade, porque ele tem cuidado de vós.\" (1 Pedro 5:7)");
			System.out.println("\"O Senhor é o meu pastor; nada me faltará.\" (Salmos 23:1)");
			System.out.println("Ele é um pai zeloso, Ele cuidará de você! Se permita ser amado! :)");
			break;
		case 10:
			System.out.println("10 - Ansiedade: \"Não andeis ansiosos por coisa alguma; em tudo, porém, sejam conhecidas diante de Deus as vossas petições.\" (Filipenses 4:6)");
			System.out.println("\"Entregue o seu caminho ao Senhor, confie nele, e o mais ele fará.\" (Salmos 37:5)");
			System.out.println("Se lembre de não permitir que sensações e medos sejam maiores do que a verdade! Ele cuidará de tudo! Busque ajuda e confie no Senhor, tudo isso vai passar! :)");
			break;
		case 11:
			System.out.println("11 - Depressão: \"Por que estás abatida, ó minha alma? Espera em Deus, pois ainda o louvarei.\" (Salmos 42:11)");
			System.out.println("\"Venham a mim todos vocês que estão cansados e sobrecarregados, e eu lhes darei descanso.\" (Mateus 11:28)");
			System.out.println("Entregue suas angústias ao Senhor! Você passará por este momento difícil! Busque ajuda e lembre-se de que o Senhor tem grandes planos para sua vida, confie Nele! :)");
			break;
		case 12:
			System.out.println("12 - Promessa: \"Porque eu bem sei os planos que tenho para vós, diz o Senhor: planos de paz e não de mal, para vos dar um futuro e uma esperança.\" (Jeremias 29:11)");
			System.out.println("\"O Senhor cumprirá o seu propósito para comigo; o teu amor, Senhor, permanece para sempre.\" (Salmos 138:8)");
			System.out.println("O Senhor tem planos maravilhosos para sua vida! Alegre-se e persevere!");
			break;
		default:
			System.out.println("Você digitou uma opção que não está no nosso menu, você poderia checar e digitar novamente?");
		}
		leia.close();
	}

}
