package ExercicioPratico_20_agosto;
import java.awt.*;
import java.awt.event.*;

public class Exercicio4_Calculadora extends Frame{
			Label l1;
			Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,be,ba,bi,br,bd,bm;
			String Nr1,Nr2;
			int Oper=0;
			double Result,Nr;
		public Exercicio4_Calculadora() {
			setTitle("Calculadora");
			setResizable(false);
			setSize(340,390);
			setLocation(100,100);
			setBackground(Color.white);
			setLayout(null);
			
			l1 = new Label("");
			l1.setBounds(10,30,300,30);
			
			b1 = new Button("1");
			b1.setBounds(10,60,80,80);
			
			b5 = new Button("5");
			b5.setBounds(10,140,80,80);
			
			b9 = new Button("9");
			b9.setBounds(10,220,80,80);
			
			bm = new Button("*");
			bm.setBounds(10,300,80,80);
			
			b2 = new Button("2");
			b2.setBounds(90,60,80,80);
			
			b6 = new Button("6");
			b6.setBounds(90,140,80,80);
			
			b0 = new Button("0");
			b0.setBounds(90,220,80,80);
			
			bd = new Button("/");
			bd.setBounds(90,300,80,80);
			
			b3 = new Button("3");
			b3.setBounds(170,60,80,80);
			
			b7 = new Button("7");
			b7.setBounds(170,140,80,80);
			
			ba = new Button("+");
			ba.setBounds(170,220,80,80);
			
			br = new Button("Raiz 2");
			br.setBounds(170,300,80,80);
			
			b4 = new Button("4");
			b4.setBounds(250,60,80,80);
			
			b8 = new Button("8");
			b8.setBounds(250,140,80,80);
			
			be = new Button("-");
			be.setBounds(250,220,80,80);
			
			bi = new Button("=");
			bi.setBounds(250,300,80,80);
			
		
		
			
	
			
			add(b9); 
			add(b0); 
			add(b1);  // Os objetos têm que ser adicionados ao Frame		
	        add(b2);
	        add(b3);
	        add(b4);
	        add(b5);
	        add(b6);
	        add(b8); 
	        add(b7);  
	        add(br); 
	        add(ba); 
	        add(be); 
	        add(bd); 
	        add(bm); 
	        add(bi);
	        add(l1);


			 ButtonHandler handler = new ButtonHandler();
	         b1.addActionListener(handler);
	         b2.addActionListener(handler);
	         b3.addActionListener(handler);
	         b4.addActionListener(handler);
	         b5.addActionListener(handler);
	         b6.addActionListener(handler);
	         b7.addActionListener(handler);
	         b8.addActionListener(handler);
	         b9.addActionListener(handler);
	         b0.addActionListener(handler);
	         bm.addActionListener(handler);
	         bd.addActionListener(handler);
	         be.addActionListener(handler);
	         ba.addActionListener(handler);
	         br.addActionListener(handler);
	         bi.addActionListener(handler);
	         
			
			
			
		}
		public static void main (String arg[]){
			new Exercicio4_Calculadora().setVisible(true);
		}
		 public boolean handleEvent(Event e)
	        {
	           if (e.id == Event.WINDOW_DESTROY) 
	              System.exit(0);                
	           return (super.handleEvent(e));    
	                                             
	        }
		 private class ButtonHandler implements ActionListener
	     {
	             public void actionPerformed(ActionEvent e)
	             {
	            	 if ((e.getActionCommand() == "1") && (Oper == 0))
	                      Nr1 = Nr1 + "1";
	                   else if ((e.getActionCommand() == "2") && (Oper == 0))
	                      Nr1 = Nr1 + "2";
	                   else if ((e.getActionCommand() == "3") && (Oper == 0))
	                      Nr1 = Nr1 + "3";
	                   else if ((e.getActionCommand() == "4") && (Oper == 0))
	                      Nr1 = Nr1 + "4";
	                   else if ((e.getActionCommand() == "5") && (Oper == 0))
	                      Nr1 = Nr1 + "5";
	                   else if ((e.getActionCommand() == "6") && (Oper == 0))
	                      Nr1 = Nr1 + "6";
	                   else if ((e.getActionCommand() == "7") && (Oper == 0))
	                      Nr1 = Nr1 + "7";
	                   else if ((e.getActionCommand() == "8") && (Oper == 0))
	                      Nr1 = Nr1 + "8";
	                   else if ((e.getActionCommand() == "9") && (Oper == 0))
	                      Nr1 = Nr1 + "9";
	                   else if ((e.getActionCommand() == "0") && (Oper == 0))
	                      Nr1 = Nr1 + "0";

	                   else if ((e.getActionCommand() == "1") && (Oper != 0))
	                      Nr2 = Nr2 + "1";
	                   else if ((e.getActionCommand() == "2") && (Oper != 0))
	                      Nr2 = Nr2 + "2";
	                   else if ((e.getActionCommand() == "3") && (Oper != 0))
	                      Nr2 = Nr2 + "3";
	                   else if ((e.getActionCommand() == "4") && (Oper != 0))
	                      Nr2 = Nr2 + "4";
	                   else if ((e.getActionCommand() == "5") && (Oper != 0))
	                      Nr2 = Nr2 + "5";
	                   else if ((e.getActionCommand() == "6") && (Oper != 0))
	                      Nr2 = Nr2 + "6";
	                   else if ((e.getActionCommand() == "7") && (Oper != 0))
	                      Nr2 = Nr2 + "7";
	                   else if ((e.getActionCommand() == "8") && (Oper != 0))
	                      Nr2 = Nr2 + "8";
	                   else if ((e.getActionCommand() == "9") && (Oper != 0))
	                      Nr2 = Nr2 + "9";
	                   else if ((e.getActionCommand() == "0") && (Oper != 0))
	                      Nr2 = Nr2 + "0";

	                   else if (e.getActionCommand() == "+")
	                         Oper = 1;
	                   else if (e.getActionCommand() == "-")
	                         Oper = 2;
	                   else if (e.getActionCommand() == "*")
	                         Oper = 3;
	                   else if (e.getActionCommand() == "/")
	                         Oper = 4;
	                   else if (e.getActionCommand() == "Raiz 2")
	                         Oper = 5;

	                   else if (e.getActionCommand() == "=")
	                      {
	                         if(Oper == 1)
	                            Result = Double.parseDouble(Nr1) + Double.parseDouble(Nr2);
	                         else if(Oper == 2)
	                            Result = Double.parseDouble(Nr1) - Double.parseDouble(Nr2);
	                         if(Oper == 3)
	                            Result = Double.parseDouble(Nr1) * Double.parseDouble(Nr2);
	                         if(Oper == 4)
	                            Result = (Double.parseDouble(Nr1) / Double.parseDouble(Nr2));
	                         if(Oper == 5)
	                            {
	                            Nr = Double.parseDouble(Nr1);
	                            Result = Math.sqrt(Nr);
	                            }
	 	                 l1.setText(Double.toString(Result));
	                         Nr1 = "";
	                         Nr2 = "";
	                         Oper = 0;
	                      }
	                }

	        }
	}
		