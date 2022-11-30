import javax.swing.JOptionPane;

public class Passaro extends Animal{
	String alimento,som;
	public void incluir() {
		alimento = JOptionPane.showInputDialog(null,"Qual alimento seu passaro come?");
		som = JOptionPane.showInputDialog(null,"Qual o som emitido pelo seu passaro?");
	}
}
