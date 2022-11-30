import javax.swing.JOptionPane;

public class Exercicio33Caminhao extends Exercicio33Veiculos{
	double tonel;
	public Exercicio33Caminhao(){
		tonel = Integer.parseInt(JOptionPane.showInputDialog("Digite as toneladas"));
	}
}
