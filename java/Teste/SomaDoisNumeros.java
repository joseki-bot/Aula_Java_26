package Teste;

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {  //psvm = tab = atalho para esse comando
        Scanner sc = new Scanner (System.in);

        /*        
==========================================================================================
        int resultado1 = 3 + 2 / 2;
        int resultado2 = (3 + 2) / 2;
        System.out.println("Resultados 1: -" +resultado1+ " resultado 2: "+resultado2);
============================================================================================
*/

        /*
        int ResMedia = (n1 + n2) / 2;
        int ResSoma = n1 + n2;
        int ResSub = n1 - n2;
        int ResMult = n1*n2;
      //double ResDiv = (int) (double) (n1/n2); //com essa linha ele não mostra muitos números depois da virgula
        int ResMod = n1 % n2;

        System.out.println("A Media Entre os dois números é: " + ResMedia );
        System.out.println("A Soma Entre os dois números é: "+ ResSoma );
        System.out.println("A Subtração Entre os dois números é: "+ ResSub );
        System.out.println("A Multiplicação Entre os dois números é: "+ ResMult);
        System.out.println("A Divisão Entre os dois números é: "+ ((double) n1/n2) ); //Aqui ele mostras
        System.out.println("A Porcetagem Entre os dois números é: "+ ResMod );
        */
       
   /*     
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt(); //para o user escrever
        
        System.out.println("Digite outro Número: ");
        int n2 = sc.nextInt();
        
        int Resultado = n1+n2; //Isso vaz a soma dos dois números virar uma varialvel
        System.out.println("A soma entre os números é "+(Resultado));
    */

        System.out.println("Coloque o Sinal da conta que dejesa fazer: ");
        int S = sc.nextInt();
        
        System.out.println("Digite um número: ");
        int N1 = sc.nextInt();
        
        System.out.println("Digite outro número: ");
        int N2 = sc.nextInt();
        
        System.out.println(N1 +S+ N2);
        int Res = sc.nextInt();
        
        System.out.println("A respota é: "+Res);
        
    }
}
