
import javax.swing.JOptionPane;
public class Exercicio32COMPLEXO {
	static double nota1,nota2,conceito;
	static String avaliacao,tipo;
	public Exercicio32COMPLEXO(){
		tipo = JOptionPane.showInputDialog("Digite o tipo do curso");
		if (tipo.equals("segundo grau")||tipo.equals("Segundo grau")) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			conceito = Double.parseDouble(JOptionPane.showInputDialog("Digite o conceito"));
		}else if(tipo.equals("superior")||tipo.equals("Superior")) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		}else if(tipo.equals("mestrado")||tipo.equals("Mestrado")) {
			avaliacao = JOptionPane.showInputDialog("Digite a avaliação");	
		}
	}
	public static String Avaliar(double nota1,double nota2,double conceito) {
		String situacao;
		double media;
		media = (nota1+nota2)/2+conceito;
		if (media>=5) {
			situacao = "Aprovado uhu";
			return situacao;
		}else {
			situacao = "Reprovado ;-;";
			return situacao;
		}
		
	}
	public static String Avaliar(double nota1,double nota2) {
		String situacao;
		double media;
		media = (nota1+nota2)/2;
		if (media>=7) {
			situacao = "Aprovado uhu";
			return situacao;
		}else if(media>=3){
			situacao = "Exame, confiaaa que ainda dá '-'";
			return situacao;
		}else {
			situacao = "Reprovado ;-;";
			return situacao;
		}
	}
	public static String Avaliar(String avaliacao) {
		String situacao;
		if (avaliacao.equals("A")||avaliacao.equals("B")||avaliacao.equals("C")) {
			situacao = "Aprovado uhu";
			return situacao;
		}else {
			situacao = "Reprovado ;-;";
			return situacao;
		}
	}
	public static void Mostrar(double nota1,double nota2,double conceito,String situacao) {
		JOptionPane.showMessageDialog(null,"1ª Nota: "+nota1+"\n2ª Nota: "+nota2+"\nConceito: "+conceito+"\n\nSituação: "+situacao);
	}
	public static void Mostrar(double nota1,double nota2,String situacao) {
		JOptionPane.showMessageDialog(null,"1ª Nota: "+nota1+"\n2ª Nota: "+nota2+"\n\nSituação: "+situacao);
	}
	public static void Mostrar(String avaliacao,String situacao) {
		JOptionPane.showMessageDialog(null,"Avaliação: "+avaliacao+"\n\nSituação: "+situacao);
	}
	public static void main(String args[]) {
		int aux = 1;
		String situacao;
		while(aux==1) {
			Exercicio32COMPLEXO a = new Exercicio32COMPLEXO();
			if (tipo.equals("segundo grau")||tipo.equals("Segundo grau")) {
				situacao = Avaliar(nota1,nota2,conceito);
				Mostrar(nota1,nota2,conceito,situacao);
			}else if(tipo.equals("superior")||tipo.equals("Superior")) {
				situacao = Avaliar(nota1,nota2);
				Mostrar(nota1,nota2,situacao);
			}else if(tipo.equals("mestrado")||tipo.equals("Mestrado")) {
				situacao = Avaliar(avaliacao);
				Mostrar(avaliacao,situacao);
			}
			aux = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 caso queira um replay"));
				
			}
		System.exit(0);
		}
		}

