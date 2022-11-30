// Classe: Exemplo09.java
// Exemplo simples de utilização do Switch com o break
// Autor: Prof. Marcos Antonio
// Data: Março/2021


import javax.swing.JOptionPane;

class Exemplo09
{
   public static void main(String args[])
   {
      String x;
        int ix;

      x = JOptionPane.showInputDialog("Entre com o valor de x");
      ix = Integer.parseInt(x);
      switch(ix)
      {
         case 1:
            System.out.println("Entrou com 1");
            break;
         case 2:
            System.out.println("Entrou com 2");
            break;
         case 3:
            System.out.println("Entrou com 3");
            break;
         default:
            System.out.println("Entrou com um valor diferente de 1,2,3");
            break;
      }
      System.exit(0);
   }
}