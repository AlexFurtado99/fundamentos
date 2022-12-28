package fundamentos;

import java.util.Scanner;


public class Desafioconversao {
	
	public static void main(String[] args) {
		
		
		    Scanner entrada = new Scanner(System.in); 
		    
			System.out.print("Me informe o seu salario referente ao mês 9/2021:");
			String valor1= entrada.next().replace(".",",");
	
			 
			 System.out.print("Me informe o seu salario referente ao mês 10/2021:");
			 String valor2= entrada.next().replace(".",",");
 
			 
			 System.out.print("Me informe o seu salario referente ao mês 11/2021:");
			 String valor3= entrada.next().replace(".",",");
	
			 
			 double salario1=Double.parseDouble(valor1);
			 double salario2=Double.parseDouble(valor2);
			 double salario3=Double.parseDouble(valor3);

			 double media=salario1+salario2+salario3;
			 System.out.println("Esta é a media referentes aos 3 salarios informados:"+media/3);
			 
			 
			 entrada.close();
		}
		 
	

}
