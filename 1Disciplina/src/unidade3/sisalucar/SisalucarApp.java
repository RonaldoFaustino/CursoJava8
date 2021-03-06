package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		Carro carro1 = new Carro(); // 1 objeto carro
		
		carro1.setIdCarro(1);
		carro1.setModelo("Gol");
		carro1.setPlaca("bdc-9999");
		carro1.setCor("azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("Volkswagen");
		
		totalCarros = totalCarros +1;
		
		//Carro carro2 = new Carro(); // 2 objeto carro
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("Jo�o Pedro");
		cliente1.setCnh("Dsd111");
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		sisalucar.gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));
		
				

	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria)	
	{
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);		
		locacao.setDataInicio(LocalDate.now());
		locacao.setDataFinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);
	}
	
	public static void gerarRelatorioLocacao(Carro carro1,LocalDate ...datas){ //exemplo de varargs
		
		float totalFaturado = carro1.getValorDiaria();
		
	}

}
