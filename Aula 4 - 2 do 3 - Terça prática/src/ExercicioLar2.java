import javax.swing.JOptionPane;
public class ExercicioLar2 {
	public static void main(String args[]) {
		int n;
		String me = JOptionPane.showInputDialog("Digite o n�mero correspondente ao dia da semana.\n1-Domingo\n2-Segunda\n3-Ter�a\n4-Quarta\n5-Quinta\n6-Sexta\n7-S�bado");
		n = Integer.parseInt(me);
		if(n==1) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Domingo");
		}else if (n==2) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Segunda-Feira");	
		}else if (n==3) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Ter�a-Feira");
		}else if (n==4) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Quarta-Feira");
		}else if (n==5) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Quinta-Feira");
		}else if (n==6) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: Sexta-Feira");
		}else if (n==7) {
		JOptionPane.showMessageDialog(null,"N�mero digitado: "+n+"\nDia da semana: S�bado");
		}else {
			JOptionPane.showMessageDialog(null,"ERRORRR");
		}
		
	}
}
