import javax.swing.JOptionPane;
public class Exercicio13 {
	public static void main(String args[]) {
		int op1,op2;
		float res;
		String operacao;
		op1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o operando 1"));
		op2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o operando 2 (deve ser menor do que o 1)"));
		operacao = JOptionPane.showInputDialog("Digite o operando:\n + para soma dos operandos\n - para subtração do operando 1 pelo operando 2\n * operando 1 vezes operando 2\n / operando 1 dividido pelo operando 2\n FIM - encerrar o programa");
		//equals
		if (operacao.equals("+")) {
			res = op1+op2;
			JOptionPane.showMessageDialog(null,"O resultado da soma é: "+res);
		}else if (operacao.equals("-")) {
			res = op1-op2;
			JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+res);
		}else if (operacao.equals("*")) {
			res = op1*op2;
			JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+res);
		}else if (operacao.equals("/")) {
			res = op1/op2;
			JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+res);
		}else if (operacao.equals("FIM")) {
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null,"ERRORRR");
		}
	}
}
