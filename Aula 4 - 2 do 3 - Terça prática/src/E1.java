import javax.swing.JOptionPane;//Exercicio do slide LLPOO 3
public class E1 {
	public static void main(String args[]) {
		int idade,ano;
		ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que ano voc� nasceu?"));
		idade = 2021-ano;
		if (idade<16) {
			JOptionPane.showMessageDialog(null,"Voc� tem "+idade+" anos.\nSomente maiores de 16 anos podem votar :/","Consegue votar??",JOptionPane.INFORMATION_MESSAGE);
		}else if (idade>=16 && idade<18){
			JOptionPane.showMessageDialog(null,"Voc� tem "+idade+" anos.\nPessoas entre 16 e 17 anos n�o s�o obrigados a votar, mas podem se quiserem","Consegue votar??",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (idade>=18) {
			JOptionPane.showMessageDialog(null,"Voc� tem "+idade+" anos.\nVoc� � obrigado a votar","Consegue votar??",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
