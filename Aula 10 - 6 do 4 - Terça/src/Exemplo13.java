// Classe: Exemplo13.java
// Exemplo de métodos
// Esta classe vai instanciar pela classe Exemplo13
// Autor: Prof. Marcos Antonio
// Data: Março/2021

import javax.swing.JOptionPane;

 public class Exemplo13 
 {     
    public static void main(String[] args)
    { 
       JOptionPane.showMessageDialog(null, "Estou no Método main",    
          "COMEÇANDO",JOptionPane.INFORMATION_MESSAGE);
           Exemplo12 exemp = new Exemplo12();
           exemp.Inicializa();
          exemp.Mostra();
          exemp.Altera();
          exemp.Mostra();
    }
}
