package ExercicioPratico_20_agosto;
import java.awt.*;
import java.awt.event.*;

public class Exercicio3_Jogo_Adivinha extends Frame{
			Label l1,l2,l3,l4;
			Button B1,S,R;
			TextField T1;
			 int vida=0,valor=0;
		public Exercicio3_Jogo_Adivinha() {
			setTitle("Adivinhe o número!");
			setResizable(false);
			setSize(500,400);
			setLocation(100,100);
			setBackground(Color.white);
			setLayout(null);
			
			l1 = new Label("Digite o seu chute");
			l1.setBounds(20,150,120,30);
			
			T1 = new TextField("");
			T1.setBounds(150,155,100,20);
			
			l2 = new Label("Clique em 'NOVO JOGO' para sortear");
			l2.setBounds(50,50,210,30);
			
			
			l3 = new Label("Boa sorte!");
			l3.setBounds(330,150,150,30);
			
			l4 = new Label("Aguardando:...");
			l4.setBounds(20,250,300,30);
		
			
			R = new Button("Novo Jogo");
			R.setBounds(20,350,150,40);
		
			
			B1 = new Button("CHUTAR!");
			B1.setBounds(175,350,150,40);
			B1.setBackground(Color.green);
		
			
			S = new Button("Fechar");
			S.setBounds(330,350,150,40);
		
			
	
			
		
			
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
	        add(l2);
	        add(l3);
	        add(l4);
	        add(R);
	        add(T1);
	      
	        add(B1);  
	add(S); 


			 ButtonHandler handler = new ButtonHandler();
	         B1.addActionListener(handler);
	         S.addActionListener(handler);
	         R.addActionListener(handler);
			
			
			
		}
		public static void main (String arg[]){
			new Exercicio3_Jogo_Adivinha().setVisible(true);
		}
		 private class ButtonHandler implements ActionListener
	     {
	             public void actionPerformed(ActionEvent e)
	             {
	                     String Num1,Num2,Num3;
	                     Double Res;
	                     
	                     
	                     if (e.getActionCommand() == "Fechar")
	                             System.exit(0); 
	                     if (e.getActionCommand() == "Novo Jogo"){
	                    	 vida = 10;
	                    	 l4.setText("Tentativas restantes: "+vida);
	                    	 valor = (int)(Math.random()*1000);
	                    	 l2.setText("VALENDOOO!");
	                     }
	                     else{
	                             Num1 = T1.getText();
	                            if(vida>0) {
	                            	if(Double.parseDouble(Num1)>valor) {
	                            		l3.setText("MENOR!"); 
	                            		vida = vida-1;
	                            		l4.setText("Tentativas restantes: "+vida);
	                            	}
	                            	else if(Double.parseDouble(Num1)<valor) {
	                            		l3.setText("MAIOR!");
	                            		vida = vida-1;
	                            		l4.setText("Tentativas restantes: "+vida);
	                            	}
	                            	else if(Double.parseDouble(Num1)==valor) {
	                            		l3.setText("ACERTOUUU"); 
	                            		l2.setText("Clique em 'NOVO JOGO' para sortear"); 
	                            		l4.setText("Boa!");
	                            		
	                            	}
	                            }else {
	                            	l3.setText("Acabaram suas vidas :/"); 
                            		l2.setText("Clique em 'NOVO JOGO' para sortear"); 
                            		l4.setText(";-;");
	                            }
	                     }

	             }
	     }
	}
