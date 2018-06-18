package unidade4.sisalucar;

public class Carro {

		long idCarro;
		String placa;
		String fabricante;
		int ano;
		String cor;
		float valorDiaria;
		String modelo;
		
		
		public Carro(long idCarro, String placa, String fabricante, int ano, String cor, float valorDiaria,
				String modelo) {
			super(); // Construtor da Super Classe
			this.idCarro = idCarro;
			this.placa = placa;
			this.fabricante = fabricante;
			this.ano = ano;
			this.cor = cor;
			this.valorDiaria = valorDiaria;
			this.modelo = modelo;
		}
		
		public Carro(){
			
		}
		
		public static void main(String[] args) {
			Carro carro1 = new Carro(1,"ABC-1234","Volkswagem",2013,"azul",99.90f,"gol");
			Carro carro2 = new Carro();
		}
		

	}


