//Classe para instanciar e testar o construtor
import javax.swing.JOptionPane;
public class TesteConstrutor {
	public static void main(String args[]) {
		Construtor x = new Construtor();
		JOptionPane.showMessageDialog(null,x.nome);
		System.out.println(x.nome);
		
		Construtor x2 = new Construtor("oi","nha"); //Esse construtor possui parâmetros, damos o valor deles aqui dentro
		JOptionPane.showMessageDialog(null,x2.seila+x2.nome);
	}
}
