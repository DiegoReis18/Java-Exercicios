import javax.swing.JOptionPane;

public class Verificar_ex37 extends Estudante_ex37{
	public String Exibir(String nome) {
		boolean oi = false;
		String situação = "";
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
				situação = "Aprovado";
			}else if(result>=3&&result<7) {
				situação = "Exame";
			}else if(result<3&&result>=0) {
				situação = "Reprovado";
			}
		JOptionPane.showMessageDialog(null,"Nome do aluno: "+nome+"\nNota 1: "+nota1+"\nNota 2: "+nota2+"\nMédia: "+result+"\nSituação: "+situação);
		}else if(oi==false) {
			JOptionPane.showMessageDialog(null,nome+" não encontrado");
			situação = "ERRO";
		}
		return situação;
	}
	public String Exame(String nome, double exame) {
		boolean oi = false;
		String situação = "";
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
				situação = "Aprovado";
			}else if(media<5) {
				situação = "Reprovado";
			}
		JOptionPane.showMessageDialog(null,"Nome do aluno: "+nome+"\nNota do exame: "+exame+"\nMédia final: "+media+"\nSituação: "+situação);
		}else if(oi==false) {
			JOptionPane.showMessageDialog(null,nome+" não encontrado");
			situação = "ERRO";
		}
		return situação;
	}
	public static void main(String args[]) {
		Verificar_ex37 a = new Verificar_ex37();
		int aux=2;
		String situação = "ERRO",nome="";
		while(aux!=0) {
			a.Entrada();
			a.Calculo();
			while (situação.equals("ERRO")||aux!=1||aux!=0) {
			nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno analisado");
			situação = a.Exibir(nome);
			
			if(situação.equals("Exame")){
				double exame = Double.parseDouble(JOptionPane.showInputDialog(null,"Você está de exame.\n\nDigite a nota de exame de "+nome));
				a.Exame(nome,exame);
			}
		aux = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para finalizar o programa\nDigite 1 para colocar novos nomes e notas"));
			}
		}
	}
}
