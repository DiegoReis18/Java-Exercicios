import javax.swing.JOptionPane;

public class Shows_ex36 {
	static String nome_do_show;
	static double preço;
	public void Entrada() {
		nome_do_show = JOptionPane.showInputDialog(null,"Digite o nome do Show");
		preço = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do ingresso"));
	}
	public void Exibir() {
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPreço do ingresso: "+preço);
	}
	public void Exibir(double porcentagem) { //falta coisas
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPercentual de aumento no preço: "+porcentagem+"%");
	}
	public void Exibir(double porcentagem,String tipo) {
		JOptionPane.showMessageDialog(null,"Nome do show: "+nome_do_show+"\nPercentual de aumento no preço: "+porcentagem+"%\nTipo de ingresso: "+tipo);
	}
}
