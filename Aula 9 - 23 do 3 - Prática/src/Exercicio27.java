// Ordena o vetor na ordem crescente
import javax.swing.JOptionPane;
public class Exercicio27 {
	 public static void main(String args[]) {
	 String Nome[] = new String[15];
	 String ind = "";
	 String analise;
	 int aux = 0;
	 
	
	 for(int i=0;i<15;i++) {
		 Nome[i] = JOptionPane.showInputDialog("Digite o nome "+(i+1));
		 
	 }
	 while(! ind.equals("Fim")){
		 aux = 0;
		 analise = JOptionPane.showInputDialog("Procure um nome na lista");
		 
		 for(int i=0;i<15;i++) {
			 if (analise.equals(Nome[i])) {
				 JOptionPane.showMessageDialog(null,analise+" está na lista", "Crescente", JOptionPane.INFORMATION_MESSAGE);
				 aux = 1;
			 }
			 
		 }
		 if (aux == 0) {
			 JOptionPane.showMessageDialog(null,analise+" não está na lista", "Crescente", JOptionPane.INFORMATION_MESSAGE);
		 }
		 ind = JOptionPane.showInputDialog("Deseja procurar outro nome?? \n -Digite 'Continue' para continuar\n -Digite 'Fim' para finalizar");
	 }
	 }
	 }