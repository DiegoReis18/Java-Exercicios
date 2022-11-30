import javax.swing.JOptionPane;

public class Gato extends Animal{
	String alimento,som;
	public void incluir() {
		alimento = JOptionPane.showInputDialog(null,"Qual alimento seu gato come?");
		som = JOptionPane.showInputDialog(null,"Qual o som emitido pelo seu gato?");
	}
}
