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



public class Curso extends JFrame implements ListSelectionListener, ActionListener, ItemListener{
	
	private static Connection connection;
	JRadioButton r1, r2, r3;
	ButtonGroup Bg;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField T1,T2,T3,T4;
	JButton b1,L,S;
	JList lista;
	JPanel P1;
	DefaultListModel a;
	
public Curso() {
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

	l1 = new JLabel("Curso");
	l1.setBounds(130,5,200,60);
	l1.setFont(new Font("ComicSans", Font.BOLD, 24));
	
	l2 = new JLabel("ID:");
	l2.setBounds(10,65,200,30);
	T1 = new JTextField();
	T1.setBounds(30,70,80,20);
	
	l3 = new JLabel("Id Inst.");
	l3.setBounds(150,65,200,30);
	T3 = new JTextField();
	T3.setBounds(190,70,150,20);
	
	 a= new DefaultListModel();
	 a.addElement("Administração de Empresas");
	 a.addElement("BioMedicina");
	 a.addElement("Ciências Biológicas");
	 a.addElement("Ciência da Computação");
	 a.addElement("Direito");
	 a.addElement("Educação Fisica");
	 a.addElement("Farmacologia");
	 a.addElement("Rede de Computadores");
	 a.addElement("Sistema da Informação");
	lista = new JList(a);
	lista.setSize(170,160);
	lista.setLocation(5,10);
	lista.setBackground(new Color(208,255,255));
	lista.addListSelectionListener(this);
	
	
	l5 = new JLabel("Carga Horária");
	l5.setBounds(250,200,200,30);
	T4 = new JTextField();
	T4.setBounds(250,230,80,20);
	
	
	P1 = new JPanel();
	   P1.setBounds(30,100,180,180);
	   P1.setBackground(new Color(208,255,255));
	   P1.setBorder(BorderFactory.createLineBorder(Color.black,2));
	   P1.setLayout(null);
	   P1.add(lista);
	
	l6 = new JLabel("Tipo:");
	l6.setBounds(250,100,200,30);
	
	r1 = new JRadioButton("Bacharel", false);
	r1.setLocation(250,125);
	r1.setSize(100,20);
	r1.addItemListener(this);
	
	r2 = new JRadioButton("Gestão", false);
	r2.setLocation(250,150);
	r2.setSize(100,20);
	r2.addItemListener(this);
	
	r3 = new JRadioButton("Outros", false);
	r3.setLocation(250,175);
	r3.setSize(100,20);
	r3.addItemListener(this);

	
	Bg = new ButtonGroup();
	Bg.add(r1);
	Bg.add(r2);
	Bg.add(r3);

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
	add(P1);
	add(r2);
	add(r3);

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

	   System.out.println("Vai fazer a conexão");

		
		// O URL que especifica o banco de dados Produto ao qual 
		// esse programa se conecta, utilizando JDBC para conectar a um 
		// banco de dados Microsoft ODBC.
		// Carrega o driver para permitir conexão ao banco de dados
		try 
		{ 
		   Class.forName( "com.mysql.cj.jdbc.Driver" ); 
		   System.out.println("driver carregado com sucesso");

		   connection = DriverManager.getConnection ( "jdbc:mysql://localhost/produto?user=root");
		   System.out.println("conexão com sucesso");
		}
		catch ( ClassNotFoundException cnfex ) 
		{
		   System.err.println("FALHA NA CONEXÃO DO BANCO DE DADOS" ); 
		   cnfex.printStackTrace(); 
		   System.exit( 1 ); 
		}
		catch ( SQLException sqlex ) 
		{
		   System.err.println( "BANCO DE DADOS NÃO DISPONIVEL" ); 
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
	            	 st.executeUpdate("INSERT INTO Curso VALUES ('"+ T1.getText()+"','Bacharel','"+ lista.getSelectedValue() +"', '"+ T4.getText() +"', '"+ T3.getText()+"')");
		               JOptionPane.showMessageDialog(null,lista.getSelectedValue() + " Inserido com Sucesso",
		                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r2.isSelected()){
	        	   st.executeUpdate("INSERT INTO Curso VALUES ('"+ T1.getText()+"','Gestão','"+ lista.getSelectedValue() +"', '"+ T4.getText() +"', '"+ T3.getText()+"')");
	               JOptionPane.showMessageDialog(null,lista.getSelectedValue() + " Inserido com Sucesso",
	                       "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
	           }
	           if(r3.isSelected()){
	        	   st.executeUpdate("INSERT INTO Curso VALUES ('"+ T1.getText()+"','Outros','"+ lista.getSelectedValue() +"', '"+ T4.getText() +"', '"+ T3.getText()+"')");
	               JOptionPane.showMessageDialog(null,lista.getSelectedValue() + " Inserido com Sucesso",
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
	
	new Curso().setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e) 
	{
	  
	 
	} 
	 private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {                                               
		 // TODO adicione seu código de manipulação aqui:
		 System.out.println(this.r1.getName());
		 }  
	
	}
