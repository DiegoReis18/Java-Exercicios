
import javax.swing.JOptionPane;
public class Exercicio22 {
	public static void main(String args[]) {
		int codigo,qt;
		double valor;
	    valor=0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de um lanche:\n 100- Cachorro Quente R$ 1.20 \n101-Bauru Simples R$ 1.30\n102-Bauru com ovo R$ 1.50\n103-Hambúrguer R$ 1.20\n104-CheeseBurguer R$ 1.30\n105-Refrigerante R$ 1.00"));
		
		switch(codigo)
		{
			case 100:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1.20*qt;
				break;
			case 101:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1.30*qt;
				break;
			case 102:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1.50*qt;
				break;
			case 103:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1.20*qt;
				break;
			case 104:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1.30*qt;
				break;
			case 105:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				valor = 1*qt;
				break;
			default:
				JOptionPane.showMessageDialog(null,"ERRORRR.");
				break;
		}
		JOptionPane.showMessageDialog(null,"Você deverá pagar "+valor+" reais");
	}
}