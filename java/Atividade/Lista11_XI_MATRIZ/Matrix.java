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
// 1. Somados Elementos de uma Matriz: 
// Dada uma matriz 3x3 de inteiros, some todos os elementos da matriz e exiba o resultado.

int [][] Ma3X3 = new int [3][3];

int Total = 0;

    System.out.println("Os seguinte números estão na Lista");
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Ma3X3 [i][j] = ale.nextInt(51);
        Total += Ma3X3[i][j];
        System.out.print(Ma3X3[i][j]+"|");
    }
    System.out.println("");
}
    System.out.println("\nE o Total de todos esse Números é: "+Total);
//==============================================================================
*/

/*
//==============================================================================
// 2. Matriz Identidade:                                                                |1|0|0|
// Verifique se uma matriz 3x3 é uma matriz identidade                                  |0|1|0|
// (uma matriz onde os elementos da diagonal principal são 1 e todos os outros são 0).  |0|0|1|

int [][] Ma3X3 = new int [3][3];
int contador1 = 0;
int contador0 = 0;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Ma3X3 [i][j] = ale.nextInt(2);
        System.out.print(Ma3X3[i][j]+"|");
        
        if (i == j) {
            //Ma3X3 [i][j] = 1;
            if (Ma3X3[i][j] == 1) {
                contador1++;    }
        } 
        else {
            //Ma3X3[i][j] = 0;
            if (Ma3X3[i][j] == 0) {
                contador0 ++;   }
        }
        //System.out.print(Ma3X3[i][j]+ "|");
    }
    System.out.println("");
}
    if (contador1 == 3 && contador0 == 6) {
        System.out.println("\nA Lista é uma Matriz Identidade");
    
    } else {
        System.out.println("Ela não é uma Matriz Identidade");
    }
//==============================================================================
*/

/*
//==============================================================================          |00|01|02| ! |1|2|3|
// 3. Matriz Transposta:                                                                  |10|11|12| ! |4|5|6|
// Dada uma matriz 3x3, crie e exiba a sua matriz transposta (trocar linhas por colunas). |20|21|22| ! |7|8|9| 

int [][] Matriz1 = new int [3][3];
int [][] Matriz2 = new int [3][3];

int contador1 = 2;
int contador2 = 2;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz1 [i][j] = ale.nextInt(51);
        if (Matriz1[i][j] <10) {
            System.out.print("0" +Matriz1[i][j]+ "|");
        } else {
        System.out.print(Matriz1[i][j]+"|");
        }
    }
    System.out.println("");
}
    System.out.println("-----------");
    
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz2[i][j] = Matriz1[contador1][contador2];
        if (Matriz2[i][j] <10) {
            System.out.print("0" +Matriz2[i][j]+ "|");
            contador2--;
        } else {
        System.out.print(Matriz2[i][j]+"|");
        contador2--;
        }
    }
    contador1--;
    contador2 = 2;
    System.out.println("");
} 
//==============================================================================
*/

/*
//==============================================================================
// 4. Somadas Diagonais de uma Matriz: 
// Dada uma matriz 3x3, calcule a soma dos elementos da diagonal principal e da diagonal secundária.

int [][] Matriz3 = new int [3][3];
int SomaPrincipal = 0;
int SomaSegundaria = 0;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz3 [i][j] = ale.nextInt(51);
        if (Matriz3[i][j] <10) {
            System.out.print("|0" +Matriz3[i][j]);
        
        } else {
            System.out.print("|" +Matriz3[i][j]);
        }
        
        if (i == j) {
            SomaPrincipal += Matriz3[i][j];
        
        } if (i + j == 2) {
            SomaSegundaria += Matriz3[i][j];
        }
    }
    System.out.println("|");
}
    System.out.println("\nA soma dos Números na Diagonal Principal é: [" +SomaPrincipal+ "]");
    System.out.println("E a soma dos Números da Diagonal segundaria é: [" +SomaSegundaria+ "]");
//==============================================================================
*/

/*
//==============================================================================
//5. Multiplicação por Escalar: 
//Multiplique todos os elementos de uma matriz 3x3 por um número escalar fornecido pelo usuário.

int [][] Matriz3 = new int [3][3];
int Multiplicador = 0;

    System.out.println("Digite um Número:");
    System.out.print("=> ");
        int Num = scN.nextInt();
    
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz3 [i][j] = ale.nextInt(51);
        if (Matriz3[i][j] <10) {
            System.out.print("|0" +Matriz3[i][j]);
        } 
        else {
            System.out.print("|" +Matriz3[i][j]);
        }
    }     
    System.out.println("|");
}

        System.out.println("\n------------------------");
        System.out.println("Os Agora os Número da Lista Multiplicado por " +Num);

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if ( (Matriz3[i][j] * Num) <10) {
            System.out.print("|0" +(Matriz3[i][j] * Num));
            Thread.sleep(690);
        } 
        else {
            System.out.print("|" +(Matriz3[i][j] * Num));
            Thread.sleep(690);
        }
    }     
    System.out.println("|");
}
//==============================================================================
*/

/*
//==============================================================================
// 6. Declarar e preencher uma matriz: 
// Crie uma matriz 3x3 de inteiros e preencha-a com os valores de 1 a 9, linha por linha. 
// Em seguida, exiba todos os elementos usando laços for.

int [][] Matriz3 = new int [3][3];

int Num = 1;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz3 [i][j] = Num++;
        if (Matriz3[i][j] <10) {
            System.out.print("|0" +Matriz3[i][j]);
            Thread.sleep(690);
        
        } else {
            System.out.print("|" +Matriz3[i][j]);
            Thread.sleep(690);
        }
    }
    System.out.println("|");
}
//==============================================================================
*/

/*
//==============================================================================
// 7. Soma de todos os elementos: 
// Dado o array abaixo, calcule e exiba a soma de todos os elementos da matriz 2x3.

int [][] Matriz2x3 = new int [2][3];
int soma = 0;

for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        Matriz2x3[i][j] = ale.nextInt(51);
        soma += Matriz2x3[i][j];
        if (Matriz2x3[i][j] < 10) {
            System.out.print("|0" +Matriz2x3[i][j]);
            Thread.sleep(469);
        }
        else {
            System.out.print("|" +Matriz2x3[i][j]);
            Thread.sleep(469);
        }
    }
    System.out.println("|");
}
    System.out.println("----------------");
        System.out.println("A Soma de todos os Números da Lista é " +soma);
//==============================================================================
*/
        
}   }