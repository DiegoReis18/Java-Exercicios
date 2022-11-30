// Pede o nome e a idade de 10 pessoas, depois o usuário pergunta se tal nome está na lista.
import javax.swing.JOptionPane;
public class ExercicioLar {
	 public static void main(String args[]) {
		 String Nome[] = new String[10];
		 int Idade[] = new int[10];
		 ExercicioLar x = new ExercicioLar();
		 String aux = "";
		 String nome;
		 int me = 0;
		 
		 for(int i=0;i<10;i++) {
			 Nome[i] = JOptionPane.showInputDialog("Digite o nome "+(i+1));
			 Idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+Nome[i]));
		 }
		 while(! aux.equals("Fim")) {
			 me = 0;
			 nome = JOptionPane.showInputDialog("Digite um nome para ser analisado");
			 for(int i=0;i<10;i++) {
				 if (nome.equals(Nome[i])) {
					 JOptionPane.showMessageDialog(null,nome+" está na lista", "UHU", JOptionPane.INFORMATION_MESSAGE);
					 if(Idade[i] >= 18) {
						 x.Maior(nome,Idade[i]);
						 me = 1;
					 }else if(Idade[i] < 18) {
						 x.Menor(nome,Idade[i]);
						 me = 1;
					 }
					 }
				 }
			 if(me==0) {
				 JOptionPane.showMessageDialog(null,nome+" não está na lista", "NOPE", JOptionPane.INFORMATION_MESSAGE);
			 }
			 aux = JOptionPane.showInputDialog("Deseja procurar outro nome?? \n -Digite 'Continue' para continuar\n -Digite 'Fim' para finalizar"); 
		 }
	 }
	 
	public void Maior(String analise,int idd) {
		 JOptionPane.showMessageDialog(null,analise+" é maior de idade com "+idd+" anos", "BEBEDEIRAA", JOptionPane.INFORMATION_MESSAGE);
	}
	public void Menor(String analise,int idd) {
		 JOptionPane.showMessageDialog(null,analise+" é menor de idade com "+idd+" anos", "CRESCENDO <3", JOptionPane.INFORMATION_MESSAGE);
	}
}