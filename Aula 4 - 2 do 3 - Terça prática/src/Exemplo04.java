
// Classe: Exemplo04.java
// Utiliza��o do comando if-else
// Autor: Prof. Marcos Antonio
// Data: Fevereiro/2021

import javax.swing.JOptionPane;

public class Exemplo04
{
   public static void main(String args[])
   {
      String priNumero,   // Primeiro string inserido pelo usu�rio
             segNumero,   // Segundo string inserido pelo usu�rio
             Resultado;   // Um string contendo o resultado das opera��es
      int    iNumero1,    // Primeiro numero a comparar
             iNumero2;    // Segundo numero a comparar

      // L� os n�meros digitados pelo usu�rio como string
      priNumero  = JOptionPane.showInputDialog("Entre o primeiro numero: ");
      segNumero  = JOptionPane.showInputDialog("Entre o segundo numero: ");

      // Converte os n�meros do tipo String para o tipo int
      iNumero1 = Integer.parseInt(priNumero);
      iNumero2 = Integer.parseInt(segNumero);

      // inicializa o resultado com o string vazio
      Resultado = "";

      if (iNumero1 == iNumero2)
         Resultado = Resultado + iNumero1 + " == " + iNumero2;
      else
         {
            Resultado = Resultado + iNumero1 + " != " + iNumero2;
            if (iNumero1 < iNumero2)
               Resultado = Resultado + "\n" + iNumero1 + " < " + iNumero2;
            else
               Resultado = Resultado + "\n" + iNumero1 + " > " + iNumero2;
         }

      // Exibe os Resultados
      JOptionPane.showMessageDialog(null, Resultado, "Testes com o if-else",
                                    JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
   }
}
