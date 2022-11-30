import javax.swing.JOptionPane;

public class Switch {
	public static void main(String args[]) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número de 1 a 3"));
		switch(num) {
		case (1):
			JOptionPane.showMessageDialog(null,"Você gosta do 1 :)");
		break;
		case (2):
			JOptionPane.showMessageDialog(null,"Você gosta do 2 :)");
		break;
		case (3):
			JOptionPane.showMessageDialog(null,"Você gosta do 3 :)");
		break;
		default:
			JOptionPane.showMessageDialog(null,"Eu disse de 1 a 3 ;-;");
		break;
		}
		
	}
}
