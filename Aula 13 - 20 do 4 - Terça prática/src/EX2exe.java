// Classe: executaAtleta.java
// Utilizacao de polimorfismo
// Se entrar zero para
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;

public class EX2exe
{
   public static void main(String args[])
   {
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Atletas"));
      if(n == 0)
         System.exit(0);  
      int r, p;

      EX2lutador b; // referência da superclasse
      for(int i = 0; i < n; i++)
      {
          p = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso"));
          r = (int)(Math.random() * 100); // sorteia um lutador ou um atleta
          if(r % 2 == 0)
          {
             EX2atleta a = new EX2atleta(p);//Esse equivale a instancia do objeto
             JOptionPane.showMessageDialog(null, "Categoria: " + a.defineCategoria() + "\nPeso: " + p, 
                     "RESPOSTA", JOptionPane.INFORMATION_MESSAGE);
          }
          else
          {
             b = new EX2lutador(p);
             JOptionPane.showMessageDialog(null, "Categoria: " + b.defineCategoria() + "\nPeso: " + p, 
                     "RESPOSTA", JOptionPane.INFORMATION_MESSAGE);
          }

      }
      System.exit(0);  

   } 
}
