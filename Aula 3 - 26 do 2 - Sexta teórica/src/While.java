import javax.swing.JOptionPane;
public class While {
		
	public static void main(String args[]) {
		int me = 0;
		while(me<5) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
		JOptionPane.showMessageDialog(null,"Voc� digitou "+num);
		me++;
		}//do... while tamb�m foi ensinado nessa aula.
		
		
	}
}
