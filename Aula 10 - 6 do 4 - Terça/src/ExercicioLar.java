//Socio
import javax.swing.JOptionPane;
public class ExercicioLar {
	static String NomeSocio, TelContato;
	static Double IdadeSocio;
	static int IdentSocio ;
	
	public static void leitura() {
		NomeSocio = JOptionPane.showInputDialog("Digite o nome do s�cio");
		IdentSocio = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do s�cio"));
		IdadeSocio = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do s�cio"));
		TelContato = JOptionPane.showInputDialog("Digite o telefone do s�cio");
		
	}
	
}
