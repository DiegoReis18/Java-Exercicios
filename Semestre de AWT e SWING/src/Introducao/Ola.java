package Introducao;

//Primeiro exemplo de criação de frame


import java.awt.*;
import java.awt.event.*;

public class Ola extends Frame
{
	private boolean e;
	private Event e2;
	private Event e3;
	public Ola()
	{
		setTitle("Primeiro Frame");
		setResizable(false); // altera o tamabi do frame
		setSize(400,300);
		setLocation(100,100);
             //setBounds(100,100,400,300);
		setBackground(Color.yellow);
     
	}
	public static void main ( String arg[])
	{
		new Ola().setVisible(true);
	}
     public boolean handleEvent(Event e)
     {
   
		if (e.id == Event.WINDOW_DESTROY)   // Identifica o evento
           System.exit(0);                  // Encerra a aplicação
        return (super.handleEvent(e));      // Deixa o metodo da super classe
     }
}

