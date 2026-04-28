package Atividade;

import java.util.Scanner;

public class Lista1_I_Básico {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
/*
 //=================================================================
 // 1

        System.out.println("========================");
    System.out.println("Bem Vindo os Sistema de Intificação\n");
    System.out.println("Por Favor, Digite o seu Nome: ");
    String nome = sc.nextLine();
    
    System.out.println("\n=========================");
    System.out.println("Agora informe o seu sálario liquido: ");
    double salario = sc.nextDouble();
    
    System.out.println("=========================\n"); 
    System.out.println("Indentificação adicionada\n");
    System.out.println("Sue nome é " +nome+ "\n E o seu sálario é "+salario);
    System.out.println("=========================");

//===============================================================================    
*/



/*
//****************************************************************************************************************
// 2

System.out.println("==============================================================================");
    System.out.println("Digite um numero no qual você deseja saber o seu ANTECESSOR e o seu SUCESSOR:");
    int nu = sc.nextInt();
    System.out.println("==============================================================================\n");
    
    int An = nu - 1;
    int Su = nu + 1;
    
      System.out.println("-----------------------------------------");
      System.out.println("Seu número é "+nu);
      System.out.println("O número que vem antes dele é " +An); 
      System.out.println("E o número que é depois dele é "+Su);
      System.out.println("------------------------------------------");

//******************************************************************************************************************
*/



/*
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 3
        System.out.println("===================================");
        System.out.println("Dobro e Terça parte: \n");
        System.out.println("Digite um número que deseja saber o DObro do seu valor e sua Terça parte: ");
        double Numero = sc.nextDouble();
        
        double Dobro = Numero * 2;
        double Ter = Numero / 3;
        
            System.out.println("\n===========================================================");
            System.out.println("Seu número é " +Numero);
            System.out.println("O Dobro do valor do Número " +Numero+ " é = " +Dobro);
            System.out.printf ("E a terça parte do Número é %.4f", Ter);
            System.out.println("\n=============================================================");
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/



/*
/////////////////////////////////////////////////////////////////////////////////
// 4
    System.out.println("==================================================================");
    System.out.println("Conversor de Metro(M), para Quilômetros(Km) e Centrimetros(Cm). \n");
    
    System.out.println("Coloque a Distancia que deseja converter em METRO: ");
    double Dis = sc.nextDouble();
    System.out.println("===================================================================\n");
    
    double Km = Dis / 1000;
    double Cm = Dis * 100;
    
        System.out.println("============================================="); 
        System.out.println("Sou Distancia em Metros é: " +Dis+ "M"); 
        System.out.println("\n Ela em Quilômetros fica: "+Km+ "Km"); 
        System.out.println("\n Ela em Centrimetros ficou: "+Cm+ "CM"); 
        System.out.println("=============================================");

////////////////////////////////////////////////////////////////////////////////////////////////////////
*/



/*
//------------------------------------------------------------------------------------------------
    // 5
    /*
    System.out.println("======================================================"); 
    System.out.println("Covertor de Moedas");
    System.out.println("(somente de dólar para real e de real para dólar)"); 
    System.out.println("======================================================\n");
    
        System.out.println("Informe o valor que você tem na sua conta em Real(R$): ");
        double Valor = sc.nextDouble();
        
        System.out.println("=====================================================\n");
        double Do = Valor / 5.45;
        //System.out.printf("%.2f%n", Do); 

            System.out.println("\n==========================================");
            System.out.println("Você possui R$ "+Valor);
            System.out.printf("E em dólar você Possui em Dólare %.2f%n", Do);
            System.out.println("\n=============================================");
//----------------------------------------------------------------------------------------------
*/
  
  
/*
//...........................................................................................
// 6

    System.out.println("==============================================");
    System.out.println("Diddy's Releshi");
    System.out.println("Tudo para o seu relaxamento:");
    System.out.println("==============================================\n");
        
        System.out.println("Digite o valor do Produto que deseja comprar");
        double Prod = sc.nextDouble();
        
        double Des = 5;  //Dessa parte para baixo é só para colocar o descoto 
        double Cho = Prod * (Des / 100);
        double Final = Prod - Cho;
        
        // double Prod - Prod * 0.05;  // esse comando é toda a parte de cima só que mais simplificada 
        
            System.out.println("\n================================================");
            System.out.println("O Valor do Protudo é: " +Prod);
            System.out.printf ("Com o desconto de 5 Porcento ele vai a %.2f%n", Final);
            System.out.println("==================================================");
//................................................................................................
*/



/*      
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// 7 

    System.out.println("=======================================================");
    System.out.println("Parabéns pelo Aumento Cupincha."); 
    System.out.println("Apartir de agora você vai receber 25 reais por hora "); 
    System.out.println("Com isso você ira receber os seguinte valores !!! ");
        
        int VH = 25;
        int V8 = VH * 8;
        int VM = V8 * 30;
        int VA = VM * 12;
        
            System.out.println("\n============================================================================="); 
            System.out.println("Você recebe R$ " +VH+ " Por hora de Trabalho"); 
            System.out.println("Em uma jornada de 8h por dia, você receber R$ " +V8+ " Por dia Trabalho");
            System.out.println("E em um Mês recebera R$ " +VM);
            System.out.println("E durante 1 ano de trabalho você vai receber R$ " +VA);
            System.out.println("==============================================================================");
            
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/
    


/*    
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// 7 extra

    System.out.println("=======================================================");
    System.out.println("Banco Buzanva, o banco que calcular o seu sálario."); 
    System.out.println("Informe ao Buzanva o valor que você ganha por Hora: ");
    int VH = sc.nextInt();
    
        int V8 = VH * 8;
        int VM = V8 * 30;
        int VA = VM * 12;
        
            System.out.println("============================================================================="); 
            System.out.println("Você recebe R$ " +VH+ " Por hora de Trabalho"); 
            System.out.println("Em uma jornada de 8h por dia, você receber R$ " +V8+ " Por dia Trabalho");
            System.out.println("E em um Mês recebera R$ " +VM);
            System.out.println("E durante 1 ano de trabalho você vai receber R$ " +VA);
            System.out.println("==============================================================================");
 
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/
    
    









    }
}
