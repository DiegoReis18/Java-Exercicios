import javax.swing.JOptionPane;

public class Cao extends Animal{
	String alimento,som;
	public void incluir() {
		alimento = JOptionPane.showInputDialog(null,"Qual alimento seu c�o come?");
		som = JOptionPane.showInputDialog(null,"Qual o som emitido pelo seu c�o?");
	}
}
