package Atividade;

import java.util.Random;
import java.util.Scanner;

public class Lista6_VI_DoWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
//==============================================================================

        /*
//==============================================================================
//Exercício 1: Soma de números até o usuário digitar 0
// Criar um algoritmo que leia vários números inteiros e calcule a soma deles, 
// parando quando o usuário digitar o número 0.

for (int i = 0; i < 10; i++) { System.out.println(" "); } //Aqui é para dar espaço para não aparecer a Inicialização do java

int Num; // aqui são as variaveis universal
int Res = 0;
int quantidade = 0;
    
    System.out.print("Digite um Número: "); // começo com esse Print só para não aparecer a Mensagem se digitar 0 ele sair
        int Num1 = sc.nextInt();

    do {
        quantidade++; // Aqui é só para aumentar o Número para pessoa ver quantos números ela digitou  
        
        System.out.println("\n\nPara ver a soma dos Número Digitados, digite 0");
        System.out.print("Digite um Número: "); 
            Num = sc.nextInt();
            
        Res += Num;
        
    } while ( Num != 0);  { // Não sei pq o "diferente de" funcionou sendo q tem que digitar o 0 para sair
        System.out.println("A suma dos " +quantidade+ " Número é = " + (Res + Num1) ); // O Num1 é o Primeiro Número que o user digita antes de entar nu Loop
    }
//==============================================================================
         */
 /*        
//==============================================================================
//Exercício 2: Média de notas com validação
// Criar um algoritmo que leia 4 notas de um aluno, 
// validando se as notas estão entre 0 e 10. Calcular e exibir a média das notas.

for (int i = 0; i < 15; i++) { System.out.println(" "); }
   
double soma = 0;
double Nota;
int Periodo = 1;

    do {
        System.out.print("Digite a Nota do " +Periodo+ "° Bimestre: ");
            Nota = sc.nextDouble();
        
        
        if ( (Nota < 0) || (Nota > 10) ){
            System.out.println("Nota invalida");
            Thread.sleep(1500);
            System.out.println("\n\n\n");

    
        } else if ( (Nota > -1) || (Nota < 11) ) {
            soma += Nota;
            Periodo++;    
        }
        
    } while (Periodo <=4 );
         System.out.printf ("\n\nA Media da sua Nota é %.2f" , (soma / 4) );
//==============================================================================
         */

 /*
//==============================================================================
// Exercício 3: Contagem regressiva com pausa
// Criar um algoritmo que faça uma contagem regressiva de 10 a 1, 
// com um intervalo de 1 segundo entre cada número.

for (int i = 0; i < 20; i++) { System.out.println(" "); }

int Contagem = 10;

         System.out.println("Iniciando contagem regressiva");
    do {
        System.out.println(Contagem);
        Contagem--;
        Thread.sleep(1000);
        System.out.println(".");
        
    } while (Contagem != 0); {
         System.out.println("0");
         System.out.println("\n LANÇAR");
     }
//==============================================================================
         */

 /*
//==============================================================================
// Exercício 4: Menu de opções com do-while
// Criar um menu de opções com as seguintes escolhas: 1- Cadastrar, 2- Consultar, 
// 3- Sair. O programa deve repetir a exibição do menu e a leitura da opção até que o usuário escolha a opção 3 (Sair).
for (int i = 0; i < 20; i++) { System.out.println(""); }

int Opc = 0;
    do {
for (int i = 0; i < 20; i++) { System.out.println(""); }
        
        System.out.println("=================================");
        System.out.println("         Willan Banco");
        System.out.println("=================================\n");
    
    
        System.out.println("Escolha uma das Opções Abaixo");
        
        System.out.println("=================================");
        System.out.println("1- Novo Cliente (Criar conta)");
        System.out.println("2- Já sou Cliente (Acessar conta)");
        System.out.println("3- Sair");
        System.out.println("=================================");
        System.out.print("=⟫ ");
            Opc = sc.nextInt();

        if (Opc == 1) {
            System.out.println("Bem Vindo");
            System.out.println("Por Favor nós Informe o seu CPF: ");
                String CPF = sc.nextLine();
                CPF = sc.nextLine();
            
            System.out.println("Fale o ano que você Nasceu: "); 
                String Nascimento = sc.nextLine();
                Thread.sleep(1000);
        
        } else if (Opc == 2) {
            System.out.println("O valor na sua conta é de R$ 67,67");
                Thread.sleep(2000);
        }    
            
    } while (Opc != 3); 
            
         
         if (Opc == 3) {    
        System.out.println("\n\n\nAffff, não deu para enganar esse");
        System.out.println("Vou tentar oferecer um CDB de 200% para outro");
    }
//==============================================================================
         */

 /*
//==============================================================================
// Exercício 5: Jogo de adivinhação com do-while
// Criar um jogo de adivinhação onde o programa gera um número aleatório entre 
// 1 e 100, e o usuário tenta adivinhar. O programa deve fornecer dicas 
// (maior ou menor) e contar as tentativas. O jogo termina quando o usuário acerta o número.

for (int i = 0; i < 20; i++) { System.out.println(""); }

int Vida = 3;
int Numero = ale.nextInt(100)+1;
int Chute = 0; 
    do {
        
        System.out.println("=========================" +Numero);
        System.out.println("   Adivinhe o Número     ");
        System.out.println("=========================\n");
        
        System.out.println("Você tem " +Vida+ " Vidas");
        
        System.out.println("Digite o Número que você acha que é: ");
            Chute = sc.nextInt();
            
        if (Chute > Numero) {
            System.out.println("O Número que você Digitou é maior que o Número");
            Thread.sleep(1500);
            System.out.println("\n\n\n");
            Vida--;
        
        } else if (Chute < Numero) {
            System.out.println("O Número Digitado é Menor que o Número que você tem que adivinhar");
            Thread.sleep(1500);
            System.out.println("\n\n\n");
            Vida--;
        }
        
    
    } while ( Vida > 0  &&  Chute != Numero ); 
    
         if (Vida == 0) {
             System.out.println("Você usou todas as Tentatifas");
             System.out.println("E não conseguiu acertar o Número, Melhore");
                Thread.sleep(1500);

         
         } else if (Chute == Numero) {
            System.out.println("Você acertou o Número que era " +Numero);
                Thread.sleep(1500);
         }
//==============================================================================
*/
 
/* 
//==============================================================================
//Exercício 6: O Biscoito da Sorte: 
//Simule a abertura de um biscoito mostrando uma mensagem de sorte (que pode ser fixa ou escolhida aleatoriamente). 
//Depois, o utilizador deve decidir se quer abrir outro biscoito ou parar, digitando 1 ou 0. 
//O laço do while é ideal aqui, pois garante que o primeiro biscoito seja sempre aberto antes da verificação da condição
for (int i = 0; i < 20; i++) { System.out.println(""); }

int Sair = 0;
String Escolha = "";

String Nu0 = "Cuidado: um período de grande turbulência se aproxima. Evite riscos desnecessários e prepare-se para enfrentar desafios difíceis.";
String Nu1 = "Cuidado com decisões impulsivas esta semana. Um pequeno descuido pode trazer contratempos.";
String Nu2 = "Alguém próximo pode não estar sendo totalmente sincero. Mantenha os olhos abertos.";

String Nu3 = "Uma sombra do passado retornará em breve. O que ela revelará depende apenas de você."; 
String Nu4 = "Algo que você procura há muito tempo está mais perto do que imagina, mas exige uma escolha difícil.";

String Nu5 = "Um vento favorável está soprando em sua direção. Grandes oportunidades surgirão em breve.";
String Nu6 = "A sorte sorri para quem age com coragem. Seu momento de brilhar está chegando.";
String Nu7 = "Uma onda extraordinária de boa sorte está prestes a chegar. Sucesso, prosperidade e alegrias inesperadas transformarão sua vida nos próximos meses.";

do {
int Numero = ale.nextInt(8);
    
    System.out.println("Você pega um Biscoito da Sorte ");
    System.out.println(" Você o abre e ler a Seguinte Mensagem: " );
        Thread.sleep(2000);

    if (Numero == 0) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu0);
            Thread.sleep(2000);

        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;

            }
        }
            
        
    } else if (Numero == 1) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu1);
            Thread.sleep(2000);

        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }
        
        
    } else if (Numero == 2) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu2);
            Thread.sleep(2000);
       
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }
        
        
    }  else if (Numero == 3) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu3);
            Thread.sleep(2000);
        
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }
        
    }  else if (Numero == 4) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu4);
            Thread.sleep(2000);

        
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }        
    
    
    }  else if (Numero == 5) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu5);
            Thread.sleep(2000);
        
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ((Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }

        
}  else if (Numero == 6) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu6);
            Thread.sleep(2000);
        
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if (Escolha.equals("nao") || (Escolha.equals("n")) || (Escolha.equals("no")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }        

        
}  else if (Numero == 7) {
        Sair = 0;
        System.out.println("\n\n\n");
        System.out.println(Nu7);
            Thread.sleep(2000);
        
        while (Sair != 1) {
            System.out.println("\nVocê quer Abrir Outro Biscoito (s/n):");
               Escolha = sc.nextLine();

            if ( (Escolha.equals("nao")) || (Escolha.equals("n")) || (Escolha.equals("não")) ) {
                Sair = 1;
                break;

            } else if ( (Escolha.equals("sim")) || (Escolha.equals("s")) ) {
                Sair = 1;
            }
        }        
}
        
        
} while ( (!Escolha.equals("nao")) && (!Escolha.equals("n")) && (!Escolha.equals("no")) ); { 
        System.out.println("\n");
        System.out.println("Você se contetou com oque tirou e não quer tentar a Sorte Novamente");
    }   
//==============================================================================
*/

/*
//==============================================================================
// Exercício 7: A Bomba de Ar: 
//O programa simula encher o pneu da bicicleta. A cada bombada, a pressão aumenta em 10 unidades e o programa pergunta se o pneu já está cheio 
//(1 para SIM, 2 para NÃO). Enquanto a resposta for NÃO, o programa continua a dar bombadas de ar. 
//O uso do do while assegura que pelo menos uma bombada seja dada antes da verificação
for (int i = 0; i < 15; i++) {System.out.println("");}

int Pneu = 0;
String ponto = ".";
String Encher = "";

do {
    System.out.println("\n\n\n");
    System.out.print("Enchendo o Pneu" + "\r" +ponto);
        ponto += ".";

if (ponto.equals("....")) {
    ponto = ""; }

    System.out.println("\nO Pneu já está cheio?");
    System.out.println("1 para Sim / 2 para N");
        Encher = "";
        Encher = sc.nextLine().toLowerCase();
    
    if ( Encher.equals("n") || (Encher.equals("nao")) || (Encher.equals("2")) ) {
        Pneu += 10;
        System.out.println(ponto);
            Thread.sleep(1000);
    }
    
   
} while ( (!Encher.equals("s")) && (!Encher.equals("sim")) && (!Encher.equals("1")) && (Pneu != 110) );

    if ( (Encher.equals("s")) || (Encher.equals("sim")) || (Encher.equals("1")) ) {
        if (Pneu == 0) {
            System.out.println("É serio que tu não quiz dar nem uma Bombadinha, triste");
        
        } else if (Pneu <= 60) {
            System.out.println("Ele ainda tá muito vazil, tem que Bombar mais");
            System.out.println("Pois ele está " +Pneu+ "% Cheio");
    
        } else if (Pneu <= 100) {
            System.out.println("Já está bom De Bombar, seu Pneu está " +Pneu+ "%");
        }
        
    } else if (Pneu >= 100) {
        System.out.println("Seu Pneu estouro, kkk se fudeu");
    }
//==============================================================================
*/    
    
/*    
//==============================================================================
// Exercício 8: O Papagaio Irritante: 
// Peça ao utilizador que digite um número e repete esse número no ecrã. 
// Em seguida, solicita outro número e continua repetindo até que o utilizador digite a palavra mágica 
// (por exemplo, o número 999), que faz o papagaio finalmente parar e “dormir”. 
// O do while garante que o papagaio repita pelo menos uma vez antes de verificar se deve parar.
for (int i = 0; i < 15; i++) {System.out.println("");}

String Escolha = "";

do {
    System.out.println("\n");
    System.out.print("Digite Um número: ");
        Escolha = sc.nextLine().toLowerCase().trim();
        
    if (Escolha.equals("calaboca")) {
        break; }

    
    System.out.println("Seu papagaio vê oque você digitou, e começa a repetir");
        Thread.sleep(1500);

    int Nu = Integer.parseInt(Escolha);    
        
    for (int i = 0; i < Nu; i++) {
        System.out.println("crrác crrác " +Nu+ " "); 
    }    
    
    

} while ( (!Escolha.equals("calaboca")) && (!Escolha.equals("cala boca")) ); {
        System.out.println("\n\n\n");
        System.out.println("Seu Papagaio viu que você se irrou e parou");
        System.out.println("Ele sabe se continuar, ele vai parar na boca do gato");
    }
//==============================================================================
*/    
    
    
}   }