import javax.swing.JOptionPane;

public class ExercicioLar1 {
	
	public static void main(String args[]) {
	String frase;
	frase = JOptionPane.showInputDialog("Digite a frase");
	String frasenova = new StringBuilder(frase).reverse().toString();
	String finaluhu = frasenova.toUpperCase();
	JOptionPane.showMessageDialog(null,finaluhu);
}
}