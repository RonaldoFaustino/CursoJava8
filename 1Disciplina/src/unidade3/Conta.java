package unidade3;

public class Conta {
	
	//Atributos
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente[];
	
	//Metodos
	public boolean saca(double valor)
	{
		if(valor <= saldo)
		{
			saldo = saldo- valor;
		return true;
	}
		else 
			return false; // Não conseguiu realizar o saque.
	}
	
	public void deposita(double valor)
	{
		saldo = saldo + valor;
	}
	
	public void trasnfere(Conta destino, double valor)
	{
		if (valor <= saldo)
		{
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
		}
		else
		System.out.println("Não foi possivel realizar tranferencia");
	}
	
	public void atualiza(double taxa)
	{
		this.saldo = this.saldo + this.saldo*taxa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
    
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = new Cliente[5]; //Cliente de 1 até 5
		
		
	}
	
}
