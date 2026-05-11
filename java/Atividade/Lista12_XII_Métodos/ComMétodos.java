package Atividade.Lista12_XII_Métodos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ComMétodos {
//==============================================================================
// 1. Par ou Ímpar (if/else): 
//Crie um método que receba um número inteiro e imprima se ele é par ou ímpar.     
  
    public void Par_Impar (int Numero) {
        if (Numero % 2 == 0) {
            System.out.println("O NÚMERO É PAR");
        }
        if (Numero % 2 == 1) {
            System.out.println("O NÚMERO É IMPAR");
        }
}
//==============================================================================
    
 
//==============================================================================
// 2. Status de Aprovação (if/else): 
// Crie um método que receba a nota de um aluno (0 a 10). 
// Se for maior ou igual a 7, imprima "Aprovado", senão, "Reprovado".
    
    public void Aprovador (double Nota) {
        if (Nota >= 7) {
            System.out.println("O Aluno foi aprovado");
        }
        else {
            System.out.println("O Aluno foi reprovado");
        }
}
//==============================================================================

    
//==============================================================================    
// 3. Contagem Regressiva (while): 
// Crie um método que receba um número inicial e imprima uma contagem regressiva até 0 usando a estrutura while.

    public  void contador(int numero) {
        while (numero != 0) {
            if (numero < 10) {
                System.out.print("0"+numero+ " | ");
                numero --;
            } else {
                System.out.print(numero+ " | ");
                numero--;
            }
            
            if (numero % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("00");
    }
//==============================================================================

   
//==============================================================================    
// 4. Dobrar até 100 (while): 
// Crie um método que receba um número pequeno (ex: 2) 
// e vá multiplicando-o por 2 e imprimindo o resultado até que o valor passe de 100 usando while.
    
    public void Multiplicador (int numero) {
        while (numero < 100) {
            System.out.print(numero+ " | ");
            numero *= 2;
        }
        System.out.println(numero);
    }
//==============================================================================


    
//==============================================================================    
// 5. Tabuada (for): 
// Crie um método que receba um número inteiro e imprima a sua tabuada (de 1 a 10) usando o laço for.
    
public void Tabuada (int Numero) {
    int contador = 0;
    for (int i = 0; i < 11; i++) {
        System.out.println("|"+Numero+ " X " +contador+ " = " +(Numero * contador)+"|");
        contador++;
    }
}   
//==============================================================================


//==============================================================================
// 6. Soma de N números (for):
// Crie um método que receba um número N e some todos os números de 1 até N usando o laço for, imprimindo o total no final.

public void SomaDoN (int Numero) {
    int contador = 1;
    for (int i = 0; i < Numero; i++) {
        System.out.println("|"+Numero+ " + " +contador+ " = " +(Numero + contador)+"|");
        contador++;
    }
}   
//==============================================================================    


//==============================================================================    
// 7. Dia da Semana (switch case): 
// Crie um método que receba um número de 1 a 7 e imprima o dia da semana correspondente 
// (1 = Domingo, 2 = Segunda, etc.) usando switch case.

public void DiaSemana (int numero) {
    switch (numero) {
        case 1 -> {
            System.out.println("É DOMINGO");
            break;
        }
        case 2 -> {
            System.out.println("É SEGUNDA-FEIRA");
            break;
        }
        case 3 -> {
            System.out.println("É TERÇA-FEIRA");
            break;
        }
        case 4 -> {
            System.out.println("É QUARTA-FEIRA");
            break;
        }
        case 5 -> {
            System.out.println("É QUINTA-FEIRA");
            break;
        }
        case 6 -> {
            System.out.println("É SEXTA-FEIRA");
            break;
        }
        case 7 -> {
            System.out.println("É SÁBADO-FEIRA");
            break;
        }
    }
}
//==============================================================================


//==============================================================================
// 8. Calculadora Básica (switch case): 
// Crie um método que receba dois números e um caractere representando a operação 
// ('+', '-', '*', '/'). Use switch case para calcular e imprimir o resultado.

public int Calculadora (int Num1, int Num2, String Operador) {
    int respota = 0;
    switch (Operador){
        case "+" -> { 
            respota = Num1 + Num2;
            break;
        }
        case "-" -> {
            respota = Num1 - Num2;
            break;
        }
        case "*", "x" -> {
            respota = Num1 * Num2;
            break;
        }
        case "/", "%" -> {
            respota = Num1 / Num2;
            break;
        }
    }
    return respota;
}
//==============================================================================


//==============================================================================
// 9. Maior de Três (if/else aninhado): 
// Crie um método que receba três números inteiros e imprima qual é o maior deles usando if/else.

public int MAIOR (ArrayList <Integer> Guardar) {
    int maior = 0;
    for (int somar : Guardar) {
        if (maior < somar) {
            maior = somar;
        }
    }
    return maior;
}
//==============================================================================


//==============================================================================
//  10. Contador de Vogais (for e switch case): 
// Crie um método que receba uma palavra (String) e conte quantas vogais existem nela. 
// Use um for para percorrer as letras e um switch case para verificar se é vogal.

public void ContadorVogais (String Palavra) {
    int contador = 0;
    Set <Character> guardar = new HashSet<>();
    for (int i = 0; i < Palavra.length(); i++) {
        char letra = Palavra.charAt(i);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' ||  letra == 'u') {
            contador++;
            guardar.add(letra);
        }
    }
    System.out.println("\nA Palavra '" +Palavra+"' Tem " +contador+ " Letras");
    System.out.println("E contém " +guardar.size()+" Vogais, e elas são");
    System.out.println(guardar);
}
//==============================================================================
}