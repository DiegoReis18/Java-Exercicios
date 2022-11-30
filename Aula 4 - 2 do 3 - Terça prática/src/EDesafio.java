import javax.swing.JOptionPane;
public class EDesafio {
	public static void main(String args[]) {
		int n1,n2,n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro número"));
	if(n1>n2 && n2>n3) {
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n1+" - "+n2+" - "+n3);
		//n1 - n2 - n3
	}else if(n2>n1 && n1>n3){
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n2+" - "+n1+" - "+n3);
		//n2 - n1 - n3
	}else if(n1>n3 && n3>n2) {
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n1+" - "+n3+" - "+n2);
		//n1 - n3 - n2
	}else if(n2>n3 && n3>n1) {
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n2+" - "+n3+" - "+n1);
		//n2 - n3 - n1
	}else if(n3>n1 && n1>n2) {
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n3+" - "+n1+" - "+n2);
		//n3 - n1 - n2
	}else if(n3>n2 && n2>n1) {
		JOptionPane.showMessageDialog(null,"Ordem crescente: "+n3+" - "+n2+" - "+n1);
		//n3 - n2 - n1
	}else {
		JOptionPane.showMessageDialog(null,"ERRORRR");
	}
	}
	
}
