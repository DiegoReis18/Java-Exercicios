// Classe: testaAnimal.Java
// Utilização de polimorfismo
// Autor: Prof. Marcos
// Data: Abril/2019

import javax.swing.JOptionPane;

public class EXteste 
{

   public static void main(String[] args) 
   {  
	  String cont = "S";
	  while (cont.equals("S") || cont.equals("s"))
	  {
         EXanimal a;    
         EXgato g = new EXgato();    
         EXcao c = new EXcao();    
         EXhomem h = new EXhomem();    
         a = g;    
         a.som();  // vai ecoar um miau...    
         a = c;    
         a.som(); // vai ecor um auauau...    
         a = h;    
         a.som(); // vai ecor um Como Vai...
         cont = JOptionPane.showInputDialog("Você quer fazer outra vêz ???");
      }
   }
}