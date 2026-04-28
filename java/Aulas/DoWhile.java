package Aulas;


import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        Random ale = new Random();
//==============================================================================

/*
//==============================================================================
for (int i = 0; i < 20; i++) { System.out.println("  "); }
 
    int OpcaoEscolhida;
    
    System.out.println(" == BEM-VINDO AO SISTEMA DO JOGO == "); 
    
    //Inicio do Ciclo DO (FAÇA)
    do {
for (int e = 0; e < 20; e++) { System.out.println("  "); }
        
        System.out.println("\n == MENU PRINCIPAL == \n");
        System.out.println("1. Iniciar Nova Partida");
        System.out.println("2. Ver Recordes");
        System.out.println("0. Sair do Jogo");
        System.out.print("Escolha uma opção: ");
        
        OpcaoEscolhida = sc.nextInt();
        
        if (OpcaoEscolhida == 1) {
            System.out.println("Carregando a fase 1 ...");
            
        } else if (OpcaoEscolhida == 2) {
            System.out.println("Seu Recorde: 696969 pontos");
        }

        //A condição WHILE (ENQUANTO) fica no final
        //Repetir tudo ENQUANTO a opção for DIFERENTE de zero
    
    } while (OpcaoEscolhida != 0);
        System.out.println("Até mais.");
//==============================================================================
*/

/*
//==============================================================================
for (int i = 0; i < 20; i++) { System.out.println("  "); }

    int soma = 0;
    char resp;
    
    do {
        System.out.print("Digite um valor para ser somado: ");
            int num = sc.nextInt();
       
        soma += num;
        System.out.println("Você quer continuar? [s ou n]");
        resp = sc.next().toLowerCase().charAt(0);
        
    } while (resp != 'n');
for (int i = 0; i < 20; i++) { System.out.println("  "); }
        System.out.println("A soma de todos os valores é: " +soma);
//==============================================================================
*/




}
}