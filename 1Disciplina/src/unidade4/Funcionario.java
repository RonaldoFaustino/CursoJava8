package unidade4;

public abstract class Funcionario {
	
  public static void verificarTipoFuncionario(Funcionario objeto)
	{
		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		else if (objeto instanceof Professor)
			System.out.println("Professor");
		else 
			System.out.println("Administrativo");
	}
  
  public abstract void getBonificacao();
  
  public static void main(String[]args) {
	  Funcionario objeto;
	  
	  //Polimorfismo
	  objeto = new Diretor();
	  
	  ((Diretor)objeto).departamento = "RH"; //Exemplo de Casting
	  
	  verificarTipoFuncionario(objeto);
	  
	  Professor
  }

public void pagaIR() {
	// TODO Auto-generated method stub
	
}
}
