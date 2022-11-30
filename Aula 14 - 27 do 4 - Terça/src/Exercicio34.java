//Precisava de try e catch
import javax.swing.JOptionPane;

public class Exercicio34 {
	int Arr[] = new int[20];
	int sei = 0;
	public Exercicio34(){
		String aux = "";
		int sera,cons=0;
		try {
		for(int i=0;i<20;i++) {
		cons=0;
		sera = (int)(Math.random()*100);
		sei++;
		for(int j=0;j<i;j++) {
			if(sera==Arr[j]) {
				j=i;
				cons=1;
				i--;
			}
		}
		if(cons!=1) {
			Arr[i] = sera;
			if (sei>1) {
				aux = aux+","+Arr[i];
			}else if(sei==1) {
				aux = aux+Arr[i];
			}
		}
		
		}
		JOptionPane.showMessageDialog(null,"Números:\n"+aux);
	}catch(Exception e3) {
		JOptionPane.showMessageDialog(null,"ERRO NO PROGRAMAAAA");

	}
	
		}
	public String pesquisa(double valor) {
		for(int i=0;i<20;i++) {
		if(valor==Arr[i]) {
			return "Sim";
		}
		}
		return "Não";
	}
}
