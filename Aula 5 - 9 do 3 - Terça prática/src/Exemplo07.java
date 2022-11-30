/* Classe: Exemplo7.java
/  Utilizacao do comando do-while
   Entra 10 numeros e Mostra somente os pares
   Se entrar zero para */


import javax.swing.JOptionPane;

public class Exemplo07
{
   public static void main(String args[])
   {
      String num;
      int    inum, cont;
      
      cont = 0;
      do
      {
          num  = JOptionPane.showInputDialog("Entre com um numero: ");
          inum = Integer.parseInt(num);
          if(inum == 0) 
        	  break;
          if(inum%2 != 0) 
        	  continue;
 
          JOptionPane.showMessageDialog(null, "O numero: " + inum + " é PAR", "Uso do While, Break, Contonue",
                  JOptionPane.INFORMATION_MESSAGE);
          cont++;
          
      }
      while(cont < 10);
      System.exit(0);
   }
}