package unidade1;

public class Test {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException{

		int i = 0;
		String frases []= {"um","dois","tres"}; //,"quatro","cinco","seis"}; 
		while (i<4)
		{
			/*try{
				System.out.println(frases[i]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro na acesso ao vetor");
			}
			i++;*/
			System.out.println(frases[i]);
			
			i++;
		}
	}

}
