import javax.swing.JOptionPane;
public class Exercicio21 {
	public static void main(String args[]) {
		int dia;
	
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do dia da semana:\n 1-Domingo\n2-Segunda\n3-Ter�a\n4-Quarta\n5-Quinta\n6-Sexta\n7-S�bado"));
		
		switch(dia)
		{
			case 1:
				JOptionPane.showMessageDialog(null,"Hoje � Domingo.");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Hoje � Segunda-Feira.");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Hoje � Ter�a-Feira.");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Hoje � Quarta-Feira.");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Hoje � Quinta-Feira.");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Hoje � Sabado-Feira.");
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Hoje � S�bado.");
				break;
			default:
				JOptionPane.showMessageDialog(null,"ERRORRR.");
				break;
		}
		
	}
}
