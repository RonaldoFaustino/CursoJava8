package unidade3.sisalucar;

public class Onibus extends Veiculo {
	
	public int getPassageiros() //Anula��o
	{
		return 40;
	}
	
	public void acelera (int limiteVelocidade) //exemplo de sobrecarga
	{
		System.out.println("Obede�a o limeite de velocidade que � : "+ limiteVelocidade);
	}

}
