package ExercicioPratico_20_agosto;
import java.awt.*;
import java.awt.event.*;

public class Exercicio2_Calculos_Juros extends Frame{
			Label l1,l2,l3,l4;
			Button B1,S;
			TextField T1,T2,T3;
		public Exercicio2_Calculos_Juros() {
			setTitle("GRANA GRANA GRANA!");
			setResizable(false);
			setSize(500,400);
			setLocation(100,100);
			setBackground(Color.white);
			setLayout(null);
			
			l1 = new Label("Digite o valor inicial:");
			l1.setBounds(50,150,120,30);
			
			T1 = new TextField("");
			T1.setBounds(50,200,100,20);
			
			l2 = new Label("Digite a taxa de juros:");
			l2.setBounds(190,150,120,30);
			
			T2 = new TextField("");
			T2.setBounds(190,200,100,20);
			
			l3 = new Label("Digite os meses: ");
			l3.setBounds(330,150,100,30);
			
			T3 = new TextField("");
			T3.setBounds(330,200,100,20);
		
			
			l4 = new Label("Aguardando...");
			l4.setBounds(20,350,250,30);
			l4.setBackground(Color.lightGray);
		
			
			B1 = new Button("Consultar");
			B1.setBounds(170,250,150,30);
		
			
			S = new Button("Fechar");
			S.setBounds(330,350,150,30);
		
			
	
			
		
			
			add(l1);  // Os objetos têm que ser adicionados ao Frame		
	        add(l2);
	        add(l3);
	        add(l4);
	        add(T3);
	        add(T2);
	        add(B1);  
	add(S); 
	add(T1);

			 ButtonHandler handler = new ButtonHandler();
	         B1.addActionListener(handler);
	         S.addActionListener(handler);
			
			
			
		}
		public static void main (String arg[]){
			new Exercicio2_Calculos_Juros().setVisible(true);
		}
		 private class ButtonHandler implements ActionListener
	     {
	             public void actionPerformed(ActionEvent e)
	             {
	                     String Num1,Num2,Num3;
	                     Double Res;
	                     
	                     if (e.getActionCommand() == "Fechar")
	                             System.exit(0); 
	                     else
	                     {
	                             Num1 = T1.getText();
	                             Num2 = T2.getText();
	                             Num3 = T3.getText();
	                            Res = Double.parseDouble(Num1)+(Double.parseDouble(Num1)*Double.parseDouble(Num2)*Double.parseDouble(Num3));
	                            l4.setText("O novo valor é R$"+Res); 
	                     }

	             }
	     }
	}

