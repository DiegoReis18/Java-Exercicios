// Classe: Exemplo13.java
// Exemplo de m�todos
// Esta classe vai instanciar pela classe Exemplo13
// Autor: Prof. Marcos Antonio
// Data: Mar�o/2021

import javax.swing.JOptionPane;

 public class Exemplo13 
 {     
    public static void main(String[] args)
    { 
       JOptionPane.showMessageDialog(null, "Estou no M�todo main",    
          "COME�ANDO",JOptionPane.INFORMATION_MESSAGE);
           Exemplo12 exemp = new Exemplo12();
           exemp.Inicializa();
          exemp.Mostra();
          exemp.Altera();
          exemp.Mostra();
    }
}
