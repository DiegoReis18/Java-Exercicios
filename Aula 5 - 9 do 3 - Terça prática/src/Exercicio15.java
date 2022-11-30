import javax.swing.JOptionPane;
public class Exercicio15 {
	public static void main(String args[]) {
		double salario,salariom,maiorsalario;
		int filhos,filhosm,pessoas,salariop;
		filhosm=0;
		salario=1;
		salariom=0;
		salariop=0;
		maiorsalario=0;
		pessoas=0;
		while(salario!=0) {
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário"));
		filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você possui?"));
		filhosm = filhosm+filhos;
		salariom = salariom+salario;
		if(salario>maiorsalario) {
			maiorsalario=salario;
		}
		if(salario<=1250) {
			salariop++;
		}
		pessoas++;	
		}
		pessoas = pessoas-1;
		filhosm = filhosm/pessoas;
		salariom = salariom/pessoas;
		
	}
}
