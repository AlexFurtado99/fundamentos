package fundamentos;

public class TiposString {
	
	
public static void main(String[] args) {
	

	
	var  Nome="Alex";
	var Idade= 23;
	double Salario= 1900.00;
	
	System.out.printf("Monsieur %s de %d ans ,gagne exactement un salaire de %.2f",Nome,Idade,Salario);
	
	String frase =String.format("\nMonsie ur %s de %d ans ,gagne exactement un salaire de %.2f",Nome,Idade,Salario);
	
	System.out.println(frase);


}
	
}

