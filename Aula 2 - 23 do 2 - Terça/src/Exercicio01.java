import javax.swing.JOptionPane;
public class Exercicio01 {
	public static void main(String args[]) {
		float n1,n2,n3,media;
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua terceira nota"));
		media = (n1+n2+n3)/3;
		JOptionPane.showMessageDialog(null,"Sua primeira nota: "+n1+"\nSua segunda nota: "+n2+"\nSua terceira nota: "+n3+"\n\nSua média final: "+media);
		
	}
}
