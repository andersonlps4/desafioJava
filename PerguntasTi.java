package desafio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerguntasTi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int acertos = 0;
		int entrada = 0;
		ArrayList<Questao> questoes = new ArrayList<Questao>();
		
		Questao questao1 = new Questao();
		questao1.setEnunciado("1) Qual o comando para imprimir na mesma linha? ");
		String[] alternativas = new String[4];
		alternativas[0] = "1)"+" System.out.printf";
		alternativas[1] = "2)"+" System.out.println";
		alternativas[2] = "3)"+" System.out.print";
		alternativas[3] = "4)"+" Scanner teclado = new Scanner(System.in);";
		questao1.setAlternativas(alternativas);
		questao1.setAlternativaCorreta(3);
		
		questoes.add(questao1);
		
		Questao questao2 = new Questao();
		questao2.setEnunciado("2) Qual comando se traduz por psvm?	 ");
		String[] alternativas2 = new String[4];
		alternativas2[0] = "1)"+" public static void main (Int[] args) ";
		alternativas2[1] = "2)"+" public static void main (String[] args)";
		alternativas2[2] = "3)"+" public String void main (String[] args) ";
		alternativas2[3] = "4)"+" public Scanner void main (String[] args)";
		questao2.setAlternativas(alternativas2);
		questao2.setAlternativaCorreta(2);
		
		questoes.add(questao2);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("                 SISTEMA DE AVALIAÇÃO ESCOLAR                     ");
		System.out.println("------------------------------------------------------------------");
		
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		
		for (Questao questao : questoes) {
			System.out.println("------------------------------------------------------------------");
			System.out.println(questao.getEnunciado());
			System.out.println("------------------------------------------------------------------");
			System.out.println(questao.getAlternativas()[0]);
			System.out.println(questao.getAlternativas()[1]);
			System.out.println(questao.getAlternativas()[2]);
			System.out.println(questao.getAlternativas()[3]);
			
			System.out.print("Resposta: ");
			entrada = teclado.nextInt();
			if (entrada == questao.getAlternativaCorreta()) {
				acertos++;
			}
			
			
		}
		System.out.println("Nome do aluno: " + nome);
		System.out.println("numeros de acertos: " + acertos);
		if (acertos >= 7) {
			System.out.println("Voce foi aprovado");
		}else {
			System.out.println("Você foi reprovado");
			
		}
		System.out.println("------------GABARITO-----------");
		
		System.out.println("Questão 01 - " + questao1.getAlternativaCorreta());
		System.out.println("Questão 02 - " + questoes.get(1).getAlternativaCorreta());
		System.out.println();
		
		for (Questao questao : questoes) {
			System.out.println(questao.getAlternativaCorreta());
			
		}
		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1) Qual o comando para imprimir na mesma linha? ");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+" System.out.printf");
//		System.out.println("2)"+" System.out.println");
//		System.out.println("3)"+" System.out.print");
//		System.out.println("4)"+" Scanner teclado = new Scanner(System.in);");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 3 ) {
//		entrada = teclado.nextInt();
//		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("2) Qual comando se traduz por psvm?	 ");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+" public static void main (Int[] args)  ");
//		System.out.println("2)"+" public static void main (String[] args)");
//		System.out.println("3)"+" public String void main (String[] args) ");
//		System.out.println("4)"+" public Scanner void main (String[] args)");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 2 ) {
//		entrada = teclado.nextInt();
//		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("3) Qual caractere é usado para abrir e fechar escopos ?");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+" () ");
//		System.out.println("2)"+" []");
//		System.out.println("3)"+" <> ");
//		System.out.println("4)"+" {}");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 4 ) {
//		entrada = teclado.nextInt();
//		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("4) Qual dessas alternativas não é uma classe invólucro:");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+" Boolean");
//		System.out.println("2)"+" Character");
//		System.out.println("3)"+" Int ");
//		System.out.println("4)"+" Short");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 3 ) {
//		entrada = teclado.nextInt();
//		
//		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("5) Um dev iniciante está desenvolvendo um programa em Java, ele está em dúvida sobre qual alternativa é a correta para fazer a entrada de dados de uma String. Ajude-o a responder a questão");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+" teclado.nextInt():");
//		System.out.println("2)"+" teclado.nextDouble();");
//		System.out.println("3)"+" teclado.nextFloat();");
//		System.out.println("4)"+" teclado.nextLine;");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 3 ) {
//		entrada = teclado.nextInt();
//		
//		
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("5)A alternativa que contém apenas operadores válidos na linguagem Java é");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("1)"+"  +, ==, <> e %.");
//		System.out.println("2)"+"  -, :=, != e /.");
//		System.out.println("3)"+"  *, <=, ** e >.");
//		System.out.println("4)"+"  /, !=, >= e *.");
//		
//		System.out.print("Resposta: ");
//		//if(entrada == 1 ) {
//		entrada = teclado.nextInt();
	}

}

