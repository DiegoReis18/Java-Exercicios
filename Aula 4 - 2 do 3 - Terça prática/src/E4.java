import javax.swing.JOptionPane;//Exercicio do slide LLPOO 3
public class E4 {
	public static void main(String args[]) {
		float n1,n2,n3,media;
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua terceira nota"));
		media = (n1+n2+n3)/3;
		
		if(media<3) {
			JOptionPane.showMessageDialog(null,"Sua m�dia final: "+media+"\nReprovado ;-;");
		}else if(media>3 && media<7){
			JOptionPane.showMessageDialog(null,"Sua m�dia final: "+media+"\nRecupera��o, boa sorte");
		}else if(media>=7 && media<=10) {
			JOptionPane.showMessageDialog(null,"Sua m�dia final: "+media+"\nAprovadoo uhuu");
		}else {
			JOptionPane.showMessageDialog(null,"ERRORRRR");
		}
		}
	}

