package Atividade.Lista_10_X_HastSet;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HastSet_2 {    
    public static void main(String[] args) throws InterruptedException {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Random ale = new Random();
        
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================

/*
//==============================================================================
// 1. Remoção de Duplicados: 
// Escreve um programa que peça ao utilizador o tamanho de um array e, em seguida, 
// os números para o preencher. Usa um HashSet para filtrar e exibir apenas os números únicos.

Set <Integer> Unicos = new HashSet<>();

    System.out.println("Quantos você quer de espaço no Array: ");
    System.out.print("=> ");
        int Tamanho = scN.nextInt();
        
int [] numeros = new int [Tamanho];

System.out.println("\n-------------------------");
for (int i = 0; i < Tamanho; i++) {
    System.out.println("Digite o " +(1+i)+ "° Número");
    System.out.print("=> ");
        numeros[i] = scN.nextInt();
    System.out.println("--------------------------");
    
    Unicos.add(numeros[i]);
}
System.out.println("\n\n\n");

    System.out.println("================================");
    System.out.println("Mostrando a lista");
    int contador = 0;
for (int Mostra : numeros) {
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
    Thread.sleep(2500);
    System.out.println("\n================================\n");

    System.out.println("Mostrando a lista");
    contador = 0;
for (int Mostra : Unicos) {
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
    Thread.sleep(2500);
    System.out.println("\n================================");
//==============================================================================
//==============================================================================
*/

/*
//==============================================================================
//==============================================================================
// 2. Sistema de Login: 
// Cria um conjunto de nomes de utilizador já registados. 
// Pede ao utilizador para digitar um novo nome e utiliza if-else para verificar se esse nome já existe no sistema.
    
Set <String> nomes = new HashSet<>();
Collections.addAll(nomes, "João", "Maria", "Pedro", "Ana", "Lucas", "Juliana", "Carlos", "Beatriz", "Rafael", "Camila");

int contador = 0;
String NomeLogin = "";

do {
    System.out.println("====================");
    System.out.println("Digite o seu Nome:");
    System.out.print("=> ");
        NomeLogin = scL.nextLine();
    
    if (nomes.contains(NomeLogin)) {
    System.out.println("\nDigite sua Senha");
    System.out.print("=> ");
        String Senha = scL.nextLine();
    System.out.println("====================");
    Thread.sleep(1500);
    break;
    
    } else {
        System.out.println("NOME DE USUARIO NÃO ENCONTRADO");
        System.out.println("Tente Novamente");
        Thread.sleep(2500);
        contador ++;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    if (contador == 3) {
        System.out.println("TENTATIVAS EXCEDIDAS !!!!");
        Thread.sleep(2500);
        break;
    }
} while (true);

    if (contador == 3) {
        System.out.println("VOCÊ ESTÁ BLOQUEADO");
        Thread.sleep(1500);
    
    } else {
        System.out.println("\nBem-Vindo " +NomeLogin);
    }
//==============================================================================
//==============================================================================
*/
        
/*        
//==============================================================================
//==============================================================================
// 3. Encontro de Amigos (Interseção): 
// Pede ao utilizador para inserir 5 nomes para a "Lista A" e 5 nomes para a "Lista B". 
// O programa deve mostrar apenas os nomes que aparecem em ambas as listas.

Set <String> ListaA = new HashSet<>();
Set <String> ListaB = new HashSet<>();

    System.out.println("Você e o seu Irmão estão fazendo uma Lista de convidados.");
    System.out.println("Ambos concordaram que só vão convidar que estover nas duas lista");
        Thread.sleep(3569);

    System.out.println("\n\nEscreve o Nome de quem você quer convidar\n");
    
for (int i = 0; i < 5; i++) {
    System.out.println("------------------");
    System.out.print((i+1)+ "° => ");
        ListaA.add(scL.nextLine().toLowerCase());
} 
System.out.println("\n\n\n");
    System.out.println("\n\nAgora o Seu irmão vai escrever a Lista dele");
        Thread.sleep(2500);
        
for (int i = 0; i < 5; i++) {
    System.out.println("~~~~~~~~~~~~~~~~~~");
    System.out.print((i+1)+ "° => ");
        ListaB.add(scL.nextLine().toLowerCase());
}
System.out.println("\n\n\n\n\n\n\n");
ListaA.retainAll(ListaB); // Deixa só as coisas que aparecem nas duas Listas

    if  (ListaA.size() >= 1) {
        System.out.println("Vocês Viram a Lista um do Outro");
        System.out.println("E decidiram chamar");
        System.out.println(ListaA);
    
    } else { 
        System.out.println("Vocês decidem cancelar a Festa");
        System.out.println("Pois a Última não foi uma boa Experiencia");
    }
//==============================================================================
*/

/*
//==============================================================================
// 4. Alerta de Repetição: 
// Cria um ciclo while que peça números ao utilizador continuamente. 
// Assim que o utilizador digitar um número que já inseriu anteriormente, o programa deve avisar e terminar.

Set <Integer> Numeros = new HashSet<>();
int alvo = 0;

do {
    System.out.print("Digite um Número: ");
        alvo = scN.nextInt();
    
    if (Numeros.contains(alvo)) {
        System.out.println("----------------------");
        System.out.println("\nO Número " +alvo+ " já Digitado");
        System.out.println("Finalizando...");
            Thread.sleep(2000);
        break;
    }
    System.out.println("----------------------");
    Numeros.add(alvo);
    
} while (true);
    System.out.println("\n\n======================================");
    System.out.println("Os seguites Números foram digitados.");
    System.out.println(Numeros);
    System.out.println("======================================");
//==============================================================================
*/

/*
//==============================================================================
// 5. Gestor de Convidados: 
// Implementa um menu usando switch-case onde o utilizador possa: 
// (1) Adicionar convidado, (2) Remover convidado e (3) Ver lista. O programa deve correr até que o utilizador escolha sair.

Set <String> ListaConvidados = new HashSet<>();
int loop = -1;
int loop2 = 0;
boolean Finalizador = false;
boolean Confirmador = false;

do {
for (int i = 0; i < 10; i++) {System.out.println("*");}
loop++;    

    System.out.println("---------------------------------");
    System.out.println("| SISTEMA DE CONTROLE DE EVENTO |");
    System.out.println("---------------------------------");
    System.out.println("[1] -> Adicionar convidado ");
    System.out.println("[2] -> Remover convidado");
    System.out.println("[3] -> Exibir convidados");
    if (loop >= 1) {
    System.out.println("[4] -> Finalizar Lista"); }
    System.out.println("---------------------------------");
    System.out.print("=> ");
        String Escolha = scL.nextLine().toLowerCase();
        
switch (Escolha) {
    case "1" , "add", "novo" -> {
        System.out.println("\n\nDigite o Nome da Pessoa que deseja Adicionar:");
        System.out.println("Para finaliza Digite 'sair'");
    do {
        System.out.print("=> ");
            ListaConvidados.add(scL.nextLine());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    } while (!ListaConvidados.contains("sair"));
        ListaConvidados.remove("sair");
        break;
    } 
    case "2", "remover", "tirar" -> {
        if (ListaConvidados.size() >= 1) {
            do {
            System.out.println("\nDigite o Nome da Pessoa que deseja Remover:");
            if (loop2 >= 1) { System.out.println("Para finalizar digite 'sair'"); }
            System.out.print("=> ");
                String Tirar = scL.nextLine();
            
            if (Tirar.equalsIgnoreCase("sair")) {
                System.out.println("VOLTANDO...");
                Confirmador = true;
                Thread.sleep(1569);
                break;
            }
                
            if (ListaConvidados.contains(Tirar)) {
                Confirmador = true;
                ListaConvidados.remove(Tirar);

            } else {
                System.out.println(Tirar+ " Não está na Lista !!!\n");
                loop2 ++;
                Thread.sleep(2000);
            }
            } while (Confirmador != true);
        } else {            
            loop = -1;
            System.out.println("\nA Lista Está VAZIA !!!");
            Thread.sleep(2000);
        }
        break;
    } 
    case "3", "exibir", "mostrar" -> {
        if (ListaConvidados.size() >= 1) {
            System.out.println("\nAs Seguinte Pessoas Estão na Lista");
            for (String mostrar : ListaConvidados) {
                System.out.println("-> " +mostrar);
                Thread.sleep(690);
            }
            Thread.sleep(1500);
        } else {
            loop = -1;
            System.out.println("\nA Lista Está VAZIA !!!");
            Thread.sleep(1500);
        }
        break;
    }
    case "4", "sair", "finalizar" -> {
        String ponto = "";
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.print("FINALIZANDO" +ponto);
            ponto += ".";
            Thread.sleep(690);
            
            if (ponto.length() >= 4) {
                ponto = "";
            }

        }
        Finalizador = true;
        break;
    }
    }
    
} while (Finalizador != true);
        System.out.println("\n\n\n\n\n\n");
    System.out.println("\n\n\nLista Finalizada !!!");
    Thread.sleep(1569);
//==============================================================================
*/


/*
//==============================================================================
// 6. Dicionário de Palavras: 
// Usa um ciclo do-while para pedir palavras ao utilizador. Se a palavra for nova, guarda-a. 
// O ciclo termina quando o utilizador digitar "FIM". No final, mostra quantas palavras únicas foram aprendidas.

Set <String> Palavras = new HashSet<>();

int loop = 0;
int Contador = 0;
String Pala;

    System.out.println("Digte uma Palavra:");
do {
    loop ++;
    System.out.print("=> ");
        Pala = scL.nextLine();
    System.out.println("-----------------");
    
    if (!Palavras.contains(Pala)) {
        Palavras.add(Pala);
    }
    
    if (loop == 1) {
        System.out.println("\nPara finalizar digite 'fim'");
        Thread.sleep(2000);
        System.out.println("\n-----------------");
    }
    
    if (Pala.equalsIgnoreCase("fim")) {
        System.out.println("FINALIZANDO...");
        Thread.sleep(1569);
        break;
    }
    Contador++;

} while (true);
    Palavras.remove("fim");
    System.out.println("Lista Finalizada\n");
    
    if (Contador == 1) {
        System.out.println("Foi Digitado Apenas 1 palavra");
    
    } else {
        System.out.println("Foi Digitado " +Contador+ " Palavras");
    }
    
    if (Palavras.size() == 1) {
        System.out.println("E Liste contém apenas uma Palavra");
        Thread.sleep(1000);
    
    } else {
        System.out.println("E Lista contém " +Palavras.size()+ " Palavras Diferentes");
        Thread.sleep(1000);
    }
    
    for (String Mostrar : Palavras) {
        System.out.println("-> " +Mostrar);
        Thread.sleep(690);
    }
//==============================================================================
*/

/*
//==============================================================================
// 8. Exclusividade (Diferença): 
// Carrega dois conjuntos de dados (ex: passatempos de dois amigos). 
// Mostra ao utilizador apenas os passatempos que o primeiro amigo tem e que o segundo não tem.

Set <String> PT1 = new HashSet<>();
Set <String> PT2 = new HashSet<>();

int contador = 1;
int loop = 0;

    System.out.println("Diga O nome do Primeiro Amigo");
    System.out.print("=> ");
        String Amigo1 = scL.nextLine();
    
    System.out.println("\nAgora do Seu Segundo Amigo");
    System.out.print("=> ");
        String Amigo2 = scL.nextLine();
    
for (int i = 0; i < 10; i++) { System.out.println("\n"); }

    System.out.println("Diga os Passa-Tempos de " +Amigo1);
do {
    System.out.print(contador+"°- ");
        PT1.add(scL.nextLine().toLowerCase());
    System.out.println("-----------------");
    
    if (loop == 1) {
        System.out.println("\nPara finalizar digite 'sair'");
        Thread.sleep(2000);
        System.out.println("\n-----------------");
    }
    contador++;
    loop++;
    
} while (!PT1.contains("sair"));
    PT1.remove("sair");
    
contador = 1;
loop = 0;

    System.out.println("\n\n\n\n\n\n\n");
    System.out.println("Agora os Passa-Tempo de " +Amigo2);
do {
    System.out.print(contador+"°- ");
        PT2.add(scL.nextLine().toLowerCase());
    System.out.println("-----------------");
    
    if (loop == 1) {
        System.out.println("\nPara finalizar digite 'sair'");
        Thread.sleep(2000);
        System.out.println("\n-----------------");
    }    
    contador++;
    loop++;
    
} while (!PT2.contains("sair"));
    PT2.remove("sair");
    
    PT1.retainAll(PT2); // Deixa só as coisas que aparecem nas duas Listas

    System.out.println("\n\n\n\n\n\n");    
    
    if (PT1.size() <=0 ) {
        System.out.println("Seus Amigos não tem nem um Passa-Tempo em Comum");
        System.out.println("Você vai ter que achar outro jeito de Deixar eles Ocupados");
    }
    
    if (PT1.size() >= 1) {
        System.out.println("Seus Amigos tem os seguintes Passa-Tempos em Comum");
        for (String Mostra : PT1) {
            System.out.println("-> " +Mostra);
            Thread.sleep(690);
        }
    }    
//==============================================================================
*/
    
    }   }