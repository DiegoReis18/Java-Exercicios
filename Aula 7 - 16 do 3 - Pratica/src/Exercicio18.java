import javax.swing.JOptionPane;
public class Exercicio18 {
	public static void main(String args[]) {
		int numerost;
		double valor,quadrado,cubo;
		numerost = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de número que serão digitado."));
		for(int i=0;i<numerost;i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
			quadrado = Math.pow(valor,2);
			cubo = Math.pow(valor,3);
			JOptionPane.showMessageDialog(null,"Número Digitado: "+valor+"\nQuadrado: "+quadrado+"\nCubo: "+cubo);
		}
	}
}
