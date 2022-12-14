package Projeto;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Disciplina extends JFrame implements  ActionListener, ItemListener{
	
	private static Connection connection;
	JRadioButton r1, r2, r3,r4,r5,r6;
	ButtonGroup Bg;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField T1,T2,T3,T4;
	JButton b1,L,S;
	
	JPanel P1;
	
	
public Disciplina() {
	FazConexao();
	setTitle("Incluir");
	setResizable(false);
	setLocation(100,100);
	setSize(400,400);
	setUndecorated(true);
	getContentPane().setBackground(Color.lightGray);
	getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	   getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);

	l1 = new JLabel("Disciplina");
	l1.setBounds(130,5,200,60);
	l1.setFont(new Font("ComicSans", Font.BOLD, 24));
	
	l2 = new JLabel("ID:");
	l2.setBounds(10,65,200,30);
	T1 = new JTextField();
	T1.setBounds(30,70,80,20);
	
	l3 = new JLabel("Nome disc.");
	l3.setBounds(150,65,200,30);
	T3 = new JTextField();
	T3.setBounds(215,70,150,20);
	
	
	
	
	l5 = new JLabel("Carga Hor?ria");
	l5.setBounds(250,200,200,30);
	T4 = new JTextField();
	T4.setBounds(250,230,80,20);
	
	
	
	
	l6 = new JLabel("Aulas semanais:");
	l6.setBounds(50,100,200,30);
	
	r1 = new JRadioButton("1", false);
	r1.setLocation(50,125);
	r1.setSize(100,20);
	r1.addItemListener(this);
	
	r2 = new JRadioButton("2", false);
	r2.setLocation(50,150);
	r2.setSize(100,20);
	r2.addItemListener(this);
	
	r3 = new JRadioButton("3", false);
	r3.setLocation(50,175);
	r3.setSize(100,20);
	r3.addItemListener(this);
	
	r4 = new JRadioButton("4", false);
	r4.setLocation(50,200);
	r4.setSize(100,20);
	r4.addItemListener(this);
	
	r5 = new JRadioButton("5", false);
	r5.setLocation(50,225);
	r5.setSize(100,20);
	r5.addItemListener(this);
	
	r6 = new JRadioButton("6", false);
	r6.setLocation(50,250);
	r6.setSize(100,20);
	r6.addItemListener(this);

	
	Bg = new ButtonGroup();
	Bg.add(r1);
	Bg.add(r2);
	Bg.add(r3);
	Bg.add(r4);
	Bg.add(r5);
	Bg.add(r6);
	
	

	b1 = new JButton("Salvar");
	b1.addActionListener(this);
	b1.setBounds(30,320,100,30);
	L = new JButton("Limpar");
	L.addActionListener(this);
	L.setBounds(140,320,100,30);
	S = new JButton("Sair");
	S.addActionListener(this);
	S.setBounds(250,320,100,30);
	
	
	add(l1);
	add(l2);
	add(l3);

	add(l5);
	add(l6);
	add(T1);
	add(r1);
	add(r2);
	add(r3);
	add(r4);
	add(r5);
	add(r6);
	

	add(T3);
	add(T4);
	add(S);
	add(L);
	
	add(b1);
	}
	
	public boolean handleEvent(Event e)
	{
	if (e.id == Event.WINDOW_DESTROY) 
	  System.exit(0);           
	  return (super.handleEvent(e));
	}
	public static void FazConexao()
	{

	   System.out.println("Vai fazer a conex?o");

		
		// O URL que especifica o banco de dados Produto ao qual 
		// esse programa se conecta, utilizando JDBC para conectar a um 
		// banco de dados Microsoft ODBC.
		// Carrega o driver para permitir conex?o ao banco de dados
		try 
		{ 
		   Class.forName( "com.mysql.cj.jdbc.Driver" ); 
		   System.out.println("driver carregado com sucesso");

		   connection = DriverManager.getConnection ( "jdbc:mysql://localhost/produto?user=root");
		   System.out.println("conex?o com sucesso");
		}
		catch ( ClassNotFoundException cnfex ) 
		{
		   System.err.println("FALHA NA CONEX?O DO BANCO DE DADOS" ); 
		   cnfex.printStackTrace(); 
		   System.exit( 1 ); 
		}
		catch ( SQLException sqlex ) 
		{
		   System.err.println( "BANCO DE DADOS N?O DISPONIVEL" ); 
		   sqlex.printStackTrace( ); 
		} 
	}
	public void actionPerformed(ActionEvent e)
	{
		
		Connection con = connection;

	     if(e.getSource() == b1)
	 	     {
	            try 
	            {  
	            	 Statement st = con.createStatement();
	            if(r1.isSelected()){
	            	 st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','1')");
		               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
		                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r2.isSelected()){
	        	   st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','2')");
	               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r3.isSelected()){
	        	   st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','3')");
	               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r4.isSelected()){
	        	   st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','4')");
	               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r5.isSelected()){
	        	   st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','5')");
	               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r6.isSelected()){
	        	   st.executeUpdate("INSERT INTO Disciplina VALUES ('"+ T1.getText()+"','"+ T3.getText()+"','"+ T4.getText() +"','6')");
	               JOptionPane.showMessageDialog(null,T3.getText() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	             
	               T1.setText("");

	               T3.setText("");
	               T4.setText("");
	            
	            } 
	            catch (SQLException sqlex)
	            {
	               System.out.println("erro sql "+ sqlex);
	               sqlex.printStackTrace();
	            }
	         }
	 	    else if(e.getSource() == L)
	 		 {
	 	    	T1.setText("");

	               T3.setText("");
	               T4.setText("");
	            }
	 	   
		if (e.getSource() == S)
		      System.exit(0); 
		
	}
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
	
	
	public static void main(String arg[])
	{
	
	new Disciplina().setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e) 
	{
	  
	 
	} 
	 private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {                                               
		 // TODO adicione seu c?digo de manipula??o aqui:
		 System.out.println(this.r1.getName());
		 }  
	
	}
