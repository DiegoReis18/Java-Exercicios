import javax.swing.JOptionPane;

public class Exercicio33Carro extends Exercicio33Veiculos{
	int numportas;
	public Exercicio33Carro(){
		numportas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas"));
	}
}
