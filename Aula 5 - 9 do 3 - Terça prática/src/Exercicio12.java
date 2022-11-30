import javax.swing.JOptionPane;
public class Exercicio12 {
	public static void main(String args[]) {
	    int n1,n2,n1q,n1c,n1f,n2q,n2c,n2f;
	    n1f=1;
	    n2f=1;
	    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
	    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (deve ser maior do que o primeiro)"));
	    if(n1>n2) {
	    	JOptionPane.showMessageDialog(null,"Error");
	    	System.exit(0);
	    }
	    n1q = n1*n1;
	    n1c = n1*n1*n1;
	    for(int n = 1; n<=n1;n++) {
	    	n1f = n1f*n;
	    }
	    n2q = n2*n2;
	    n2c = n2*n2*n2;
	    for(int n = 1; n<=n2;n++) {
	    	n2f = n2f*n;
	    }
	    JOptionPane.showMessageDialog(null,"Número 1: "+n1+"\nQuadrado: "+n1q+"\nCubo: "+n1c+"\nFatorial: "+n1f);
	    JOptionPane.showMessageDialog(null,"Número 2: "+n2+"\nQuadrado: "+n2q+"\nCubo: "+n2c+"\nFatorial: "+n2f);
	}
}
