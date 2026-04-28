package Codigos;


import java.util.Scanner;

public class Aula3_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
//=============================================
    System.out.print("Primeira Nota: ");
        double n1 = sc.nextDouble();
        
    System.out.print("Segunda Nota: ");
        double n2 = sc.nextDouble();
        
    double media = (n1 + n2) / 2;
    System.out.printf("A média do aluno é: %.2f" ,media);
        
    
    if (media >= 7) {
        System.out.println(" Aluno Aprovado");
        
    } else if (media >= 5) {
        System.out.println(" Aluno em Recuperação");
    
    } else {
        System.out.println(" Aluno Reprovado");
    }
    
    
}
}