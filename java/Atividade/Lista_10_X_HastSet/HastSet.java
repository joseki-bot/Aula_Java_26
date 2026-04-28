package Atividade.Lista_10_X_HastSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HastSet {    
    public static void main(String[] args) throws InterruptedException {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Random ale = new Random();
        
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================


/*
//==============================================================================
// 1. Crie um HashSet de números inteiros e adicione os números de 1 a 10. 
// Verifique se o número 5 está presente no conjunto.
    
Set <Integer> Numeros = new HashSet<>();
Numeros.add(1);
Numeros.add(8);
Numeros.add(3);
Numeros.add(4);
Numeros.add(5);
Numeros.add(6);
Numeros.add(2);
Numeros.add(7);
Numeros.add(9);
Numeros.add(10);
Numeros.add(6);
    
    boolean confirmador = false;
    
    for(int Verificador : Numeros) {
        if (Verificador == 5) {
            System.out.println("🟢O Número " +Verificador+ " está na Lista !!!🟢");
            System.out.println("\n " +Numeros);
            confirmador = true;
        }
    }
    
    if (confirmador == false) {
        System.out.println("❌O Número 5 não está na lista❌");
        System.out.println("\n" +Numeros);
    }
//==============================================================================
*/


/*
//==============================================================================    
// 2. Crie um HashSet de strings e adicione nomes de frutas. 
// Remova uma fruta específica e exiba o conjunto resultante.
    
Set <String> Frutas = new HashSet<>(); 
Collections.addAll(Frutas, "maçã", "banana", "laranja", "uva", "morango", "abacaxi", "melancia", "pera", "manga", "kiwi");

    System.out.println("--------------------");
    System.out.print("Digite Um Fruta: ");
        String NVfruta = scL.nextLine().toLowerCase();
    System.out.println("--------------------");

    boolean Confirmador = false;
    
    for (String Verificador : Frutas) {
        if (Verificador.equals(NVfruta)) {
            Confirmador = true;
            System.out.println("A Fruta já está na Lista");
            System.out.println("Deseja remover elas Fruta (S/N)");
            System.out.print("=> ");
                String Escolha = scL.nextLine().toLowerCase();
                
        switch (Escolha) {
            case "sim", "s" -> {
                System.out.println("\nREMOVENDO...");
                Thread.sleep(1569);
                Frutas.remove(NVfruta);
                
                System.out.println("Lista Atualizada");
                Thread.sleep(1000);
                
                System.out.println(Frutas);
                break;
            
            } case "não", "nao", "n", "no" -> {
                System.out.println("Exibindo A Lista");
                System.out.println(Frutas);
                Thread.sleep(1500);
                break;
            }
        }
        break;
        }
    }
    
    if (Confirmador == false) {
        System.out.println("\nA Fruta não está na lista");
        System.out.println("Deseja colocar ela na Lista ? (S/N)");
            String ALVO = scL.nextLine().toLowerCase();
            
        switch (ALVO) {
            case "sim", "s" -> {
                System.out.println("\nADICIONANDO...");
                Thread.sleep(1569);
                Frutas.add(NVfruta);
                
                System.out.println("Mostrando Lista Atualizada");
                System.out.println(Frutas);
                break;
                
            } case "não", "nao", "n", "no" -> {
                System.out.println("\nFinalizando...");
                System.out.println("Exibindo a Lista");
                System.out.println(Frutas);
                break;
            }
        }
    }
//==============================================================================
*/

/*
//==============================================================================    
// 3. Crie um HashSet de números inteiros e adicione números de 1 a 5. 
// Limpe o conjunto e verifique se está vazio

Set <Integer> Numeros = new HashSet<>();
Collections.addAll(Numeros, 1,2,3,4,5);

    System.out.println(Numeros);

    System.out.println("\n");
    int sorte = ale.nextInt(11);
    
    if (sorte % 2 == 0) {
        Numeros.clear();
        System.out.print(Numeros.isEmpty());
        System.out.print(" = A Lista está vazia\n");
    }
    if (sorte % 2 == 1) {
        System.out.print(Numeros.isEmpty());
        System.out.print(" = Tem coisas na Lista\n");
        System.out.println(Numeros);
    }
//==============================================================================    
*/

/*
//==============================================================================    
// 4. Crie um HashSet de strings e adicione nomes de cidades. 
// Verifique se o conjunto está vazio.

Set <String> cidades = new HashSet<>();

    int Tigrinho = ale.nextInt(11);
    
    if (Tigrinho % 2 == 0) {
        Collections.addAll(cidades, "Porto Alegre", "Curitiba", "Florianópolis", "São Paulo", 
                "Rio de Janeiro", "Salvador", "Recife", "Fortaleza", "Manaus", "Belém");
        
        System.out.println("~Deseja Verificar a Lista? (S/N)");
            String Escolha = scL.nextLine().toLowerCase();
            
    switch (Escolha) {
        case "sim", "s" -> {
            System.out.print("\n"+ cidades.isEmpty());
            System.out.println(" = Tem coisa na Lista");
            System.out.println("\n" +cidades);
            break;
        
        } case "não", "nao", "n", "no" -> {
            System.out.println("\nFINALIZANDO");
            System.out.println("Nunca saberemos se tinha algo na  Lista");
            break;
        }
    }
    
    } if (Tigrinho % 2 == 1) {
        System.out.println("Deseja Verificar a Lista? (S/N)");
            String Escolha = scL.nextLine().toLowerCase();
            
    switch (Escolha) {
        case "sim", "s" -> {
            System.out.print("\n"+ cidades.isEmpty());
            System.out.println(" = Não tem nada na Listas");
            System.out.println("\n" +cidades);
            break;
        
        } case "não", "nao", "n", "no" -> {
            System.out.println("\nFINALIZANDO");
            System.out.println("Nunca saberemos se tinha algo na  Lista");
            break;
        }
    }
    }
//==============================================================================    
*/

/*
//==============================================================================    
// 5. Crie um HashSet de strings e adicione nomes de cores. 
// Converta o HashSet em uma lista e exiba os elementos.

Set <String> cores = new HashSet<>();
Collections.addAll(cores, "vermelho", "azul", "verde", "amarelo", "roxo", 
                        "laranja", "preto", "branco", "cinza", "rosa");

String finalizador = "";
int contador = 0;

    System.out.println("Digite uma cor");
    System.out.println("Para finalizar digite 'sair'");
        Thread.sleep(2269);
do {
    System.out.print("=> ");
        finalizador = scL.nextLine().toLowerCase();
    System.out.println("----------");

    if (!cores.contains(finalizador)) {
        contador ++;
    }
    
    if (!finalizador.equals("sair")) {
        cores.add(finalizador);
    }
    
    if (finalizador.equals("gelo")) {
        System.out.println("GELO NÃO É COR O SEU FDP !!!");
        Thread.sleep(1500);
        throw new RuntimeException("Sobrou nada para o BETA !!!");
    }
    
} while (!finalizador.equals("sair"));
    
    System.out.println("\nExibindo Lista");
    if (contador > 1) {
        System.out.println((contador-1)+ " novas cores adicionadas");
        Thread.sleep(1550);
    }
    for (String mostrar : cores) {
        System.out.println("| "+mostrar+" |");
    }
//==============================================================================    
*/

/*
//==============================================================================
// 6. Remova um elemento do HashSet: Crie um HashSet de strings com nomes de cidades. 
// Remova a cidade "São Paulo" do HashSet e exiba o conjunto resultante.

Set <String> cidades = new HashSet<>();
    Collections.addAll(cidades, "porto alegre", "curitiba", "florianópolis", "são paulo", 
                   "rio de janeiro", "salvador", "recife", "fortaleza", "manaus", "belém");

    System.out.println("Qual a Cidade mais poluida ?");
    System.out.print("=> ");
        String Alvo = scL.nextLine().toLowerCase();
        
    if (Alvo.equals("sao paulo") || Alvo.equals("são paulo") || Alvo.equals("sp")) {
        System.out.println("\nCORRETO");
        System.out.println("Então vamos remover ela do MAPA 💣💣💣");
            Thread.sleep(2000);
        cidades.remove("são paulo");
        System.out.println("\nMostrando outra cidades melhores que São Paulo");
        System.out.println(cidades);
            Thread.sleep(1500);
    
    } else {
        System.out.println("\nERRADO");
        System.out.println("É São Paulo-SP");
        System.out.println("Vamos fazer um favor para o Brasil e tirar ela do MAPA 💣💣💣");
        Thread.sleep(2000);
        cidades.remove("são paulo");
        System.out.println("\nAgora vamos ver Cidades que podemos respirar");
        System.out.println(cidades);
        Thread.sleep(1500);
    }
//==============================================================================
*/

/*
//==============================================================================
// 7. Crie um HashSet de números inteiros e adicione números aleatórios. 
// Verifique o tamanho do conjunto.

ArrayList <Integer> Todos = new ArrayList<>();
Set <Integer> Numeros = new HashSet<>();

    int soma = 0;

for (int i = 0; i < 20; i++) {
    int Mais = ale.nextInt(51);
    Numeros.add(Mais);
    Todos.add(Mais);
    soma += Mais;
}
    System.out.println("=====================================");
    System.out.println("Mostrando a lista");
    System.out.println("O tamanho da Lista é de " +Todos.size());
    int contador = 0;
    for (int Mostra : Todos) {
        if (Mostra <= 9) {
            System.out.print(" | 0" +Mostra );
            contador ++;
        }
        if (Mostra >= 10) {
            System.out.print(" | " +Mostra);
            contador++;
        }
        if (contador == 5) {
            contador = 0;
            System.out.print(" |\n");
        }
    } Thread.sleep(2500);
    System.out.println("E a soma de Todos os Números é : " +soma);
    Thread.sleep(1500);
    System.out.println("=====================================");

    
    int somaSHIPPUDEN = 0;
    contador = 0;
    System.out.println("\nMostrando a Lista sem REPETIÇÃO");
    System.out.println("E o tamanho dela agora é de " +Numeros.size());
    for (int Mostra : Numeros) {
        somaSHIPPUDEN += Mostra;
        if (Mostra <= 9) {
            System.out.print(" | 0" +Mostra );
            contador ++;
        }
        if (Mostra >= 10) {
            System.out.print(" | " +Mostra);
            contador++;
        }
        if (contador == 5) {
            contador = 0;
            System.out.print(" |\n");
        }
    }
    System.out.println("\nE a Suma dessa lista é de: " +somaSHIPPUDEN);
    Thread.sleep(1500);
    System.out.println("=====================================");
//==============================================================================
*/

/*
//==============================================================================
// 8. Crie um HashSet de números inteiros e adicione números de 1 a 10. 
// Remova todos os números pares e exiba o conjunto resultante.

Set <Integer> Numeros = new HashSet<>();
for (int i = 0; i < 10; i++) {
    Numeros.add(i);
}

    Numeros.removeIf(n -> n % 2 == 0); // remove os pares

for (int FIM : Numeros) {
    System.out.print("|" +FIM+ " ");
}
System.out.println("");
//==============================================================================
*/
        
/*      
//==============================================================================
// 9. Crie um HashSet de strings e adicione nomes de países. 
// Verifique se o conjunto contém todos os elementos de uma lista específica.

ArrayList <String> NVpais = new ArrayList<>();
Set <String> pais = new HashSet<>();
Collections.addAll(pais, "brasil", "argentina", "canadá", "japão", "alemanha", 
                         "frança", "méxico", "portugal", "italia", "austrália");

        System.out.println("Para finalizar digite 'sair'");
        System.out.println("\n-------------------------");
        Thread.sleep(2000);
do {
    System.out.print("Diga um PAÍS: ");
        NVpais.add (scL.nextLine().toLowerCase());
} while (!NVpais.contains("sair"));

    NVpais.remove("sair");
    
    System.out.println("\n====================================");
    for (int i = 0; i < NVpais.size(); i++) {
        if (pais.contains(NVpais.get(i)))
            System.out.println("O País " +NVpais.get(i)+ " está na Lista");
    }
    System.out.println("====================================");
//==============================================================================
*/ 
    
 }   }