package ExercicioPratico_17_Setembro;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.*;

public class EX_5_1C extends JFrame implements ActionListener, ItemListener{
		String loca[][] = new String[10][5];
		
		JRadioButton r1, r2, r3, r4, r5;
		ButtonGroup Bg;
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField T1,T2,T3;
		JPasswordField P1;
		JButton b1,L,S;
		
public EX_5_1C() {
	setTitle("Incluir");
	setResizable(false);
	setLocation(100,100);
	setSize(400,400);
	getContentPane().setBackground(Color.lightGray);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    l1 = new JLabel("Cadastro");
    l1.setBounds(130,5,200,60);
    l1.setFont(new Font("ComicSans", Font.BOLD, 24));
    
    l2 = new JLabel("ID:");
    l2.setBounds(10,65,200,30);
    T1 = new JTextField();
    T1.setBounds(30,70,80,20);
    
    l3 = new JLabel("Nome:");
    l3.setBounds(150,65,200,30);
    T2 = new JTextField();
    T2.setBounds(190,70,150,20);
    
    l4 = new JLabel("Login:");
    l4.setBounds(10,130,200,30);
    T3 = new JTextField();
    T3.setBounds(50,135,150,20);
    
    l5 = new JLabel("Senha");
    l5.setBounds(10,190,200,30);
    P1 = new JPasswordField();
    P1.setBounds(50,195,150,20);

    l6 = new JLabel("Tipo:");
    l6.setBounds(250,100,200,30);
    
    r1 = new JRadioButton("Gerente", false);
    r1.setLocation(250,125);
    r1.setSize(100,20);
    r1.addItemListener(this);
    
    r2 = new JRadioButton("Funcionário", false);
    r2.setLocation(250,150);
    r2.setSize(100,20);
    r2.addItemListener(this);
    
    r3 = new JRadioButton("CLT", false);
    r3.setLocation(250,175);
    r3.setSize(100,20);
    r3.addItemListener(this);
    
    r4 = new JRadioButton("PJ", false);
    r4.setLocation(250,200);
    r4.setSize(100,20);
    r4.addItemListener(this);
    
    r5 = new JRadioButton("Estagiário", false);
    r5.setLocation(250,225);
    r5.setSize(100,20);
    r5.addItemListener(this);
    
    Bg = new ButtonGroup();
    Bg.add(r1);
    Bg.add(r2);
    Bg.add(r3);
    Bg.add(r4);
    Bg.add(r5);
    
    b1 = new JButton("Acessar");
    b1.addActionListener(this);
    b1.setBounds(30,300,100,30);
    L = new JButton("Limpar");
    L.addActionListener(this);
    L.setBounds(140,300,100,30);
    S = new JButton("Sair");
    S.addActionListener(this);
    S.setBounds(250,300,100,30);
    
    
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    add(T1);
    add(r1);
    add(r2);
    add(r3);
    add(r4);
    add(r5);
    add(P1);
    add(T3);
    add(T2);
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
public void actionPerformed(ActionEvent e)
{
}
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}	
	


public static void main(String arg[])
{
	new EX_5_1C().setVisible(true);
}



}
