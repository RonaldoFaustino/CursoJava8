package unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {
		
		long idLocacao;
		long idCliente;
		long idCarro;
		float valorLocado;
		LocalDate dataInicio;
		LocalDate dataFinal;
		public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate dataInicio,
				LocalDate dataFinal) {
			super();
			this.idLocacao = idLocacao;
			this.idCliente = idCliente;
			this.idCarro = idCarro;
			this.valorLocado = valorLocado;
			this.dataInicio = dataInicio;
			this.dataFinal = dataFinal;
		}

		public Locacao(){
			
		}
		
	}


