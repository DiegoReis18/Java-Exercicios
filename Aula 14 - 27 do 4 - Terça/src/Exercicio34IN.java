import javax.swing.JOptionPane;

public class Exercicio34IN {
public	static void main(String[] args) {
	try {
	double valor = 1;
	String res = "não";
	Exercicio34 a = new Exercicio34();
	while(valor!=0) {
	valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Adivinhe um dos valores do vetor (entre 1 e 100)\nDigite 0 para finalizar"));
	res = a.pesquisa(valor);
	if(res.equals("Sim")) {
		JOptionPane.showMessageDialog(null,"O valor "+valor+" está no vetor","Acertouuu",JOptionPane.INFORMATION_MESSAGE);
	}
	}
	}catch(Exception e3) {
		JOptionPane.showMessageDialog(null,"ERRO");

	}
	
	
		
	
		
	
}
}
