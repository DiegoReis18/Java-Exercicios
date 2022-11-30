import javax.swing.JOptionPane;

public class Exercicio33Moto extends Exercicio33Veiculos{
	int cilind;
	public Exercicio33Moto(){
		cilind = Integer.parseInt(JOptionPane.showInputDialog("Digite as cilindradas"));
	}
}
