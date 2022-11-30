// Sobrecarga de métodos é mais de um método com o mesmo nome, porém com o parâmetro diferente
// Polimorfismo de método
import javax.swing.JOptionPane;
public class Sobrecarga {
	public static void main(String args[]) {
		Sobrecarga x = new Sobrecarga();
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da sua mãe"));
		
		if (a<=10) {
			x.idade(a);
		}else if (a>=11 && a<=18) {
			x.idade();
		}else if (a>18) {
			x.idade(a,b);
		}
	}
	public void idade(int a) {
		JOptionPane.showMessageDialog(null,"Você é uma criança com idade "+a);
	}
	public void idade() {
		JOptionPane.showMessageDialog(null,"Você é um adolescente");
	}
	public void idade(int a,int b) {
		JOptionPane.showMessageDialog(null,"Você e a sua mãe uhu com idade "+a+" e "+b);
	}
	
	
	
	
	
}