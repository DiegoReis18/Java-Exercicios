import javax.swing.JOptionPane;
public class Exercicio17 {
	public static void main(String args[]) {
		int pessoas,idade,idmaior,idmenor,idmedia;
		idmaior=0;
		idmenor=100;
		idmedia=0;
		pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas."));
		for(int i=0;i<pessoas;i++) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa analisada."));
			if (idade>idmaior) {
				idmaior = idade;
			}if (idade<idmenor) {
				idmenor = idade;
			}
			idmedia = idmedia+idade;
		}
		idmedia = idmedia/pessoas;
		JOptionPane.showMessageDialog(null,"Número de pessoas: "+pessoas+"\nMaior idade: "+idmaior+"\nMenor idade: "+idmenor+"\nMédia das idades: "+idmedia);
	}
}
