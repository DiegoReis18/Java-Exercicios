// Sobrecarga de m�todos � mais de um m�todo com o mesmo nome, por�m com o par�metro diferente
// Polimorfismo de m�todo
import javax.swing.JOptionPane;
public class Sobrecarga {
	public static void main(String args[]) {
		Sobrecarga x = new Sobrecarga();
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da sua m�e"));
		
		if (a<=10) {
			x.idade(a);
		}else if (a>=11 && a<=18) {
			x.idade();
		}else if (a>18) {
			x.idade(a,b);
		}
	}
	public void idade(int a) {
		JOptionPane.showMessageDialog(null,"Voc� � uma crian�a com idade "+a);
	}
	public void idade() {
		JOptionPane.showMessageDialog(null,"Voc� � um adolescente");
	}
	public void idade(int a,int b) {
		JOptionPane.showMessageDialog(null,"Voc� e a sua m�e uhu com idade "+a+" e "+b);
	}
	
	
	
	
	
}