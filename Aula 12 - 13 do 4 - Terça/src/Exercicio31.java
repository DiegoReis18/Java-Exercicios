//Construtor - instância necessáriaaa
import javax.swing.JOptionPane;
public class Exercicio31 {
	static int forma = 1;
	static float x,y,z;
	public Exercicio31() {
		forma = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma geométrica\n1- Quadrado\n2- Retângulo\n3- Cubo\n\nDigite outro valor caso queira encerrar o programa."));
		switch(forma){
			case 1:
				x =  Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
				break;
			case 2:
				x =  Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura do retângulo"));
				y =  Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do comprimento do retângulo"));
				break;
			case 3:
				x = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado do cubo"));
				y = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do segundo lado do cubo"));
				z = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do terceiro lado do cubo"));
				break;
			default:
				JOptionPane.showMessageDialog(null,"FIM");
				System.exit(0);
				break;
				
				
		}
			
	}
	public static float quadrado(float lado) {
		return lado*lado;
	}
	public static float retangulo(float lado1,float lado2) {
		return lado1*lado2;
	}
	public static float cubo(float lado1,float lado2,float lado3) {
		return lado1*lado2*lado3;
	}
	public static void mostrar(float resp,int forma) {
		String nome = "";
		if (forma==1){
			nome = "Quadrado";
		}else if (forma==2){
			nome = "Retângulo";
		}else if (forma==3) {
			nome = "Cubo";
		}else {
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null,"Forma: "+nome+"\nÁrea: "+resp);
	}
	public static void main(String args[]) {
		float resp;
		resp=0;
		while(forma>0 && forma<4) {
		Exercicio31 a = new Exercicio31();
		switch(forma){
			case 1:
				resp = quadrado(x);
				break;
			case 2:
				resp = retangulo(x,y);
				break;
			case 3:
				resp = cubo(x,y,z);
				break;
		}
		mostrar(resp,forma);
		}
		
		
	}
}
