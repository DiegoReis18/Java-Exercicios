// Encapsulamento é a utilização de atributos privates e altera-los através de métodos.
// Auxilio do get e set.
import javax.swing.JOptionPane;

public class Encapsulamento {

	private String nome;
	
	
	public void setNome (String nhai) {
		
		this.nome = nhai;
		
	}
	
	public String getNome() {
		return nome;
	}
}
