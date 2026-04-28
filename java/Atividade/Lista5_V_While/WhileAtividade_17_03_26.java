package Atividade.Lista5_V_While;


import java.util.Random;
import java.util.Scanner;

public class WhileAtividade_17_03_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random ale = new Random();

        
/*        
//============================================================================== 
//Exercício 1: Cálculo da média de idade de uma turma
//Desenvolver um algoritmo que calcula a média de idade dos alunos de uma turma. 
//O usuário deve informar a idade de cada aluno e digitar um valor negativo para indicar o fim da entrada de dados.

    double MediaIdade = 0;
    int aluno = 1;
    int media = 0; 
    
    System.out.println("\n========================================================");
    System.out.println("Digite quanto Alunos você quer Fazer a Média das idades.");
        int QuPes = sc.nextInt();
    System.out.println("\n");
    
    while (media < QuPes) {
        System.out.print("Digite a Idade do " +aluno+ "° aluno: ");
            double Idade = sc.nextDouble();
        
        MediaIdade += Idade;
        media++;
        aluno++;
        
        if (Idade <= 3) {
            System.out.println("Idade Invalida, Ninguém ia tá em uma escola com menos de 4 Anos");
            break;
        
        } else if (Idade >= 90) {
            System.out.println("É para digitar uma Idade Real, esse aí já morreu a tempos");
            break;
    }
    }
    System.out.println("\nA média de idade dos " +(aluno -1)+ " é: " +(MediaIdade / QuPes));
//============================================================================== 
*/

/*
//============================================================================== 
//Exercício 2: Validação de senha
//Criar um algoritmo que solicita uma senha ao usuário e verifica se ela é igual à senha correta "1234" 
//O programa deve continuar solicitando a senha até que o usuário digite a senha correta.

    int Tentativas = 1;
    
    System.out.println("==============================================");
    System.out.print("Digite O Nome do Usuario: ");
        String Nome = sc.nextLine();
    
    System.out.print("Digite a Senha: ");    
        int Senha = sc.nextInt();
    
    while (Senha != 1234) {
        if (Tentativas >= 5) {
            System.out.println("Limete de Tentativas Alcançadas, Tente Novamente Mais Tarde");
            return;
        }
         
        Senha = 0;
        System.out.print("Digite a Senha Novamente: ");
            int SenhaNova = sc.nextInt();
        
        Senha += SenhaNova;
        Tentativas ++;
    }
    if (Tentativas >= 3) {
            
        System.out.println("login Realizado, Bem Vindo " +Nome+ " !");
        System.out.println("Você Errou a Senha " +(Tentativas - 1)+ " Vezes, "
+ "Anote em Um papel para não esquecer Na Próxima");    
    
    } else {
        System.out.println("login Realizado, Bem Vindo " +Nome+ " !");
    }
//============================================================================== 
*/       

/*
//============================================================================== 
//Exercício 3*: Tabuada de um número
//Criar um algoritmo que exibe a tabuada de um número inteiro positivo informado pelo usuário. 
//O programa deve validar se o número digitado é positivo antes de exibir a tabuada.

    int End = 0;
    int Multiplicador = 1;
    int Outro = -1;
    
    System.out.println("==============================================");
    System.out.print("Digite um Número: ");
        int Num = sc.nextInt();
    System.out.print("Agora digite até onde você quer a tabuada dele vá: ");
        int Tabuada = sc.nextInt();
        
    if (Num <= 0) {
        while (Outro < 0) {
            System.out.println("\n Somente Números Possitivos");
            System.out.print("Digite outro Número: ");
            int OutroNum = sc.nextInt();
            Outro = OutroNum;    
        }
        
        while (Tabuada > End) {
            End++;
            int Resultado = Outro * Multiplicador;
            System.out.println(Outro+ " X " +Multiplicador+ " = " +Resultado);

            Multiplicador++;
        }  
    }
    
    while (Tabuada > End) {
        End++;
        int Resultado = Num * Multiplicador;
        System.out.println(Num+ " X " +Multiplicador+ " = " +Resultado);
        
        Multiplicador++;
    }
//============================================================================== 
*/

/*
//============================================================================== 
//Exercício 4 (DESAFIO): Jogo de par ou ímpar
//Criar um jogo de par ou ímpar contra o computador. 
//O usuário escolhe entre par ou ímpar e digita um número de 0 a 5. 
//O computador gera um número aleatório de 0 a 5, e o programa verifica quem ganhou a rodada. 
//O jogo continua até que o usuário digite "sair" para encerrar.

//==============================================================================
int Finalizador = 0; // Isso está só para iniciar o Loop, precisa de uma variavel antes
while (Finalizador < 10) { // esse valor só tá ai para o loop aconter

for (int i = 0; i < 20; i++) { // Isso aq é para dar espaço para não apacer os codigos do programa inicinando 
System.out.println("  "); }
    
    System.out.println("======================================");
    System.out.print("Escolha entre PAR ou IMPAR: ");
        String PaIm = sc.nextLine().toLowerCase(); // o toLowerCase é para fazer mesmo que ele digite com tudo maiuscula ele poder jogar
        
    if (PaIm.equals("par")) { // se ele escrever par vai rodar tudo isso
        System.out.println("\nVocê escolher PAR");
        System.out.print("Agora digite um Número: ");
            int NuPAR = sc.nextInt();
        
        int NumMAC = ale.nextInt(10); // Esse linha faz ser gerado um numero aleatorio entre 0 e 10
        System.out.println("O Número que a Maquina Escolhou foi " +NumMAC);
        
        int SomaPar = NuPAR + NumMAC; // Aqui soma o Número que o User e a Maquina escolheram, para pode saber se é par ou Impar
        
        if (SomaPar % 2 == 0) { // if dentro de if, já tá podendo se jogar da ponte ?, mais isso serve para ver se o número é par
            System.out.println("\nVocê Ganhou !!!");
            System.out.println("A soma dos Número escolhidos deu " +SomaPar);
            System.out.println("Que é Um Número PAR");
            
        } else if (SomaPar % 2 == 1) { // aqui é para ver se o número é impar
            System.out.println("\nA Máquina Ganhou !!!");
            System.out.println("A soma dos Número escolhidos deu " +SomaPar);
            System.out.println("Que é Um Número IMPAR");
        }
    
        
    } else if (PaIm.equals("impar")) { // Mesmo esquema, se ele digitou impar vai rodar isso
        System.out.println("\nVocê escolher IMPAR");
        System.out.print("Agora digite um Número: ");
            int NuIM = sc.nextInt();
        
        int NumMAC = ale.nextInt(10);
        System.out.println("O Número que a Maquina Escolhou foi " +NumMAC);
        
        int SomaImpar = NuIM + NumMAC;
        
        if (SomaImpar % 2 == 0) {
            System.out.println("\nA Máquina Ganhou !!!");
            System.out.println("A soma dos Número escolhidos deu " +SomaImpar);
            System.out.println("Que é Um Número PAR");

        } else if (SomaImpar % 2 == 1) {
            System.out.println("\nVocê Ganhou !!!");
            System.out.println("A soma dos Número escolhidos deu " +SomaImpar);
            System.out.println("Que é Um Número IMPAR");
        }
    
        
    } else { // Se ele deu Miss Click ou só tá fazendo Graça digitando coisas nd a ver, o Código vai parar, ele para por n tem usar o GoTo aq
        System.out.println("Por Favor, digite somente a sua escolha entre PAR ou IMPAR");
        break;
    }
    
    sc.nextLine();
        int end = 0;
        while (end < 10) { // Loop dentro de loop, eu tô complicando a minha vida
        System.out.println("\n\nDeseja jogar novamente ? (sim / nao)");// Aqui o Loop só vai para se ele Digitar sim ou nao, se fazer Graça vai ficar no Loop
            String NewGame = sc.nextLine().toLowerCase();

        if ( (NewGame.equals("nao")) || (NewGame.equals("n")) || (NewGame.equals("no")) ) {
            Finalizador += 100; // Se ele não quer jogar vai fazer o loop parar, tá um número muito alto pq fiquei com raiva q n tava funcionando que coloquei isso
            break;

        } else if ( (NewGame.equals("sim")) || (NewGame.equals("s")) || (NewGame.equals("yes")) ) {
            break; // esse Break só para o Loop da escolha de Sim ou nao

        } else { // Se ele foi engraçadinho vai ficar repetindo o loop
            System.out.println("Escolha somente entre Sim ou Nao");
        } }
    }
//==============================================================================
*/
}
}