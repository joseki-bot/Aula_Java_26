package Teste;


import java.util.Scanner;

public class MediaComRes {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
    
//==============================================================================


//==============================================================================

for (int i = 0; i < 15; i++) { System.out.println(" "); }
    
int Aluno = 1;
double Resp = 0;
String Nota;

    System.out.print("Digite A Nota do 1º Aluno: ");
        String Nota1 = sc.nextLine();

    do {
        Aluno++;
        
        System.out.println("\n\nDigite '=' para ver a medida de todos os Alunos ");
        System.out.print("Digite A Nota do " +Aluno+ "° Aluno: ");
            Nota = sc.nextLine();
        
        if ( Nota.equals("=") ) {
            break; }
        
        Nota = Nota.replace(',', '.');
        double NumNota = Double.parseDouble (Nota);
        
        Resp += NumNota;   
        
    } while ( Aluno < 99999 ); {
    
        double NumNota1 = Double.parseDouble(Nota1);
        Resp += NumNota1;
       
        double Aluno1 = Aluno;
        Resp = Resp / Aluno1;
        
        System.out.println("\n\n");
        System.out.print("A media dos " +Aluno+ " Alunos é"); 
        System.out.printf(":  %.2f%n" ,Resp);
    }        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}