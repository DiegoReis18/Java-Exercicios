// Ordena o vetor na ordem crescente
import javax.swing.JOptionPane;
public class Exercicio26 {
	 public static void main(String args[]) {
		 int Numeros[] = new int[8];
		 int iNum;
		
		 for(int i=0;i<8;i++) {
			 Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número "+(i+1)));
			 
		 }
		 for(int i=0; i < 8; i++) {
             for(int j=i+1; j < 8; j++)
             {
                if(Numeros[i] > Numeros[j])
                {
                   iNum = Numeros[i];                            
                   Numeros[i] = Numeros[j];
                   Numeros[j] = iNum;
             }   
          } 
		 }
		 for(int i=0;i<8;i++) {
			 JOptionPane.showMessageDialog(null,"Número "+(i+1)+": "+Numeros[i], "Crescente", JOptionPane.INFORMATION_MESSAGE);
			 
		 }
	 }
	 }