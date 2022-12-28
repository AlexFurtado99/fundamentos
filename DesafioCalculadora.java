package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		Double valor1= entrada.nextDouble();
		
		System.out.println("Informe um outro numero:");
		Double valor2=entrada.nextDouble();
		
		System.out.println("Informe o tipo de operaçao:");
		String operacao = entrada.next();
		
		Double result="+".equals(operacao) ? valor1+valor2 : 0;
		result="-".equals(operacao) ? valor1-valor2:result;
		result="*".equals(operacao) ? valor1*valor2:result;
		result="/".equals(operacao) ? valor1/valor2:result;
		result="%".equals(operacao) ? valor1%valor2:result;



		System.out.printf("%.2f %s %.2f=%.2f",valor1,operacao,valor2,result);
		
		entrada.close();
		
		 
		
	}

}
