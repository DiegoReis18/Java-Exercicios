package ExercicioPratico_27_agosto;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2_2_List_Livro extends Frame{
			Label l1,l2,l3,l4,l5;
			Button B1,B2,S;
			TextField T1,T2;
			List li;
			static String Titulo[] = new String[50];
			static String Pagina[] = new String[50];
			static int j=0,i=0;
			
		public Exercicio2_2_List_Livro() {
			setTitle("Lista de livros");
			setResizable(false);
			setSize(500,400);
			setLocation(100,100);
			setBackground(Color.white);
			setLayout(null);
			
			l1 = new Label("Titulo");
			l1.setBounds(20,80,50,30);
			
			T1 = new TextField("");
			T1.setBounds(100,80,120,20);
			
			l2 = new Label("Liste os livros");
			l2.setBounds(50,40,120,30);
			
			li = new List();
			li.setBounds(20,200,350,150);
			
			T2 = new TextField("");
			T2.setBounds(100,120,80,20);
			
			l3 = new Label("Páginas");
			l3.setBounds(20,120,50,30);
			
			l4 = new Label("Aguardando");
			l4.setBounds(350,50,150,30);
			
			l5 = new Label("Livros:");
			l5.setBounds(20,170,150,30);
			
			B2 = new Button("Salvar");
			B2.setBounds(370,210,120,40);
			B2.setBackground(Color.green);
			
			B1 = new Button("Listar");
			B1.setBounds(370,260,120,40);
			B1.setBackground(Color.green);
			
			S = new Button("Fechar");
			S.setBounds(370,310,120,40);
			S.setBackground(Color.green);
	
		
			
	
			
		
			
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
	        add(l2);
	        add(l3);
	        add(l4);
	        add(T2);
	        add(T1);
	        add(B1);   
	        add(B2);  
	        add(li);
	        add(S);
	        add(l5);


			 ButtonHandler handler = new ButtonHandler();
	         B1.addActionListener(handler);
	         B2.addActionListener(handler);
	         S.addActionListener(handler);
	        
			
			
			
		}
		public static void main (String arg[]){
			new Exercicio2_2_List_Livro().setVisible(true);
		}
		 private class ButtonHandler implements ActionListener
	     {
	             public void actionPerformed(ActionEvent e)
	             {
	     
	                     
	              if (e.getActionCommand() == "Fechar")
	            	  System.exit(0);
	                      
	                        
	                         
	             if (e.getActionCommand() == "Salvar"){
	            	  Titulo[i] = T1.getText();
	            	  Pagina[i] = T2.getText();
	            	  l4.setText("Salvo!");
	                  i++;
	             }
	             if (e.getActionCommand() == "Listar"){
	            	  li.removeAll();
	            	 for(int x=0;x<i;x++) {
	            		  li.addItem("Titulo: "+Titulo[x]+" Paginas: "+Pagina[x]);
	            		  
	            		  
	            	  }
	             }
	             
	                    	 
	                    	
	                     }
	                     
	                     
	                           
	                     }

	             
	     }
	
