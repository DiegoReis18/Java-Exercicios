import javax.swing.JOptionPane;

public class Exercicio33EXE {
public static void main (String args[]) {
	String Tipo;
	double me = 0;
	int me2 = 0;
	int aux = 1;
	while(aux==1) {
	Tipo = JOptionPane.showInputDialog("Digite o tipo do veiculo");
		if(Tipo.equals("Carro")||Tipo.equals("carro")) {
			Exercicio33Carro a = new Exercicio33Carro();
			a.Mostrar(Tipo,a.numportas,me);
		}else if(Tipo.equals("Caminhão")||Tipo.equals("caminhão")) {
			Exercicio33Caminhao b = new Exercicio33Caminhao();
			b.Mostrar(Tipo,me2,b.tonel);
		}else if(Tipo.equals("Moto")||Tipo.equals("moto")) {
			Exercicio33Moto c = new Exercicio33Moto();
			c.Mostrar(Tipo,c.cilind,me);
		}
		aux = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 caso queira um replay"));
	}
	System.exit(0);
}
}
