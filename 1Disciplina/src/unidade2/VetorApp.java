package unidade2;

public class VetorApp {

	public static void main(String[] args) {
		
		
		/***********************vetor de tipos primitivos***************/
		/*
		int fibo[] = new int [20];
		
		fibo[0] =1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0] + fibo[1];
		
		for (int i=3;i<20;i++)
			fibo[i] = fibo[i-1] + fibo[i-2];
		
		for(int f: fibo)
			System.out.print(f+",");
		*/
		
		/**********************Vetor de objetos*************************/
		/*
		
		String vetor [] = new String [10];
		vetor[0] = new String("Antonio");
		vetor[9] = new String("Carlos");
		
		for(String z:vetor)
			System.out.println(z+",");
		
		*/
		/********************** Matrizes *********************************/
		
		//int matriz[][] = new int [3][3];
		
		//matriz [0][0] = 100;
		
		//System.out.println(matriz+",");
		
		 //boolean email = "java@teste.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
	       // System.out.println(email);
	        
	        for(int i=3;i<20;i+=2){
	        	System.out.print((i%3)+"");
	        }
	}

}
