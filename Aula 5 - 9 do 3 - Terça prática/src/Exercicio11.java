import javax.swing.JOptionPane;
public class Exercicio11 {
	public static void main(String args[]) {
	int pedido,n,pizza,chop,sobremesa;
	double conta = 0;
	double gorjeta = 0;
	pedido=1;
	pizza=0;
	chop=0;
	sobremesa=0;
	while(pedido!=0) {
		pedido = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu pedido!!\n1- Pizza (34 reais)\n3- Chopp (6 reais)\n8- Sobremesa (9 reais)\n0- Encerrar pedido"));
		switch(pedido) {
		case(1):
			pizza++;
			conta = conta+34;
			JOptionPane.showMessageDialog(null,"Pizza adicionada ao pedido!!");
			break;
		case(3):
			chop++;
			conta = conta+6;
			JOptionPane.showMessageDialog(null,"Chopp adicionado ao pedido!!");
			break;
		case(8):
			sobremesa++;
			conta = conta+9;
			JOptionPane.showMessageDialog(null,"Sobremesa adicionada ao pedido!!");
			break;
		case(0):
			gorjeta = conta*0.1;
		    conta = conta+gorjeta;
		    JOptionPane.showMessageDialog(null,"Fim da compra!!");
		    break;
		default:
			 JOptionPane.showMessageDialog(null,"Digite um número válido");
			 break;
		}
	}
	 JOptionPane.showMessageDialog(null, "Pizzas consumidas: "+pizza+"\nChopps consumidos: "+chop+"\nSobremesas consumidas: "+sobremesa+"\n\nValor total: "+conta);

	}
}
