package desafio;
import java.util.Scanner;

public class PerguntasTi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int entrada = 0;
		boolean resposta1, resposta2 ,resposta3, resposta4,resposta5,resposta6,resposta7,resposta8,resposta9,resposta10 ,media;
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("                 SISTEMA DE AVALIAÇÃO ESCOLAR                     ");
		System.out.println("------------------------------------------------------------------");
		
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("1) Qual o comando para imprimir na mesma linha? ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+" System.out.printf");
		System.out.println("2)"+" System.out.println");
		System.out.println("3)"+" System.out.print");
		System.out.println("4)"+" Scanner teclado = new Scanner(System.in);");
		
		System.out.print("Resposta: ");
		//if(entrada == 3 ) {
		entrada = teclado.nextInt();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("2) Qual comando se traduz por psvm?	 ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+" public static void main (Int[] args)  ");
		System.out.println("2)"+" public static void main (String[] args)");
		System.out.println("3)"+" public String void main (String[] args) ");
		System.out.println("4)"+" public Scanner void main (String[] args)");
		
		System.out.print("Resposta: ");
		//if(entrada == 2 ) {
		entrada = teclado.nextInt();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("3) Qual caractere é usado para abrir e fechar escopos ?");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+" () ");
		System.out.println("2)"+" []");
		System.out.println("3)"+" <> ");
		System.out.println("4)"+" {}");
		
		System.out.print("Resposta: ");
		//if(entrada == 4 ) {
		entrada = teclado.nextInt();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("4) Qual dessas alternativas não é uma classe invólucro:");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+" Boolean");
		System.out.println("2)"+" Character");
		System.out.println("3)"+" Int ");
		System.out.println("4)"+" Short");
		
		System.out.print("Resposta: ");
		//if(entrada == 3 ) {
		entrada = teclado.nextInt();
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("5) Um dev iniciante está desenvolvendo um programa em Java, ele está em dúvida sobre qual alternativa é a correta para fazer a entrada de dados de uma String. Ajude-o a responder a questão");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+" teclado.nextInt():");
		System.out.println("2)"+" teclado.nextDouble();");
		System.out.println("3)"+" teclado.nextFloat();");
		System.out.println("4)"+" teclado.nextLine;");
		
		System.out.print("Resposta: ");
		//if(entrada == 3 ) {
		entrada = teclado.nextInt();
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("5)A alternativa que contém apenas operadores válidos na linguagem Java é");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1)"+"  +, ==, <> e %.");
		System.out.println("2)"+"  -, :=, != e /.");
		System.out.println("3)"+"  *, <=, ** e >.");
		System.out.println("4)"+"  /, !=, >= e *.");
		
		System.out.print("Resposta: ");
		//if(entrada == 1 ) {
		entrada = teclado.nextInt();
	}

}

