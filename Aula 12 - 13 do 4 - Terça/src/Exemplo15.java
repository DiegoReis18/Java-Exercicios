// Classe: Exemplo15.java
// Exemplo de método construtor
// Esta classe vai instanciar a classe Exemplo14
// Autor: Prof. Marcos Antonio
// Data: Abril/2021

 import javax.swing.JOptionPane;

 public class Exemplo15 
 {
    public static void main( String [] args ) 
    {
	 Exemplo14 data = new Exemplo14();
         JOptionPane.showMessageDialog(null, 
           "Sem Parametros" + "\nDia = " + data.dia +
           "\nMes = " + data.mes + "\nAno = " + data.ano,
           "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);

         Exemplo14 natal = new Exemplo14(25, 12, 2019); 
         JOptionPane.showMessageDialog(null, 
           "No Natal" + "\nDia = " + natal.dia +
           "\nMes = " + natal.mes + "\nAno = " + natal.ano,
           "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);
    }
 }