package Teste;

import java.util.Scanner;

public class InteracaoComUser {
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a sua Idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Muito prazer, " +nome);
        System.out.println("Tá muito veio, já tá com " +idade+ " kskskssk");
    }

    
}
