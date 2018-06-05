package unidade2;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		
		/***************  M�todo matches ********************/
		
	        boolean nome = "Maria".matches("Maria");
	        System.out.println("Retorno = "+nome);
	        
	    /*************** Modificadores(Modificador ignora letras mai�sculas e min�sculas) **********************/
	        
	        boolean sobreNome = "Silveira".matches("(?i)silveira");
			System.out.println("Retorno = "+sobreNome);
		
		/**************** Modificadores(Valida��es de caracteres)***************/
			
			boolean correioeletr = "@".matches(".");
	        System.out.println("Qualquer caractere: "+correioeletr);
	         
	        boolean numero = numero = "a".matches("\\d");
	        System.out.println("Possui n�mero: "+numero);
	        
	        numero = "2".matches("\\d");
	        System.out.println("Possui n�mero: "+numero);
	         
	        boolean letrasNumeros = "A2".matches("\\w\\d"); 
	        System.out.println("Possui letras e n�meros? "+letrasNumeros);
	         
	        boolean espaco = " ".matches("\\s");
	        System.out.println("Possui espa�o? "+espaco);
	        
	    /**************** Modificadores(Exemplos de ocorr�ncias)***************/
	        
	        //Procura a ocorrencia de 1 caractere
	        boolean caractere = "E".matches(".");
	        System.out.println(caractere);
	         
	        //Procura a ocorr�ncia de 2 caracteres
	        caractere = "Ab".matches("..");
	        System.out.println(caractere);
	         
	        //Valida��o de cep
	        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
	        boolean valida = "99855-000".matches(cep);
	        System.out.println(valida);
	        
	    /**************** Quantificadores (Demonstra��o dos quantificadores)***************/  
	        
	        //Procura 2 d�gitos no texto
	        boolean valor = "74".matches("\\d{2}");
	        System.out.println(valor);
	         
	        //Procura mais de 2 d�gitos no texto
	        valor = "211".matches("\\d{9,}");
	        System.out.println(valor);
	         
	        //Procura d�gitos entre os valores de 2 e 5 
	        valor = "2121".matches("\\d{2,5}");
	        System.out.println(valor);
	         
	        //Procura d�gito entre 0 e 1 vezes
	        valor = "22".matches(".?");
	        System.out.println(valor);
	         
	        //Procura d�gito entre 0 e mais vezes
	        valor = "75411".matches(".*");
	        System.out.println(valor);
	         
	        //Procura d�gito entre 1 e mais vezes
	        valor = "".matches(".+");
	        System.out.println(valor);
	         
	        //Cria express�o regular resumida da data
	        String data = "02/05/1995";
	        valor = data.matches("\\d{2}/\\d{2}/\\d{4}");
	        System.out.println("Data: "+valor);
	         
	        //Cria a express�o regular resumida do cep
	        String cep = "8545-222";
	        valor = cep.matches("\\d{4}-\\d{3}");
	        System.out.println("Cep: "+valor);
	        
	        /**************** Metacaracteres de fronteira (Demonstra��o dos metacaracteres)***************/  
	        
	        //Come�a na palavra Java, continua com qualquer caractere a partir do . 0 e mais vezes
	        boolean palavra = "Java322".matches("^Java.*"); 
	        System.out.println(palavra);
	         
	        //Termina com 322
	        //O ponto (.) Come�a com qualquer caractere e busca 0 ou mais caracteres finalizando com o num 322
	        palavra = "Java322".matches(".*322$");
	        System.out.println(palavra);
	         
	        //Pesquisa se uma palavra existe no texto
	        palavra = "Hello World Java".matches(".*Java.*");
	        System.out.println(palavra);
	         
	        //Pesquisa os caracteres que est�o depois da letra O e antes da palavra Java 
	        palavra = "O mundo Java".matches("^O.*Java$");
	        System.out.println(palavra);
	         
	        //Pesquisa pela palavra Inter ou Gr�mio
	        boolean time = "Inter".matches("Inter|Gr�mio");
	        System.out.println("Time: "+time);
	        
	        /**************** Agrupadores (Demonstra��o de agrupadores)***************/
	        
	      //Busca qualquer letra de a at� z - faz diferen�a utilizar mai�sculas e min�suculas
	        boolean palavra = "g".matches("[a-z]");
	        System.out.println(palavra);
	         
	        //Verifica se foi escrita em letra mai�scula ou min�scula
	        palavra = "Java".matches("[jJ]ava");
	        System.out.println(palavra);
	         
	        //Verifica caracteres de A at� Z e a at� z
	        palavra = "Sql".matches("[A-Z][a-z]*");
	        System.out.println(palavra);
	         
	        //N�o permite que comece com as letras a e i
	        palavra = "Oracle".matches("[^aei]racle");
	        System.out.println(palavra);
	         
	        //Verifica se foi digitado o caractere "j" e "s"
	        //Retorna false por causa da letra "z" onde que o padr�o esperava a letra "s"
	        palavra = "Objetoz".matches("Ob[j]eto[s]");
	        System.out.println(palavra);
	         
	        //Valida��o de email
	        boolean email = "java@teste.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
	        System.out.println("email");
	    }
			
}


