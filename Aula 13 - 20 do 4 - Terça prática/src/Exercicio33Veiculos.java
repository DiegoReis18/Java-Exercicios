import javax.swing.JOptionPane;

public class Exercicio33Veiculos {
	static String placa,marca,modelo,cor;
	static int ano;
	public Exercicio33Veiculos(){
		placa = JOptionPane.showInputDialog("Digite a placa do carro");
		modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
		marca = JOptionPane.showInputDialog("Digite a marca do carro");
		cor = JOptionPane.showInputDialog("Digite a cor do carro");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
	}
	public static void Mostrar(String Tipo,int extra,double tonelada) {
		if(Tipo.equals("Carro")||Tipo.equals("carro")) {
		JOptionPane.showMessageDialog(null,"Carro\n\nPlaca: "+placa+"\nModelo: "+modelo+"\nMarca: "+marca+"\nCor: "+cor+"\nAno: "+ano+"\nPortas: "+extra);
		}else if(Tipo.equals("Caminhão")||Tipo.equals("caminhão")) {
			JOptionPane.showMessageDialog(null,"Caminhão\n\nPlaca: "+placa+"\nModelo: "+modelo+"\nMarca: "+marca+"\nCor: "+cor+"\nAno: "+ano+"\nToneladas: "+tonelada);
		}else if(Tipo.equals("Moto")||Tipo.equals("moto")) {
			JOptionPane.showMessageDialog(null,"Moto\n\nPlaca: "+placa+"\nModelo: "+modelo+"\nMarca: "+marca+"\nCor: "+cor+"\nAno: "+ano+"\nCilindradas: "+extra);
		}
	}
}
