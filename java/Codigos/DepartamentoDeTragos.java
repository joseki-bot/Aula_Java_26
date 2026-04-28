package Codigos;


import java.time.LocalDate;
import java.util.Scanner;

public class DepartamentoDeTragos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//==============================================================================
        
System.out.println("=========================");
System.out.println("DEPARTAMENTO DETRAGOS");
System.out.println("=========================");

System.out.print  ("NOME: ");
    String Nome = sc.nextLine();
    
int ano = LocalDate.now().getYear();
System.out.println("ANO ATUAL: "+ano);

System.out.print("ANO DE NASCIMENTO: ");
    int AnoNas = sc.nextInt();

    int Idade = (ano - AnoNas);
System.out.println("IDADE: " +Idade+ " Anos");

if (Idade >= 18) {
    System.out.println("APTO PARA BEBER ");
    System.out.println("======================");
} else {
    System.out.println("DEVE BEBER NESCAL");
    System.out.println("======================");

}        
        
        
    }
}
