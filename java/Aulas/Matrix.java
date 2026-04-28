package Aulas;

import java.util.Random;
import java.util.Scanner;

public class Matrix {    
    public static void main(String[] args) throws InterruptedException {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Random ale = new Random();
        
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================

/*
//==============================================================================
// Tabuada
//                              🔻 Linhas
    int [][] tabuada = new int [11][11];
//                                  🔺 Colunas

for (int linha = 1; linha < 11; linha++) { //Linhas
    for (int coluna = 1; coluna < 11; coluna++) { // coluna
        tabuada [linha][coluna] = (linha) * (coluna);
        System.out.print(linha+ " X " +coluna+ " = " +tabuada[linha][coluna] + "\t" );
    }//                                                                         🔺 É um alinhamento de coluna (tabualação)
    System.out.println("");
    }
//==============================================================================
*/

/*
//==============================================================================
// Tabuada com Interação

    System.out.print("DIgite um número para ver a tabuada: ");
        int numero = scN.nextInt();
        
//                              🔻 Linhas
    int [][] tabuada = new int [11][11];
//                                  🔺 Colunas

for (int linha = 1; linha < 11; linha++) { //Linhas
    for (int coluna = 1; coluna < 11; coluna++) { // coluna
        tabuada [linha][coluna] = (linha) * (coluna);
    }
}
    System.out.println("Tabua do " +numero+ " :");
    for (int coluna = 0; coluna < 11; coluna++) {
        System.out.println(numero+ " X " +coluna+ " = " +tabuada[numero][coluna]+ "\t");
    }
//==============================================================================
*/


//==============================================================================
//Maior Elemento 
int [][] m = new int [3][3]; 

    System.out.println("DIite os valores da Natriz 3x3: ");
    for (int i = 0; i < m.length; i++) { // linha
        for (int j = 0; j < m[i].length; j++) {
            System.out.println("Elemento [" +i+ "][" +j+ "]:");
            m[i][j] = ale.nextInt(101);
            System.out.println(m[i][j]);
        }
    }
    int maior = m[0][0];
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            if (m[i][j] > maior) {
                maior = m[i][j];
            }
        }
    }
    // Exibir o maior valor encontrado
    System.out.println("Maior: " +maior);

//==============================================================================

    
}   }