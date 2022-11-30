package ExercicioPratico_17_Setembro;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EX_5_1B extends JFrame implements ActionListener{
		JLabel l1,l2,l3;
		JTextField T1;
		JPasswordField P1;
		JButton b1;
		
public EX_5_1B() {
	setTitle("Login");
	setResizable(false);
	setLocation(100,100);
	setSize(400,300);
	getContentPane().setBackground(Color.lightGray);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    l1 = new JLabel("Login");
    l1.setBounds(130,10,200,40);
    l1.setFont(new Font("ComicSans", Font.BOLD, 30));
    
    l2 = new JLabel("Nome:");
    l2.setBounds(60,100,200,30);
    T1 = new JTextField();
    T1.setBounds(100,105,200,20);
    
    l3 = new JLabel("Senha:");
    l3.setBounds(60,150,200,30);
    P1 = new JPasswordField();
    P1.setBounds(100,155,200,20);
    
    b1 = new JButton("Acessar");
    b1.addActionListener(this);
    b1.setBounds(130,200,100,30);
    
    add(l1);
    add(l2);
    add(l3);
    add(T1);
    add(P1);
    add(b1);
}

public boolean handleEvent(Event e)
{
   if (e.id == Event.WINDOW_DESTROY) 
      System.exit(0);           
      return (super.handleEvent(e));
}
@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent e)
{
	EX_5_1 obj = new EX_5_1();
	System.out.println(obj.aux);
	int aux=0;
	if( e.getSource() == b1 ) {
	for(int i=0;i<10;i++) {
		if (obj.logins[i][4]=="Gerente") {
			if(obj.logins[i][2].equals(T1.getText())&&obj.logins[i][3].equals(P1.getText())){
				aux=1;
			}
		}
	}
	
    	if(T1.getText().equals("Diego")&&P1.getText().equals("123")) {
    		JOptionPane.showMessageDialog(null, "Acesso aceito!");
    		
       	 	obj.setVisible(true);
       	 	dispose();
    	
    	}else if(aux==1){
    		if(obj.aux==1) {
    			EX_5_1C a = new EX_5_1C();
    			a.setVisible(true);
    		}else if(obj.aux==2) {
    			EX_5_1D a = new EX_5_1D();
    			
    		}else if(obj.aux==3) {
    			EX_5_1E a = new EX_5_1E();
    			
    		}
    		
    		
    	}else {
    		JOptionPane.showMessageDialog(null, "Acesso Negado!");
    	}
	}
}

public static void main(String arg[])
{
	new EX_5_1B().setVisible(true);
}
}
