// Se entrar zero para
// Utilizacao do comando while
// Entra 10 numeros e Mostra somente os pares



import javax.swing.JOptionPane;

public class Exemplo06
{
   public static void main(String args[])
   {
      String num;
      int    inum, cont;
      
      cont = 0;
      while(cont < 10)
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
      System.exit(0);
   }
}
