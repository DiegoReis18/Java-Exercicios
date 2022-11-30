//Atividades
import javax.swing.JOptionPane;
public class Atividades_Lar {
	static String Aparelho;
	static String Nivel;
	static double Tempo;
	
	public static void leitura(int vezes) {
		Aparelho = JOptionPane.showInputDialog("Digite o nome do aparelho");
		Nivel = JOptionPane.showInputDialog("Digite o nivel do aparelho (A,B,C)");
		Tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo"));
	
	}
	public static void exibir(String nome,int id,String Telefone,Double idade) {
		JOptionPane.showMessageDialog(null,"Identificação do sócio: "+id+"\nNome do sócio: "+nome+"\nTelefone: "+Telefone+"\nIdade: "+idade+"\n\nAparelho: "+Aparelho+"\nNivel: "+Nivel+"\nTempo: "+Tempo);
	}
}
