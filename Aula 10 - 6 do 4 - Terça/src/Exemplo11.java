// Classe: Exemplo11.java
// Exemplo simples de m�todos
// Autor: Prof. Marcos Antonio
// Data: Mar�o/2021

import javax.swing.JOptionPane;

 public class Exemplo11 
 {     
    static int dia, mes, ano;
    public static void Inicializa()
    {
        dia = 01;
        mes = 02;
        ano = 2018; 
    } 
    public static void Altera()
    {
        dia = 02;
        mes = 03;
        ano = 2018; 
    } 
    public static void Mostra()
    { 
       JOptionPane.showMessageDialog(null,"Dia: "+dia+"\nM�s: "+ 
          mes+"\nAno: "+ano,"MOSTRANDO",
          JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args)
    { 
       JOptionPane.showMessageDialog(null, "Estou no M�todo main",    
          "COME�ANDO",JOptionPane.INFORMATION_MESSAGE);
       Inicializa();
       Mostra();
       Altera();
       Mostra();
       System.exit(0);
    }
 }
