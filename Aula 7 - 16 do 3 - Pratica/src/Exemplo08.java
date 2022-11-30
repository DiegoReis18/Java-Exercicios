/* Classe: Exemplo8.java
   Utilizacao do comando for
   Entra 10 numeros e Mostra somente os pares
   Se entrar zero para */
// Autor: Prof. Marcos Antonio
// Data: Março/2021

import javax.swing.JOptionPane;

public class Exemplo08
{
   public static void main(String args[])
   {
      String num;
      int    inum, cont;
      
      for(cont = 0; cont < 10; cont++)
      {
          num  = JOptionPane.showInputDialog("Entre com um numero: ");
          inum = Integer.parseInt(num);
          if(inum == 0)
        	  break;
          if(inum%2 != 0)
        	  continue;//lembrando q o continue volta para o inicio do for
          JOptionPane.showMessageDialog(null, "O numero: " + inum + " é PAR", "Uso do While, Break, Contonue",
                  JOptionPane.INFORMATION_MESSAGE);
      }
      System.exit(0);
   }
}
