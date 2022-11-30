package ExercicioPratico_03_Setembro;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ex1_Pagina_Carro extends JFrame  implements ActionListener
{
	int i=0;
	String carro[][] = new String[10][3];
	String valores[][] = new String[10][2];
	JLabel l1,l2,l3,l4,l5,li,c;
	JButton B1,S,L;
	JTextField T1,T2,T3,T4,T5;
public Ex1_Pagina_Carro() {
	setTitle("Carro");
	setResizable(false);
	setSize(310,400);
	setLocation(100,100);
	setBackground(Color.red);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	
	li = new JLabel("Cadastrando Carro");
	li.setBounds(70,10,200,30);	
	
	c = new JLabel("Aguardando");
	c.setBounds(70,290,200,30);	
	
	l1 = new JLabel("Placa:");
	l1.setBounds(20,50,50,30);
	T1 = new JTextField("");
	T1.setBounds(70,55,100,20);
	
	l2 = new JLabel("Marca:");
	l2.setBounds(20,100,150,30);
	T2 = new JTextField("");
	T2.setBounds(70,105,100,20);
	
	l3 = new JLabel("Modelo: ");
	l3.setBounds(20,150,150,30);
	T3 = new JTextField("");
	T3.setBounds(70,155,100,20);
	
	l4 = new JLabel("Valor Carro");
	l4.setBounds(20,200,150,30);
	T4 = new JTextField("");
	T4.setBounds(90,205,100,20);
	
	l5 = new JLabel("Valor Locação:");
	l5.setBounds(20,250,150,30);
	T5 = new JTextField("");
	T5.setBounds(110,255,100,20);
	
	
	B1 = new JButton("Salvar");
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
    add(l4);
    add(l5);
    add(B1); 
    add(c);
add(S);
add(L);
add(T1);
add(T2);
add(T3);
add(T4);
add(T5);


	
	
}

public void actionPerformed(ActionEvent e)
         {
                 String Num1;
                
                 if( e.getSource() == B1 ) {
                	 carro[i][0] = T1.getText();
                	 System.out.println(carro[i][0]);
                	 carro[i][1] = T2.getText();
                	 System.out.println(carro[i][1]);
                	 carro[i][2] = T3.getText();
                	 System.out.println(carro[i][2]);
                	 valores[i][0] = T4.getText();
                	 System.out.println(valores[i][0]);
                	 valores[i][1] = T5.getText();
                	 System.out.println(valores[i][1]);
                	 c.setText("Valor "+carro[i][0]+" preenchido");
                	 i++;
                	 
                 }else if( e.getSource() == L ) {
                	 T1.setText("");
                	 T2.setText("");
                	 T3.setText("");
                	 T4.setText("");
                	 T5.setText("");
                	 
                 }else if( e.getSource() == S ) {
                	 //dispose();
                 }
                	 
         }
 
public static void main (String arg[]){
	new Ex1_Pagina_Carro().setVisible(true);
}
}

