//Construtor é um método inicial que possui o mesmo nome da classe
//Ele serve para definir configurações iniciais de um programa
import javax.swing.JOptionPane;
public class Construtor extends Auxiliar {
	String nome, seila;
	
	
	public Construtor() {
		nome = "S/N";
	}
	public Construtor(String a, String b) { //Construtor com 2 parâmetros para preencher o atributo
		nome = a;
		seila = b;
	}
}
