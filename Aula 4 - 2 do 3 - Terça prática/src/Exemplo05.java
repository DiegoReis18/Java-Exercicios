// Métodos
// classe: Exemplo5.java
 // Exempolo de utilização simples de métodos
// Autor: Prof. Marcos Antonio
// Data: Fevereiro/2021

 import javax.swing.JOptionPane; 

 public class Exemplo05
 {
       public static void Cadastrar(String Nome)
       {
          JOptionPane.showMessageDialog(null, "METODO CADASTRAR: Nome = " +
               Nome, "Cadastrando a Pessoa", JOptionPane.INFORMATION_MESSAGE);
       }
    
       public static void Alterar(int Idade)
       {
          JOptionPane.showMessageDialog(null, "METODO ALTERAR: Idade = " + 
               Idade, "Alterando a Pessoa", JOptionPane.INFORMATION_MESSAGE);

       }
   
       public static void Excluir(double Peso)
       {
          JOptionPane.showMessageDialog(null, "METODO EXCLUIR: Peso = " + 
               Peso, "Excluindo a Pessoa", JOptionPane.INFORMATION_MESSAGE);
       }

       public static void main( String args[])
       {
          String Nome, Id, Pes, Resp = "S";
          int    Idade;
          double Peso;

          while (Resp.equals("S") || Resp.equals("s"))  
          {
             Nome  = JOptionPane.showInputDialog("Entre com o Nome");
             Id    = JOptionPane.showInputDialog("Entre com a Idade");
             Idade = Integer.parseInt(Id);
             Pes   = JOptionPane.showInputDialog("Entre com o Peso");
             Peso  = Double.parseDouble(Pes);

             Cadastrar(Nome);
             Alterar(Idade);
             Excluir(Peso);
             Resp  = JOptionPane.showInputDialog("Deseja continuar : S ou N");
          }
          JOptionPane.showMessageDialog(null, "ENCERRAMENTO DA CLASSE Exexmplo9",
                "FIM", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
       }
 }
