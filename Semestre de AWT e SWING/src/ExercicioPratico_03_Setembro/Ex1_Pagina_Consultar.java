package ExercicioPratico_03_Setembro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1_Pagina_Consultar extends JFrame  implements ActionListener
{
	String loca[][] = new String[10][4];
	
	
	JLabel l1,l2,l3,l4,li;
	JButton B1,S,L;
	List T1;
	
		public Ex1_Pagina_Consultar(){
			setTitle("Carros Cadastrados");
			setResizable(false);
			setSize(310,400);
			setLocation(100,100);
			setBackground(Color.red);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			
			li = new JLabel("Consulta - Carros alocados");
			li.setBounds(70,10,200,30);	
			
			l1 = new JLabel("Cliente");
			l1.setBounds(15,50,50,30);
			
			
			l2 = new JLabel("Placa");
			l2.setBounds(60,50,50,30);
			
			l3 = new JLabel("Dias");
			l3.setBounds(100,50,50,30);
			
			l4 = new JLabel("Valor");
			l4.setBounds(140,50,50,30);
			
			
			T1 = new List();
			T1.setBounds(20,90,250,150);
			
			B1 = new JButton("Consultar");
			B1.addActionListener(this);
			B1.setBounds(0,330,90,30);
			
			

			
			S = new JButton("Fechar");
			S.addActionListener(this);
			S.setBounds(200,330,90,30);

			


			add(li);
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
		    add(l2);
		    add(l3);
		    add(l4);
		    add(B1);  
		add(S);
		
		add(T1);
		


		}
	      
	      public boolean handleEvent(Event e)
	       {
	          if (e.id == Event.WINDOW_DESTROY) 
	             System.exit(0);           
	             return (super.handleEvent(e));
	       }

		public void actionPerformed(ActionEvent e)
		{
			
			String evento;
			 Ex1_Pagina_Carro a = new Ex1_Pagina_Carro();
			if( e.getSource() == B1 ) {
				a.carro[1][1] = "nhainhai";
			for(int i=0;i<10;i++) {
				
				T1.addItem("oi"+a.carro[i][0]+" "+a.carro[i][1]+" "+a.carro[i][2]+" "+a.valores[i][0]);
		
			}
			}else {
				dispose();
			}
	      
	      
	      
	      
	}

		public static void main(String arg[])
		{
			new Ex1_Pagina_Consultar().setVisible(true);
		}

}
