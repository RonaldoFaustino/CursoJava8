package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota"));
		
		if ((nota<0)||(nota>100))
		{
			JOptionPane.showMessageDialog(null, "Nota inv�lida, digite um intervalo entre 0 a 100");
			main(null);
		}
		else
		{
			if(nota < 50)
				JOptionPane.showMessageDialog(null, "Conceito: Insuficiente");
			else if(nota < 70)
				JOptionPane.showMessageDialog(null, "Conceito: Regular");
			else if(nota <= 90)
				JOptionPane.showMessageDialog(null, "Conceito: BOM");
			else 
				JOptionPane.showMessageDialog(null, "Conceito:Excelente");
		}
		
	}

}
