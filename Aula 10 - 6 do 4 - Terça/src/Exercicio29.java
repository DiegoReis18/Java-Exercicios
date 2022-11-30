import javax.swing.JOptionPane;
public class Exercicio29 {
	static String nome,tipo,sexo;
	static Double idade;
	public static void leitura() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade"));
		sexo = JOptionPane.showInputDialog("Digite seu sexo - M ou F");
		
	}
	public static void mostrar() {
		JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo+"\nTipo: "+tipo);
	}

}
