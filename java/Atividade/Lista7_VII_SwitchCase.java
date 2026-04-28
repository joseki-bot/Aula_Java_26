package Atividade;

import java.util.Random;
import java.util.Scanner;

public class Lista7_VII_SwitchCase {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
    
for (int i = 0; i < 15; i++) {System.out.println("");}
//==============================================================================


/*
//==============================================================================
// 1- Dias da Semana: 
// Receber um número de 1 a 7 e imprimir o dia da semana correspondente.

    System.out.println("----------------------");
    System.out.println("    Março de 2026"    );
    System.out.println("----------------------");

    System.out.print("Informe o Dia: ");
        String Dia = sc.nextLine().toLowerCase();
        
    switch (Dia) {
        case "1", "8", "15", "22", "29": //Domingo
            System.out.println("O dia " +Dia+ " é Domingo, ou seja FOLGA");
            Thread.sleep(1500);
            break;
        
        case "2", "9", "16", "23", "30": // Segunda
            System.out.println("O dia "  +Dia+ " é Segunda-Feira, Saúdade do Domingo");
            Thread.sleep(1500);
            break;
        
        case "3", "10", "17", "24", "31": // Terça
            System.out.println("O dia " +Dia+ " é Terça-Feira, Pelo Menos a segunda já passou");
            Thread.sleep(1500);
            break;
            
        case "4", "11", "18", "25": // Quarta
            System.out.println("O dia " +Dia+ " é Quarta-Feira, Quarta nunca tem algo de Bom ou Ruim, Peba");
            Thread.sleep(1500);
            break;
        
        case "5": // QUinto dia Útil do Mês
            System.out.println("O dia " +Dia+ " é Quinta-Feira, e o Mais Importante, Dia de pagamento");
            System.out.println("FINALEMENTE, já não aguentava mais comer pão com rato");
                Thread.sleep(1500);
            break;
            
        case "12", "19", "26": // Quinta
            System.out.println("O dia " +Dia+ " é Quinta-Feira, A ansiedade bate bate, só tamo ela SEXTA");
            Thread.sleep(1500);
            break;
            
        case "6", "13", "20", "27": // Sexta
            System.out.println("O dia " +Dia+ " é Sexta-Feira, SEXTOOUUUUUU!!!!!!!!!!!");
            Thread.sleep(1500);
            break;
            
        case "7", "14", "21", "28": // Sabado-Feira
            System.out.println("O dia " +Dia+ " é Sábado, Vamos Lula faz o 5x2 ser real");
            Thread.sleep(1500);
            break;
            
        case "0":
            System.out.println("Caraí, Dia 0, ksksks, e o 0 é Impar");
            Thread.sleep(1500);
            break;
            
        case "mes":
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println(" 1  |  2  |  3  |  4  |  5  |  6  |  7");
            System.out.println(" 8  |  9  | 10  | 11  | 12  | 13  | 14");
            System.out.println(" 15 | 16  | 17  | 18  | 19  | 20  | 21"); 
            System.out.println(" 22 | 23  | 24  | 25  | 26  | 27  | 28");
            System.out.println(" 29 | 30  | 31  |");
                break;
                
        default:
            int DiaNu = Integer.parseInt(Dia);
            if (DiaNu < 0) {
                System.out.println(DiaNu+ " é serio, dia Negativo, kkkk");
                System.out.println("inventou a Máquina do Tempo ou algo parecido é");
                Thread.sleep(1500);
                break; 
            
            } else if (DiaNu >= 32){
                System.out.println(DiaNu+ " , é serio, virou Calendário Maia isso aqui");
                Thread.sleep(1500);
                break;
            
            } else {
                System.out.println("Opção Inválida, Tente Novamente");
                    Thread.sleep(1500);
                    break;
            }    
    }    
//==============================================================================
*/

/*
//==============================================================================
// 2 - Calculadora com Repetição:
// Criar uma calculadora que só para quando o utilizador escolher a opção "Sair", 
//usando while e switch-case.

int sair = 0;
int gambiara = 0;

    System.out.println("----------------------");
    System.out.println("     Calculadora    ");
    System.out.println("----------------------");

    System.out.print("Digite um Número: ");
        int Nu1 = sc.nextInt();
    System.out.print("Digite um Número: ");
        int Nu2 = sc.nextInt();
    System.out.println("----------------------\n");
    
    
    System.out.println("----------------------------------------");
    System.out.println("Oque você quer fazer com esses Números \n");
    
    System.out.println("1. Somar (+)");
    System.out.println("2. Subtrair (-)");
    System.out.println("3. Dividir (/)");
    System.out.println("4. Multiplicar (X)");
    System.out.println("5. Sair (=) \n");
    
while (sair != 1) {    
    System.out.print("==> ");
        //String Escolha = sc.nextLine();
        String Escolha = sc.nextLine().toLowerCase();
    System.out.println("----------------------------------------");

    switch (Escolha) {
        case "1", "somar", "+":
            System.out.println(Nu1+ " + " +Nu2+ " = " +(Nu1+Nu2));
            Thread.sleep(1500);
            sair = 1;
            break;
        
        case "2", "subtrair", "-": 
            System.out.println(Nu1+ " - " +Nu2+ " = " +(Nu1-Nu2) );
            Thread.sleep(1500);
            sair = 1;
            break;
        
        case "3", "dividir", "/":
            System.out.println(Nu1+ " / " +Nu2+ " = " +(Nu1 / Nu2));
            Thread.sleep(1500);
            sair = 1;
            break;
        
        case "4", "multiplicar", "x":
            System.out.println(Nu1+ " x " +Nu2+ " = " +(Nu1*Nu2) );
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "5", "sair", "=":
            System.out.println("Saindo...");
            Thread.sleep(1500);
            sair = 1;
            break;
        
        default:
            if (gambiara >= 1) {
            System.out.println("Opção Invalida, escolha uma das opções ");
            Thread.sleep(1500);
            break; }
            gambiara++;
    } 
}
//==============================================================================
*/

/*
//==============================================================================
//3 - Classificação de Vogal: 
//Verificar se uma letra (a, e, i, o, u) é uma vogal.

    System.out.print("Digite uma Letra: ");
        String letra = sc.nextLine().toLowerCase();
        
    switch (letra) {
        case "a":
            System.out.println("A letra 'A' é uma Vogal");
            Thread.sleep(1500);
            break;
            
        case "e": 
            System.out.println("A letra 'E' é uma Vogal");
            Thread.sleep(1500);
            break;
            
        case "i":
            System.out.println("A letra 'I' é uma Vogal");
            Thread.sleep(1500);
            break;
            
        case "o":
            System.out.println("A letra 'O' é uma Vogal");
            Thread.sleep(1500);
            break;
            
        case "U": 
            System.out.println("A letra 'U' é uma Vogal");
            Thread.sleep(1500);
            break;
        
        default:
            System.out.println("A Letra '" +letra+ "' é uma consoante");
            break;
    }
//==============================================================================
*/

/*
//==============================================================================
// 4 -  Menu de Restaurante com Desconto: 
// Menu de comida onde, se o valor total ultrapassar R$20, aplica-se um desconto usando if.

int sair = 0;
int MaisPrato = 0;
String EscSwi = "";
double valor = 0;

String item1 = "Arroz à Moda, ";
String item2 = "Feijão Explosivo do Chefe, ";
String item3 = "Macarrão, ";
String item4 = "Frango Surpresa, ";
String item5 = "Carne Misteriosa da Casa, ";

String Pedido ="";

while (sair != 1) {         System.out.println("\n\n\n\n\n");
    EscSwi = "";
    MaisPrato = 0;
    
    
    System.out.println("------------");
    System.out.println("    MENU    ");
    System.out.println("------------");

    System.out.println("1. Arroz à Moda");
        double arroz = 12.90;
    System.out.println("2. Feijão Explosivo do Chefe");
        double feijao = 15.50;
    System.out.println("3. Macarrão");
        double macarrao = 18.75;
    System.out.println("4. Frango Surpresa");
        double frango = 22.00;
    System.out.println("5. Carne Misteriosa da Casa");
        double carne = 19.90;
    System.out.println("------------");
    
    System.out.println("Escolha um dos Itens");
        String Escolha = sc.nextLine();
  
//> > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > >       
    while (MaisPrato != 1) {
        switch (Escolha) {
        case "1" -> {
            System.out.println("\n\nVocê escolheu o Arroz à Moda.");
            System.out.println("1. Ver os Detalhes do Prato");
            System.out.println("2. Pedir outro Prato");
            System.out.println("3. Finalizar o Pedido");
            
            System.out.print("Escolha uma Opção: ");
            EscSwi = sc.nextLine();
            System.out.println("\n");
            //====================================================================    
            switch (EscSwi) {
                case "1" -> {
                    System.out.println("Arroz à Moda “Sobrou Ontem” - R$ " +arroz);
                    System.out.println("Arroz cuidadosamente requentado na arte milenar do micro-ondas.");
                    System.out.println("Com leves notas de “esqueci na geladeira”. Acompanha esperança.");
                    Thread.sleep(1500); 
                    break;
                }
                //====================================================================      
                case "2" -> {
                    System.out.println("Voltando para o Menu...");
                    MaisPrato = 1; 
                    valor += arroz;
                    Pedido +=item1;
                    break;
                }
                //==================================================================        
                case "3" -> {
                    System.out.println("Finalizando o Pedido...");
                    MaisPrato = 1;
                    sair = 1; 
                    valor += arroz;
                    Pedido += item1;
                    break;
                }
            } //================================================================
        break;
        }
//=     =   =   =   =   =   =   =   =   =   =   =   =   =   =   =   =   =   =
        case "2" -> {
            System.out.println("\n\nVocê escolheu o Feijão Explosivo do Chefe");
            System.out.println("1. Ver os Detalhes do Prato");
            System.out.println("2. Pedir outro Prato");
            System.out.println("3. Finalizar o Pedido");
            
            System.out.print("Escolha uma Opção: ");
            EscSwi = sc.nextLine();
            System.out.println("\n");//====================================================================    
            switch (EscSwi) {
                case "1" -> {
                    System.out.println("Feijão Explosivo do Chefe - R$ " +feijao);
                    System.out.println("Feijão temperado com um segredo altamente… ativo.");
                    System.out.println("Pode causar efeitos especiais inesperados após o consumo.");
                    Thread.sleep(1500); 
                    break;
                }
                //====================================================================      
                case "2" -> {
                    System.out.println("Voltando para o Menu...");
                    MaisPrato = 1; 
                    valor += feijao;
                    Pedido += item2;
                    break;
                }
                //==================================================================        
                case "3" -> {
                    System.out.println("Finalizando o Pedido...");
                    MaisPrato = 1;
                    sair = 1; 
                    valor += feijao;
                    Pedido += item2;
                    break;
                }
            } //================================================================
        break;
        }
//= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        case "3" -> {
            System.out.println("\n\nVocê escolheu o Macarrão");
            System.out.println("1. Ver os Detalhes do Prato");
            System.out.println("2. Pedir outro Prato");
            System.out.println("3. Finalizar o Pedido");
            
            System.out.print("Escolha uma Opção: ");
            EscSwi = sc.nextLine();
            System.out.println("\n");
            //====================================================================    
            switch (EscSwi) {
                case "1" -> {
                    System.out.println("Macarrão “Al Dente… ou Quase - R$ " +macarrao);
                    System.out.println("Massa no ponto exato entre cru e passado demais.");
                    System.out.println("Uma experiência gastronômica indecisa.");
                    Thread.sleep(1500); 
                    break;
                }
                //====================================================================      
                case "2" -> {
                    System.out.println("Voltando para o Menu...");
                    MaisPrato = 1; 
                    valor += macarrao;
                    Pedido += item3;
                    break;
                }
                //==================================================================        
                case "3" -> {
                    System.out.println("Finalizando o Pedido...");
                    MaisPrato = 1;
                    sair = 1; 
                    valor += macarrao;
                    Pedido += item3;
                    break;
                }
            }  //================================================================
        break;
        }
//= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        case "4" -> {
            System.out.println("\n\nVocê escolheu o Frango Surpresa");
            System.out.println("1. Ver os Detalhes do Prato");
            System.out.println("2. Pedir outro Prato");
            System.out.println("3. Finalizar o Pedido");
            
            System.out.print("Escolha uma Opção: ");
            EscSwi = sc.nextLine();
            System.out.println("\n");//====================================================================    
            switch (EscSwi) {
                case "1" -> {
                    System.out.println("Frango Surpresa (nem o cozinheiro sabe o que vem) - R$ " +frango);
                    System.out.println("Pode ser grelhado, cozido ou algo completamente diferente.");
                    System.out.println("Cada pedido é uma aventura única.");
                    Thread.sleep(1500); 
                    break;
                }
                //====================================================================      
                case "2" -> {
                    System.out.println("Voltando para o Menu...");
                    MaisPrato = 1; 
                    valor += frango;
                    Pedido += item4;
                    break;
                }
                //==================================================================        
                case "3" -> {
                    System.out.println("Finalizando o Pedido...");
                    MaisPrato = 1;
                    sair = 1; 
                    valor += frango;
                    Pedido += item4;
                    break;
                }
            } //================================================================
        break;
        }
//= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        case "5" -> {
            System.out.println("\n\nVocê escolheu o Carne Misteriosa da Casa");
            System.out.println("1. Ver os Detalhes do Prato");
            System.out.println("2. Pedir outro Prato");
            System.out.println("3. Finalizar o Pedido");
            
            System.out.print("Escolha uma Opção: ");
            EscSwi = sc.nextLine();
            System.out.println("\n");//====================================================================    
            switch (EscSwi) {
                case "1" -> {
                    System.out.println("Carne Misteriosa da Casa - R$ " +carne);
                    System.out.println("Ninguém sabe de onde veio, mas garantimos que… é carne.");
                    System.out.println("Ou algo muito parecido.");
                    Thread.sleep(1500); 
                    break;
                }
                //====================================================================      
                case "2" -> {
                    System.out.println("Voltando para o Menu...");
                    MaisPrato = 1; 
                    valor += carne;
                    Pedido += item5;
                    break;
                }
                //==================================================================        
                case "3" -> {
                    System.out.println("Finalizando o Pedido...");
                    MaisPrato = 1;
                    sair = 1; 
                    valor += carne;
                    Pedido += item5;
                    break;
                }
            } //================================================================
        break;
        }
//= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        default -> {
            System.out.println("Opção Invalida, escolha os itens do MENU");
            Thread.sleep(2000);
            MaisPrato = 1;
            break;
        }
        }
    }   
} 
//> > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > >       
    System.out.printf("\nVocê Pediu %.2f" ,Pedido);
    System.out.println("Sua seu pedido deu R$ " +valor);
        
        if (valor >= 20) {
            System.out.println("Mas você recebeu um desconto de 5%");
            System.out.printf("O total valor final é R$ %.2f" ,(valor * 0.95) );
        }
//==============================================================================
*/


//==============================================================================
// 5 -  Identificar o Mês: 
// Receber um número de 1 a 12 e exibir o nome do mês correspondente.

int sair =0;

while (sair != 1) {
    System.out.print("Digite o nome ou o número do mês  que você deseja ver o calentario: ");
        String Mes = sc.nextLine().toLowerCase();
        
    switch (Mes) {
        case "1", "janeiro", "jan":
            System.out.println();
            System.out.println("============= JANEIRO 2026 ============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |  1  |  2  |  3  |  4");
            System.out.println(" 5  |  6  |  7  |  8  |  9  | 10  | 11");
            System.out.println(" 12 | 13  | 14  | 15  | 16  | 17  | 18");
            System.out.println(" 19 | 20  | 21  | 22  | 23  | 24  | 25");
            System.out.println(" 26 | 27  | 28  | 29  | 30  | 31  |");
            System.out.println();
            Thread.sleep(2000);
            break;
            
        case "2", "fevereiro", "fev":
            System.out.println();
            System.out.println("============ FEVEREIRO 2026 ===========");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println(" 1  |  2  |  3  |  4  |  5  |  6  |  7");
            System.out.println(" 8  |  9  | 10  | 11  | 12  | 13  | 14");
            System.out.println(" 15 | 16  | 17  | 18  | 19  | 20  | 21");
            System.out.println(" 22 | 23  | 24  | 25  | 26  | 27  | 28");
            System.out.println();   
            Thread.sleep(2000);
            break;
            
        case "3", "março", "mar":
            System.out.println(); 
            System.out.println("============== MARÇO 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println(" 1  |  2  |  3  |  4  |  5  |  6  |  7");
            System.out.println(" 8  |  9  | 10  | 11  | 12  | 13  | 14");
            System.out.println(" 15 | 16  | 17  | 18  | 19  | 20  | 21");
            System.out.println(" 22 | 23  | 24  | 25  | 26  | 27  | 28");
            System.out.println(" 29 | 30  | 31  |");
            Thread.sleep(2000);
            break;
            
        case "4", "abril", "abr":
            System.out.println();
            System.out.println("============== ABRIL 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |  1  |  2  |  3  |  4");
            System.out.println(" 5  |  6  |  7  |  8  |  9  | 10  | 11");
            System.out.println(" 12 | 13  | 14  | 15  | 16  | 17  | 18");
            System.out.println(" 19 | 20  | 21  | 22  | 23  | 24  | 25");
            System.out.println(" 26 | 27  | 28  | 29  | 30  |");
            Thread.sleep(2000);
            break;
            
        case "5", "maio", "mai":
            System.out.println("============== MAIO 2026 ==============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |     |  1  |  2  |  3");
            System.out.println(" 4  |  5  |  6  |  7  |  8  |  9  | 10");
            System.out.println(" 11 | 12  | 13  | 14  | 15  | 16  | 17");
            System.out.println(" 18 | 19  | 20  | 21  | 22  | 23  | 24");
            System.out.println(" 25 | 26  | 27  | 28  | 29  | 30  | 31");
            System.out.println();
            Thread.sleep(2000);
            break;
            
        case "6", "junho", "jun":
            System.out.println();
            System.out.println("============== JUNHO 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println(" 1  |  2  |  3  |  4  |  5  |  6  |  7");
            System.out.println(" 8  |  9  | 10  | 11  | 12  | 13  | 14");
            System.out.println(" 15 | 16  | 17  | 18  | 19  | 20  | 21");
            System.out.println(" 22 | 23  | 24  | 25  | 26  | 27  | 28");
            System.out.println(" 29 | 30  |");
            Thread.sleep(2000);
            break;
            
        case "7", "julho", "jul":
            System.out.println();
            System.out.println("============== JULHO 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |  1  |  2  |  3  |  4");
            System.out.println(" 5  |  6  |  7  |  8  |  9  | 10  | 11");
            System.out.println(" 12 | 13  | 14  | 15  | 16  | 17  | 18");
            System.out.println(" 19 | 20  | 21  | 22  | 23  | 24  | 25");
            System.out.println(" 26 | 27  | 28  | 29  | 30  | 31  |");
            Thread.sleep(2000);
            break;
            
        case "8", "agosto", "ago":
            System.out.println();
            System.out.println("============= AGOSTO 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |     |     |  1  |  2");
            System.out.println(" 3  |  4  |  5  |  6  |  7  |  8  |  9");
            System.out.println(" 10 | 11  | 12  | 13  | 14  | 15  | 16");
            System.out.println(" 17 | 18  | 19  | 20  | 21  | 22  | 23");
            System.out.println(" 24 | 25  | 26  | 27  | 28  | 29  | 30");
            System.out.println(" 31 |");
            Thread.sleep(2000);
            break;
            
        case "9", "setembro", "set":
            System.out.println(); 
            System.out.println("============ SETEMBRO 2026 ============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |  1  |  2  |  3  |  4  |  5  |  6");
            System.out.println(" 7  |  8  |  9  | 10  | 11  | 12  | 13");
            System.out.println(" 14 | 15  | 16  | 17  | 18  | 19  | 20");
            System.out.println(" 21 | 22  | 23  | 24  | 25  | 26  | 27");
            System.out.println(" 28 | 29  | 30  |");
            System.out.println("\nMês de NoFAP, merda");
            Thread.sleep(2000);
            break;
            
        case "10", "outubro", "out":
            System.out.println();
            System.out.println("============ OUTUBRO 2026 =============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |     |     |  1  |  2  |  3  |  4");
            System.out.println(" 5  |  6  |  7  |  8  |  9  | 10  | 11");
            System.out.println(" 12 | 13  | 14  | 15  | 16  | 17  | 18");
            System.out.println(" 19 | 20  | 21  | 22  | 23  | 24  | 25");
            System.out.println(" 26 | 27  | 28  | 29  | 30  | 31  |");
            Thread.sleep(2000);
            break;
            
        case "11", "novembro", "nov":
            System.out.println();
            System.out.println("============ NOVEMBRO 2026 ============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println(" 1  |  2  |  3  |  4  |  5  |  6  |  7");
            System.out.println(" 8  |  9  | 10  | 11  | 12  | 13  | 14");
            System.out.println(" 15 | 16  | 17  | 18  | 19  | 20  | 21");
            System.out.println(" 22 | 23  | 24  | 25  | 26  | 27  | 28");
            System.out.println(" 29 | 30  |");
            Thread.sleep(2000);
            break;
            
        case "12", "desembro", "des":
            System.out.println(); 
            System.out.println("============= DEZEMBRO 2026 ============");
            System.out.println("Dom | Seg | Ter | Qua | Qui | Sex | Sab");
            System.out.println("---------------------------------------");
            System.out.println("    |  1  |  2  |  3  |  4  |  5  |  6");
            System.out.println(" 7  |  8  |  9  | 10  | 11  | 12  | 13");
            System.out.println(" 14 | 15  | 16  | 17  | 18  | 19  | 20");
            System.out.println(" 21 | 22  | 23  | 24  | 25  | 26  | 27");
            System.out.println(" 28 | 29  | 30  | 31  |");
            Thread.sleep(2000);
            break;
            
    }
        System.out.println("\n");
        System.out.println("1. SAIR");
        System.out.println("2. Ver Outro Mês");
        System.out.print("=> ");
            String Escolha = sc.nextLine().toLowerCase();
            
        switch (Escolha) {
            case "1", "sair":
                System.out.println("Saindo...");
                sair = 1;
                Thread.sleep(1500);
                break;
            
            case "2":
                System.out.println("Voltando...");
                Thread.sleep(1500);
                break;
        }
}        
//==============================================================================


/*
//==============================================================================
// 6 -  Sistema de Notas com Validação: 
// O programa pede uma nota (letra A, B, C, D, F). 
// Se a nota for 'F', ele usa um if para perguntar se o aluno fez a recuperação.

    System.out.println("Infome a sua Nota: (A-B-C-D-E-F)");
        String Nota = sc.nextLine().toLowerCase();
        
    switch (Nota) {
        case "a":
            System.out.println("Nota A (10), você está de parabens");
            Thread.sleep(1500);
            break;
            
        case "b": 
            System.out.println("Nota B (8), você parabens, mas você pode melhora");
            Thread.sleep(1500);
            break;
            
        case "c":
            System.out.println("Nota C (6), Você ficou na média, tá melhor que o Derick ");
            Thread.sleep(1500);
            break;
            
        case "d":
            System.out.println("Nota D (4), você ficou de recuperação");
            System.out.println("Deseja fazer a recuperação ? ");
                String ResRec = sc.nextLine().toLowerCase();
                
                switch (ResRec) {
                    case "sim", "s", "yes" -> {
                        int DiaRec = ale.nextInt(31);
                        System.out.println("Sua Recuperação ficou para o Dia " +(DiaRec+1) );
                        Thread.sleep(2000); 
                        break;  }
                        
                    case "nao", "no", "não" -> {
                        System.out.println("Ok, você só vai ter que fazer o Ano todo de novo");
                        Thread.sleep(2000); 
                        break;  }
                }
            break;

        case "e":
            System.out.println("Nota E (2), você só responde 7 em tudo, é serio");
            System.out.println("Mas eu sou Obrigado a Perguntar se você quer fazer a recuperação");
            System.out.println("Quer fazer ?");
                String ResRec1 = sc.nextLine().toLowerCase();
                
                switch (ResRec1) {
                    case "sim", "s", "yes" -> {
                        int DiaRec = ale.nextInt(31);
                        System.out.println("Sua Recuperação ficou para o Dia " +(DiaRec+1) );
                        Thread.sleep(2000); 
                        break; }
                        
                    case "nao", "no", "não" -> {
                        System.out.println("Ok, você só vai ter que fazer o Ano todo de novo");
                        Thread.sleep(2000); 
                        break; }
                }
            break;
            
        case "f" :
            int DiaRec = ale.nextInt(31);
            
            System.out.println("Nota F (0), irmão tu nem tentou fazer, tu entregou a prova em Branco");
            System.out.println("Você tem que fazer a recuperação");
            System.out.println("E vai fazer ela no Dia " +(DiaRec + 1) );
            Thread.sleep(1500);
            break;
    }
//==============================================================================
*/
    
/*    
//==============================================================================
// 7 -  Dia Útil ou Fim de Semana: 
// Receber um dia (1 a 7) e dizer se é "Dia de trabalho" ou "Fim de semana".

int sair = 0;

while (sair != 1) {
    System.out.print("\n\nDigite Um dia de 1 a 7:  ");
        String Dia = sc.nextLine();
            
    switch (Dia) {
        case "1":
            System.out.println("Dia 1 é Segunda-Feira, então é dia de trabalho");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "2":
            System.out.println("Dia 2 é Terça-Feira, oque resta hoje é Trabalho");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "3":
            System.out.println("Dia 3 é Quarta-Feira, trabalho trabalhe e trabalhe");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "4":
            System.out.println("Dia 4 é Quinta-Feira, trabalho é o esforço humano dotado\n" 
                              +"de um propósito e envolve a transformação da natureza através\n" 
                              +"do dispêndio de capacidades físicas e mentais.");
            Thread.sleep(1500);
            sair = 1;
            break;
            
         case "5":
            System.out.println("Dia 5 é Sexta-Feira, SEXTOO, mas você trabalha ksksks");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "6":
            System.out.println("Dia 6 é Sábado, Sabadeira é folga, e você está com resaca");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        case "7":
            System.out.println("Dia 7 é Domingo, hoje é folga e dia de limpar a case, e ficar triste que você volta por trabalho amanhã");
            Thread.sleep(1500);
            sair = 1;
            break;
            
        default:
            System.out.println("Dia invalido, apenas responda com Número de 1 a 7");
            Thread.sleep(2000);
            break;
    }
}    
//==============================================================================
*/

/*
//==============================================================================
// 8 - Mini Caixa Eletrônico: 
//Criar um menu que permite ver saldo, depositar ou sair. 
//Usa um laço do-while para manter o programa rodando até o utilizador decidir sair.

int sair =0;
double Saldo = ale.nextDouble(1500);

do {
    System.out.println("========================");
    System.out.println("=== Caixa Eletrônico ===");
    System.out.println("========================");
    
    System.out.println("1. Ver Saldo");
    System.out.println("2. Depositar");
    System.out.println("3. Sair");
        
    System.out.print("==>  ");
        String Escolha = sc.nextLine();
        
    switch (Escolha) {
        case "1":
            System.out.println("========================");
            System.out.printf("Saldo: %.2f" ,Saldo);
            Thread.sleep(1550);
            
            System.out.println("\n1. Voltar");
            System.out.println("2. Sair");
                String EscSaldo = sc.nextLine().toLowerCase();
            
            switch (EscSaldo) {
                case "1", "voltar" -> {
                    System.out.println("Voltando...");
                    Thread.sleep(1500); 
                    break;  }
                    
                case "2", "sair" -> {
                    System.out.println("Saindo...");
                    Thread.sleep(1500);
                    sair = 1; 
                    break; }    }
        break;
            
        case "2":
            System.out.println("========================");
            System.out.print("Quanto você quer Depositar: ");
                double Deposito = sc.nextDouble();
            Saldo += Deposito;
            Thread.sleep(1500);
            
            System.out.println("\n1. Voltar");
            System.out.println("2. Sair");
                String EscDeposito = sc.nextLine().toLowerCase();
                EscDeposito = sc.nextLine().toLowerCase();
                
            switch (EscDeposito) {
                case "1", "voltar" -> {
                    System.out.println("\nVoltando...");
                    Thread.sleep(1500); 
                    break;  }
                    
                case "2", "sair" -> {
                    System.out.println("Saindo...");
                    Thread.sleep(1500);
                    sair = 1; 
                    break;  }   }
            break;
                
        case "3":
            System.out.println("========================");
            System.out.println("Saindo...");
            Thread.sleep(1500);
            sair = 1;
            break;
    }

} while (sair != 1); {
        System.out.println("Tudo o dinheiro na sua conta foi transferido por Lula, faça o L imediatamente");
    }
//==============================================================================
*/            






















}
}