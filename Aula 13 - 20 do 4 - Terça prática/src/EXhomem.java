// Classe: Homem.Java
// Utiliza��o de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;

public class EXhomem extends EXanimal 
{    
   public void som() 
   { 
      JOptionPane.showMessageDialog(null, "OL�, COMO VAI ???",
         "EMISS�O DE SOM", JOptionPane.INFORMATION_MESSAGE);
   }    
}    
