import java.util.Random;
import java.util.Scanner;

public class Matriz_Fácil {
    public static void main(String[] args) {        
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================

/*
//==============================================================================
// 1. Criação Simples: 
// Crie uma matriz de inteiros 2x2 e atribua valores manualmente. 
// Depois, imprima o valor que está na primeira linha e primeira coluna.

int [][] Matriz2x2 = new int [2][2];

    System.out.println("Digite um Número");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print("=> ");
        Matriz2x2[i][j] = scN.nextInt();
    }
}
        System.out.println("-----------------------------");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print("|" +Matriz2x2[i][j]);
    }
    System.out.println("|");
}
    System.out.println("--------------------------------------");
    System.out.println("O Numero que está na Posição 00 é - " +Matriz2x2[0][0]);
    System.out.println("O Numero que está na Posição 10 é - " +Matriz2x2[1][0]);
//==============================================================================
*/

/*
//==============================================================================
// 2. Soma Total: 
// Crie uma matriz 2x2, preencha-a e exiba a soma de todos os seus elementos.

int [][] Matriz2x2 = new int [2][2];
int soma = 0;

for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        Matriz2x2[i][j] = ale.nextInt(11);
        System.out.print("|" +Matriz2x2[i][j]);
        soma += Matriz2x2[i][j];
    }
    System.out.println("|");
}
    System.out.println("----------------------------------------");
    System.out.println("A soma de todos os elementes da Matriz é");
    System.out.println("==> " +soma);
//==============================================================================
*/

/*
//==============================================================================
// 3. Preenchimento Uniforme: 
// Crie uma matriz 3x3 e use um laço de repetição para preencher todos os espaços com o número 5.

int [][] MAtriz3x3 = new int [3][3];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        MAtriz3x3[i][j] = 5;
        System.out.print("|" +MAtriz3x3[i][j]);
    }
    System.out.println("|");
}
//==============================================================================
*/ 

/*
//==============================================================================
// 4. Multiplicação por 2: 
// Dada uma matriz 2x2 pré-preenchida, multiplique cada elemento por 2 e mostre o resultado.

int [][] Matriz2x2 = new int [2][2];
                                    
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        Matriz2x2[i][j] = ale.nextInt(11);
        System.out.print("|" +Matriz2x2[i][j]);
    }
    System.out.println("|");
}
    System.out.println("\nAgora essa Matriz Multiplicado por 2");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print("|" +Matriz2x2[i][j]*2);
    }
    System.out.println("|");
}
//==============================================================================
*/

/*
//==============================================================================
// 5. Contagem de Pares:
// Crie uma matriz 2x3 e conte quantos números pares existem dentro dela.

int [][] Matriz2x3 = new int[2][3];

for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz2x3[i][j] = ale.nextInt(51);
        System.out.print("|" +Matriz2x3[i][j]);
    }
    System.out.println("|");
}

    System.out.println("\nOs seguintes Números são Pares");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        if (Matriz2x3[i][j] % 2 == 0) {
            System.out.print(Matriz2x3[i][j] + "| ");
        }
    }
}
System.out.println("");
//==============================================================================
*/

/*
//==============================================================================
// 6. Identificando o Maior: 
// Crie uma matriz 2x2 e descubra qual é o maior valor armazenado nela.

int [][] Matriz2x2 = new int [2][2];
int maior = 0;

for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        Matriz2x2[i][j] = ale.nextInt(51);
        System.out.print("|" +Matriz2x2[i][j]);
        
        if (Matriz2x2[i][j] > maior){
            maior = Matriz2x2[i][j];
        }
    }
    System.out.println("|");
}
        System.out.println("\nO maior número da Lista é");
        System.out.println("==> " +maior);
//==============================================================================
*/

/*
//==============================================================================
// 7. Linha Específica: 
// Crie uma matriz 3x3 e imprima apenas os valores localizados na segunda linha.

int [][] Matriz3x3 = new int [3][3];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz3x3[i][j] = ale.nextInt(51);
        System.out.print("|" +Matriz3x3[i][j]);
    }
    System.out.println("|");
}
    System.out.println("-------");
    System.out.println("APenas a Segunda Linha");
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1) {
            System.out.print("|" +Matriz3x3[i][j]);
        }
    }
}
System.out.println("");
//==============================================================================
*/

/*
//==============================================================================
// 8. Diagonal Principal: 
// Crie uma matriz 3x3 onde os elementos da diagonal principal
// (onde a linha é igual à coluna) sejam 1 e o restante seja 0.

int [][] Matriz3x3 = new int [3][3];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == j) {
            Matriz3x3 [i][j] = 1;
        } 
        else {
            Matriz3x3[i][j] = 0;
        }
        System.out.print(Matriz3x3[i][j]+ "|");
    }
    System.out.println("");
}
//==============================================================================
*/
    }
}
