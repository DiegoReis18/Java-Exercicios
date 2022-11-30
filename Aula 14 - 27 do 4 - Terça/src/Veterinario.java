import javax.swing.JOptionPane;

public class Veterinario {
	static int tipo = 1;
	public void mostrar(String nome,int tipo,int idade,String alimento,String som) {
		JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nTipo: "+tipo+"\nSom: "+som+"\nComida: "+alimento);
	}
	public static void main(String[] args) {
		try {
		Veterinario x = new Veterinario();
		while(tipo!=0) {
		tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o seu Animal de estimação?\n\n1-Cão\n2-Gato\n3-Passaro\n0-Finalizar Programa"));
		switch(tipo) {
		case 1:
			Cao cao = new Cao();
			cao.incluir();
			x.mostrar(cao.nome,tipo,cao.idade,cao.alimento,cao.som);
			break;
		case 2:
			Gato gato = new Gato();
			gato.incluir();
			x.mostrar(gato.nome,tipo,gato.idade,gato.alimento,gato.som);
			break;
		case 3:
			Passaro passaro = new Passaro();
			passaro.incluir();
			x.mostrar(passaro.nome,tipo,passaro.idade,passaro.alimento,passaro.som);
			break;
		case 0:
			JOptionPane.showMessageDialog(null,"Programa finalizado");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Escolha não correspondida");
			break;
		}
		}
		}catch(Exception e3) {
			JOptionPane.showMessageDialog(null,"Erro no programa");
		}
		
	}
}
