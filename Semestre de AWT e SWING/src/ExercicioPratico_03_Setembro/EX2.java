package ExercicioPratico_03_Setembro;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EX2 extends JFrame  implements ActionListener
{
	String loca[][] = new String[10][4];
	MenuBar menu;
	Menu	me1,me2,me3;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
	
		public EX2(){
		  setTitle("Menu");
	      setResizable(false);
	      setSize(400,300);
	      setLocation(100,100);
	      setBackground(Color.yellow);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      me1 = new Menu("Cadastrar");
	      m1 = new MenuItem("Curso");
	      m1.addActionListener(this);
	      m2 = new MenuItem("Disciplina");
	      m2.addActionListener(this);
	      m3 = new MenuItem("Aluno");
	      m3.addActionListener(this);
	      m4 = new MenuItem("Professor");
	      m4.addActionListener(this);
	      me1.add(m1);
	      me1.add(m2);
	      me1.add(m3);
	      me1.add(m4);
	      
	      me2 = new Menu("Mostrar");
	      m5 = new MenuItem("Cursos");
	      m5.addActionListener(this);
	      m6 = new MenuItem("Disciplinas");
	      m6.addActionListener(this);
	      m7 = new MenuItem("Alunos");
	      m7.addActionListener(this);
	      m8 = new MenuItem("Professores");
	      m8.addActionListener(this);
	      m9 = new MenuItem("Cursos/Professores");
	      m9.addActionListener(this);
	      m10 = new MenuItem("Cursos/Disciplinas");
	      m10.addActionListener(this);
	      m11 = new MenuItem("Professores/Disciplinas");
	      m11.addActionListener(this);
	      me2.add(m5);
	      me2.add(m6);
	      me2.add(m7);
	      me2.add(m8);
	      me2.addSeparator();
	      me2.add(m9);
	      me2.add(m10);
	      me2.add(m11);
	      
	      me3 = new Menu("SAIR");
	      m12 = new MenuItem("Sair");
	      m12.addActionListener(this);
	      me3.add(m12);
	      
	      menu = new MenuBar();
	      menu.add(me1);
	      menu.add(me2);
	      menu.add(me3);
	      
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
			
            if( e.getSource() == m1 ) 
            	evento = "Curso";
            else if( e.getSource() == m2 )
                 evento = "Disciplina";
            else if( e.getSource() == m3 )
                evento = "Aluno";
            else if( e.getSource() == m4 ) {
            	evento = "Professor";
            }else if( e.getSource() == m5 )
                evento = "Cursos";
            else if( e.getSource() == m6 )
                evento = "Disciplinas";
            else if( e.getSource() == m7 )
                evento = "Alunos";
            else if( e.getSource() == m8 )
                evento = "Professores";
            else if( e.getSource() == m9 )
                evento = "Cursos/Professores";
            else if( e.getSource() == m10 ) 
            	evento = "Cursos/Disciplinas";
            else if( e.getSource() == m11 )
                evento = "Professores/Disciplinas";
            else
            	System.exit(0);   
            
           
            JOptionPane.showMessageDialog(null, evento, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);      
	}
		public static void main(String arg[])
		{
			new EX2().setVisible(true);
		}

}
