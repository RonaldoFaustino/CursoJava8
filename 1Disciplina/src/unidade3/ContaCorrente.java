package unidade3;

public class ContaCorrente extends Conta {

	public void atualiza(double taxa)// Exemplo de anula��o
	{
		super.saldo = super.saldo + super.saldo*taxa*2;
	}
}
