package unidade3;

public class Conta {
	
	//Atributos
	int numero;
	double saldo;
	double limite;
	String nome;
	
	//Metodos
	public boolean saca(double valor)
	{
		return false;
	}
	
	public void deposita(double valor)
	{
		
	}
	
	public void trasnfere(Conta destino, double valor)
	{
		
	}
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.trasnfere(conta2, 30);
	}
}
