package Codigos;



import java.util.Random;
import java.util.Scanner;

public class Aula_SwitchCase_Menu {
     public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
//==============================================================================
for (int i = 0; i < 10; i++) {System.out.println("");}
        
    System.out.println("============================");        
    System.out.println("      MENU DO PROGRAMA");        
    System.out.println("============================");
        
        
         System.out.println("Escolha Um Opção");        
         System.out.println("\n1. Novo Arquivo");        
         System.out.println("2. Salvar");
         System.out.println("3. Salvar Como...");  
         System.out.println("4. Sair sem Salvar");
         System.out.println("5. Fechar o Programa");
        
        String opcao = sc.nextLine();
        
        switch (opcao) {
            case "1":
                System.out.println("Novo arquivo criado.");
                break;
                
            case "2":
                System.out.println("Arquivo salvo");
                break;
                
            case "3":
                System.out.println("Arquivo salvo como cópia");
                break;
                
            case "4":
                System.out.println("Você saiu do Programa sem SALVAR");
                break;
                
            case "5":
                System.out.println("O Programa está sendo fechado");
                break;
                
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        
         System.out.println("-----------------");
         System.out.println(" Desligano o PC");
         System.out.println("-----------------");
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}
