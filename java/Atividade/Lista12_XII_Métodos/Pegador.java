package Atividade.Lista12_XII_Métodos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pegador {
    
    public static void ESPAÇO () { 
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
    }
        public static void main(String[] args) throws InterruptedException {
            Scanner scL = new Scanner(System.in);
            Scanner scN = new Scanner(System.in);
            Random ale = new Random();

ESPAÇO();
//==============================================================================

/*
//==============================================================================
// 1. Par ou Ímpar (if/else): 
// Crie um método que receba um número inteiro e imprima se ele é par ou ímpar.

ComMétodos P_I = new ComMétodos();

    System.out.println("Digite um Número");
    System.out.print("=> ");
        int Numero = scN.nextInt();

    P_I.Par_Impar(Numero);
//==============================================================================
*/

/*
//==============================================================================
// 2. Status de Aprovação (if/else): 
// Crie um método que receba a nota de um aluno (0 a 10). 
// Se for maior ou igual a 7, imprima "Aprovado", senão, "Reprovado".

ComMétodos Verificar = new ComMétodos();

    System.out.println("Digite a Sua Nota:");
    System.out.print("=> ");
        double Nota = scN.nextDouble();
        
    Verificar.Aprovador(Nota);
//==============================================================================
*/

/*
//==============================================================================
// 3. Contagem Regressiva (while): 
// Crie um método que receba um número inicial e imprima uma contagem regressiva até 0 usando a estrutura while.

ComMétodos loopDiminundo = new ComMétodos();

    System.out.println("Digite um Número:");
    System.out.print("=> ");
        int numero = scN.nextInt();
    
    System.out.println("==========================");        
    loopDiminundo.contador(numero);
    System.out.println("==========================");        
//==============================================================================
*/                

/*
//==============================================================================
// 4. Dobrar até 100 (while): 
// Crie um método que receba um número pequeno (ex: 2) 
// e vá multiplicando-o por 2 e imprimindo o resultado até que o valor passe de 100 usando while.
 
ComMétodos Mult = new ComMétodos();
int finalizador = 0;
int numero = 0;

do {
    System.out.println("Digite um Número");
    System.out.print("=> ");
        numero = scN.nextInt();
        
    if (numero >= 20) {
        System.out.println("\nValor do número é muito alto, digite um número Menor");
        Thread.sleep(2000);
        ESPAÇO();
    }else {
        finalizador = 1;
    }
        
} while (finalizador != 1);        
        
    System.out.println("===================");        
    Mult.Multiplicador(numero);
    System.out.println("===================");   
//==============================================================================    
*/

/*
//==============================================================================    
// 5. Tabuada (for): 
// Crie um método que receba um número inteiro e imprima a sua tabuada (de 1 a 10) usando o laço for.
 
ComMétodos tabuada = new ComMétodos();

    System.out.println("Digite Um número que você deseja ver a Sua Tabuada");
    System.out.print("=> ");
        int Numero = scN.nextInt();
        
    System.out.println("============");
    tabuada.Tabuada(Numero);
    System.out.println("=============");
//==============================================================================
*/ 

/*
//==============================================================================
// 6. Soma de N números (for):
// Crie um método que receba um número N e some todos os números de 1 até N usando o laço for, imprimindo o total no final.

ComMétodos soma = new ComMétodos();

    System.out.println("Digite um Número");
    System.out.print("=> ");
        int Numero = scN.nextInt();
        
    System.out.println("==================");
    soma.SomaDoN(Numero);
    System.out.println("==================");
//==============================================================================  
*/

/*
//==============================================================================    
// 7. Dia da Semana (switch case): 
// Crie um método que receba um número de 1 a 7 e imprima o dia da semana correspondente 
// (1 = Domingo, 2 = Segunda, etc.) usando switch case.

ComMétodos semana = new ComMétodos();
int numero = 0;

    System.out.println("Digite um Número de 1 a 7");
do {
    System.out.print("=> ");
        numero = scN.nextInt();

} while (numero > 7);
    semana.DiaSemana(numero);
//==============================================================================    
*/

/*
//==============================================================================    
// 8. Calculadora Básica (switch case): 
// Crie um método que receba dois números e um caractere representando a operação 
//('+', '-', '*', '/'). Use switch case para calcular e imprimir o resultado.

ComMétodos Calc = new ComMétodos();

    System.out.println("Digite o Primeiro Número");
        int Num1 = scN.nextInt();
    ESPAÇO();
    
    System.out.println("Digite o Operador dá conta que deseja fazer:");
    System.out.print(Num1+ " ");
        String Operador = scL.nextLine().toLowerCase();
    ESPAÇO();
    
    System.out.println("Digite o Segundo Número");
    System.out.print(Num1+ " " +Operador+ " ");
        int Num2 = scN.nextInt();
    ESPAÇO();

    int respota = Calc.Calculadora(Num1, Num2, Operador);
    
    System.out.println("===============");
    System.out.println(Num1+ " "+Operador+" "+Num2+" = "+ respota);
    System.out.println("===============");
//==============================================================================    
*/

/*
//==============================================================================
// 9. Maior de Três (if/else aninhado): 
// Crie um método que receba três números inteiros e imprima qual é o maior deles usando if/else.
ComMétodos GRANDE = new ComMétodos();
ArrayList <Integer> Guardar = new ArrayList<>();
int contador = 1;
String Num = "";

do { 
    System.out.println("Digite o " +contador+ "° Número:");
    System.out.print("=> ");
        Num = scL.nextLine();
    contador++;

    if (!Num.equals("=")) {
    int numero = Integer.parseInt(Num);
    Guardar.add(numero);
    }
    
    if (contador == 2) {
        System.out.println("Para finalizar digite '='");
        Thread.sleep(2000);
        ESPAÇO();
    }
} while (!Num.equals("="));
    int maior = GRANDE.MAIOR(Guardar);
    ESPAÇO();
    System.out.println(Guardar);
    System.out.println("\nDos Números acima, o Maior é: " +maior);
//==============================================================================
*/

/*
//==============================================================================
// 10. Contador de Vogais (for e switch case): 
//Crie um método que receba uma palavra (String) e conte quantas vogais existem nela. 
//Use um for para percorrer as letras e um switch case para verificar se é vogal.

ComMétodos Vogal = new ComMétodos();

    System.out.println("Digite uma Palavra");
    System.out.print("=> ");
        String Palavra = scL.nextLine().toLowerCase();
        
    Vogal.ContadorVogais(Palavra);
//==============================================================================
*/
    }
 }