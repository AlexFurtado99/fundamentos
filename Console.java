package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("bom\n");
		System.out.print("dia!\n\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d",1,2,3);
				
		Scanner entrada = new Scanner(System.in);
		

		
		System.out.print("\n\nDigite seu anime preferido:");
		String anime = entrada.nextLine();
		System.out.print("\n\nDigite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("\n\nAnime:"+anime);
		System.out.println("Nome:"+nome);
		System.out.printf  ("Seu nome é %s e seu anime preferido é %s",nome,anime);
		
		System.out.print("\nDigite sua idade");
		int idade = entrada.nextInt();
		System.out.printf("%s que tem %s como anime preferido e fez %d anos em maio ",nome,anime,idade);
		
		entrada.close();
	}
}
