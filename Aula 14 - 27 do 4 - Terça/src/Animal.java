import javax.swing.JOptionPane;

public class Animal {
	String nome;
	int idade;
	public Animal() {
		nome = JOptionPane.showInputDialog(null,"Qual o nome do animal??");
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do animal"));
	}
}
