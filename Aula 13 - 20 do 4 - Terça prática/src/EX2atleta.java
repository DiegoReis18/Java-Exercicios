// Classe: Atleta.java
// Utilizacao de polimorfismo
// Se entrar zero para
// Autor: Prof. Marcos Antonio
// Data: Abril/2021


import javax.swing.JOptionPane;

public class EX2atleta
{
   private int peso;
   public EX2atleta (int p)
   {
      peso = p;
   }
   public String defineCategoria()
   {
      String cat;
      if(peso <= 50)
         cat = "Infantil";
      else if(peso <= 65)
         cat = "Juvenil";
      else
         cat = "Adulto";
      return cat;
   }
 }