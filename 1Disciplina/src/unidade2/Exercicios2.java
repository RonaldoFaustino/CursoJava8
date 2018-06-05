package unidade2;

public class Exercicios2 {

	public static void main(String[] args) {
		int fat = 1;
		int valor = 5; //ou qualquer outro valor que queira calcular;
		for( int i = 2; i <= valor; i++ )
		{ 
		     fat *= i;
		}
		System.out.println( "O fatorial de " + valor + " é igual a " + fat );
		}

	}


