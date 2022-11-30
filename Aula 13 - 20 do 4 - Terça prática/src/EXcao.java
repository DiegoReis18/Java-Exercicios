// Classe: Cachorro.Java
// Utilização de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;
	       
public class EXcao extends EXanimal 
{    
   public void som() 
   { 
      JOptionPane.showMessageDialog(null, "AUAUAUAUAUAUAUAU !!!",
         "EMISSÃO DE SOM", JOptionPane.INFORMATION_MESSAGE);
   }    
}    
