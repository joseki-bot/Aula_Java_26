package Teste;
import java.util.Scanner;
public class TesteIfElse {
        public static void main(String[] args) throws InterruptedException {
            Scanner sc = new Scanner (System.in);    
 
    /*
    //1
    System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
       
        
    if ( (ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0) ) 
    {    
        System.out.println("O ano " +ano+ " é bissexto");
        
    } else {
        System.out.println("O Ano escolhido Não é Bissexto");
    } 
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
        
    if ((Numero % 2 == 0)) {
        System.out.println("O Número " +Numero+ " é Par");
    
    } else {
        System.out.println("O Número não é Par");
    }
//==============================================================================    
    */

    
    /*
//==============================================================================
    //3
    
    System.out.println("Bem Vindo ao Detran RS\n");
    System.out.println("Você só pode tirar a sua CNH com 18 anos ou mais");
    
    System.out.println("\nPor Favor, informe a sua Idade: ");
        int Idade = sc.nextInt();
        
        
    if (Idade >= 18) {
        System.out.println("Você tem " +Idade+ " Com esse idade você ja pode tentar tirar a sua CNH");
        
    } else {
        int Falta = (18 - Idade);
        System.out.println("Você tem " +Idade+ " Você ainda é de menor");
        System.out.println("Você ainda tem que esperar mais " +Falta+ " Anos");
    }
//==================================================================================        
    */
    
    
    
//==============================================================================
//4
    System.out.println("VERIFICADOR DE NÚMEROS"); 
    System.out.println("Escolha 2 Número onde você vai poder comparalos a um Treceiro");
        Thread.sleep (4000);
        
    System.out.println("\nPor Valor escolha O Primeiro Número:");
        int PriN = sc.nextInt();
        Thread.sleep (3000);
        
    System.out.println("\nAgora escolha o Treceiro Número:");
    System.out.println("Ele dever ser Menor que o Primeiro Número");
        int SegN = sc.nextInt();
        Thread.sleep (3000);
        
    if (PriN >= SegN) {
        
    }
        
        
    System.out.println("\n\nAgora você vai escolher um Terceiro Número");       
    System.out.println("Esse Número vai ser comparado entre o " +PriN+ " e o " +SegN);
        System.out.println("\nDigite o Número:");
        int TreN = sc.nextInt();
    
    
    
//==============================================================================        
    
        
    
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
