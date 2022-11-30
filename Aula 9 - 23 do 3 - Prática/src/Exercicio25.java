// Mostra o vetor digitado e a raiz quadrada do número
import javax.swing.JOptionPane;
public class Exercicio25 {
	 public static void main(String args[]) {
		 double Numeros[] = new double[8];
		 double Raiz[] = new double[8];
	
		 
		 for(int i=0;i<8;i++) {
			 Numeros[i] =  Double.parseDouble(JOptionPane.showInputDialog("Digite o número "+(i+1)));
		 }
		 for(int i=0;i<8;i++) {
			 Raiz[i] = Math.sqrt(Numeros[i]);
		 }
		 for(int i=0;i<8;i++) {
			 JOptionPane.showMessageDialog(null,"Numero "+(i+1)+": "+Numeros[i]+"\nRaiz "+(i+1)+": "+Raiz[i]);
		 }
	 }
}