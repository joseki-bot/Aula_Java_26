package Atividade;


import java.util.Scanner;

public class Lista3_III_IfElse {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
//============================================================

        /*
//1
    System.out.println("Departamento de consulta de Multas\n");
    System.out.println("Por Favor, Informe a Velocidade do seu Veículo");
        int Vll = sc.nextInt();
        int Limite = Vll - 80;
        int Multa = (Vll - 80) * 5 ;

        
    if (Vll > 80) {
        System.out.println("\nVocê Ultrapassou o Limete de Velocidade de 80km/h");
        System.out.println("Você recemerar uma multa pois Ultrapassou o Limete em "
                +Limite+ "km/h");
        System.out.println("\nSua multa é de R$ " +Multa);
        
    } else {
        System.out.println("\nVocê segui o Limete e não recebeu nem uma Multa");
        System.out.println("Parabéns");
    }
//================================================================================ 
    */
    
        
    /*
//================================================================================
// 2
    
    System.out.println("As Eleições são esse Ano e você pode fazer a Diferença");
    System.out.println("\nPor Favor nós Informe a sua idade para ver se você tem o Direito ao Voto: ");    
        int DirVoto = sc.nextInt();
        
    if (DirVoto >= 16) {
        System.out.println("Você tem o direito ao Voto !!!, pois você já tem " +DirVoto+ " Anos");
    
    } else {
        int SemDir = 16 - DirVoto ;
        System.out.println("Você Ainda não tem Idade suficiente Precisa esperar mais");
        System.out.println(SemDir+ " Anos");
    }
 //==============================================================================       
    */
    
    
    /*
//==============================================================================    
// 3 
    System.out.println("=======================================");
    System.out.println("Verificador De Aprovação \n");
    System.out.print("Nós Informe o Seu Nome: ");
        String Nome = sc.nextLine();
    
    System.out.print("\nAgora nós informe a sua nota em Mátematica: ");
        double NotaMat = sc.nextDouble();
    
    System.out.print("Agora a de Português: ");
        double NotaPor = sc.nextDouble();
        
    double Media = (NotaMat + NotaPor) / 2;
    
    if (Media >= 7) {
        System.out.println("\n\nParabens você conseguiu se Aprovado");
        System.out.println("Sua média final foi " +Media);
        
    } else if (Media == 10) {
        System.out.println("\n\nMuito Bem, você conseguiu a Nota Máxima !!!");
        System.out.println("Sua nota foi perfeita de 10!!!");
        
    } else {
        System.out.println("Você não foi aprovado pois sua Nota foi " +Media);
        System.out.println("Estude mais na Próxima");
    }
//================================================================================
    */
    
    
    /*
//===============================================================================
// 4

    System.out.println("=======================================");
    System.out.println("Comparador de Número");
    System.out.print("\nEncolha um Número:  ");
        int N1 = sc.nextInt();
        
    System.out.print("\nAgora escolha outro Número: ");
        int N2 = sc.nextInt();
        
    if (N1 > N2) {
        int Maior1 = N1 - N2;
        System.out.println("\n\nO Número " +N1+ " é maior que o " +N2);
        System.out.println("Ele é " +Maior1+ " Nivel Doque " +N2);
    
    } else if ((N2 == N1) || (N1 == N2)) {
        System.out.println("\n\nAmbos o Números são iguais");
        System.out.println("Por Favor, Reinicie e escolha Outra Número");
        
    } else {
        int Maior2 = N2 - N1;
        System.out.println("\n\nO Número " +N2+ " É maior que o " +N1);
        System.out.println("Ele é " +Maior2+ " Nivel Doque " +N1);
    }
 //===============================================================================   
    */
    
    
    /*
//================================================================================
// 5

    System.out.println("=================================");
    System.out.println("Nossa Loja está fazendo uma Oferta Especial");
    System.out.print("Para ver se Você tem o Direito ao Desconto nós informe o Seu Nome: ");
        String Nome = sc.nextLine();
    
    System.out.println("\nAgora escolha o seu Gênero");
        System.out.println("1) Feminino");
        System.out.println("2) Masculino");
        String Gere= sc.nextLine().trim().toLowerCase(); 
        
     System.out.print("\nNós Informe o Valor do Produto: ");
         double Valor = sc.nextInt();
        
// .equls está vendo se a respota da pessoa é igual as opção, só funciona para uma palavra      
    if (Gere.equals("1") || Gere.equals("feminino") || Gere.equals("f")) {
        double DesMu = (Valor * 0.13);
        double FinalMul = (Valor - DesMu);
            
        System.out.println("\nParabéns " +Nome+ " ,Você Ganhou o desconto especial de 13% para as Mulheres");
        System.out.printf("Seu Produto de R$ %.2f" ,Valor);
        System.out.printf(" ,Para R$ %.2f" ,FinalMul);
        
    } else if (Gere.equals("2") || Gere.equals("masculino") || Gere.equals("m")){
        double DesMan = (Valor * 0.05);
        double FinalMan = (Valor - DesMan);
            
        System.out.println("\nOlá " +Nome+ " ,Você Ganhou um desconto de 5%");
        System.out.printf("Seu Produto de R$ %.2f" ,Valor);
        System.out.printf(" Para R$ %.2f" ,FinalMan);
                
  
    } else {
        System.out.println("Ops, aconteceu um Problema, tente novamente");
    }
//===============================================================================
    */
 
 
    /*
//===============================================================================
// 6    
        System.out.println("===============================");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine().trim(); 
// .trim Ele remove todos os espaços em branco extras do início e do fim da string, mas não os entre falavras

        if (nome.length() > 5) {
            System.out.println("\nSeu é muito Grande, ele tem " +nome.length()+ " Caracteres BAH!!!");

        } else if (nome.length() == 5) {
            System.out.println("Seu Nome Tem examamente 5 Caracteres");
        
        } else {
            System.out.println("Seu nome é muito Pequeno, ele tem só " +nome.length()+ " Caracteres, Melhore");
        }
//==============================================================================     
    */
    
    
    /*
//================================================================================
// 7

    System.out.println("=================================");
    System.out.print("Digite uma palavra: ");
    String palavra = sc.nextLine();

    String invertida = "";

    for (int i = palavra.length() - 1; i >= 0; i--) {
      invertida += palavra.charAt(i);
    }

    System.out.println("Sua Palavra é " +palavra);
    System.out.println("E ela invertida fica  " +invertida);
//================================================================================    
   */
    
    
    /*
//================================================================================
// 8

    System.out.println("===============================");
    System.out.println("Ferificador de Palavras");
        
    System.out.println("\nDigire uma Palavra");
        String Palavra = sc.nextLine().toLowerCase();


  boolean TemVogal = false;

        for (int i = 0; i < Palavra.length(); i++) {
            char letra = Palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                TemVogal = true;
                break;
            }
        }

        if (TemVogal) {
            System.out.println("A palavra contém pelo menos uma vogal.");
        } else {
            System.out.println("A palavra NÃO contém vogais.");
        }
    }
}
 //===============================================================================   
    */
    
    
    /*
//==================================================================================
// 9
    
    System.out.print("Digite um login: ");
    String login = sc.nextLine();
                                                       // .contains esta verifica se tem espaço
    if (login.length() >= 6 && !login.contains(" ")) { // .length vê quantos caracteres existem
        System.out.println("Login válido");
 
    } else {
        System.out.println("Login inválido");
    }    
//===============================================================================
    */
    
    
    /*
//================================================================================
// 10
    
    System.out.print("Digite um dia da semana: ");
        String dia = sc.nextLine().toLowerCase();

    if (dia.equals("sábado") || dia.equals("sabado") || dia.equals("domingo")) {
        System.out.println("Fim de semana"); 
    //.equals indentifica se a palavra toda é igual 

    } else if (dia.equals("segunda") || dia.equals("terça") || dia.equals("terca")
   || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
        System.out.println("Dia útil");

    } else {
        System.out.println("Dia inválido");
        }
//================================================================================   
    */
    
    
   /* 
//================================================================================
// 11
    
    System.out.print("Digite uma frase: ");
        String Frase = sc.nextLine() .toLowerCase(); //Tranforma as letra maiculas em minusculas

        String NovaFrase = Frase.replace("Java", "Programação");

    if (Frase.equals("java")) {
        System.out.println("Frase modificada:\n");
        System.out.println("Sua frase era. \n" +Frase+ "\n");
        System.out.println("E agora ela ficou \n" +NovaFrase);
    
    } else {
        System.out.println("Sua Frase não pode ser Modificada pois não foi "
       + "encontrada nem uma palavra Java.");
    }
//================================================================================
    */
   
   
    /*
//================================================================================
// 12

        System.out.println("===========================");
        System.out.print("Digite o seu E-mail:  ");
            String mail = sc.nextLine() .toLowerCase();
            
        if (mail.endsWith("@gmail.com") && !mail.contains(" ") ) {
            System.out.println("\n\n==============================");
            System.out.println("E-Mail altorizado !");
            System.out.println("Indentificado com Gmail");
        
        } else if (mail.endsWith("@hotmail.com") && !mail.contains(" ")) {
            System.out.println("\n\n ===========================");
            System.out.println("Verificando E-mail");
             
            System.out.println("hotmail Indentificado, você é Velho");
            System.out.println("E já está passou da Hora de você Trocar o seu E-mail");

        } else if (mail.endsWith("@bol.com") && !mail.contains(" ") ) {
            System.out.println("\n\n ===========================");
            System.out.println("Verificando E-mail");
                
            System.out.println("Irmão, como tu ainda tá vivo");
            System.out.println("Tu não vai acessar não, já está fazendo Hora extra");
        
        } else {
            System.out.println("\n\n ===========================");
            System.out.println("Verificando E-mail");
                
            System.out.println("Não Encontrado, Por Favor tente Novamente");
        }
//=================================================================================
    */
    
    }
}