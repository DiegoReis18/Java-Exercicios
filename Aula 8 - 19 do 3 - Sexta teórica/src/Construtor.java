//Construtor � um m�todo inicial que possui o mesmo nome da classe
//Ele serve para definir configura��es iniciais de um programa
import javax.swing.JOptionPane;
public class Construtor extends Auxiliar {
	String nome, seila;
	
	
	public Construtor() {
		nome = "S/N";
	}
	public Construtor(String a, String b) { //Construtor com 2 par�metros para preencher o atributo
		nome = a;
		seila = b;
	}
}
