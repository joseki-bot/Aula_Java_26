package TESTES;

import TESTES.BASE;
import java.util.ArrayList;
import java.util.Scanner;

//==============================================================================
// Espaço
public class LISTA12_TudoJunto { 
    public static void ESPAÇO () {
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
    }
//==============================================================================

//==============================================================================   
// Tabela
public static void TABELA () {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("=- DIGA QUAL ATIVIDADE VOCÊ DESEJA VER -=");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("1° -> Par ou Impar:");
    System.out.println("2° -> Status de Aprovação:");
    System.out.println("3° -> Contagem Regressiva:");
    System.out.println("4° -> Dobrar até 100:");
    System.out.println("5° -> Tabua:");
    System.out.println("6° -> Soma de N números:");
    System.out.println("7° -> Dia da Semana:");
    System.out.println("8° -> Calculadora Básica:");
    System.out.println("9° -> Maior de Três:");
    System.out.println("10° -> Contador de Vogais");
}    
//==============================================================================

//==============================================================================
// 1. Par ou Ímpar (if/else): 
// Crie um método que receba um número inteiro e imprima se ele é par ou ímpar.
public static void ATI_1 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

    System.out.println("Digite um Número");
    System.out.print("=> ");
        int Numero = scN.nextInt();

    Pegar.Par_Impar(Numero);
}
//==============================================================================

//==============================================================================
// 2. Status de Aprovação (if/else): 
// Crie um método que receba a nota de um aluno (0 a 10). 
// Se for maior ou igual a 7, imprima "Aprovado", senão, "Reprovado".

public static void ATI_2 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

    System.out.println("Digite a Sua Nota:");
    System.out.print("=> ");
        double Nota = scN.nextDouble();
        
    Pegar.Aprovador(Nota);
}
//==============================================================================

//==============================================================================
// 3. Contagem Regressiva (while): 
// Crie um método que receba um número inicial e imprima uma contagem regressiva até 0 usando a estrutura while.

public static void ATI_3 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);
    System.out.println("Digite um Número:");
    System.out.print("=> ");
        int numero = scN.nextInt();
    
    System.out.println("==========================");        
    Pegar.contador(numero);
    System.out.println("==========================");      
}
//==============================================================================

//==============================================================================
// 4. Dobrar até 100 (while): 
// Crie um método que receba um número pequeno (ex: 2) 
// e vá multiplicando-o por 2 e imprimindo o resultado até que o valor passe de 100 usando while.

public static void ATI_4 () throws InterruptedException {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

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
    Pegar.Multiplicador(numero);
    System.out.println("===================");   
}
//==============================================================================    

//==============================================================================    
// 5. Tabuada (for): 
// Crie um método que receba um número inteiro e imprima a sua tabuada (de 1 a 10) usando o laço for.
 
public static void ATI_5 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

    System.out.println("Digite Um número que você deseja ver a Sua Tabuada");
    System.out.print("=> ");
        int Numero = scN.nextInt();
        
    System.out.println("============");
    Pegar.Tabuada(Numero);
    System.out.println("=============");
}
//==============================================================================

//==============================================================================
// 6. Soma de N números (for):
// Crie um método que receba um número N e some todos os números de 1 até N usando o laço for, imprimindo o total no final.

public static void ATI_6 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

    System.out.println("Digite um Número");
    System.out.print("=> ");
        int Numero = scN.nextInt();
        
    System.out.println("==================");
    Pegar.SomaDoN(Numero);
    System.out.println("==================");
}
//==============================================================================  

//==============================================================================    
// 7. Dia da Semana (switch case): 
// Crie um método que receba um número de 1 a 7 e imprima o dia da semana correspondente 
// (1 = Domingo, 2 = Segunda, etc.) usando switch case.

public static void ATI_7 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);

int numero = 0;

    System.out.println("Digite um Número de 1 a 7");
do {
    System.out.print("=> ");
        numero = scN.nextInt();

} while (numero > 7);
    Pegar.DiaSemana(numero);
}
//==============================================================================    

//==============================================================================    
// 8. Calculadora Básica (switch case): 
// Crie um método que receba dois números e um caractere representando a operação 
//('+', '-', '*', '/'). Use switch case para calcular e imprimir o resultado.

public static void ATI_8 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);
Scanner scL = new Scanner(System.in);

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

    int respota = Pegar.Calculadora(Num1, Num2, Operador);
    
    System.out.println("===============");
    System.out.println(Num1+ " "+Operador+" "+Num2+" = "+ respota);
    System.out.println("===============");
}
//==============================================================================    

//==============================================================================
// 9. Maior de Três (if/else aninhado): 
// Crie um método que receba três números inteiros e imprima qual é o maior deles usando if/else.

public static void ATI_9 () throws InterruptedException {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);
Scanner scL = new Scanner(System.in);

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
    int maior = Pegar.MAIOR(Guardar);
    ESPAÇO();
    System.out.println(Guardar);
    System.out.println("\nDos Números acima, o Maior é: " +maior);
}
//==============================================================================

//==============================================================================
// 10. Contador de Vogais (for e switch case): 
//Crie um método que receba uma palavra (String) e conte quantas vogais existem nela. 
//Use um for para percorrer as letras e um switch case para verificar se é vogal.

public static void ATI_10 () {
ESPAÇO();
BASE Pegar = new BASE();
Scanner scN = new Scanner(System.in);
Scanner scL = new Scanner(System.in);

    System.out.println("Digite uma Palavra");
    System.out.print("=> ");
        String Palavra = scL.nextLine().toLowerCase();
        
    Pegar.ContadorVogais(Palavra);
}
//==============================================================================

//==============================================================================
// MAIN
public static void main(String[] args) throws InterruptedException {
Scanner scL = new Scanner(System.in);
int contador = 0;

do {
ESPAÇO();
TABELA();

    if (contador == 1){
        System.out.println("SAIR");
    }
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.print("=> ");
        String escolha = scL.nextLine().toLowerCase();
    
    switch (escolha) {
        case "1" -> {
            ATI_1();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "2" -> {
            ATI_2();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "3" -> {
            ATI_3();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "4" -> {
            contador = 1;
            ATI_4();
            Thread.sleep(2500);
            break;
        }
        case "5" -> {
            ATI_5();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "6" -> {
            ATI_6();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "7" -> {
            ATI_7();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "8" -> {
            ATI_8();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "9" -> {
            ATI_9();
            Thread.sleep(2500);
            break;
        }
        case "10" -> {
            ATI_10();
            contador = 1;
            Thread.sleep(2500);
            break;
        }
        case "sair" -> {
            System.out.println("FILIZANDO...");
            Thread.sleep(2000);
            contador = 2;
            break;
        }
    }    
} while (contador != 2);
    
}   }