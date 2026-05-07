
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
// 3° PARTE - 1
// Se ele escolher uma opção de 1 a 4, vai entrar nós cases e mudar o Coringa para o tipo
// de conta vai a usuario vai querer fazer

switch (Escolha) {
    case "1", "soma", "somar", "+" ->{
        Coringa = "Somar"; // Aqui vai entrar em um case no final e fazer a conta e também usar o nome em um SOUT
        contador = 0;// para finalizar o loop do DoWHile
        if (Guardar.isEmpty()) { 
            qlDIAGONAL = 4; // Ele vai pegar esse valor e usar na Diagonal segundaria
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
// 3° PARTE - 2    
// Se o User escolha 5 ou 6, vai entrar nesse case, e fazer uma nova lista com todos os valores sendo par/impar
    
    case "5", "par", "pares" -> {
        qlDIAGONAL = 3;// Valor usado na Diagonal Segundaria
        System.out.println("\n\n\n\n\n\n\n\n\n");
        contador = 2; // Esse valor e para não aparecer mais na Tabela as opções 5 e 6
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Matriz_5x5[i][j] % 2 == 0) { //Aqui vai pegar e armazenar os valores Pares
                    Guardar.add(Matriz_5x5[i][j]); // Vai adicionar os valores Pares no Guardar
                     
                    contadorSHIPPUDEN ++; //                               ⬇  
                    if (Matriz_5x5[i][j] < 10) {//                         *
                    System.out.print("|0" +Matriz_5x5[i][j]+ "|\t");//     *
                    }//                                                    *
                    else {//                                               > Essa parte é só para deixa a Lista Nesse formato
                    System.out.print("|" +Matriz_5x5[i][j]+ "|\t");//      >    { |00| 01| 02| 03| }
                    }//                                                    *    { |10| 11| 12| 13| }
                    if (contadorSHIPPUDEN == 4) {//                        *    { |20| 21| 22| 23| }
                    contadorSHIPPUDEN = 0;//                               *    { |30| 31| 32| 33| }
                    System.out.println(""); //                             ⬆ 
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
                if (Matriz_5x5[i][j] % 2 == 1) { // Se o número for impar ele vai se ser armazenado no Guardar
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
// 4° PARTE 
// Esse parte vai pegar o valor da Matriz e colocar em uma segunda, para depois fazer as contas

if (Guardar.isEmpty()) { // Esse if é para transferia a primeira Matriz para a segunda
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            MatrizFinal[i][j] = Matriz_5x5[i][j];
        }
    }
} else { // caso o User escolher a poção 5 ou 6, vai vim para cá
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (!Guardar.isEmpty()) {
                MatrizFinal[i][j] = Guardar.get(0);
                Guardar.remove(0);
            }
        }
    }
    Guardar.clear();// Limpa o ArrayList
}
//==============================================================================
// 5° PARTE
// Vai pergunta como o user quer fazer as contas, se é por LInha, coluna, diagonal etc

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
// 5.5° PARTE
// Se o user escolher a primeira ou a segunda opção, o programa vai pergunta qual das listas ou culunas
// o User vai serer usar para fazer os calculos

switch (modo) {
    case "linhas", "1", "linha" -> {
        do { // Vai continuar no Loop até o User digitar uma linha certa 
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
//==============================================================================
// 6° PARTE 
// Vai pegar os números da possição que o User escolher e vai armazenar elas no Guardar
// Depois esses valores serão usados para afzer a conta que foi escolhida

switch (modo) {
    case "linha" -> {
        Guardar.clear(); // limpa o ArrayList
        tipo = "Linha"; // a Variavel tipo é só para colocar o nome do Tipo de formato o User escolheu 
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                if (i == (posicao-1)) { // Vai pegar a Possição da linha que o User escolheu e colocar no ArrayList
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
                if (j == (posicao-1)) { // Vai pegar a possição que o Usuario esccolher e armazenala no Guardar
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
                if (i == j) { // Vai pegar os número da diagonal Principal ↘, e armazenalas
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
                if (i + j == qlDIAGONAL) { //// Vai pegar os número da diagonal segundaria ↖, e armazenalas
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
                Guardar.add(MatrizFinal[i][j]); // Vai pegar todos os Números e colocar no Guardar
            }
        } break;
    }
}
//==============================================================================
// 7° PARTE 
// Vai pegar os Números Armazenados no Guardar e fazer os calculos passeado noque o
// Usuario escolher, também será mostrado os Nuúmero que foram usados na conta

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
    
}   }