import javax.swing.JOptionPane;
public class Exercicio30 {
	public static float calculo(float x, float y) {
		float resp = x;
		if(y==0) {
			return 1;
		}
		while(y>1) {
			resp = resp*x;
			y--;
		}
		return resp;
	}
	public static float leitura() {
		float num;
		num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
		return num;
	}
	public static void mostrar(float resposta) {
		JOptionPane.showMessageDialog(null,"o resultado da conta é "+resposta);
	}
	public static void main(String args[]) {
		float x,y,resp;
		
		int aux = 1;
		while(aux==1) {
			x =0;
			y=0;
			resp=0;
			x = leitura();
			if(x==0) {
				System.exit(0);
			}
			y = leitura();
			resp = calculo(x,y);
			mostrar(resp);
		}
		}
}
