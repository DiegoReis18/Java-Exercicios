//Polimorfismo - sobrescrita
public class teste {
	 public static void main(String args[])
	   {
		 ClasseMãe cm = new ClasseMãe();
		 ClasseFilha cf = new ClasseFilha();
		 ClasseFilha2 cf2 = new ClasseFilha2();
		 ClasseNeta cn = new ClasseNeta();
		 
		 cm.qmsou();
		 cf.qmsou();
		 cf2.qmsou();
		 cn.qmsou();
		 
	   }
}
