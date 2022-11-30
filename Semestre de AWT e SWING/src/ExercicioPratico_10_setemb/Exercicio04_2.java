package ExercicioPratico_10_setemb;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Exercicio04_2 extends JFrame implements ActionListener
{
	String loca[][] = new String[10][4];
	JMenuBar menu;
	JMenu	me1,me2,me3;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
	
		public Exercicio04_2(){
		  setTitle("Menu");
	      setResizable(false);
	      setSize(400,300);
	      setLocation(100,100);
	      setBackground(Color.yellow);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      me1 = new JMenu("Cadastrar");
	      m1 = new JMenuItem("Curso");
	      m1.addActionListener(this);
	      m2 = new JMenuItem("Disciplina");
	      m2.addActionListener(this);
	      m3 = new JMenuItem("Aluno");
	      m3.addActionListener(this);
	      m4 = new JMenuItem("Professor");
	      m4.addActionListener(this);
	      me1.add(m1);
	      me1.add(m2);
	      me1.add(m3);
	      me1.add(m4);
	      
	      me2 = new JMenu("Mostrar");
	      m5 = new JMenuItem("Cursos");
	      m5.addActionListener(this);
	      m6 = new JMenuItem("Disciplinas");
	      m6.addActionListener(this);
	      m7 = new JMenuItem("Alunos");
	      m7.addActionListener(this);
	      m8 = new JMenuItem("Professores");
	      m8.addActionListener(this);
	      m9 = new JMenuItem("Cursos/Professores");
	      m9.addActionListener(this);
	      m10 = new JMenuItem("Cursos/Disciplinas");
	      m10.addActionListener(this);
	      m11 = new JMenuItem("Professores/Disciplinas");
	      m11.addActionListener(this);
	      me2.add(m5);
	      me2.add(m6);
	      me2.add(m7);
	      me2.add(m8);
	      me2.addSeparator();
	      me2.add(m9);
	      me2.add(m10);
	      me2.add(m11);
	      
	      me3 = new JMenu("SAIR");
	      m12 = new JMenuItem("Sair");
	      m12.addActionListener(this);
	      me3.add(m12);
	      
	      menu = new JMenuBar();
	      menu.add(me1);
	      menu.add(me2);
	      menu.add(me3);
	      
	      setJMenuBar(menu);
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
			new Exercicio04_2().setVisible(true);
		}

}
