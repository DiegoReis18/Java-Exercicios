import javax.swing.JOptionPane;
public class Exercicio21 {
	public static void main(String args[]) {
		int dia;
	
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia da semana:\n 1-Domingo\n2-Segunda\n3-Terça\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sábado"));
		
		switch(dia)
		{
			case 1:
				JOptionPane.showMessageDialog(null,"Hoje é Domingo.");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Hoje é Segunda-Feira.");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Hoje é Terça-Feira.");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Hoje é Quarta-Feira.");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Hoje é Quinta-Feira.");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Hoje é Sabado-Feira.");
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Hoje é Sábado.");
				break;
			default:
				JOptionPane.showMessageDialog(null,"ERRORRR.");
				break;
		}
		
	}
}
