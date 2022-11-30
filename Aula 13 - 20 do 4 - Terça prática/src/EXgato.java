// Classe: Gato.Java
// Utilização de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;
           
public class EXgato extends EXanimal 
{    
   public void som() 
   { 
      JOptionPane.showMessageDialog(null, "MIAUUUUUUUU !!",
         "EMISSÃO DE SOM", JOptionPane.INFORMATION_MESSAGE);
   }    
} 