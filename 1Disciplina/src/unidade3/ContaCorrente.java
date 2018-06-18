package unidade3;

public class ContaCorrente extends Conta {

	public void atualiza(double taxa)// Exemplo de anulação
	{
		super.saldo = super.saldo + super.saldo*taxa*2;
	}
}
