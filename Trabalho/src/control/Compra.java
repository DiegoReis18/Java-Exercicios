package control;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Livro;
import model.Loja;
public class Compra implements control.InterCompra{
	static double pre�o;
	public static int qtd1=0,qtd2=0,qtd3=0,qtd4=0,qtd5=0,a=1;
	model.Loja loja = new model.Loja();
	ArrayList<model.Livro> cesta = new ArrayList();
	public void iniciarCompra() {
		String inicio;
		inicio = JOptionPane.showInputDialog(null,"PROMO��O!!!\n\nDigite 'Iniciar' para come�ar as compras","Bem vindo(a)",JOptionPane.PLAIN_MESSAGE);
		if(inicio.equals("Iniciar")||inicio.equals("iniciar")||inicio.equals("INICIAR")) {
			JOptionPane.showMessageDialog(null,"Iniciado com sucesso!","UHU!",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Obrigado e Volte Sempre!","At� mais",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
	}
	public void comprar(String escolha,String nome) {
		
		if(escolha.equals("1")) {
			pre�o = 20;
			model.Produto produto = new model.Produto(escolha,qtd1,pre�o);
			qtd1 = produto.getqtd();
			setTotal(precoTotal+produto.getpreco());
			setIndice(indiceCompra+1);
			model.Livro aux = new model.Livro("A culpa � das estrelas");
			aux.getTitulo();
			cesta.add(aux);
			JOptionPane.showMessageDialog(null,"A culpa � das estrelas foi adicionado para a sua cesta","Item adicionado � sua cesta!",JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha.equals("2")) {
			pre�o = 50;
			model.Produto produto = new model.Produto(escolha,qtd2,pre�o);
			qtd2 = produto.getqtd();
			setTotal(precoTotal+produto.getpreco());
			setIndice(indiceCompra+1);
			model.Livro aux = new model.Livro("Game of thrones");
			aux.getTitulo();
			cesta.add(aux);
			JOptionPane.showMessageDialog(null,"Game of Thrones foi adicionado para a sua cesta","Item adicionado � sua cesta!",JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha.equals("3")) {
			pre�o = 30;
			model.Produto produto = new model.Produto(escolha,qtd3,pre�o);
			qtd3 = produto.getqtd();
			setTotal(precoTotal+produto.getpreco());
			setIndice(indiceCompra+1);
			model.Livro aux = new model.Livro("Percy Jackson");
			aux.getTitulo();
			cesta.add(aux);
			JOptionPane.showMessageDialog(null,"Percy Jackson foi adicionado para a sua cesta","Item adicionado � sua cesta!",JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha.equals("4")) {
			pre�o = 10;
			model.Produto produto = new model.Produto(escolha,qtd4,pre�o);
			qtd4 = produto.getqtd();
			setTotal(precoTotal+produto.getpreco());
			model.Livro aux = new model.Livro("O Pequeno Principe");
			aux.getTitulo();
			cesta.add(aux);
			JOptionPane.showMessageDialog(null,"O Pequeno Principe foi adicionado para a sua cesta","Item adicionado � sua cesta!",JOptionPane.INFORMATION_MESSAGE);
			setIndice(indiceCompra+1);
		}else if(escolha.equals("5")) {
			pre�o = 100;
			model.Produto produto = new model.Produto(escolha,qtd5,pre�o);
			qtd5 = produto.getqtd();
			setTotal(precoTotal+produto.getpreco());
			setIndice(indiceCompra+1);
			model.Livro aux = new model.Livro("Harry Potter");
			aux.getTitulo();
			cesta.add(aux);
			JOptionPane.showMessageDialog(null,"Harry Potter foi adicionado para a sua cesta","Item adicionado � sua cesta!",JOptionPane.INFORMATION_MESSAGE);
		}else if(escolha.equals("Rever")||escolha.equals("REVER")||escolha.equals("rever")) {
			loja.mostrarAcervo();
		}else {
			a=2;
			finalizarCompra(nome);
		}
		
	}
	public void finalizarCompra(String nome) {
		String cestaf = "";
		for(int i=0;i<cesta.size();i++) {
			System.out.println(cesta.get(i).getTitulo());
			cestaf = cestaf+"\n- "+cesta.get(i).getTitulo();
		}
		JOptionPane.showMessageDialog(null,"Fim do seu pedido "+nome+"!","Obrigado por comprar conosco!",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Ordem dos itens comprados:\n"+cestaf,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Total de itens pedidos: "+getIndice(),"Obrigado por comprar conosco!",JOptionPane.INFORMATION_MESSAGE);
		mostrarCesta(nome);
	}
	public void mostrarCesta(String nome) {
		double pre�o1=20,pre�o2=50,pre�o3=30,pre�o4=10,pre�o5=100;
		double pre�o1f=pre�o1*qtd1;
		double pre�o2f=pre�o2*qtd2;
		double pre�o3f=pre�o3*qtd3;
		double pre�o4f=pre�o4*qtd4;
		double pre�o5f=pre�o5*qtd5;
		if(pre�o1f>0){
		JOptionPane.showMessageDialog(null,"A culpa � das estrelas:\n\nPre�o Unit�rio: R$"+pre�o1+"\nQuantidades compradas: "+qtd1+"\n\nPre�o Total: R$"+pre�o1f,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		}
		if(pre�o2f>0) {
		JOptionPane.showMessageDialog(null,"Game of Thrones:\n\nPre�o Unit�rio: R$"+pre�o2+"\nQuantidades compradas: "+qtd2+"\n\nPre�o Total: R$"+pre�o2f,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		}
		if(pre�o3f>0) {
		JOptionPane.showMessageDialog(null,"Percy Jackson:\n\nPre�o Unit�rio: R$"+pre�o3+"\nQuantidades compradas: "+qtd3+"\n\nPre�o Total: R$"+pre�o3f,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		}
		if(pre�o4f>0) {
		JOptionPane.showMessageDialog(null,"O Pequeno Principe:\n\nPre�o Unit�rio: R$"+pre�o4+"\nQuantidades compradas: "+qtd4+"\n\nPre�o Total: R$"+pre�o4f,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		}
		if(pre�o5f>0) {
		JOptionPane.showMessageDialog(null,"Harry Potter:\n\nPre�o Unit�rio: R$"+pre�o5+"\nQuantidades compradas: "+qtd5+"\n\nPre�o Total: R$"+pre�o5f,"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);
		}
		JOptionPane.showMessageDialog(null,"Total de itens pedidos: "+getIndice()+"\nPre�o total do pedido: R$"+getTotal(),"Cesta de "+nome,JOptionPane.PLAIN_MESSAGE);

	}
	model.Loja lj = new model.Loja();
	
	private double precoTotal = 0;
	private int indiceCompra = 0;
	public String getOpcao(String escolha) {
		 escolha = JOptionPane.showInputDialog(null,"Digite abaixo o C�digo do livro desejado\nDigite 'Rever' para ver os pre�os novamente\n\n1- "+lj.acervo.get(0).getTitulo()+"\n2- "+lj.acervo.get(1).getTitulo()+"\n3- "+lj.acervo.get(2).getTitulo()+"\n4- "+lj.acervo.get(3).getTitulo()+"\n5- "+lj.acervo.get(4).getTitulo()+"\n\n 0- Encerrar pedido","Fa�a seu pedido",JOptionPane.PLAIN_MESSAGE);
		 return escolha;
	}
	private boolean verificaOpcao(String escolha) {
		if(escolha.equals("1")||escolha.equals("2")||escolha.equals("3")||escolha.equals("4")||escolha.equals("5")||escolha.equals("0")||escolha.equals("Rever")||escolha.equals("REVER")||escolha.equals("rever")) {
			return true;
		}else {
		return false;
		}
	}
	public boolean getVerifica(String escolha) {
		return verificaOpcao(escolha);
	}
	public int getIndice() {
		return indiceCompra;
		}
	public void setIndice(int COD) {
		this.indiceCompra = COD;
		}
	public double getTotal() {
		return precoTotal;
		}
	public void setTotal(double QTD) {
		this.precoTotal = QTD;
		
	}
}
