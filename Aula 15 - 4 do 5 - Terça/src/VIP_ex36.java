import javax.swing.JOptionPane;

public class VIP_ex36 extends Shows_ex36{
	double Acresc;
	public void Entrada() {
		Acresc = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o percentual de acr�scimo"));
	}
	public void mostra() {
		Exibir(Acresc);
	}
}
