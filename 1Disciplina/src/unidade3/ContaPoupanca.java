package unidade3;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa)
	{
		super.saldo = super.saldo + this.saldo*taxa*3;
	}
}
