import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String args[]) {
		float n1,n2,n3,media;
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua terceira nota"));
		media = (n1+n2+n3)/3;
		JOptionPane.showMessageDialog(null,"Sua primeira nota: "+n1+"\nSua segunda nota: "+n2+"\nSua terceira nota: "+n3+"\n\nSua média final: "+media);
		if (media==10) {
			JOptionPane.showMessageDialog(null,"Melhor da salaa");
		}else if(media>=6 && media<10){
			JOptionPane.showMessageDialog(null,"Passouuu uhu");
		}else if (media<6 && media>0) {
			JOptionPane.showMessageDialog(null,"Reprovado ;-;");
		}else if (media==0) {
			JOptionPane.showMessageDialog(null,"Amada??? sério??");
		}else if (media<0 || media>10) {
			JOptionPane.showMessageDialog(null,"Que nota estranha ^^");
		}else {
			JOptionPane.showMessageDialog(null,"ERRORRR");
		}
		
	}
}


