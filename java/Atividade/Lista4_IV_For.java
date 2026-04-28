package Atividade;

import java.util.Scanner;

public class Lista4_IV_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    

/*==============================================================================        
// 1.  Exibir a tabuada completa de 1 a 10.

    System.out.println("================================");
    System.out.print("Digite um Número: ");
    int Num = sc.nextInt();
        
    for (int i = 0; i <= 10; i++) {
        int Res = Num * i;
        
        System.out.println("O Número " +Num+ "X" +i+ " é: " +Res);
    }
==============================================================================*/
        
/*==============================================================================
// 2. Exibir os números de 1 a 10 em ordem decrescente.

    for (int i = 10; i >= 0; i--) {
        System.out.println(i);
    }
==============================================================================*/        
        
/*==============================================================================
// 3. Calcular a soma dos números de 1 a 10.
    int Soma = 0;
    
    for (int i = 0; i <= 10; i++) {
        Soma += i;
        }
    
    System.out.println("========");
    System.out.println("   "+Soma);
    System.out.println("========");    
 =============================================================================*/       
        

//==============================================================================
/*
// 4.  Exibir os números ímpares de 9 a 1 em ordem decrescente.
 
    for (int i = 9; i >= 0; i -=2) {
        System.out.println(i);
       
    }
*/
//==============================================================================
    
//==============================================================================
/*
// 5. Calcular a média de 5 números informados pelo usuário.

    double BaseM = 0;
    
    for (int i = 0; i < 5; i++) {
        System.out.println("==============================");        
        System.out.print("Digire um número: ");
            double UserN = sc.nextInt();
            
        BaseM += UserN;
    }
    System.out.println("\n================================");
    System.out.println("A media dos Valores é: " +BaseM / 5);
    System.out.println("================================");
*/
//==============================================================================
  
//==============================================================================
/*
// 6. Solicitar ao usuário um caractere e um número, e exibir o caractere 
// repetido o número de vezes especificado.

    System.out.print("Agora Digite um Caractere: ");
        String Carac = sc.nextLine();
    System.out.print("Digite um Número: ");
        int N= sc.nextInt();

    for (int i = 0; i < N; i++) {
        System.out.println((i+1)+ "- " +Carac);
    }
*/
//==============================================================================

//==============================================================================
/*
// 7. Solicitar ao usuário um número inicial, um número final e um incremento, 
// e exibir a contagem entre esses números com o incremento especificado.

    System.out.println("=======================");
    System.out.print("Digite Um Número Inicial: ");
        int N1 = sc.nextInt();
        
    System.out.print("\nDigite Um número que vai ser o Final: ");
        int N2 = sc.nextInt();
        
    System.out.print("\nDigite um número para Incrementar: ");
        int NIn = sc.nextInt();
        
    if (N1 < N2) {
        System.out.println("\nSeu Número vai começar " +N1+ " e vai até " +N2);
            System.out.println("E vai sumando de " +NIn+ " em " +NIn+ "\n");
    
        for (int i = N1; i <= N2; i+=NIn) {
            System.out.println(i); }
    
    } else if (N1 > N2) {
        System.out.println("\nSeu Número vai começar " +N1+ " e vai até " +N2);
        System.out.println("E vai diminuindo de " +NIn+ " em " +NIn+ "\n");
                
        for (int i = N1; i >= N2; i-=NIn) {
            System.out.println(i); }
   
    } else if (N1 == N2) {
        System.out.println("\nVocê Digitou o mesmo Número em ambos, assim ele só vai aparecer uma vez");
        System.out.println(N1);
    
    } else {
        System.out.println("Algo de errado, Por Favor, começe Novamente");
    }
*/
//==============================================================================        

//==============================================================================        
/*
// 8. Solicitar ao usuário a idade de 5 pessoas e calcular a média das idades.

    double IdadeM = 0;
    
    for (int i = 0; i < 5; i++) {
        System.out.println("==============================");   
        System.out.print("Digite o Nome de uma pessoa: ");
            String Nome = sc.nextLine();
        
        System.out.print("Digite a Idade dessa Pessoa: ");
            double UserN = sc.nextInt();
        
        IdadeM += UserN;
    }
    System.out.println("\n================================");
    System.out.println("A media das Idades das pessoas são: " +IdadeM / 5);
    System.out.println("================================");
*/    
//==============================================================================        


//==============================================================================        
/*
// 9. Solicitar ao usuário 7 números e identificar o maior e o menor valor digitados.

    System.out.print("Digite um Número: ");
        int Nu = sc.nextInt();
    
    int Menor = Nu;
    int Maior = Nu;
    
    for (int i = 1; i <7; i++) {
        System.out.print("Digite um Número: ");
        Nu = sc.nextInt();
            
    if (Nu >= Maior) {
        Maior = Nu;
        
    } else if (Nu <= Menor) {
        Menor = Nu;
    }
    }

    System.out.println("\nO maior número é " +Maior);
    System.out.println("E o menor é " +Menor);
*/
//==============================================================================        






        
}
}