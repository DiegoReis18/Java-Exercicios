import java.util.Scanner;
public class Scan {	

		public static void main(String args[]) {
			String nome;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o seu nome");
			nome = scan.nextLine();
			System.out.println("Seu nome é: "+nome);
		}
	}