package Trabalho;

import javax.swing.*;
import javax.swing.event.*;

import Projeto.Curso;

import java.awt.*;
import java.awt.event.*;

public class Trabalho extends JFrame implements ActionListener{
	
	String texto = "", aux = "";
	JMenuBar menu;
	JMenu	me1,me2,me3;
	JMenuItem m1,m2,m3,m4,m5;
	JTextArea ta1;
	JButton b1;
	JScrollPane sp;
    
	
public Trabalho(){
	
	  setTitle("Menu");
      setResizable(false);
      setSize(400,300);
      setLocation(100,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      me1 = new JMenu("ARQUIVO");
      m1 = new JMenuItem("NOVO");
      m1.addActionListener(this);
      m2 = new JMenuItem("SAIR");
      m2.addActionListener(this);
      me1.add(m1);
      me1.add(m2);
      
      me2 = new JMenu("AJUDAR");
      me3 = new JMenu("MOSTRAR");
      	m3 = new JMenuItem("AJUDA 1");
      	m3.addActionListener(this);
      	m4 = new JMenuItem("AJUDA 2");
      	m4.addActionListener(this);
      	me3.add(m3);
      	me3.add(m4);
      m5 = new JMenuItem("SOBRE");
      m5.addActionListener(this);
     
      me2.add(me3);
      me2.add(m5);
      
      menu = new JMenuBar();
      menu.add(me1);
      menu.add(me2);
      
      ta1 = new JTextArea();
      sp = new JScrollPane();
      sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      ta1.setLineWrap(true);
      ta1.setEditable(false);
      this.add(ta1, BorderLayout.CENTER);
      this.add(sp, BorderLayout.CENTER);
      sp.getViewport().add(ta1);
      
     

      b1 = new JButton("Sair");
      this.add(b1, BorderLayout.SOUTH);
      
      
      
      
      setJMenuBar(menu);
	}
public static void main (String arg[])
{
   new Trabalho().setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
    if( e.getSource() == m1 ) {
    	aux = "Você selecionou a opção 'NOVO'\n";
    }else if( e.getSource() == m2 ) {
    	aux = "Você selecionou a opção 'SAIR'\n";
	}else if( e.getSource() == m3 ) {
		aux = "Você selecionou a opção 'AJUDA 1'\n";
	}else if( e.getSource() == m4 )
		aux = "Você selecionou a opção 'AJUDA 2'\n";
    else {
    	aux = "Você selecionou a opção 'SOBRE'\n"; 
    }
    texto = texto+aux;
	ta1.setText(texto);
 }
}
