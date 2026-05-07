
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CalculosDeMatríz {     
    public static void main(String[] args) throws InterruptedException {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");} 
//==============================================================================

//  { 00| 01| 02| 03| 04 }
//  { 10| 11| 12| 13| 14 }
//  { 20| 21| 22| 23| 24 }
//  { 30| 31| 32| 33| 34 }
//  { 40| 41| 42| 43| 44 }

//==============================================================================
// 1° PARTE
// Nessa parte estão as 2 Matriz, 1 que vai ser a Primeiro que vai servir para armagenar os Número que são gerado aleatoriamente, e exibilodo
//Já a segunda vai ser usado para var as opeações Matématica, o ArrayList vai servir para colocar os Numero Par, Impares, linhas, colubas,
// a Diagonal Principal e a Segundaria. Também está então as variaveis Universal

int [][] Matriz_5x5 = new int [5][5];
int [][] MatrizFinal = new int [5][5];
ArrayList <Integer> Guardar = new ArrayList();
String Coringa = "";
int Resultado = 0;
String tipo = "";
int contador = 1;
int qlDIAGONAL = 0;
int linha = 0;
int coluna = 0;
int contadorSHIPPUDEN = 0;
int posicao = 0;


for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        Matriz_5x5[i][j] = ale.nextInt(100);
        if (Matriz_5x5[i][j] < 10) { // Esse if é vai fazer a Lista ficar mais ajeitada, tipo se o Número for menos que 10, ele vai colocar um 0 atrás
            System.out.print("|0" +Matriz_5x5[i][j] +"|\t"); // ficando {01 | 02| 03 }
            //Thread.sleep(269);
        }
        else {
            System.out.print("|" +Matriz_5x5[i][j]+ "|\t");
            //Thread.sleep(269);
        }
    }
    System.out.println(""); // Aqui quebra a Linha dando espaço nelas 
}
//Thread.sleep(2000);

//==============================================================================
// 2° PARTE
// Aqui a Lista foi gerada e aque vai Perguntar oque o Usuario que fazer com a Lista.
// a Opção 5 e 6 vai pegar todos os valores da Lista Principal e criar uma nova sendo só par ou impar
// o DoWhile vai ser usado para mostra esse Mesma Mensagem novamente, mas as Opções 5 e 6

do {
System.out.println("\n=================================");
System.out.println("Diga oque quer fazer com a MATRIZ");
System.out.println("=================================");
System.out.println("1. SOMAR (+)");
System.out.println("2. SUBTRAIR (-)");
System.out.println("3. MULTIPLICAÇÃO (X)");
System.out.println("4. DIVISÃO (/)");

if (contador == 1) {
System.out.println("5. VALORES PARES");
System.out.println("6. VALORES IMPARES");
}
System.out.println("--------------------------------");
System.out.print("=> ");
    String Escolha = scL.nextLine().toLowerCase();

//==============================================================================    
    
switch (Escolha) {
    case "1", "soma", "somar", "+" ->{
        Coringa = "Somar";
        contador = 0;
        if (Guardar.isEmpty()) {
            qlDIAGONAL = 4;
        }
        break;
    }
    case "2", "subtrair", "diminuir", "-" -> {
        Coringa = "Subtrair";
        contador = 0;
        if (Guardar.isEmpty()) {
            qlDIAGONAL = 4;
        }
        break;
    }
    case "3", "multiplicação", "multiplicar", "x", "*" -> {
        Coringa = "Multiplicar";
        contador = 0;
        if (Guardar.isEmpty()) {
            qlDIAGONAL = 4;
        }
        break;
    }
    case "4", "dividir", "divisão", "/" -> {
        Coringa = "Dividir";
        contador = 0;
        if (Guardar.isEmpty()) {
            qlDIAGONAL = 4;
        }
        break;
    }
//==============================================================================    
    case "5", "par", "pares" -> {
        qlDIAGONAL = 3;
        System.out.println("\n\n\n\n\n\n\n\n\n");
        contador = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Matriz_5x5[i][j] % 2 == 0) {
                    Guardar.add(Matriz_5x5[i][j]);
                    contadorSHIPPUDEN ++;
                    if (Matriz_5x5[i][j] < 10) {
                        System.out.print("|0" +Matriz_5x5[i][j]+ "|\t");
                    }
                    else {
                        System.out.print("|" +Matriz_5x5[i][j]+ "|\t");
                    }
                    if (contadorSHIPPUDEN == 4) {
                        contadorSHIPPUDEN = 0;
                        System.out.println("");
                    }
                }
            }
        }
        break;
    }
    case "6", "impar", "impares" -> {  
        qlDIAGONAL = 3;
        System.out.println("\n\n\n\n\n\n\n\n\n");
        contador = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Matriz_5x5[i][j] % 2 == 1) {
                    Guardar.add(Matriz_5x5[i][j]);
                    contadorSHIPPUDEN ++;
                    if (Matriz_5x5[i][j] < 10) {
                        System.out.print("|0" +Matriz_5x5[i][j]+ "|\t");
                    }
                    else {
                        System.out.print("|" +Matriz_5x5[i][j]+ "|\t");
                    }
                    if (contadorSHIPPUDEN == 4) {
                        System.out.println("");
                        contadorSHIPPUDEN = 0;
                    }
                }
            }
        }
        break;
    }
}
}while (contador != 0);

//==============================================================================
if (Guardar.isEmpty()) {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            MatrizFinal[i][j] = Matriz_5x5[i][j];
        }
    }
} else {
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (!Guardar.isEmpty()) {
                MatrizFinal[i][j] = Guardar.get(0);
                Guardar.remove(0);
            }
        }
    }
    Guardar.clear();
}
//==============================================================================
System.out.println("\n\n==============================");
System.out.println("Você quer " +Coringa+ " como :");
System.out.println("==============================");
System.out.println("1. Linhas ➡️");
System.out.println("2. Coluna ⬇️");
System.out.println("3. Diagonal Principal ↘️");
System.out.println("4. Diagonal Segundaria ↙️");
System.out.println("5. Tudo ⬜");
System.out.println("-----------------------------");
System.out.print("=> ");
    String modo = scL.nextLine().toLowerCase();
    
//==============================================================================
switch (modo) {
    case "linhas", "1", "linha" -> {
        do {
            System.out.println("\nQual das Linhas Você quer " +Coringa);
            System.out.print("=> ");
                posicao = scN.nextInt();
                modo = "linha";
        } while (posicao >= 6);
        break;
    }
    case "coluna", "colunas", "2" -> {
        do {
            System.out.println("\nQual das Colunas Você quer " +Coringa);
            System.out.print("=> ");
                posicao = scN.nextInt();
                modo = "coluna";
        } while (posicao >= 6);
        break;
    }
}   
//=============================================================================='
switch (modo) {
    case "linha" -> {
        Guardar.clear();
        tipo = "Linha";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                if (i == (posicao-1)) {
                    Guardar.add(MatrizFinal[i][j]);
                }   
                }
            } 
        break;
    } 
    case "coluna" -> {
        Guardar.clear();
        tipo = "Coluna";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == (posicao-1)) {
                    Guardar.add(MatrizFinal[i][j]);
                }
            }
        } break;
    }
    case "3", "Diagonal" -> {
        Guardar.clear();
        tipo = "Diagonal Principal";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    Guardar.add(MatrizFinal[i][j]);
                }
            }
        } break;
    }
    case "4" -> {
        Guardar.clear();
        tipo = "Diagonal Segundaria";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == qlDIAGONAL) {
                    Guardar.add (MatrizFinal[i][j]);
                }
            }
        } break;
    }
    case "5" -> {
        Guardar.clear();
        tipo = "Tudos";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Guardar.add(MatrizFinal[i][j]);
            }
        } break;
    }
}
//==============================================================================
switch (Coringa) {  //Coringa = Somar Subtrair Multiplicar Dividir
    case "Somar" -> {
        for (int Calcular : Guardar) {
            Resultado += Calcular;
        }
        System.out.println("\n\n=============================");
        System.out.println("A Soma dos Valores da " +tipo+" é: ");
        System.out.println(Guardar);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("=> " +Resultado);
        System.out.println("=============================");
        break;
    }
    case "Subtrair" -> {
        int Pri = Guardar.get(0);
        Guardar.remove(0);
        
        for (int Calcular : Guardar) {
            Resultado -= Calcular;
        }
        Resultado = Pri + Resultado;
        
        System.out.println("\n\n=============================");
        System.out.println("A Subtraição dos Valores da " +tipo+" é: ");
        System.out.println(Guardar);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("=> " +Resultado);
        System.out.println("=============================");
        break;
    }
    case "Multiplicar" -> {
        Resultado = Guardar.get(0);
        Guardar.remove(0);
        
        for (int Calcular : Guardar) {
            Resultado *= Calcular;
        }
        System.out.println("\n\n=============================");
        System.out.println("A Multiplicação dos Valores da  " +tipo+" é: ");
        System.out.println(Guardar);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("=> " +Resultado);
        System.out.println("=============================");
        break;
    }
    case "Dividir" -> {
        double Res = Guardar.get(0);
        Guardar.remove(0);
        
        for (double Calcular : Guardar) {
            Res /= Calcular;
        }
        System.out.println("\n\n=============================");
        System.out.println("A Divição dos Valores da " +tipo+" é: ");
        System.out.println(Guardar);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("=> " +Res);
        System.out.println("=============================");
        break;
                
    }
}
        System.out.println("\n-----------"+qlDIAGONAL);
    
    
}   }