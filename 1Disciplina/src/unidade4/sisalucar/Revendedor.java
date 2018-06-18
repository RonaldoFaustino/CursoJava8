package unidade4.sisalucar;

public enum Revendedor {
	
	ABCVEICULOS("101010/0001","Rua Da Goria, 1500", "Volswagem"),
	SIMOES("202020/0002", "R. Da Patria,200", "Fiat"), 
	EMANUELVEICULOS("303030/0003", "Garcia Vieira,2003","Chevrolet");
	
	String cnpj;
	String endereco;
	String fabricante;
	
	
	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	
	
}
