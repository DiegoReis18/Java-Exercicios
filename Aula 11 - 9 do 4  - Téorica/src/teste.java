//Polimorfismo - sobrescrita
public class teste {
	 public static void main(String args[])
	   {
		 ClasseM�e cm = new ClasseM�e();
		 ClasseFilha cf = new ClasseFilha();
		 ClasseFilha2 cf2 = new ClasseFilha2();
		 ClasseNeta cn = new ClasseNeta();
		 
		 cm.qmsou();
		 cf.qmsou();
		 cf2.qmsou();
		 cn.qmsou();
		 
	   }
}
