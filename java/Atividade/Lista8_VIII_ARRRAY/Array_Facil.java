package Atividade.Lista8_VIII_ARRRAY;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Facil {
    public static void main(String[] args) throws InterruptedException {
        Scanner ScNum = new Scanner(System.in);
        Scanner ScLe = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================

/*
//==============================================================================
// 1. Soma dos Elementos: 
// Crie um array de números inteiros e calcule a soma de todos os seus elementos. 

    System.out.println("DIgite quantos Espaços você quer no Array: ");               
        int Espaco = ScNum.nextInt();
        
    int soma = 0;
        
    int [] Array1 = new int [Espaco];
    for (int i = 0; i < Espaco; i++) {
        System.out.print("Digite o " +(i+1)+ " Número: ");
            Array1[i] = ScNum.nextInt();
        soma += Array1[i];
    }

    System.out.println("\nA seguir a soma dos Seguintes valores: " +Arrays.toString(Array1));
    System.out.println("-> " +soma);
//==============================================================================
*/

/*
//==============================================================================
// 2. Encontrar o Maior Valor: 
// Dado um array de números inteiros, descubra qual é o maior número presente nele.
    
    System.out.println("==========================================");
    System.out.println("DIgite quantos Espaços você quer no Array:");               
        int Espaco = ScNum.nextInt();
    System.out.println();    

    int Maior = 0;
    int Menor = 696969;
        
    int [] Array1 = new int [Espaco];
    for (int i = 0; i < Espaco; i++) {
        System.out.println("-------------------------------");
        System.out.print("Digite o " +(i+1)+ " Número: ");
            Array1[i] = ScNum.nextInt();
    }
    System.out.println("-------------------------------\n\n");

        for (int i = 0; i < Espaco; i++) {
            if (Maior < Array1[i]) {
                Maior = Array1[i]; }
            
            if (Menor > Array1[i]) {
                Menor = Array1[i]; }
        }

        System.out.println("O Seguintes número foram Digitados");
        System.out.println("-> " + Arrays.toString(Array1));
        System.out.println("\nE o Maior Número foi: ");
        System.out.println("-> " + Maior);
        System.out.println("\nE o Menor foi:");
        System.out.println("-> " + Menor);
//==============================================================================
*/

/*
//==============================================================================
// 3. Contar Pares e Ímpares: 
// Construa um programa que, a partir de um array de números inteiros, 
// conte quantos elementos são pares e quantos são ímpares. 

    System.out.println("==========================================");
    System.out.println("DIgite quantos Espaços você quer no Array:");               
        int Espaco = ScNum.nextInt();
    System.out.println();    
        
    int [] Array1 = new int [Espaco];
      for (int i = 0; i < Espaco; i++) {
        System.out.println("-------------------------------");
        System.out.print("Digite o " +(i+1)+ " Número: ");
            Array1[i] = ScNum.nextInt();
    }
    System.out.println("-------------------------------\n\n");

int contadorPAR = 0;
int contadorIMPAR = 0;
        
    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] % 2 == 0) {
            contadorPAR++; }
        
        if (Array1[i] % 2 == 1) {
            contadorIMPAR++;    }
    }
            
    int [] PAR = new int [contadorPAR];
    int [] IMPAR = new int [contadorIMPAR];
    
int ConfirmadorPAR = 0;
int ConfirmadorIMPAR = 0;
    
    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] % 2 == 0) {
            PAR[ConfirmadorPAR] = Array1[i];
            ConfirmadorPAR++;   } 
        
        if (Array1[i] % 2 == 1)   {
            IMPAR[ConfirmadorIMPAR] = Array1[i]; 
            ConfirmadorIMPAR++;      }
    }

    System.out.println("O seguinte Número foram digitados ");
    System.out.println("-> " + Arrays.toString(Array1));
    System.out.println("\nE desses Número são PARES os seguintes: ");
    System.out.println("->" + Arrays.toString(PAR));
    System.out.println("\nE desses Número são IMPARES os seguintes: ");
    System.out.println("-> " + Arrays.toString(IMPAR));
//==============================================================================
*/

/*
//==============================================================================
//  4. Inverter o Array: 
//  Escreva um programa que crie um novo array contendo os elementos do array original em ordem inversa.

    System.out.println("==========================================");
    System.out.println("DIgite quantos Espaços você quer no Array:");               
        int Espaco = ScNum.nextInt();
    System.out.println();    
        
    String [] Array1 = new String [Espaco];
      for (int i = 0; i < Espaco; i++) {
        System.out.println("-------------------------------");
        System.out.print("Digite a " +(i+1)+ "° Palavra: ");
            Array1[i] = ScLe.nextLine();
    }
    System.out.println("-------------------------------\n\n");

    int diminuidor = Espaco - 1;
    String [] Array2 = new String [Espaco];

    for (int i = 0; i < Espaco; i++) {
        Array2 [i] = Array1[diminuidor];
        diminuidor --;
    }

    System.out.println("Você Digitou no Primeiro array a seguintes coisas: ");
    System.out.println("-> " + Arrays.toString(Array1));
    System.out.println("\nREVERSE");   
    System.out.println(" -> " + Arrays.toString(Array2));
//==============================================================================
*/

/*
//==============================================================================
// 5. Busca Linear (Encontrar um elemento): 
// Faça um programa que verifique se um número específico existe dentro de um array. 
// Caso exista, mostre a posição (índice) onde ele se encontra.  

    int Espaço = ale.nextInt(16);
    int [] Array1 = new int [Espaço];
    int Finalizador = 0;
    int Alvo;
    String Escolha;
    
    for (int i = 0; i < Espaço; i++) {
        Array1[i] = ale.nextInt(21); }
    
        System.out.println("=========================");
        System.out.println("== Buscador de Números ==");
        System.out.println("=========================");
    
while (Finalizador != 1) {
    System.out.println("\n=========================");
    System.out.println("Digite um Número para Verificarmo");
    System.out.println("se ele está na Lista: ");
        Alvo = ScNum.nextInt();
            
    for (int i = 0; i < Espaço; i++) {
        if (Alvo == Array1[i]) {
            System.out.println("NÚMERO ENCONTRADO !!!");
            System.out.println("Ele está no espaço  |" +(1+i)+ "|");
            Finalizador = 1 ;
            break;
        } 
    }    
        if(Finalizador != 1) {  
            System.out.println("NÚMERO NÃO ENCONTRADO !!!");
            System.out.println("Deseja tentar Novamente (N/S):");
                Escolha = ScLe.nextLine().toLowerCase();
                    
            switch (Escolha) {
                case "não", "nao", "no", "n" -> {
                    System.out.println("Finalizando...");
                    Thread.sleep(1569);
                    Finalizador = 1;
                    break;
                }
                
                default -> {
                    System.out.println("Voltando ...");
                }
            }
        }
    
}   
    
    System.out.println("\nMostrando A Lista");
    for (int FIM : Array1) {
        System.out.print("|" +FIM);
    }
//==============================================================================
*/

/*
//==============================================================================
//6. Média e Elementos Acima da Média: 
// Crie um programa que calcule a média dos valores de um array e exiba apenas os números que são maiores do que essa média.  
                
    System.out.println("==========================================");
    System.out.println("DIgite quantos Espaços você quer no Array:");               
        int Espaco = ScNum.nextInt();
    System.out.println();    

    double media = 0;
    
    double [] Array1 = new double [Espaco];
    for (int i = 0; i < Espaco; i++) {
        System.out.println("-------------------------------");
        System.out.print("Digite o " +(i+1)+ "° Nota: ");
            Array1[i] = ScNum.nextDouble();
        media += Array1[i];
    }
    System.out.println("-------------------------------\n\n");

    media = media / Espaco;
    int contador = 0;

    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] >= media) {
            contador++;     }
    }
            
    double [] NotaMaior = new double [contador];
    int confirmador = 0;
    
    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] >= media) {
            NotaMaior[confirmador] = Array1[i];
            confirmador++;   } 
    }
    
    System.out.println("As seguintes notas foram colocadas: ");
    System.out.println("-> " + Arrays.toString(Array1));
    System.out.println("\nE a média das notas foi: " +media);
    System.out.println("\nE as notas que alcançaram a média foram:");
    System.out.println("-> " +Arrays.toString(NotaMaior));
//==============================================================================
*/

/*
//==============================================================================
// Média dos Arrays, junto com o nome dos alunos 
    
    System.out.println("==========================================");
    System.out.println("DIgite quantos Espaços você quer no Array:");               
        int Espaco = ScNum.nextInt();
    System.out.println();    

    double media = 0;
    
    double [] Array1 = new double [Espaco];
    for (int i = 0; i < Espaco; i++) {
        System.out.println("-------------------------------");
        System.out.print("Digite o " +(i+1)+ "° Nota: ");
            Array1[i] = ScNum.nextDouble();
        media += Array1[i];
    }
    System.out.println("-------------------------------\n\n");

    media = media / Espaco;
    int contador = 0;

    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] >= media) {
            contador++;     }
    }
            
    double [] NotaMaior = new double [contador];
    int confirmador = 0;
    
    for (int i = 0; i < Espaco; i++) {
        if (Array1[i] >= media) {
            NotaMaior[confirmador] = Array1[i];
            confirmador++;   } 
    }
    
    System.out.println("As seguintes notas foram colocadas: ");
    System.out.println("-> " + Arrays.toString(Array1));
    System.out.println("\nE a média das notas foi: " +media);
    System.out.println("\nE as notas que alcançaram a média foram:");
    System.out.println("-> " +Arrays.toString(NotaMaior));    
 */   
    
}   }