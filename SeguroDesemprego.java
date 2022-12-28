package fundamentos;

import java.util.Scanner;

public class SeguroDesemprego {
public static void main(String[] args) {
	
	Scanner entrada= new Scanner(System.in);
	
	
	System.out.println("Nos informe seu salario:");
	Double salario = entrada.nextDouble();
	
	
	final double fator=0.8;
	double R =salario*fator;
	
	
	 System.out.printf("Seu seguro desemprego serade : %.2f",R);
}
}
