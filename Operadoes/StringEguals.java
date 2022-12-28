package fundamentos.Operadoes;
import java.util.Scanner;
public class StringEguals {
	

	
	public static void main(String[] args) {
		
			
	System.out.println("2"=="2");
	String S=new String("2");
	System.out.println("2".equals(S));
	
	Scanner entrada= new Scanner(System.in);
	
	String s2= entrada.next();
	System.out.println("2".equals(s2.trim()));
	
	entrada.close();
	
	
	
	
	}

}
