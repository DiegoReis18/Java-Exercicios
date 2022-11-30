// Indicando o maior número do vetor
import javax.swing.JOptionPane;
public class Exercicio24 {
	 public static void main(String args[]) {
		 int Numeros[] = new int[5];
		 int aux;
		 int maior = -999;
		 int posição = 0;
		 
		 for(int i=0;i<5;i++) {
			 Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número "+(i+1)));
			 
		 }
		 for(int i=0;i<5;i++) {
			 JOptionPane.showMessageDialog(null,"Número "+(i+1)+": "+Numeros[i], "Maior", JOptionPane.INFORMATION_MESSAGE);
				
			 
		 }
		 for(int i=0;i<5;i++) {
			 
				 if (Numeros[i] > maior) {
					 maior = Numeros[i];
					 posição = i+1;
					 
				 }
			
		 }
			 JOptionPane.showMessageDialog(null,"O maior número é o "+maior+"\n Posição = "+posição, "Maior", JOptionPane.INFORMATION_MESSAGE);
			
		
	 }
}
