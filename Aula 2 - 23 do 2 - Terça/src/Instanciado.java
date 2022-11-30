import javax.swing.JOptionPane;
public class Instanciado {
	String nome;
	int idade;
	public static void main(String args[]) {
		Instanciado p1 = new Instanciado();
		Instanciado p2 = new Instanciado();
		Instanciado p3 = new Instanciado();
		p1.nome = JOptionPane.showInputDialog("Digite o nome 1");
		p1.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade 1"));
		p2.nome = JOptionPane.showInputDialog("Digite o nome 2");
		p2.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade 2"));
		p3.nome = JOptionPane.showInputDialog("Digite o nome 3");
		p3.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade 3"));
		JOptionPane.showMessageDialog(null,"Informações da pessoa 1: "+p1.nome+", "+p1.idade+" anos\nInformações da pessoa 2: "+p2.nome+", "+p2.idade+" anos\nInformações da pessoa 3: "+p3.nome+", "+p3.idade+" anos");
	}
}
