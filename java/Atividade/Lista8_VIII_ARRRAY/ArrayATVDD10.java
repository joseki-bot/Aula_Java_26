package Atividade.Lista8_VIII_ARRRAY;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayATVDD10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================
// 10 Mesclar (Juntar) DOis Arrays:
//Pegar dois arrays diferentes e juntar os elemetnos de ambos em um terceiro array

//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// 10. Mesclar (Juntar) Dois Arrays: 
// Pegar dois arrays diferentes e juntar os elementos de ambos em um terceiro array.
int finalizador = 0;
String Escolha = null;
int Espaço = 0;

while (finalizador != 1) {

System.out.println("=================================================");
System.out.println(" Escolha qual Tipo de Array que você quer usar:");
System.out.println("=================================================");
System.out.println("1. INT (inteiro)");
System.out.println("2. STRING (Corda)");
System.out.println("3. DOUBLE (Número com Vírgula)");
System.out.println("4. CHAR (Um Único Elemento)");
System.out.print("==> ");
    Escolha = sc.nextLine().toLowerCase();
    

System.out.println();
// Essa parte é só para só menu para o Usuario escolher qual tipo de Array que o 
// usuario vai querer usar
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜



//------ Essa Primeira case é se ele escolher a 1° opção que é o tipo int ------   
switch (Escolha) {
case "1", "int", "inteiro", "numero" -> {
finalizador = 1;
    System.out.println("Quantos espaços você quer no Array ?");    
    System.out.print("==> "); // espaços que eu me refiro é quanto fazer o array se repete
        Espaço = sc.nextInt();

    int [] INT1 = new int [Espaço];    
        for (int i = 0; i < Espaço; i++) {
            System.out.println("-----------------------------");
            System.out.print("Digite o " +(1+i)+ "° Núemro: ");
                INT1[i] = sc.nextInt();     
        }
            System.out.println("-----------------------------");
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

// Agora vai ser o segundo ARRAY, que vai ser do mesmo tipo que a pessoa escolheu
    System.out.println("\n\n");
    System.out.println("Agora é o segungo array, que vai ser do Mesmo Tipo");
    System.out.println("E com a mesma quantidade de espaço do Primeiro");
        Thread.sleep(2500);
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   . 

//Como ele vai iqual primeiro só com outra respota usei a mesma variavel
    int [] INT2 = new int [Espaço];    
         for (int i = 0; i < Espaço; i++) {
            System.out.println("-----------------------------");
            System.out.print("Digite o " +(1+i)+ "° Núemro: ");
                INT2[i] = sc.nextInt();     
         }
            System.out.println("-----------------------------");
            Thread.sleep(1500);
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   . 

// Agora vai ser Exibido oque foi escrevido nós dois Array, e perguntar oque ele
// quer fazer com esse dois array.
    System.out.println("\n\n");
    
        System.out.println(" 1° ARRAY | 2° ARRAY");
    for (int i = 0; i < Espaço; i++) {
        System.out.println("| " +INT1[i]+ "   |   " +INT2[i]+ " |");
    }             Thread.sleep(2000);

    System.out.println("===========================================");
    System.out.println("OQUE VOCÊ DEJESA FAZER COM ESSES VALORES ?");
    System.out.println("===========================================");
    System.out.println("1. SOMAR (+)");
    System.out.println("2. DIMINUIR (-)");
    System.out.println("3. MULTIPLICAR (X)");
    System.out.println("4. DIVIDIR (/)");
    System.out.println("5. MESCLAR");
    System.out.print("=> ");
        String EQUACAO = sc.nextLine().toLowerCase();
        EQUACAO = sc.nextLine().toLowerCase();
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

//+++++++++ Agora vamos para um segundo switch para fazer as equações +++++++++
    switch (EQUACAO) {
        case "1", "somar", "+", "mais" ->{
            int [] INT3 = new int [Espaço];
            for (int i = 0; i < Espaço; i++) {
                INT3 [i] = INT1[i] + INT2[i];
            }
            System.out.println("A Soma dos dois ARRAY é:");
            for (int Final : INT3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de soma 
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

//---------------- Agora é o case de vai dimunir a segundo opção ----------------
        case "2", "diminuir", "-", "menos" ->{
            int [] INT3 = new int [Espaço];
            for (int i = 0; i < Espaço; i++) {
                INT3 [i] = INT1[i] - INT2[i];
            }
            System.out.println("A Subtração dos dois ARRAY é:");
            for (int Final : INT3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de diminuição
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .    
        
//xxxxxxxxxxxxxxxx Agora é o case de vai multiplicar xxxxxxxxxxxxxxxxxxxxxxxxxxx
        case "3", "multiplicar", "x", "vezes" ->{
            int [] INT3 = new int [Espaço];
            for (int i = 0; i < Espaço; i++) {
                INT3 [i] = INT1[i] * INT2[i];
            }
            System.out.println("A Multiplicação dos dois ARRAY é:");
            for (int Final : INT3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de multiplicação
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .  
        
/////////////////// Agora é o case de vai dividir //////////////////////////////
        case "4", "dividir", "/" ->{
            int [] INT3 = new int [Espaço];
            for (int i = 0; i < Espaço; i++) {
                INT3 [i] = INT1[i] / INT2[i];
            }
            System.out.println("A Divisão dos dois ARRAY é:");
            for (int Final : INT3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de Divisão
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        
     
//-><- Agora é o case que vai mesclar ou seja, vai juntar os dois resultados -><-     
        case "5", "mesclar" -> {
            System.out.println("Processando..");
            Thread.sleep(1560);
            
            int [] INT3 = new int [Espaço + Espaço];
            for (int i = 0; i < Espaço; i++) {
                INT3[i] = INT1[i];  }
            
            for (int i = 0; i < Espaço; i++) {
                INT3 [Espaço + i] = INT2[i]; }
            
            System.out.println("A Mesclagem do Arrays foi concluída.");
            System.out.println("-> " + Arrays.toString(INT3) );
        }
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
} // fecha o switch da equação
    break;
} // Essa acheve é para fechar o case do INT
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜


//------------------  Essa  Segundo case é para o tipo STRING  ------------------
case "2", "string", "corda", "palavra" -> {
finalizador = 1;
    System.out.println("Quantos espaços você quer no Array ?");    
    System.out.print("==> "); // espaços que eu me refiro é quanto fazer o array se repete
        Espaço = sc.nextInt();

    String [] STR1 = new String [Espaço];
    System.out.println("Tem que escreve a respota duaz vezes");
    Thread.sleep(1500);
        for (int i = 0; i < Espaço; i++) {
            System.out.println("----------------------------");
            System.out.print("Digite a " +(1+i)+ "° Palavra: ");
                STR1[i] = sc.nextLine();
                STR1[i] = sc.nextLine();  
                STR1[i] = STR1[i] + " ";
        }
            System.out.println("----------------------------");
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

// Agora vai ser o segundo ARRAY, que vai ser do mesmo tipo que a pessoa escolheu
    System.out.println("\n\n");
    System.out.println("Agora é o segungo array, que vai ser do Mesmo Tipo");
    System.out.println("E com a mesma quantidade de espaço do Primeiro");
        Thread.sleep(2500);
    
//Como ele vai iqual primeiro só com outra respota usei a mesma variavel
    String [] STR2 = new String [Espaço];    
        for (int i = 0; i < Espaço; i++) {
             System.out.println("----------------------------");
            System.out.print("Digite a " +(1+i)+ "° Palavra: ");
                STR2[i] = sc.nextLine();        }
            System.out.println("----------------------------");
            
// Agora vai ser criado o Treceiro Array, que vai juntar as palavra do array 1 e 2
// E vai ser exibido as palavras juntas
System.out.println("\n\n");

    String[]STR3 = new String [Espaço + Espaço];
    System.out.println("Processando...");
    Thread.sleep(1569);
    
    for (int i = 0; i < Espaço; i++) {
        STR3[i] = STR1[i];  }
    
    for (int i = 0; i < Espaço; i++) {
        STR3[Espaço+i] = STR2[i];
    }
    
    System.out.println("As Palavra Digitadas foram");
    System.out.println("-> " + Arrays.toString(STR3));
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
    break;  
}// Essa é a chave para fechar o case da String
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜


//----------  Essa para a Terceira opçao o DOUBLE, número com Vírgula  ----------
case "3", "double", "virgula" -> {
finalizador = 1;
    System.out.println("Quantos espaços você quer no Array ?");    
    System.out.print("==> "); // espaços que eu me refiro é quanto fazer o array se repete
        Espaço = sc.nextInt();

double [] DOU1 = new double [Espaço];  
    for (int i = 0; i < Espaço; i++) {
        System.out.println("-----------------------------");
        System.out.print("Digite o " +(1+i)+ "° Número Décimal: ");
            DOU1 [i] = sc.nextDouble();         
    }
        System.out.println("-----------------------------");

// Agora vai ser o segundo ARRAY, que vai ser do mesmo tipo que a pessoa escolheu
    System.out.println("\n\n");
    System.out.println("Agora é o segungo array, que vai ser do Mesmo Tipo");
    System.out.println("E com a mesma quantidade de espaço do Primeiro");
        Thread.sleep(2500);
    
//Agora ele vai vai fazer o segundo array
double [] DOU2 = new double [Espaço];  
    for (int i = 0; i < Espaço; i++) {
        System.out.println("-----------------------------");
        System.out.print("Digite o " +(1+i)+ "° Número Décimal: ");
            DOU2 [i] = sc.nextDouble();         
    }
        System.out.println("-----------------------------");
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   . 

// Agora vai ser Exibido oque foi escrevido nós dois Array, e perguntar oque ele
// quer fazer com esse dois array.
    System.out.println("\n\n");
    
        System.out.println(" 1° ARRAY | 2° ARRAY");
    for (int i = 0; i < Espaço; i++) {
        System.out.println("| " +DOU1[i]+ "   |   " +DOU2[i]+ " |");
    }             Thread.sleep(2000);

    System.out.println("===========================================");
    System.out.println("OQUE VOCÊ DEJESA FAZER COM ESSES VALORES ?");
    System.out.println("===========================================");
    System.out.println("1. SOMAR (+)");
    System.out.println("2. DIMINUIR (-)");
    System.out.println("3. MULTIPLICAR (X)");
    System.out.println("4. DIVIDIR (/)");
    System.out.println("5. MESCLAR");
    System.out.print("=> ");
        String EQUACAO = sc.nextLine().toLowerCase();
        EQUACAO = sc.nextLine().toLowerCase();
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

//+++++++++ Agora vamos para um segundo switch para fazer as equações +++++++++
    switch (EQUACAO) {
        case "1", "somar", "+", "mais" ->{
            double [] DOU3 = new double [Espaço];
            for (int i = 0; i < Espaço; i++) {
                DOU3 [i] = DOU1[i] + DOU2[i];
            }
            System.out.println("A Soma dos dois ARRAY é:");
            for (double Final : DOU3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de soma 
//.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        

//---------------- Agora é o case de vai dimunir a segundo opção ----------------
        case "2", "diminuir", "-", "menos" ->{
            double [] DOU3 = new double [Espaço];
            for (int i = 0; i < Espaço; i++) {
                DOU3 [i] = DOU1[i] - DOU2[i];
            }
            System.out.println("A Subtração dos dois ARRAY é:");
            for (double Final : DOU3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de diminuição
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .    
        
//xxxxxxxxxxxxxxxx Agora é o case de vai multiplicar xxxxxxxxxxxxxxxxxxxxxxxxxxx
        case "3", "multiplicar", "x", "vezes" ->{
            double [] DOU3 = new double [Espaço];
            for (int i = 0; i < Espaço; i++) {
                DOU3 [i] = DOU1[i] * DOU2[i];
            }
            System.out.println("A Multiplicação dos dois ARRAY é:");
            for (double Final : DOU3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de multiplicação
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .  
        
/////////////////// Agora é o case de vai dividir //////////////////////////////
        case "4", "dividir", "/" ->{
            double [] DOU3 = new double [Espaço];
            for (int i = 0; i < Espaço; i++) {
                DOU3 [i] = DOU1[i] / DOU2[i];
            }
            System.out.println("A Divisão dos dois ARRAY é:");
            for (double Final : DOU3) {
                System.out.println("- " +Final);    }
    break;
    } // fecha o case de Divisão
 //.    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .        
           
//-><- Agora é o case que vai mesclar ou seja, vai juntar os dois resultados -><-     
        case "5", "mesclar" -> {
            System.out.println("Processando..");
            Thread.sleep(1560);
            
            double [] DOU3 = new double [Espaço + Espaço];
            for (int i = 0; i < Espaço; i++) {
                DOU3[i] = DOU1[i];  }
            
            for (int i = 0; i < Espaço; i++) {
                DOU3[Espaço + i] = DOU2[i]; }
            
            System.out.println("A Mesclagem do Arrays foi concluída.");
            System.out.println("-> " + Arrays.toString(DOU3) );
        }
        
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
} // fecha o switch da equação
    break;
} // Essa acheve é para fechar o case do DOUBLE
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜


// Esse é para a Quarta opção, o CHAR, que eu acho que vai dar um dor de cabeça
case "4", "char", "um" -> {
finalizador = 1;
    System.out.println("Quantos espaços você quer no Array ?");    
    System.out.print("==> "); // espaços que eu me refiro é quanto fazer o array se repete
        Espaço = sc.nextInt();

    char [] CHAR1 = new char [Espaço];
        for (int i = 0; i < Espaço; i++) {
            System.out.println("-----------------------------");
            System.out.print("Digite o " +(1+i)+ "° Elemento: ");
                CHAR1[i] = sc.next().charAt(0);     
        }
            System.out.println("-----------------------------");

// Agora vai ser o segundo ARRAY, que vai ser do mesmo tipo que a pessoa escolheu
    System.out.println("\n\n");
    System.out.println("Agora é o segungo array, que vai ser do Mesmo Tipo");
    System.out.println("E com a mesma quantidade de espaço do Primeiro");
        Thread.sleep(2500);
    
//Agora ele vai vai fazer o segundo array    
    char [] CHAR2 = new char [Espaço];
        for (int i = 0; i < Espaço; i++) {
            System.out.println("-----------------------------");
            System.out.print("Digite o " +(1+i)+ "° Elemento: ");
                CHAR2[i] = sc.next().charAt(0);     
        }
            System.out.println("-----------------------------");
            
// Agora vai ser criado o Treceiro Array, que vai juntar as palavra do array 1 e 2
// E vai ser exibido as palavras juntas
System.out.println("\n\n");

    char[]CHAR3 = new char [Espaço + Espaço];
    System.out.println("Processando...");
    Thread.sleep(1569);
    
    for (int i = 0; i < Espaço; i++) {
        CHAR3[i] = CHAR1[i];  }
    
    for (int i = 0; i < Espaço; i++) {
        CHAR3[Espaço+i] = CHAR2[i];
    }
    
    System.out.println("As Palavra Digitadas foram");
    System.out.println("-> " + Arrays.toString(CHAR3));
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
    break;  
}// Essa é a chave para fechar o case da String
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜


//-------- Agora é o default 
// Relatorio 18:31 o loop está funcionando
default -> {
    System.out.println("OPÇÃO INVALIDA, voltando...");
    Thread.sleep(2000);
for (int i = 0; i < 6; i++) { System.out.println("."); }
    break;  }

    } // Essa chave é para fechar o Switch
//⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜

} // Essa chave fecha o loop

}
}