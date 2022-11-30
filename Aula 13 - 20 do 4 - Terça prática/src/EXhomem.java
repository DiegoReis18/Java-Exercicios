// Classe: Homem.Java
// Utilização de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;

public class EXhomem extends EXanimal 
{    
   public void som() 
   { 
      JOptionPane.showMessageDialog(null, "OLÁ, COMO VAI ???",
         "EMISSÃO DE SOM", JOptionPane.INFORMATION_MESSAGE);
   }    
}    
