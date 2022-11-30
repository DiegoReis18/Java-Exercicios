import javax.swing.JOptionPane;

public class Elevador {
	int AndarAtual, Total, Capacidade,Pessoas;
	public void Ligar(int capacidade, int total) {
		total = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos andares o prédio possui"));
		Total = total;
		capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Capacidade total de pessoas no elevador"));
		Capacidade = capacidade;
		
	}
	public int Entrar(int pessoas,int capacidade) {
		pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas pessoas entraram no elevador"));
		if(pessoas>capacidade) {
			pessoas = pessoas-capacidade;
			JOptionPane.showInputDialog(null, "Havia mais pessoas do que o suportado pelo elevador\nEntraram apenas "+pessoas+" pessoas","Elevador cheio!!",JOptionPane.WARNING_MESSAGE);
		}
		return pessoas;
	}
}
