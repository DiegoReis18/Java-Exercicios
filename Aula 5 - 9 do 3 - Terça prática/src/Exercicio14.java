import javax.swing.JOptionPane;
public class Exercicio14 {
	public static void main(String args[]) {
		int pessoas,idade,idadem;
		float peso,pesom;
		idadem = 0;
		pesom = 0;
		pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas"));
		while(pessoas!=0) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso"));
			if (idade>=40) {
				idadem = idadem+1;
				pesom = pesom+peso;
			}
			pessoas = pessoas-1;
		}
		pesom = pesom/idadem;
		JOptionPane.showMessageDialog(null,"a média do peso das "+idadem+" pessoas acima de 40 anos é: "+pesom);
	}
}
