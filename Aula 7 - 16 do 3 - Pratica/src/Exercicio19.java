import javax.swing.JOptionPane;
public class Exercicio19 {
	public static void main(String args[]) {
		int veiculos;
		float pc,pv,pcm,pvm,lucro,total;
		pcm=0;
		pvm=0;
		veiculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de veiculos vendidos."));
		for (int i=1;i<=veiculos;i++) {
			pc = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo do veiculo "+i));
			pv = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo do veiculo "+i));
			lucro = pv-pc;
			pcm = pc+pcm;
			pvm = pvm+pv;
			if(lucro>0) {
				JOptionPane.showMessageDialog(null,"O veiculo "+i+" gerou o lucro de "+lucro+" reais");
			}else if(lucro<=0) {
				JOptionPane.showMessageDialog(null,"O veiculo "+i+" gerou o prejuizo de "+lucro+" reais");
			}
		}
		if (pcm>=pvm) {
			total = pcm-pvm;
			JOptionPane.showMessageDialog(null,"A confessionária teve o prejuizo de "+total+" reais");
		}else if (pvm>pcm) {
			total = pvm-pcm;
			JOptionPane.showMessageDialog(null,"A confessionária teve o lucro de "+total+" reais");
		}
	}
}
