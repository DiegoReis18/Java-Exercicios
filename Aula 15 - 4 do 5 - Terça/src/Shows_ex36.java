import javax.swing.JOptionPane;

public class Shows_ex36 {
	static String nome_do_show;
	static double pre�o;
	public void Entrada() {
		nome_do_show = JOptionPane.showInputDialog(null,"Digite o nome do Show");
		pre�o = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o pre�o do ingresso"));
	}
	public void Exibir() {
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPre�o do ingresso: "+pre�o);
	}
	public void Exibir(double porcentagem) { //falta coisas
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPercentual de aumento no pre�o: "+porcentagem+"%");
	}
	public void Exibir(double porcentagem,String tipo) {
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPercentual de aumento no pre�o: "+porcentagem+"%\nTipo de ingresso: "+tipo);
	}
}
