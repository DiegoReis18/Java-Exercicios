//vetores

import javax.swing.JOptionPane;

 public class Exemplo10      
{
     static String Resp = "S";
     
     public static void main(String args[])
     {
          int Numeros[] = new int[5];
          String Numero;
          int i, j, iNum;

          while(Resp.equals("S") || Resp.equals("s"))
          {
             JOptionPane.showMessageDialog(null,"Entre com os N�meros",
               "ENTRADA DOS N�MEROS", JOptionPane.INFORMATION_MESSAGE);
             for(i=0; i < 5; i++)
             {
                Numero = JOptionPane.showInputDialog("Entre com o "+ (i+1) +
                                  "N�mero:");
                iNum = Integer.parseInt(Numero);
                Numeros[i] = iNum;
             }
             JOptionPane.showMessageDialog(null,"Vou Mostrar os N�meros",
                     "N�O CLASSIFICADOS", JOptionPane.INFORMATION_MESSAGE);
                   for(i=0; i < 5; i++)
                   {
                      JOptionPane.showMessageDialog(null,"O "+ (i+1) + " Numero = " + 
                        Numeros[i], "N�MEROS N�O CLASSIFICADOD", 
                        JOptionPane.INFORMATION_MESSAGE);
                   }
                   JOptionPane.showMessageDialog(null,"Vou Classificar os N�meros",
                     "CLASSIFICA��O DOS N�MEROS", 
                     JOptionPane.INFORMATION_MESSAGE);
                   for(i=0; i < 5; i++)
                      for(j=i+1; j < 5; j++)
                      {
                         if(Numeros[i] > Numeros[j])
                         {
                            iNum = Numeros[i];                            
                            Numeros[i] = Numeros[j];
                            Numeros[j] = iNum;
                      }   
                   }   
                   JOptionPane.showMessageDialog(null,"Vou Mostrar os N�meros",
                     "CLASSIFICADOS", JOptionPane.INFORMATION_MESSAGE);
                      for(i=0; i < 5; i++)
                   {
                      JOptionPane.showMessageDialog(null,"O " + (i+1) + " Numero = " + 
                        Numeros[i], "CLASSIFICADO", 
                       JOptionPane.INFORMATION_MESSAGE);
                   }
                   Resp  = JOptionPane.showInputDialog("Deseja fazer de novo ? S ou N");

               }
               System.exit(0);
           }
      }