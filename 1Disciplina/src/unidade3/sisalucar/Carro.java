package unidade3.sisalucar;

public class Carro  extends Veiculo{

		private long idCarro;
		private String placa;
		private String fabricante;
		private int ano;
		private String cor;
		private float valorDiaria;
		private String modelo;
		private Revendedor revendedor;
		
		public long getIdCarro()
		{
			return this.idCarro;
		}
		
		public void setIdCarro(long idCarro)
		{	
			this.idCarro = idCarro;
		}
		
		
		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getValorDiaria() {
			return valorDiaria;
		}

		public void setValorDiaria(float valorDiaria) {
			this.valorDiaria = valorDiaria;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public Revendedor getRevendedor() {
			return revendedor;
		}

		public void setRevendedor(Revendedor revendedor) {
			this.revendedor = revendedor;
		}

		public Carro(long idCarro, String placa, String fabricante, int ano, String cor, float valorDiaria,
				String modelo, Revendedor revendedor) {
			super(); // Construtor da Super Classe
			this.idCarro = idCarro;
			this.placa = placa;
			this.fabricante = fabricante;
			this.ano = ano;
			this.cor = cor;
			this.valorDiaria = valorDiaria;
			this.modelo = modelo;
			this.revendedor = revendedor;
		}
		
		public Carro()
		{
			
		}
		
		public int getPassageiros() //Anula��o
		{
			return 4;
		}
		
		public void acelera (int limiteVelocidade) //exemplo de sobrecarga
		{
			System.out.println("Obede�a o limeite de velocidade que � : "+ limiteVelocidade);
		}
		
		public void abastecer(int quantidadeLitros)
		{
			System.out.println("Para abastecer o carro � necessario :"+ quantidadeLitros + "Litros.");
		}
		
		public static void main(String[] args) {
			Carro carro1 = new Carro(1,"ABC-1234","Volkswagem",2013,"azul",99.90f,"gol", Revendedor.EMANUELVEICULOS);
			Carro carro2 = new Carro();
			
			carro1.acelera();
			carro1.freia();
			carro1.getPassageiros();
			carro1.getVelocidade();
			carro1.autonomia = 40;
			
			
		}
		

	}


