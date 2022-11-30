//Socio
import javax.swing.JOptionPane;
public class ExercicioLar {
	static String NomeSocio, TelContato;
	static Double IdadeSocio;
	static int IdentSocio ;
	
	public static void leitura() {
		NomeSocio = JOptionPane.showInputDialog("Digite o nome do sócio");
		IdentSocio = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do sócio"));
		IdadeSocio = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do sócio"));
		TelContato = JOptionPane.showInputDialog("Digite o telefone do sócio");
		
	}
	
}
