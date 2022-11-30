import javax.swing.JOptionPane;

public class Consulta_ex36 extends Shows_ex36{
	static String Ingresso;
	public static void main(String args[]) {
		int aux = 1;
		while(aux!=0) {
		Shows_ex36 a = new Shows_ex36();
		a.Entrada();
		Ingresso = JOptionPane.showInputDialog(null,"Digite o Tipo de ingresso\n- Normal\n- VIP\n- Camarote");
		if(Ingresso.equals("Normal")||Ingresso.equals("normal")) {
			Normal_ex36 b = new Normal_ex36();
			b.mostra();
		}else if(Ingresso.equals("VIP")||Ingresso.equals("vip")) {
			VIP_ex36 c = new VIP_ex36();
			c.Entrada();
			c.mostra();
		}else if(Ingresso.equals("Camarote")||Ingresso.equals("camarote")) {
			Camarote_ex36 d = new Camarote_ex36();
			d.Entrada();
			d.mostra();
		}else {
			JOptionPane.showMessageDialog(null,"ERRO");
		}
		aux = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para finalizar o programa"));
		}
	}
}
