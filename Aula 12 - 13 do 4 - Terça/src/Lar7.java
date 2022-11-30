//CONSTRUTOR apenas
import javax.swing.JOptionPane;
public class Lar7 {
	static int area_calculada;
	static double area_calculada1;
	public Lar7(int lado) {
		area_calculada = lado*lado;
	}
	public Lar7(int base,int altura) {
		area_calculada = base*altura;
	}
	public Lar7(double diagonalMaior,double diagonalMenor) {
		area_calculada1 = (diagonalMaior*diagonalMenor)/2;
	}
	public Lar7(int maior,int menor,int altura) {
		area_calculada = (maior+menor)/2*altura;
	}
	public Lar7(double raio) {
		area_calculada1 = 3.14*(raio*raio);
	}
}
