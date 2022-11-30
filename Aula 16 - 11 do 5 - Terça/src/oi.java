
public class oi {

	public static int fib (int n) {
		if(n==0) {
			System.out.print(n); return 1;
		}
		if(n==1) {
			System.out.print(n); return 1;
		}
		int x  = fib(n-1) + fib(n-2);
		System.out.print(x);
		return x;
	}
   public static void main(String[] args) {
      fib(3);
   }

}
