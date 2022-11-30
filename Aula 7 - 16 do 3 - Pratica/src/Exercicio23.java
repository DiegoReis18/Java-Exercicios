import javax.swing.JOptionPane;
public class Exercicio23 {
	public static void main(String args[]) {
		int codigo,qt,tamanho;
		double valor;
	    valor=0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do tênis:\n 1001- Adidas \n1002- Nike\n1003- Puma\n1005- Rainha\n1008- Olympikus"));
		
		switch(codigo)
		{
			case 1001:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho?"));
				if(tamanho>=37 && tamanho<=39) {
					valor = 183*qt;
				}else if(tamanho>=40 && tamanho<=41) {
					valor = 199.60*qt;
				}else if(tamanho>=42 && tamanho<=46) {
					valor = 228.30*qt;
				}else {
					JOptionPane.showMessageDialog(null,"ERRORRR.");
				}
				break;
			case 1002:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho?"));
				if(tamanho>=36 && tamanho<=38) {
					valor = 256.50*qt;
				}else if(tamanho>=39 && tamanho<=42) {
					valor = 299.20*qt;
				}else if(tamanho>=43 && tamanho<=48) {
					valor = 335*qt;
				}else {
					JOptionPane.showMessageDialog(null,"ERRORRR.");
				}
				break;
			case 1003:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho?"));
				if(tamanho>=32 && tamanho<=36) {
					valor = 149.20*qt;
				}else if(tamanho>=37 && tamanho<=39) {
					valor = 176.80*qt;
				}else if(tamanho>=40 && tamanho<=42) {
					valor = 225.70*qt;
				}else {
					JOptionPane.showMessageDialog(null,"ERRORRR.");
				}
				break;
			case 1005:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho?"));
				if(tamanho>=31 && tamanho<=36) {
					valor = 164*qt;
				}else if(tamanho>=37 && tamanho<=40) {
					valor = 192.50*qt;
				}else if(tamanho>=41 && tamanho<=44) {
					valor = 225.40*qt;
				}else {
					JOptionPane.showMessageDialog(null,"ERRORRR.");
				}
				break;
			case 1008:
				qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho?"));
				if(tamanho>=37 && tamanho<=39) {
					valor = 225*qt;
				}else if(tamanho>=40 && tamanho<=42) {
					valor = 248.20*qt;
				}else if(tamanho>=43 && tamanho<=448) {
					valor = 260*qt;
				}else {
					JOptionPane.showMessageDialog(null,"ERRORRR.");
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"ERRORRR.");
				break;
		}
		JOptionPane.showMessageDialog(null,"Você deverá pagar "+valor+" reais");
	}
}
