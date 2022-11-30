package ExercicioPratico_27_agosto;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2_Array_dados extends Frame{
			Label l1,l2,l3,l4;
			Button B1,B2;
			TextField T1;
			Choice c;
			static String idade[] = new String[5];
			static String nome[] = new String[5];
			static int j=0,i=0;
			
		public Exercicio2_Array_dados() {
			setTitle("Cadastro!");
			setResizable(false);
			setSize(500,400);
			setLocation(100,100);
			setBackground(Color.white);
			setLayout(null);
			
			l1 = new Label("Nome");
			l1.setBounds(20,150,50,30);
			
			T1 = new TextField("");
			T1.setBounds(100,155,120,20);
			
			l2 = new Label("Exercicio Bolado");
			l2.setBounds(50,50,120,30);
			
			c= new Choice();
			c.setBounds(100,220,120,30);
				c.addItem("18");
				c.addItem("19");
				c.addItem("20");
				c.addItem("21");
				c.addItem("22");
				c.addItem("23");
				c.addItem("24");
				c.addItem("25");
				c.addItem("26");
				c.addItem("27");
				c.addItem("28");
				c.addItem("29");
				c.addItem("30");
			
			
			l3 = new Label("Idade");
			l3.setBounds(20,220,50,30);
			
			l4 = new Label("Aguardando");
			l4.setBounds(350,50,150,30);
			
			B1 = new Button("Salvar");
			B1.setBounds(20,350,150,40);
			B1.setBackground(Color.green);
			
			B2 = new Button("Fechar");
			B2.setBounds(300,350,150,40);
			B2.setBackground(Color.green);
	
		
			
	
			
		
			
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
	        add(l2);
	        add(l3);
	        add(l4);
	   
	        add(T1);
	        add(B1);   
	        add(B2);  
	        add(c);


			 ButtonHandler handler = new ButtonHandler();
	         B1.addActionListener(handler);
	         B2.addActionListener(handler);
	        
			
			
			
		}
		public static void main (String arg[]){
			new Exercicio2_Array_dados().setVisible(true);
		}
		 private class ButtonHandler implements ActionListener
	     {
	             public void actionPerformed(ActionEvent e)
	             {
	     
	                     
	                     if (e.getActionCommand() == "Fechar")
	                         if(i==5) {
	                        	 for(int x=0;x<5;x++) {
	                        		 JOptionPane.showMessageDialog(null,"Nome: "+nome[x]+"\nIdade: "+idade[x],"Cadastro "+x,JOptionPane.INFORMATION_MESSAGE);
	                        	 }
	                        	 JOptionPane.showMessageDialog(null,"Fim dos dados","Fim",JOptionPane.INFORMATION_MESSAGE);
	                        	 System.exit(0);
	                         } else {
	                        	 l4.setText("Preencha tudo!");
	                        
	                         
	             }if (e.getActionCommand() == "Salvar"){
	                    	 if(i<5) {
	                    		 nome[i] = T1.getText();
	                    		 idade[i] = c.getSelectedItem();
	                    		 l4.setText("Salvo!");
	                    		 i++;
	                    	 }else {
	                    		 l4.setText("Cheio!");
	                    		
	                    	}
	                    	 
	                    	
	                     }
	                     
	                     
	                           
	                     }

	             }
	     }
	
