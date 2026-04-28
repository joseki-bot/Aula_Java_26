package Codigos;


import java.util.Random;
import java.util.Scanner;

public class Aula_ARRAYS {
     public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
//==============================================================================
/*
//==============================================================================
    int [] numeros = new int [5]; 
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;
            
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elemento no índice " +i+": " +numeros[i]);
         }
//==============================================================================
*/    

/*
//==============================================================================
    int[] numeros = new int [5]; 

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite o valor para o índice " +i+ ": ");
            numeros[i] = sc.nextInt();
        }

    System.out.println("\nValores armazenados no array: ");
    
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elementos no índice " +i+ ": " +numeros[i]);
        }
//==============================================================================
*/

/*
//==============================================================================
    //double[] notas = {8.5, 7.0, 9.2, 6.5, 10.0};

    System.out.println("----- Relatorio de Notas da Turma -----");
    System.out.println("Quantas notas você deseja calcular?");
        int qtdNotas = sc.nextInt();
        
        double[]notas = new double [qtdNotas];
        
//System.out.println("Quantidade de provas avaliadas: " +notas.length);
    
    double soma = 0;
         System.out.println("\nDigite as notas abaixo: ");
    
    for (int i = 0; i < notas.length; i++) {
            System.out.println("digite a nota " +(i+1)+ ": ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];
         }
    
    double media = soma / notas.length;
    System.out.println("----------------------------");
    System.out.println("Média final da turma: " +media);     

//    Laço for-each
//    System.out.println("\nListando as notas rapidamente usando o for-each");
//    for(double notaAtual : notas) {
//        System.out.println("-> " +notaAtual);
//    }
//==============================================================================
*/ 

/*
//==============================================================================
    String[] alunos = {"José", "Pablo", "Willy", "Derick"};
    
    System.out.println("--- Lista de Chama ---");
    System.out.println("Total de alunos matriculados: " +alunos.length);
    System.out.println("---------------------------------------------");
    
    for (int i = 0; i < alunos.length; i++) {
        System.out.println("Número " +(i+1)+ ": " +alunos[i]);
    }
         
    System.out.println("\n[aviso] O aluno 'Dérick' foi transferido. 'Bryan' ocupou a vaga");
        alunos[3] = "Bryan";
        
    System.out.println(" -- Nova Lista atualizada da chamada --");
        for (String nomeAtual : alunos) {
            System.out.println("- " +nomeAtual);
        }
//==============================================================================
*/


//==============================================================================
    String[]alunos = new String [3];

    System.out.println("--- Cadastro de Alunos ---");
    System.out.println("Você tem " +alunos.length+ " vagas na turma");
    System.out.println("---------------------------------------------");
    
    for (int i = 0; i < alunos.length; i++) {
        System.out.println("Digite o nome do " +(i+1)+ "° alunos:");
            alunos[i] = sc.nextLine();
    }
         
    System.out.println(" -- Nova Lista atualizada da chamada --");
        for (String nomeAtual : alunos) {
            System.out.println("- " +nomeAtual);
        }
//==============================================================================










    
    
}
}
