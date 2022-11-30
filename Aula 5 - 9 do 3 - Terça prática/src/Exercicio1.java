import javax.swing.JOptionPane;
public class Exercicio1 {
	public static void main(String args[]) {
		int maior,menor,valor,n;
		n = 0;
		menor = 10050;
		maior = 0;
		while(n<10) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero: "));
			if(valor==0) {
				 JOptionPane.showMessageDialog(null, "Digite um número diferente de 0");
			}
			else if(valor!=0) {
				if(valor<menor){
					menor = valor;
					 JOptionPane.showMessageDialog(null, "é o menor e "+n);
					
				}else if(valor>maior) {
					maior = valor;
					JOptionPane.showMessageDialog(null, "é o maior e "+n);
					
				}
			n++;	
			}
			
		}
		 JOptionPane.showMessageDialog(null, "Maior valor: "+maior+"\nMenor valor: "+menor);
	}
}
