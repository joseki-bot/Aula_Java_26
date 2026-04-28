package Aulas;


import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    

/*        
//==============================================================================
    int contador = 1;
    int soma = 0;
    int num;
    
    int maior = Integer.MIN_VALUE; // menor valor possivel de Int, que o Usuario digite
    
    System.out.println(maior+"\n");
    
    //enquato
    while (contador <= 5) {
        System.out.print("Digite o " +contador+ "° valor: ");
        num = sc.nextInt(); // 1 20 5 10 99
        
        if (num > maior) { // 1 > 0
            maior = num; // 0
        }
        
        System.out.println(maior);
        soma += num;
        contador++;
    }
    
    System.out.println("\nA soma de todos os valores é: " +soma);
    System.out.println("O maior número digitado é: " +maior);
//==============================================================================
*/

/*
//==============================================================================
    double contaDolar = 5.19;
    
    System.out.println("\nQuantos vezes você quer converter?");
        int vezes = sc.nextInt();
    int contador = 1;
    System.out.println("\n");
    
    while (contador <= vezes) {
        System.out.println("\nQual o valore em R$?");
        double valorReais = sc.nextDouble();
        double valorDolares = (valorReais / contaDolar); // 1 / 5,19
        
        System.out.printf("O valor convertido é U$ %.2f\n" ,valorDolares);
        contador++; // +1 i++
    }
//==============================================================================
*/   
    
/*
//==============================================================================
    String Chegou = "não";
    
    //ENQUATO a resposta NÃO for "sim"
    while (! Chegou.equalsIgnoreCase("sim") ) {
        System.out.println("\nShrek, a gente já chegou?");
        System.out.println(" -- resposta (sim / não):");
        Chegou = sc.nextLine(); //aqui vai decidir quando o loop vai parar
    } 
    System.out.println("Finalmente! Vamos sair da Carruagem ");
//==============================================================================
*/

/*
//==============================================================================
    int nivelAgua = 0;
    System.out.println("Encher o copo ...");
    
    while (nivelAgua < 100) {
        nivelAgua = nivelAgua + 10; // Adicionando 10ml de cada vez
        System.out.println("Nível atual: " +nivelAgua+ " ml");        

        if (nivelAgua == 90) {
            System.out.println("Quase Overflow");
            //Break:
        }
    }
    System.out.println("Copo cheio! Pode beber");
//==============================================================================
*/






}
}