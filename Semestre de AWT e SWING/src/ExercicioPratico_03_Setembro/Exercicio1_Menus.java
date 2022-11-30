package ExercicioPratico_03_Setembro;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Exercicio1_Menus extends JFrame  implements ActionListener
{
	String loca[][] = new String[10][4];
	MenuBar menu;
	Menu	me1,me2,me3,me4,me5;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14;
	
		public Exercicio1_Menus(){
			setTitle("Carros");
	      setResizable(false);
	      setSize(400,300);
	      setLocation(200,100);
	      getContentPane().setBackground(Color.yellow);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      me1 = new Menu("Carros");
	      m1 = new MenuItem("Cadastrar");
	      m1.addActionListener(this);
	      m2 = new MenuItem("Alterar");
	      m2.addActionListener(this);
	      m3 = new MenuItem("Excluir");
	      m3.addActionListener(this);
	      me1.add(m1);
	      me1.add(m2);
	      me1.add(m3);
	      
	      me2 = new Menu("Locação");
	      m4 = new MenuItem("Incluir");
	      m4.addActionListener(this);
	      m5 = new MenuItem("Alterar Locação");
	      m5.addActionListener(this);
	      m6 = new MenuItem("Excluir Locação");
	      m6.addActionListener(this);
	      m7 = new MenuItem("Consultar");
	      m7.addActionListener(this);
	      m8 = new MenuItem("Finalizar");
	      m8.addActionListener(this);
	      me2.add(m4);
	      me2.add(m5);
	      me2.add(m6);
	      me2.add(m7);
	      me2.addSeparator();
	      me2.add(m8);
	      
	      me3 = new Menu("Consultar");
	      m9 = new MenuItem("Clientes");
	      m9.addActionListener(this);
	      m10 = new MenuItem("Carros");
	      m10.addActionListener(this);
	      m11 = new MenuItem("Montante");
	      m11.addActionListener(this);
	      me3.add(m9);
	      me3.add(m10);
	      me3.add(m11);
	      
	      me4 = new Menu("Calcular");
	      m12 = new MenuItem("Valor Locação");
	      m12.addActionListener(this);
	      m13 = new MenuItem("Valor Multa");
	      m13.addActionListener(this);
	      me4.add(m12);
	      me4.add(m13);
	      
	      me5 = new Menu("SAIR");
	      m14 = new MenuItem("Sair");
	      m14.addActionListener(this);
	      me5.add(m14);
	      
	      menu = new MenuBar();
	      menu.add(me1);
	      menu.add(me2);
	      menu.add(me3);
	      menu.add(me4);
	      menu.add(me5);
	      
	      setMenuBar(menu);
		}
	      
	      public boolean handleEvent(Event e)
	       {
	          if (e.id == Event.WINDOW_DESTROY) 
	             System.exit(0);           
	             return (super.handleEvent(e));
	       }

		public void actionPerformed(ActionEvent e)
		{
			String evento="";
			int f=0;
			
            if( e.getSource() == m1 ) {
            	 Ex1_Pagina_Carro obj = new Ex1_Pagina_Carro();
            	 obj.setVisible(true);
            	 f++;
            }else if( e.getSource() == m2 )
                 evento = "Alterar";
            else if( e.getSource() == m3 )
                evento = "Excluir";
            else if( e.getSource() == m4 ) {
            	Ex1_Pagina_Locacao obj = new Ex1_Pagina_Locacao();
       			obj.setVisible(true);
       			f++;
            }else if( e.getSource() == m5 )
                evento = "Alterar Locação";
            else if( e.getSource() == m6 )
                evento = "Excluir Locação";
            else if( e.getSource() == m7 )
                evento = "Consultar";
            else if( e.getSource() == m8 )
                evento = "Finalizar";
            else if( e.getSource() == m9 )
                evento = "Clientes";
            else if( e.getSource() == m10 ) {
            	Ex1_Pagina_Consultar obj = new Ex1_Pagina_Consultar();
       			obj.setVisible(true);
       			f++;
            }else if( e.getSource() == m11 )
                evento = "Montante";
            else if( e.getSource() == m12 )
                evento = "Valor da locação";
            else if( e.getSource() == m13 )
                evento = "Valor multa";
            else
            	System.exit(0);   
            
            if(f==0)
            JOptionPane.showMessageDialog(null, evento, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
           
	     
	      
	      
	      
	      
	      
	}
		public static void main(String arg[])
		{
			new Exercicio1_Menus().setVisible(true);
		}

}
