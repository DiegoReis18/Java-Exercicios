// Classe: Cachorro.Java
// Utiliza��o de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;
	       
public class EXcao extends EXanimal 
{    
   public void som() 
   { 
      JOptionPane.showMessageDialog(null, "AUAUAUAUAUAUAUAU !!!",
         "EMISS�O DE SOM", JOptionPane.INFORMATION_MESSAGE);
   }    
}    
