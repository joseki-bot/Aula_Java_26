package Atividade.Lista8_VIII_ARRRAY;


import java.util.Random;
import java.util.Scanner;

public class Atividade_Arrays {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================
/*
//==============================================================================
// 1. Armazenando notas de alunos: 
// Crie um programa que armazene as notas bimestrais de um aluno em um array de números decimais. 
// O seu programa deve percorrer todas as notas armazenadas, somá-las e, em seguida, 
// calcular e exibir a média final do aluno.

double soma = 0;
double []  nota = new double[4];

    for (int i = 0; i < nota.length; i++) {
        System.out.print("Digite a nota do " +(i+1)+ "° Bimestre: ");
            nota [i] = sc.nextDouble();
            soma = soma + nota[i];
        }
    
System.out.println("\n");

    for (int i = 0; i < nota.length; i++) {
        System.out.println("---------------------------");
        System.out.println("Nota do " +(i+1)+ "° Bimestre");
        System.out.println("-> " +nota[i]);
        }
    
    System.out.println("---------------------------");
    System.out.printf("Sua média final é de %.2f" ,(soma / nota.length));
    System.out.println();
//==============================================================================
*/


//==============================================================================
//2. Invertendo uma string: 
// Desenvolva um algoritmo que receba uma palavra (uma String) e a converta em um array de caracteres (char). 
// O objetivo do programa é manipular as posições desse array para inverter a ordem das letras e,
// no final, exibir a palavra lida de trás para frente.

    System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
char [] letras = palavra.toCharArray();
int inicio = letras.length -1 ;   

for (int i = 0; i < letras.length; i++) {
    System.out.println(letras[inicio]);
    inicio--;
}
//==============================================================================


/*
//==============================================================================
// 3. Encontrando o maior valor em um array: 
// Dado um array contendo uma lista de números inteiros aleatórios, 
// crie um programa que analise cada um dos elementos para descobrir qual é o maior número presente na lista. 
// Ao final, imprima esse número na tela.

    System.out.print("Digite quantos número que quer gerar: ");
        int numero = sc.nextInt();
  
int [] NumAle = new int[numero];        
        
    for (int i = 0; i < NumAle.length; i++) {
        NumAle[i] = ale.nextInt(100);
    }

    System.out.println("\nOs Número gerados foram: ");
    for (int i = 0; i < NumAle.length; i++) {
        System.out.println((i+1)+ "° " +NumAle[i]);
        Thread.sleep(1000);
    }

    int maior = NumAle[0];
    
    for (int i = 0; i < NumAle.length; i++) {
        if (NumAle[i] > maior) {
            maior = NumAle[i]; }
    }
    
    System.out.println("==============================");
    System.out.println("E o Maior Número é o " +maior);
    System.out.println("==============================");
        Thread.sleep(1500);
//==============================================================================
*/

/*
//==============================================================================
//4. Verificando se um array contém um elemento específico: 

// Desenvolva um programa que funcione como um sistema de busca. 
// Você deve criar um array de números inteiros e escolher um número específico como 'alvo'. 
// O programa deve vasculhar a lista e, se encontrar o alvo, deve registrar que a busca teve sucesso. 
// Ao final, exiba true (verdadeiro) se o elemento foi encontrado, ou false (falso) caso ele não exista no array.

    System.out.print("Digite quantos número que quer gerar: ");
        int numero = sc.nextInt();

boolean encontrado = false;        
int [] NumAle = new int[numero];        
        
    for (int i = 0; i < NumAle.length; i++) {
        NumAle[i] = ale.nextInt(100);
    }

    System.out.println("Fale que número você quer achar na Lista: ");
        int alvo = sc.nextInt();
    System.out.println("------------------");
       
    for (int i = 0; i < NumAle.length; i++) {
        System.out.print((i+1)+ "° = " +NumAle[i]+ "| ");
        if (alvo == NumAle[i]) {
            encontrado = true;
            break; }
    }
    
    System.out.println("\nO Número " +alvo+ " foi encontrado ?  = " +encontrado);
//==============================================================================
*/

/*
//==============================================================================
//5. Ordenando um array de strings: Crie um programa para organizar uma lista de palavras. 
// A partir de um array contendo nomes de frutas misturados, 
// utilize as ferramentas nativas da linguagem Java para colocá-los automaticamente em ordem alfabética. 
// Ao final, exiba o array ordenado de forma legível na tela.

        // Array com frutas misturadas
    String[] frutas = {"Banana", "Maçã", "Laranja", "Abacaxi", "Uva"};

    Arrays.sort(frutas);

    // Exibindo o array de forma legível
    System.out.println("Frutas em ordem alfabética:");
        
    for (int i = 0; i < frutas.length; i++) {
        System.out.println(frutas[i]);
    }


//==============================================================================
*/

/*
//==============================================================================
//6. Média dos Elementos: 
// Calcular a média aritmética de todos os números em um array de casas decimais (double).

    System.out.print("Digite Quantos Número você quer usar: ");
        int numero = sc.nextInt();
        
double [] NumMedia = new double [numero];
System.out.println();
double soma = 0;

    for (int i = 0; i < numero; i++) {
        System.out.print("Digite o " +(i+1)+ "° Número: " );
            NumMedia [i] = sc.nextDouble();
            soma += NumMedia[i];
        }

double media = soma / numero;
        System.out.println("--------------------------------------");
        System.out.println("A media dos " +numero+ " alunos é: " +media);
//==============================================================================
*/

/*
//==============================================================================
//7. Cópia com Multiplicação: 
// Criar um segundo array que seja uma cópia do primeiro, mas com todos os valores multiplicados por 2.

    System.out.print("Digite Quantos Número você quer usar: ");
        int numero = sc.nextInt();
        
int [] Array1 = new int [numero];

    for (int i = 0; i < numero; i++) {
        System.out.println("----------------------------");
        System.out.print("Digite o " +(i+1)+ "° Número: " );
            Array1 [i] = sc.nextInt();
    }
    System.out.println("----------------------------\n");
    
    System.out.println("Seu número foram");
    for (int i = 0; i < numero; i++) {
        System.out.println("==> " +Array1[i]);
    }

    System.out.println("\nAgora esse número que você digitou multiplicado por 2x");
    for(int multi : Array1) {
        System.out.println("2 x => " +(multi * 2));
    }
//==============================================================================
*/

/*
//==============================================================================
// 8. Frequência de um Número:  
// Contar quantas vezes um número específico se repete dentro do array.

int contador = 0;
    System.out.print("Digite Quantos Número você quer usar: ");
        int numero = sc.nextInt();
        
int [] Array1 = new int [numero];

    for (int i = 0; i < numero; i++) {
        System.out.println("----------------------------");
        System.out.print("Digite o " +(i+1)+ "° Número: " );
            Array1 [i] = sc.nextInt();
    }
    System.out.println("----------------------------\n");
    
    System.out.println("Digite o Número que você quer ver quantas vezes ele repetiu:");
        int alvo = sc.nextInt ();
  
    for (int i = 0; i < Array1.length; i++) {
        if (alvo == Array1[i]) {
            contador++; }
    }
    System.out.println("O Número " +alvo+ " se repetiu " +contador+ " vezes");
//==============================================================================
*/

/*
//==============================================================================
//9. Substituir Negativos por Zero: 
// Percorrer um array e, sempre que encontrar um número negativo, trocá-lo por zero.
    
    System.out.println("=======================================");
    System.out.print("Digite Quantos Número você quer usar: ");
        int numero = sc.nextInt();
    
int [] Array1 = new int [numero];

    for (int i = 0; i < numero; i++) {
        System.out.println("----------------------------");
        System.out.print("Digite o " +(i+1)+ "° Número: " );
            Array1 [i] = sc.nextInt();
    }
    System.out.println("----------------------------\n");
    System.out.println("Verificando os Números");

    for (int i = 0; i < Array1.length; i++) {
        if (Array1[i] < 0) {
            System.out.println("!");
            Array1[i] = 0; }
    }
    
    System.out.println("Lista modificada, Número negativos foram trocados para 0");
    for(int negativo : Array1){
        System.out.println("=> " +negativo);
    }
//==============================================================================
*/

}
}
