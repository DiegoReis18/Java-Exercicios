// Exercicio de ler a altura e o sexo de um grupo definido pelo usuário, logo depois apontar algumas informações
import javax.swing.JOptionPane;
public class Exercicio10 {
	public static void main(String args[]) {
		int pessoas,n,sexo,sexom,sexohomem,mulher;
		double altura,alturam,alturamedia;
		String sexofinal;
		alturamedia=0;
		n = 0;
		alturam=0;
		sexohomem=0;
		mulher=0;
		sexom=0;
		sexofinal="";
		pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas"));
		while(n<pessoas) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
			sexo =  Integer.parseInt(JOptionPane.showInputDialog("Digite o seu sexo.\n1-Masculino\n2-Feminino"));
			if(altura>alturam) {
				alturam = altura;
				sexom = sexo;
			}
			if(sexo==2) {
				alturamedia = altura+alturamedia;
				mulher = mulher+1;
			}
			if(sexo==1) {
				sexohomem = sexohomem+1;
			}
			
			n++;	
			}
		alturamedia = alturamedia/mulher;
		if(sexom==1) {
			sexofinal = "Homem";
		}else if(sexom==2) {
			sexofinal = "Mulher";
		}
		
		 JOptionPane.showMessageDialog(null, "Maior Altura do grupo: "+alturam+"\nMedia das alturas das mulheres: "+alturamedia+"\nNúmero de homens: "+sexohomem+"\nSexo da pessoa mais alta: "+sexofinal);
	}
}

