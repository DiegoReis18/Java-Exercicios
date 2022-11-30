import javax.swing.JOptionPane;

public class Estudante_ex37 {
	static String Nomes[] = new String[5];
	static double Result[] = new double[5];
	static double notas[][] = new double[5][2];
	public void Entrada() {
		for(int i=0;i<5;i++) {
			Nomes[i] = JOptionPane.showInputDialog(null,"O nome do aluno "+i);
			for(int j=0;j<2;j++) {
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota "+j+" do aluno "+Nomes[i]));
			}
		}
	}
	public void Calculo() {
		for(int i=0;i<5;i++) {   
				Result[i] = (notas[i][0]+notas[i][1])/2;
		}
	}
	public double Calculo(String aluno,double exame) {
		boolean oi = false;
		double nota1=0,nota2=0;
		for(int i=0;i<5;i++) { 
			if(aluno==Nomes[i]) {
				oi = true;
				nota1=notas[i][0];
				nota2=notas[i][1];
				i=10;
			}else {
				oi = false;
			}
		}
		if(oi==true) {
			JOptionPane.showMessageDialog(null,aluno+" está matriculado");
		}else if(oi==false) {
			JOptionPane.showMessageDialog(null,aluno+" não está matriculado");
		}
		return (((nota1+nota2)/2)+exame)/2;
	}
}
