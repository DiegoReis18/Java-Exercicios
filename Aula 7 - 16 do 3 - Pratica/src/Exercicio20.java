import javax.swing.JOptionPane;
public class Exercicio20 {
	public static void main(String args[]) {
		int codigo;
		double salarioantigo,salarionovo, media;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do seu cargo"));
		salarioantigo = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário"));
		switch(codigo)
		{
			case 101:
				salarionovo = salarioantigo*1.05;
				break;
			case 102:
				salarionovo = salarioantigo*1.08;
				break;
			case 103:
				salarionovo = salarioantigo*1.10;
				break;
			default:
				salarionovo = salarioantigo*1.15;
				break;
		}
		media = salarionovo-salarioantigo;
		JOptionPane.showMessageDialog(null,"Antigo salário: "+salarioantigo+"\nNovo salário: "+salarionovo+"\nAumento: "+media);
	}
}
