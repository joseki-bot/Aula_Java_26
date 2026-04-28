package Atividade;


import java.util.Scanner;

public class Lista2_II_Básico { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
    /*
    //1
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
        boolean bissexto = ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0) );
        System.out.println("O ano " +ano+ " é bissexto? \n" +bissexto);
//==============================================================================    
    */ 
 
    
    /*
 //=============================================================================    
    //2
        System.out.println("Verificador de Par");
        System.out.println("Se o número for Par, vai aparece Truem");
        System.out.println("Se ele não for vai aparecer False");
        
        System.out.println("\nDigite um Número:");
        int Numero = sc.nextInt();
        
        boolean Par = ((Numero % 2 == 0));
        
        System.out.println("O Número " +Numero+ " é: \n" +Par);
//==============================================================================    
    */

    
    /*
//==============================================================================
    //3
    
    System.out.println("Bem Vindo ao Detran RS\n");
    System.out.println("Vamos Verificar a sua Idade");
    System.out.println("Se você tiver mais de 18 anos vai aparecer uma mensagem falando True");
    System.out.println("Se aparecer true Você pode dirigir");
        
    System.out.println("\nPor Favor, informe a sua Idade: ");
    int Idade = sc.nextInt();
        
    boolean Maior = ((Idade >= 18));
        
        System.out.println("Você tem " +Idade+ " Se aparecer true Você pode tirar a carteira\n" +Maior);
//==================================================================================        
   */
    
    
    /*
//==============================================================================
    //4
    
    System.out.println("Digite um número: ");
    int Nu = sc.nextInt();
    
        boolean Con = ((Nu > 10) && (Nu < 20) );
        
        System.out.println("\nVocê Digitou o Número " +Nu+ " Vamos ver se ele está entre o 10 e 20\n" +Con);
//==============================================================================        
    */
        
    
     /*   
//==============================================================================
// 5

System.out.println("Digite um número: ");
int Nu = sc.nextInt();        

    boolean Mul = ((Nu % 3 == 0) || (Nu % 7 == 0));
    
    System.out.println("\nVocê Digitou o Número " +Nu+ " Vamos ver se ele é um multiplo de 3 ou 7\n" +Mul);
//===============================================================================
   */

     
     /*
//==============================================================================
// 6

    System.out.println("Bem Vindo ao Portal do Aluno, aqui você pode ver se está aprovado ou Não\n");
    System.out.println("Por favor Informe o seu nome:");
        String Nome = sc.nextLine();
        
    System.out.println("\nAgora nós informe a sua Nota:");
        int Nota = sc.nextInt();
    
    System.out.println("\nAgora nós informe a sua presença:");
        int Pres = sc.nextInt();
        
    
    boolean NotaFi = ((Nota >= 60) && (Pres >= 75));
    
    System.out.println("Olá " +Nome+ " 👋\n");
        System.out.println("Veremos a sua Presença de " +Pres+"%");
        System.out.println("E a sua Nota de " +Nota+ " Pontos");
        System.out.println("E você está " +NotaFi+ "!!!");
//==============================================================================
    */
     
        
    }
}
