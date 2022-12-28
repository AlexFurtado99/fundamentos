package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		int F= 86;
		final double n1=32;
		final double conv=5/9.0;
		double C=  (F-n1)*conv;
		
		System.out.println(C);
		
		 F=150;
		 C=(F-n1)*conv;
	
		System.out.println("O resultado  "+C +" C");
		
	
	}
	
	
}
 