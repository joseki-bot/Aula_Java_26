package Teste;

import java.util.Random;
import java.util.Scanner;

public class NomeNotaMedia {
    public static void main(String[] args) throws InterruptedException {
        Scanner ScNum = new Scanner(System.in);
        Scanner ScLe = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================


//==============================================================================
    System.out.println("DIgite quantos Notas você colocar as notas: ");               
    System.out.print("=> ");               
        int qtdAluno = ScNum.nextInt();
        
    double [] NotasAluno = new double [qtdAluno * 4];
    double [] MediaAluno = new double [qtdAluno];
    String [] NomeAluno = new String [qtdAluno];
    
    for (int i = 0; i < qtdAluno; i++) {
        System.out.print("Digite o nome do " +(i+1)+ "° Aluno: ");
            NomeAluno[i] = ScLe.nextLine();
    }
    
    double media = 0;
    int contador = 0;
    int contadorNOME = 1;
    System.out.println("\n==============================");
    
    for (int i = 0; i < qtdAluno; i++) {
        System.out.println("Digite a nota de " +NomeAluno[i]+ ":");
        for (int i2 = 0; i2 < NotasAluno.length; i2++) {
            System.out.print((contadorNOME)+"° Nota: ");
                NotasAluno[contador] = ScNum.nextDouble();
            System.out.println("-------------------");
            media += NotasAluno[contador];
            contador ++;    
            contadorNOME++;
            
            if (contador % 4 == 0) {
                System.out.println("\n");
                contadorNOME = 1;
                MediaAluno[i] = media;
                media = 0;
                break;  }
        }
    }

    double MediaTotal = 0;
    
    System.out.println("\n==================================");
    System.out.println("A media dos Alunos Foram");
    
    for (int i = 0; i < MediaAluno.length; i++) {
        MediaAluno[i] = MediaAluno[i] / 4;
        MediaTotal += MediaAluno[i];
        System.out.printf(NomeAluno[i]+ ": %.2f" ,MediaAluno[i]);
        System.out.println();
        Thread.sleep(1500);
    }
    
    MediaTotal = MediaTotal / qtdAluno;
    
    System.out.println("===================================");
    System.out.printf("A média total das Notas é  %.2f" ,MediaTotal);
    Thread.sleep(2069);
    
    System.out.println("\n\n ===================================");
    System.out.println("Os Seguintes Alunos firacam de Recuperação:");
    
    for (int i = 0; i < qtdAluno; i++) {
        if (MediaAluno[i] < MediaTotal) {
            System.out.println("=> " +NomeAluno[i]);
        }
    }
    Thread.sleep(2069);
    























    }    }