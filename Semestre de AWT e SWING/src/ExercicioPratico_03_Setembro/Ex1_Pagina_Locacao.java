package ExercicioPratico_03_Setembro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1_Pagina_Locacao extends JFrame  implements ActionListener
{
	JLabel l1,l2,l3,li;
	JButton B1,S,L;
	JTextField T1,T2,T3;
	
		public Ex1_Pagina_Locacao(){
			setTitle("Locação");
			setResizable(false);
			setSize(310,400);
			setLocation(100,100);
			setBackground(Color.red);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			
			li = new JLabel("Cadastrando Locação");
			li.setBounds(70,10,200,30);	
			
			l1 = new JLabel("Cliente: ");
			l1.setBounds(20,50,50,30);
			T1 = new JTextField("");
			T1.setBounds(70,55,100,20);
			
			l2 = new JLabel("Placa: ");
			l2.setBounds(20,100,150,30);
			T2 = new JTextField("");
			T2.setBounds(70,105,100,20);
			
			l3 = new JLabel("Dias: ");
			l3.setBounds(20,150,150,30);
			T3 = new JTextField("");
			T3.setBounds(70,155,100,20);
			
			
			B1 = new JButton("Consultar");
			B1.addActionListener(this);
			B1.setBounds(0,330,90,30);
			
			L = new JButton("Limpar");
			L.addActionListener(this);
			L.setBounds(100,330,90,30);

			
			S = new JButton("Fechar");
			S.addActionListener(this);
			S.setBounds(200,330,90,30);

			


			add(li);
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
		    add(l2);
		    add(l3);
		
		    add(B1);  
		add(S);
		add(L);
		add(T1);
		add(T2);
		add(T3);


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
		
	     
	      
	      
	      
	      
	      
	}
		public static void main(String arg[])
		{
			new Ex1_Pagina_Locacao().setVisible(true);
		}

}
