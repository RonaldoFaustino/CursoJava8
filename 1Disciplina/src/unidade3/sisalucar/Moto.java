package unidade3.sisalucar;

public class Moto extends Veiculo {

	public int getPassageiros() //Anulação
	{
		return 1;
	}
	
	public void acelera (int limiteVelocidade) //exemplo de sobrecarga
	{
		System.out.println("Obedeça o limeite de velocidade que é : "+ limiteVelocidade);
	}
}
