public class Exemplo {
   public static void main(String[] args){
      System.out.print("X");
      try { // Divisão com inteiros
         int a = 1/0;
         System.out.print("M");
      } catch (ArithmeticException e) {
         TrataExemplo();
         System.out.print("Z");
      } catch (ArrayIndexOutOfBoundsException t) {
         System.out.print("Y");
      } finally {
         System.out.print("V");
      }
   }
   public static void TrataExemplo(){
      try {
         System.out.print("R");
      } catch (Exception ex2) {
         System.out.print("W");
      }
   }
}
