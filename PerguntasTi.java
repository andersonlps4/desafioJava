package desafio;

import java.util.Scanner;

public class PerguntasTi {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            
        String nome;
        int resposta1, resposta2, resposta3, resposta4, resposta5, resposta6, resposta7, resposta8, resposta9, resposta10;
        int acertos = 0;
        int status;

        System.out.println("-------------------------------------");
        System.out.println("         Avaliação escolar");
        System.out.println("-------------------------------------");
        
        System.out.print("Digite o seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Questão 1 - Qual o comando usado para imprimir na mesma linha: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" 1) System.out.println();");
        System.out.println(" 2) System.out.printf(); ");
        System.out.println(" 3) System.out.print (); ");
        System.out.println(" 4) Scanner teclado = new Scanner(System.in);");  
        
        System.out.print("Resposta: ");
        resposta1 = ler.nextInt();
        
        if(resposta1 == 3 ){
            acertos++;
        }
       
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 2 - Qual comando se traduz por psvm");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) public static void main (Int[] args)  ");
        System.out.println("2) public static void main (String[] args)");		
        System.out.println("3) public String void main (String[] args) ");
        System.out.println("4) public Scanner void main (String[] args)");
        
        System.out.print("Resposta: ");
        resposta2 = ler.nextInt();
        
        if(resposta2 == 2 ){
            acertos++;
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("3) Qual caractere é usado para abrir e fechar escopos?");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1)() ");
        System.out.println("2)[]");
        System.out.println("3)<> ");
        System.out.println("4){}");
        
        System.out.print("Resposta: ");
        resposta3 = ler.nextInt();
  
        if(resposta3 == 4 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 4 - Qual dessas alternativas não é uma classe invólucro: ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) Boolean");
        System.out.println("2) Character");
        System.out.println("3) Int");
        System.out.println("4) Short");
        
        System.out.print("Resposta: ");
        resposta4 = ler.nextInt();
  
        if(resposta4 == 3 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 5 - Um dev iniciante está desenvolvendo um programa em Java, "
                + "ele está em dúvida sobre qual alternativa é a correta para fazer a entrada de"
                + " dados de uma String. Ajude-o a responder a questão: ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) teclado.nextInt()");
        System.out.println("2) teclado.nextDouble(); ");
        System.out.println("3) teclado.nextFloat(); ");
        System.out.println("4) teclado.nextLine ");
        
        System.out.print("Resposta: ");
        resposta5 = ler.nextInt();
  
        if(resposta5 == 4 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 6 - Qual dessas formas não está correta para declarar variáveis: ");
		System.out.println("------------------------------------------------------------------");
        System.out.println("1) String nome = Eduardo");
        System.out.println("2) int idade = 3;");
        System.out.println("3) char letra = (char) “A”");
        System.out.println("4) Boolean casado = new Boolean(false)");
        
        System.out.print("Resposta: ");
        resposta6 = ler.nextInt();
  
        if(resposta6 == 1 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 7 - Analise as alternativas a seguir e responda "
                + "qual delas define corretamente o que é 'Método'");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) (...)O método se refere ao tempo de vida e acessibilidade de uma variável(...)");
        System.out.println("2) (...)Um método é uma maneira de executar alguma tarefa.(...)");
        System.out.println("3) (...)é a saída padrão, que permite exibir as Strings"
                + " no console (terminal) de comando quando o aplicativo de Java é executado.(...)");
        System.out.println("4) (...)implementa as operações de entrada de dados pelo teclado no console.(...)");
        
        System.out.print("Resposta: ");
        resposta7 = ler.nextInt();
  
        if(resposta7 == 2 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 8 - A alternativa que contém apenas operadores válidos na linguagem Java é");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) /, !=, >= e *");
        System.out.println("2) +, ==, <> e %");
        System.out.println("3) -, :=, != e /");
        System.out.println("4) *, <=, ** e >");
        
        System.out.print("Resposta: ");
        resposta8 = ler.nextInt();
  
        if(resposta8 == 1 ){
            acertos++;
        }  
	
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 9 - Observe a seguinte operação e indique qual será  "
                + "resultado ao usar o comando System.out.print(calculo)"
                + "\nclass main{"
                + "\nint a = 8;"
                + "\nint b = 7;"
                + "\nint c = 9;"
                + "\nint calculo = (a * b) / c;"
                + "\n }");
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("1) calculo = 6,2");
        System.out.println("2) calculo = 6f");
        System.out.println("3) calculo = 6,2f");
        System.out.println("4) Impossível, pois as variáveis são inteiras e o resultado é um float");
        
        System.out.print("Resposta: ");
        resposta9 = ler.nextInt();
  
        if(resposta9 == 1 ){
            acertos++;
        }  
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Questão 10 - Analise as alternativas a seguir e responda "
                + "qual delas define corretamente o que é 'Encapsulamento'");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) (...)é um bloco de código ou coleção de instruções "
                + "ou um conjunto de códigos agrupados para executar uma determinada tarefa ou operação.(...)");
        System.out.println("2) (...)um programa que executa os aplicativos Java.(...)");
        System.out.println("3)  (...) bibliotecas (API’s) necessárias para criação de programas em Java (...)");
        System.out.println("4)  (...)separar o programa em partes, o mais isoladas possível. (...)");
        
        System.out.print("Resposta: ");
        resposta10 = ler.nextInt();
  
        if(resposta10 == 4 ){
            acertos++;
        }  
	      
        System.out.println("--------------------------------------------------------");
        System.out.println("                    FIM DAS QUESTÕES                    ");
        System.out.println("--------------------------------------------------------");
        
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de acertos: " + acertos);
        if(acertos <=6){
            System.out.println("Status: Reprovado");
        } else{
            System.out.println("Aprovado");
        }




        System.out.println("-------------Gabarito ---------  Resposta Correta ------- ");
        System.out.println("Questão 1: "+ resposta1 +"------------Item 3--------------");
        System.out.println("Questão 2: "+ resposta2 +"------------Item 2--------------");
        System.out.println("Questão 3: "+ resposta3 +"------------Item 4--------------");
        System.out.println("Questão 4: "+ resposta4 +"------------Item 3--------------");
        System.out.println("Questão 5: "+ resposta5 +"------------Item 4--------------");
        System.out.println("Questão 6: "+ resposta6 +"------------Item 1--------------");
        System.out.println("Questão 7: "+ resposta7 +"------------Item 2--------------");
        System.out.println("Questão 8: "+ resposta8 +"------------Item 1--------------");
        System.out.println("Questão 9: "+ resposta9 +"------------Item 1--------------");
        System.out.println("Questão 10: "+ resposta10 +"----------Item 4--------------");   
    }

    }  