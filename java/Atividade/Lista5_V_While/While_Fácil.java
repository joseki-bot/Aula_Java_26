package Atividade.Lista5_V_While;

import java.util.Random;
import java.util.Scanner;

public class While_Fácil {
     public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        Random ale = new Random();
//============================================================================== 
  
        
/*        
//============================================================================== 
//1: O Foguete Lento
//Objetivo: Fazer o foguete começar a contagem no número 10, 
//mas em vez de descer de 1 em 1, descer de 2 em 2 (Ex: 10, 8, 6...).

for (int i = 0; i < 20; i++) { // Isso aq é para dar espaço para não apacer os codigos do programa inicinando 
System.out.println("  "); }
        
    System.out.println("Iniciando Contagem Regressiva");
    
    int Contador = 10;
    while (Contador > -1) { //ENQUANTO, CHEGAR
        System.out.println(".");
        System.out.println(Contador);
            Thread.sleep(2000); 

        Contador --;
        Contador --;
    
     } System.out.println("Foguete Lançado, Partiu Lua");   
//============================================================================== 
*/        
        
/*        
//============================================================================== 
//2: Comendo Pizza
//Objetivo: Alterar os textos do programa anteior! Em vez de contagem, chamem a variável de fatiasPizza. 
//Comecem com 8 fatias. Dentro do while, imprimam "Comi uma fatia! Restam: [fatiasPizza]". 
//No final do while, imprimam "Comi demais!".
        
for (int i = 0; i < 20; i++) { // Isso aq é para dar espaço para não apacer os codigos do programa inicinando 
System.out.println("  "); }
        
    System.out.println("Você está em uma competição de qm come mais Pizza");
        Thread.sleep(1500); 
        
    int PizzaComidas = 1;
    while (PizzaComidas <= 8) { //ENQUANTO, CHEGAR
        System.out.println("Você comeu " +PizzaComidas+ " Fatias de Pizza\n");
            Thread.sleep(1000); 
        PizzaComidas ++;
    
    } System.out.println("Você Chegou no Seu Limite");
    System.out.println("Mas você ainda escuta seus amigos torcerem por Você");
    System.out.print("\nVocê DESEJA CONTINUAR COMENDO ? ");
        String Esco = sc.nextLine().toLowerCase();
    
    if (Esco.equals("sim") ) {    
    int Dado =ale.nextInt(10);
    System.out.println(Dado);
    
        if (Dado == 0) {
            System.out.println("Você junta o resto de suas Força");
                Thread.sleep(1000); 
            System.out.println("E consegue colocar a Última Fatia em sua Boca\n");
                Thread.sleep(2000);
            System.out.println("Mas Você acaba EXPLODINDO");
            System.out.println("Devia ter parado");
        
        } else if (Dado > 5) {
            System.out.println("Você junta o resto de suas Força");
                Thread.sleep(1000); 
            System.out.println("E consegue colocar a Última Fatia em sua Boca");
                Thread.sleep(2000);
            System.out.println("Comendo no total 9 Fatias\n");
            System.out.println("Ficando em Quinto Lugar, e o Primeiro comeu 20 Fatias");
        
        } else if (Dado < 5) {
            System.out.println("Você junta o resto de suas Força");
            System.out.println("Mas não consegue continuar e sair de lá Apenas com uma dor de Barriga");
        }
    
    } else if (Esco.equals("nao") ) {
        System.out.println("Você entendeu o Seu Limite, e souber para");
        System.out.println("A Única coisa que vem em seu cabeça é");
        System.out.println("comi de mais");
    
    } else {
        System.out.println("Você Não soube oque responder");
         System.out.println("E o Deus da Pizza ficou brabo com sua Duvida e te matou");
    }    
//============================================================================== 
*/        
     
/*
//============================================================================== 
//3: O Elevador
//Objetivo: Fazer o inverso! O elevador está no andar 0 (térreo). 
//Enquanto o andar for menor que 5, subam 1 andar (andar = andar + 1). 
//Imprimam "Andar número: ...". Quando sair do while, imprimam "Chegou ao topo!".

for (int i = 0; i < 20; i++) { // Isso aq é para dar espaço para não apacer os codigos do programa inicinando 
System.out.println("  "); }

    System.out.println("Você está no Elevador e ele está subindo\n");
    
    int Andar = 0;
    while (Andar < 6) {
        System.out.println(Andar);
        System.out.println("Efeito sonoro de Subindo");
            Thread.sleep(1500);

        System.out.println("    |");
            Thread.sleep(1500);
        System.out.println("    |");
            Thread.sleep(1500);
        System.out.println("  ------");
            Thread.sleep(1500);
        System.out.println("  |    |");
            Thread.sleep(1500);
        System.out.println("  |    |");
            Thread.sleep(1500);
        System.out.println("  ------\n");
            Thread.sleep(1500);
        Andar++;
        System.out.println("Você chegou no " +Andar+ "°");
        
        System.out.print("\nQuer decer nesse Andar? ");
            String Esco = sc.nextLine().toLowerCase();
        
        if (Esco.equals("sim")) {
            System.out.println("\n\n\nVocê desse no " +Andar+ "°");
            System.out.println("Não era o seu Objetivo, mas você decide só seguir em frente ");
            break;
            
        } else if (Esco.equals("nao") ) {
            System.out.println("\n\n\nVocê Decide ficar no Elevador");
            System.out.println("Por que sabe que esse andar não é o se Destino");
            
        } else {
            System.out.println("\n\n\nVocê não soube oque fazer, e o Elevador Rompe o cabo");
            System.out.println("Ficar só andado de elevador, teve consequências");
            System.out.println("E ter 150Kg não te ajudou também");
            break;
        }

    } if (Andar >= 6 ) {
            System.out.println("\n\n\n\n\n\n ");
         System.out.println("Esse é o Último andar, e você Desce");
         System.out.println("Pois acabou de Chegar no Topo");
    }
//============================================================================== 
*/

/*
//============================================================================== 
//4. A Bateria do Celular
//Simule a bateria do celular descarregando rapidamente enquanto você joga um jogo pesado. 
//Use um laço while para diminuir o valor da bateria em saltos maiores.
//Dica: troque o valor 20 por 10 e veja como a bateria dura mais tempo.

for (int i = 0; i < 20; i++) { 
System.out.println("  "); }

    System.out.println("Seu Telemovel está com 100%");
    System.out.println("E você decide jogar um jogo Móvel de Dinossauros");
    Thread.sleep(2500);

    
    int Bateria = 100;
    int hora = 0;
    int min = 0;
    
    while (Bateria > 0) {
        hora ++;
        min += 7;
        System.out.println("\nVocê jogou por " +hora+ ":" +min);
        Bateria += Bateria - 102;
        
        System.out.println("E você olha a Bateria so seu Telemóvel e ele está com " +Math.max(1,Bateria)+ "%");
        

        System.out.println("\n\n\n");
        Thread.sleep(2000);
    
    } System.out.println("Seu Telemóvel ficou com 0%");
    System.out.println("E seu Save Bugou e você perdeu o seu Rex Lv 150");
    System.out.println("que você esperou por " +(hora -2)+ ":" +(min-6)+ " para ele ser domado");
//============================================================================== 
*/    
        

/*
//==============================================================================
//5. A Barra de Carregamento (Loading...)
//Crie uma simulação de download. 
//Use um laço while para somar valores até chegar ao limite máximo de 100%, 
//mostrando a barra de carregamento.
for (int i = 0; i < 10; i++) {
    System.out.println(" "); }

String Barra = "=";
String Ponto = ".";
int Jogo = 0;
while (Jogo < 100) {//Enquanto, Chagr
    
    System.out.println("Baixando o Jogo" +Ponto);
for (int i = 0; i < 1; i++) {
    Ponto += "."; }
        
    System.out.println("-------------- "+Jogo+"% --------------");
        Jogo += Jogo + 3;
    
    System.out.println(Barra);
        Barra += Barra;
        
    System.out.println("---------------------------------");
        Thread.sleep(1500);  

for (int i = 0; i < 5; i++) {
    System.out.println(" "); } 

if (Ponto.equals("....") ) {
    Ponto = ""; }
    
} System.out.println("--------------100%--------------");
  System.out.println("================================");
  System.out.println("--------------------------------");        
    Thread.sleep(2000);
    
for (int i = 0; i < 5; i++) {
    System.out.println(" "); }

        System.out.println("Jogo Instalado, Pode Jogar");
        System.out.println("Você Instalou o Jogo, Fenboy and Futa House, Adventures");
//==============================================================================
*/

/*    
//==============================================================================
// 6. Encher o Balão
// Programe um balão que vai enchendo na tela até estourar. 
// Use o while para aumentar o tamanho gradualmente e criar expectativa visual.
for (int i = 0; i < 10; i++) { System.out.println(" "); }

int Boom = 0;
String Balao = "⬜";
String Balao1 = "";
String Balao2 = "";
String Balao3 = "";
    
    while (Balao.length () <= 8) {
        
        System.out.println(Balao);
        System.out.println(Balao1);        
        System.out.println(Balao2);             
        System.out.println(Balao3);             
            Thread.sleep(2500);  

        Balao += Balao;
        Balao1 = Balao ;
        
System.out.println("\n\n\n\n\n\n");
        if (Balao.length() >= 3 ) {
            Balao2 = Balao;
        
        } if (Balao.length() >= 6){
           Balao3 = Balao; }
        
        System.out.println("\n\n\n\n\n\n");

    } System.out.println("\n\nBOOM !!!");
        System.out.println("⬜       ⬜   ⬜  ⬜");
        System.out.println("    ⬜   ⬜   ⬜   ⬜");
        System.out.println("  ⬜                 ⬜");
        System.out.println(" ⬜  ⬜       ⬜ ⬜⬜");
        System.out.println("        ⬜");
        System.out.println("    ⬜       ⬜   ⬜     ⬜");
        System.out.println("⬜⬜      ⬜       ⬜");
//==============================================================================
 */   

/*        
//==============================================================================
//7. Cofre de Moedas
//Simule um cofre que acumula moedas. 
//Use o while para guardar dinheiro até alcançar o valor necessário para comprar algo desejado

for (int i = 0; i < 10; i++) { System.out.println(" "); }

    System.out.print("Oque Você Deseja Comprar? ");
        String Compra = sc.nextLine();
        
    System.out.print("Informe o Valor do " +Compra+ ": ");
        double Valor = sc.nextDouble();
        
    System.out.print("\nQuanto você quer guardar por Dia? ");
        double valorDia = sc.nextDouble();
        
double ValorQuardado = 0; 
int dia = 1;
int mes = 0;
int ano = 0;
    while (ValorQuardado <= Valor) {
for (int i = 0; i < 10; i++) { System.out.println(" "); }

        System.out.println("Você está no " +dia+ "° Dia");
            dia++;
        
        System.out.printf("\nE você guardou mais R$ %.2f" ,valorDia);
        
            ValorQuardado += valorDia;
        System.out.printf("\nE você está atualmente com R$ %.2f" ,ValorQuardado);
        
            double Falta = (Valor - ValorQuardado);
        System.out.printf("\nE falta para comprar o seu " +Compra+ " o valor de R$ %.2f" ,Math.max(0,Falta) );
            //Thread.sleep(3000);  
    }
    
for (int i = 0; i < 3; i++) { System.out.println(" "); }
    System.out.println("Você conseguiu guardar o Valor Necessario para comprar o " +Compra);
   
    if (dia >= 365) {
        ano = (dia / 365);
        System.out.println("você só precisou juntar por " +ano+ " Anos");
        System.out.println("Parabéns por não desister");
    
    }else if (dia >= 30) {
        mes = (dia / 30);
        System.out.println("Você só precisou de " +mes+ " Mês para conseguir" );
        System.out.println("Parabéns por se manter firme até o Final");
    
    } else {
        System.out.println("Você precisou só de " +dia+ " Dias");
        System.out.println("Agora partiu próxima Meta");
    }
//==============================================================================
*/    
    





    
    
    
    
    
    
    
}
}