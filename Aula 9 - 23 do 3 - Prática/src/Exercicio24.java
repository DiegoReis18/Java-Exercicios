// Indicando o maior n�mero do vetor
import javax.swing.JOptionPane;
public class Exercicio24 {
	 public static void main(String args[]) {
		 int Numeros[] = new int[5];
		 int aux;
		 int maior = -999;
		 int posi��o = 0;
		 
		 for(int i=0;i<5;i++) {
			 Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero "+(i+1)));
			 
		 }
		 for(int i=0;i<5;i++) {
			 JOptionPane.showMessageDialog(null,"N�mero "+(i+1)+": "+Numeros[i], "Maior", JOptionPane.INFORMATION_MESSAGE);
				
			 
		 }
		 for(int i=0;i<5;i++) {
			 
				 if (Numeros[i] > maior) {
					 maior = Numeros[i];
					 posi��o = i+1;
					 
				 }
			
		 }
			 JOptionPane.showMessageDialog(null,"O maior n�mero � o "+maior+"\n Posi��o = "+posi��o, "Maior", JOptionPane.INFORMATION_MESSAGE);
			
		
	 }
}
