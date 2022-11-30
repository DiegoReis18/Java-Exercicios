import javax.swing.JOptionPane;

public class Camarote_ex36 extends Shows_ex36{
	String tipo;
	double Acresc;
	public void Entrada() {
		tipo = JOptionPane.showInputDialog(null,"Digite o tipo do camarote (Superior ou Inferior)");
		Acresc = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o percentual de acréscimo"));
	}
	public void mostra() {
		Exibir(Acresc,tipo);
	}
}
