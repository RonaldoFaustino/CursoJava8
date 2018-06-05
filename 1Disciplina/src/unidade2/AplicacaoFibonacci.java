package unidade2;

public class AplicacaoFibonacci {

	public static void main(String[] args) {
		
		int anterior1 = 1;
		int anterior2 = 1;
		int calculando = anterior1 + anterior2;
		int soma = calculando + anterior1 + anterior2;
		System.out.println(anterior1 +","+ anterior2 +","+ calculando);
		
		for(int i=4;i<20; i++){
			anterior1 = anterior2;
			anterior2 =calculando;
			calculando = anterior1 + anterior2;
			soma = soma +calculando;
			System.out.print(calculando+",");
		}
		
		double media = soma/20;
		System.out.println("Media= "+media);
	}

}
