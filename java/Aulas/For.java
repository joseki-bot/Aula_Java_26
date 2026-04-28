package Aulas;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
 
//==============================================================================        
    
//        variavel que fale 1
//    for (int i = 1;  i <= 10; i++1) {
//                     ⌊ Um limete que quando chegar em 10 para
//        
//                            desse jeito vai somando de 2 em 2
//   for (int i = 1;i <= 10; i+=2) {
//        System.out.println(i);
//        }
/*
    int soma = 0;
    for (int i = 1;i <= 5; i++) {
        System.out.println("Digite um Valor: ");
        int num = sc.nextInt();
        soma += num; // soma = soma + num
    }
        System.out.println("A soma dos valores é: "+soma);
*/
//==============================================================================

//      Tabuada
 /*   System.out.println("Digite um Número:");
        int num = sc.nextInt();
        
    for (int i=1; i<=10; i++) { //1 2 ... 10         1*
        System.out.println(num+ " X " +i+ " = " +(num *i)); // 1 x 1 = 1
    } */
        

// Programa que mostre quantos valores difitados estão entre 0 e 10 após 6 
//difitações e soma-los
//===============================================================================       
//      Impares entres 0 e 10
/*   
    int contador = 0;
    int SomaImpares = 0;
        
    for (int i = 0; i < 6; i++) {
        System.out.println("Digte o valor: ");        
        int valor = sc.nextInt();
        if (valor >= 0 && valor <= 10) {  // O valor só vai entrar aqui se estiver entre 0 e 10
            contador++; // ele conta quanto números estão entre 0 e 10
            
            if (valor % 2 == 1) {  // mostra se o número é impar
                SomaImpares += valor;
                
            }
        }
    }
    System.out.println("Ao todo foram " +contador+ " valores entre 0 e 10");
    System.out.println("Nesse intervalor, a soma dos ímpares foi " +SomaImpares);    
*/        
   
/*
//================================================================================
// Contador de vagois 
    
    System.out.println("===================");
    String palavra = "Programacao";
    int contador = 0;
                                // length conta quantos caractere a palavra tem
    for (int i = 0; i < palavra.length(); i++) { // p r o g r a m a c a o 
        char c = palavra.charAt(i);
        
        if (c=='a' || c=='e' || c =='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c =='O' || c=='O' || c=='U' ) {
            contador++; // tem uma vogal que é a Letra O 
            int mais = i + 1;
            System.out.println("A Letra que está na possição " +mais+" é : " +c);
        }
    }
    System.out.println("Número de vogais: " +contador);  
==================================================================================
*/       

/*
//================================================================================
// Contador de vagois com Sccaner
    
    System.out.println("=========================");
    System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int contador = 0;
    
                                // length conta quantos caractere a palavra tem
    for (int i = 0; i < palavra.length(); i++) { // p r o g r a m a c a o 
        char c = palavra.charAt(i);
        
        if (c=='a' || c=='e' || c =='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c =='O' || c=='O' || c=='U' ) {
            contador++; // tem uma vogal que é a Letra O 
            int mais = i + 1;
            System.out.println("A Letra que está na possição " +mais+" é : " +c);
        }
    }
    System.out.println("Número de vogais: " +contador); 
//================================================================================    
*/   

/*
//================================================================================

    System.out.println("=========================");
    System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int contador = 0;
        
    String vogais = "aieouAEIOUáéíóúÁÉÍÓÚãõÃÕÔôÂâ";
    
    for (int i = 0; i < palavra.length(); i++) {
        char c = palavra.charAt(i);
//                                // .valuOF converte a String para algo que o Char entende        
        if (vogais.contains(String.valueOf(c))) {
            contador++;
            System.out.println("letra " +(i+1)+ " é: " +c);
        }
    }
    
        System.out.println("Número de vogais (incluindo acentuadas): " +contador);
        
*/      
        
        
        
        
        
 }
}
