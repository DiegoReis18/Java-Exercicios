import javax.swing.JOptionPane;//Exercicio do slide LLPOO 3
public class E2 {
	public static void main(String args[]) {
	String nome;
	int sexo;
	double altura,pif,pim;
	nome = JOptionPane.showInputDialog(null,"Digite seu nome");
	sexo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero correspondente ao seu sexo.\n1- Feminino\n2- Masculino"));
	altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura.\nUse ponto ao inv�s de virgula "));
	switch(sexo) {
	case 1:
		pif = (62.1*altura)-44.7;
		JOptionPane.showMessageDialog(null,"Seu peso ideal � "+pif,"Medidor de peso ideal",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 2:
		pim = (72.7*altura)-58;
		JOptionPane.showMessageDialog(null,"Seu peso ideal � "+pim,"Medidor de peso ideal",JOptionPane.INFORMATION_MESSAGE);
		break;
	}
	}
}
