package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Byte x = 100;
		Short y = 1000;
		Integer k = Integer.parseInt(entrada.nextLine());
		Long u = 1000000L;// long

		System.out.println(x.byteValue());
		System.out.println(u.toString());
		System.out.println(k * 6);
		System.out.println(y+60);

		
		Boolean bo= Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		Character c = '@';
		System.out.println(c+"...");
		
		
		
		
		entrada.close();
	}
}