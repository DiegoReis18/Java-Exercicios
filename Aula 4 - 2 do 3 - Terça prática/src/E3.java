import javax.swing.JOptionPane;//Exercicio do slide LLPOO 3
public class E3 {
	public static void main(String args[]) {
		float a,b,c;
		a = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado A do triangulo"));
		b = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado B do triangulo"));
		c = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado C do triangulo"));
		if (a==b && b==c && a==c) {
			JOptionPane.showMessageDialog(null,"Esse � um tri�ngulo equil�tero","Qual tri�ngulo �?",JOptionPane.INFORMATION_MESSAGE);
		}else if(a==b && b!=c || b==c && a!=c || a==c && b!=a){
			JOptionPane.showMessageDialog(null,"Esse � um tri�ngulo is�celes","Qual tri�ngulo �?",JOptionPane.INFORMATION_MESSAGE);
		}else if(a!=b && b!=c && a!=c){
			JOptionPane.showMessageDialog(null,"Esse � um tri�ngulo escaleno","Qual tri�ngulo �?",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
