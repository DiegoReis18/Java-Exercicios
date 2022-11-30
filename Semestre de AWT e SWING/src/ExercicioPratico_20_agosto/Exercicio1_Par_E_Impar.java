package ExercicioPratico_20_agosto;
import java.awt.*;
import java.awt.event.*;


public class Exercicio1_Par_E_Impar extends Frame {
		Label l1,l2;
		Button B1,S;
		TextField T1;
	public Exercicio1_Par_E_Impar() {
		setTitle("Par ou impar?? ");
		setResizable(false);
		setSize(500,400);
		setLocation(100,100);
		setBackground(Color.red);
		
		setLayout(null);
		
		l1 = new Label("Digite o número:");
		l1.setBounds(190,150,100,30);
	
		
		l2 = new Label("Aguardando...");
		l2.setBounds(20,350,150,30);
		l2.setBackground(Color.lightGray);
	
		
		B1 = new Button("Consultar");
		B1.setBounds(170,250,150,30);
	
		
		S = new Button("Fechar");
		S.setBounds(330,350,150,30);
	
		
		T1 = new TextField("");
		T1.setBounds(190,200,100,20);
	
		
		add(l1);  // Os objetos têm que ser adicionados ao Frame		
        add(l2);   
        add(B1);  
add(S); 
add(T1);

		 ButtonHandler handler = new ButtonHandler();
         B1.addActionListener(handler);
         S.addActionListener(handler);
		
		
		
	}
	public static void main (String arg[]){
		new Exercicio1_Par_E_Impar().setVisible(true);
	}
	 private class ButtonHandler implements ActionListener
     {
             public void actionPerformed(ActionEvent e)
             {
                     String Num1;

                     if (e.getActionCommand() == "Fechar")
                             System.exit(0); 
                     else
                     {
                             Num1 = T1.getText();
                             if (Double.parseDouble(Num1)%2==0) {
                            	 l2.setText("O número "+Num1+" é par!"); 
                             }else {
                            	 l2.setText("O número "+Num1+" é impar!"); 
                             }
                            
                     }

             }
     }
}
