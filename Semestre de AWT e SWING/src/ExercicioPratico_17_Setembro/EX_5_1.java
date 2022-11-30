package ExercicioPratico_17_Setembro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX_5_1 extends JFrame implements ActionListener
{
	String logins[][] = new String[10][5];
	int aux;
	JMenuBar menu;
	JMenu	me1,me2,me3;
	JMenuItem m1,m2,m3,m33,m5,m6,m7,m8,m9,m10,m11,m12,m13;
	
		public EX_5_1(){
		logins[0][0] = "1";
		logins[0][1] = "a";
		logins[0][2] = "1";
		logins[0][3] = "1";
		logins[0][4] = "Gerente";
		  setTitle("Menu");
	      setResizable(false);
	      setSize(400,300);
	      setLocation(100,100);
	      getContentPane().setBackground(Color.lightGray);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      me1 = new JMenu("Cadastrar");
	      m1 = new JMenuItem("Curso");
	      m1.addActionListener(this);
	      m2 = new JMenuItem("Disciplina");
	      m2.addActionListener(this);
	      m3 = new JMenuItem("Aluno");
	      m3.addActionListener(this);
	      m33 = new JMenuItem("Professor");
	      m33.addActionListener(this);
	      me1.add(m1);
	      me1.add(m2);
	      me1.add(m3);
	      me1.add(m33);
	      
	      me2 = new JMenu("Mostrar");
	      m5 = new JMenuItem("Curso");
	      m5.addActionListener(this);
	      m6 = new JMenuItem("Disciplina");
	      m6.addActionListener(this);
	      m7 = new JMenuItem("Aluno");
	      m7.addActionListener(this);
	      m8 = new JMenuItem("Professor");
	      m8.addActionListener(this);
	      m9 = new JMenuItem("Curso/Professor");
	      m9.addActionListener(this);
	      m10 = new JMenuItem("Curso/Disciplina");
	      m10.addActionListener(this);
	      m11 = new JMenuItem("Professor/Disciplina");
	      m11.addActionListener(this);
	      m12 = new JMenuItem("Aluno/Disciplina");
	      m12.addActionListener(this);
	      me2.add(m5);
	      me2.add(m6);
	      me2.add(m7);
	      me2.add(m8);
	      me2.addSeparator();
	      me2.add(m9);
	      me2.add(m10);
	      me2.add(m11);
	      me2.add(m12);
	      
	      
	      me3 = new JMenu("SAIR");
	      m13 = new JMenuItem("Sair");
	      m13.addActionListener(this);
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
			
            if( e.getSource() == m1 ) {
            	aux=1;
            	EX_5_1B a = new EX_5_1B();
            	a.setVisible(true);
            }else if( e.getSource() == m2 ) {
            	aux=2;
            	EX_5_1B a = new EX_5_1B();
            	a.setVisible(true);
			}else if( e.getSource() == m3 ) {
				aux=3;
				EX_5_1B a = new EX_5_1B();
				a.setVisible(true);
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
            else
            	System.exit(0);   
            
           
             
	}
		public static void main(String arg[])
		{
			new EX_5_1().setVisible(true);
		}

}
