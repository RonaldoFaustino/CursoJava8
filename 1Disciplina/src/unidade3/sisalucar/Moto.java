package unidade3.sisalucar;

public class Moto extends Veiculo {

	public int getPassageiros() //Anula��o
	{
		return 1;
	}
	
	public void acelera (int limiteVelocidade) //exemplo de sobrecarga
	{
		System.out.println("Obede�a o limeite de velocidade que � : "+ limiteVelocidade);
	}
}
