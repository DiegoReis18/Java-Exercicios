// Classe: Exemplo12.java
// Exemplo de métodos
// Esta classe vai ser instanciada pela classe Exemplo13
// Autor: Prof. Marcos Antonio
// Data: Março/2021

import javax.swing.JOptionPane;

 public class Exemplo12 
 {     
    int dia, mes, ano;
    public void Inicializa()
    {
        dia = 01;
        mes = 02;
        ano = 2018; 
    } 
    public void Altera()
    {
        dia = 02;
        mes = 03;
        ano = 2018; 
    } 
    public void Mostra()
    { 
       JOptionPane.showMessageDialog(null,"Dia: "+dia+"\nMês: "+ 
          mes+"\nAno: "+ano,"MOSTRANDO", 
          JOptionPane.INFORMATION_MESSAGE);
    }
}