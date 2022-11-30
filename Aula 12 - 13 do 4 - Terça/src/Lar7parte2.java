import javax.swing.JOptionPane;

//Ligado com o Lar7
public class Lar7parte2 {
	static double w,k;
	static int x,y,z;
	public Lar7parte2(int figura){
		switch(figura) {
		case 1:
			x =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
			break;
		case 2:
			x =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
			y =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
			break;
		case 3:
			w =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior"));
			k =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor"));
			break;
		case 4:
			x =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base maior"));
			y =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base menor"));
			z =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
			break;
		case 5:
			w =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
			break;
		default:
			JOptionPane.showMessageDialog(null,"FIM");
			System.exit(0);
			break;

			
		}
		
	}
	public static void exibir(int lado,int area) {
		JOptionPane.showMessageDialog(null,"Forma: Quadrado\nLado: "+lado+"\nÁrea: "+area);
	}
	public static void exibir(int base,int altura,int area) {
		JOptionPane.showMessageDialog(null,"Forma: Retângulo\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);
	}
	public static void exibir(double maior,double menor,double area) {
		JOptionPane.showMessageDialog(null,"Forma: Losango\nDiagonal Maior: "+maior+"\nDiagonal Menor: "+menor+"\nÁrea: "+area);
	}
	public static void exibir(int maior,int menor,int altura,int area) {
		JOptionPane.showMessageDialog(null,"Forma: Trapézio\nBase Maior: "+maior+"\nBase Menor: "+menor+"\nAltura: "+altura+"\nÁrea: "+area);
	}
	public static void exibir(double raio,double area) {
		JOptionPane.showMessageDialog(null,"Forma: Circulo\nRaio: "+raio+"\nÁrea: "+area);
	}
	
	public static void main(String args[]) {
		int comando = 1;
		while(comando>0 && comando<6) {
		comando = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma geométrica que você quer saber o valor da área\n1- Quadrado\n2- Retângulo\n3- Losango\n4- Trapézio\n5- Circulo\n\nDigite outro valor caso queira encerrar o programa."));
		Lar7parte2 a = new Lar7parte2(comando);
		switch(comando){
		case 1:
			Lar7 a1 = new Lar7(x);
			exibir(x,a1.area_calculada);
			break;
		case 2:
			Lar7 a2 = new Lar7(x,y);
			exibir(x,y,a2.area_calculada);
			break;
		case 3:
			Lar7 a3 = new Lar7(w,k);
			exibir(w,k,a3.area_calculada1);
			break;
		case 4:
			Lar7 a4 = new Lar7(x,y,z);
			exibir(x,y,z,a4.area_calculada);
			break;
		case 5:
			Lar7 a5 = new Lar7(w);
			exibir(w,a5.area_calculada1);
			break;
		default:
			System.exit(0);
			break;

	}
	}
	}
}
