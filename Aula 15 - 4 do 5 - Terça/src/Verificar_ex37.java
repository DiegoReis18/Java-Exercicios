import javax.swing.JOptionPane;

public class Verificar_ex37 extends Estudante_ex37{
	public String Exibir(String nome) {
		boolean oi = false;
		String situa��o = "";
		double result=0,nota1=0,nota2=0;
		for(int i=0;i<5;i++) {
			String a = Nomes[i];
		
			if(nome.equals(a)) {
			
				oi = true;
				result = Result[i];
				nota1=notas[i][0];
				nota2=notas[i][1];
				i=10;
			
			}else {
				oi = false;
			
			}
		}
		if(oi==true) {
			JOptionPane.showMessageDialog(null,nome+" encontrado");
			if(result>=7&&result<=10) {
				situa��o = "Aprovado";
			}else if(result>=3&&result<7) {
				situa��o = "Exame";
			}else if(result<3&&result>=0) {
				situa��o = "Reprovado";
			}
		JOptionPane.showMessageDialog(null,"Nome do aluno: "+nome+"\nNota 1: "+nota1+"\nNota 2: "+nota2+"\nM�dia: "+result+"\nSitua��o: "+situa��o);
		}else if(oi==false) {
			JOptionPane.showMessageDialog(null,nome+" n�o encontrado");
			situa��o = "ERRO";
		}
		return situa��o;
	}
	public String Exame(String nome, double exame) {
		boolean oi = false;
		String situa��o = "";
		double result=0;
		for(int i=0;i<5;i++) { 
			if(nome.equals(Nomes[i])) {
				oi = true;
				result = Result[i];
				i=10;
			}else {
				oi = false;
			}
		}
		double media = (result+exame)/2;
		if(oi==true) {
			JOptionPane.showMessageDialog(null,nome+" encontrado");
			if(media>=5) {
				situa��o = "Aprovado";
			}else if(media<5) {
				situa��o = "Reprovado";
			}
		JOptionPane.showMessageDialog(null,"Nome do aluno: "+nome+"\nNota do exame: "+exame+"\nM�dia final: "+media+"\nSitua��o: "+situa��o);
		}else if(oi==false) {
			JOptionPane.showMessageDialog(null,nome+" n�o encontrado");
			situa��o = "ERRO";
		}
		return situa��o;
	}
	public static void main(String args[]) {
		Verificar_ex37 a = new Verificar_ex37();
		int aux=2;
		String situa��o = "ERRO",nome="";
		while(aux!=0) {
			a.Entrada();
			a.Calculo();
			while (situa��o.equals("ERRO")||aux!=1||aux!=0) {
			nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno analisado");
			situa��o = a.Exibir(nome);
			
			if(situa��o.equals("Exame")){
				double exame = Double.parseDouble(JOptionPane.showInputDialog(null,"Voc� est� de exame.\n\nDigite a nota de exame de "+nome));
				a.Exame(nome,exame);
			}
		aux = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para finalizar o programa\nDigite 1 para colocar novos nomes e notas"));
			}
		}
	}
}
