// Exercicio de usar metodos para pedir um número e outro para pedir a raiz
// Exemplo de atributo static no class
import javax.swing.JOptionPane;
public class Exercicio28 {
	static double num;
	static double raiz;
	public static double leitura() {
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		return num;
	}
	public static double raiz() {
		raiz = Math.sqrt(num);
		return raiz;
	}
	
	public static void main(String args[]) {
		
		num=1;
		while(num!=0) {
		leitura();
		raiz();
		JOptionPane.showMessageDialog(null,"Número digitado: "+num+"\nRaiz do número: "+raiz);
		}
	 }
}
