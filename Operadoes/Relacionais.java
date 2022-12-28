package fundamentos.Operadoes;

public class Relacionais {
	
	public static void main(String[] args) {
		
	int a=97;
	int b='a';
	System.out.println(b == a);
	
	System.out.println('\u0061');
	
	System.out.println(3>4);
	System.out.println(3>=4);
	System.out.println(3>=3);
	System.out.println(30!=370);
	
	boolean bomComportamento=true;
	double nota=11.9;
	boolean passouPorMedia=nota>10;
	boolean temDesconto=bomComportamento && passouPorMedia;
	String resultato =temDesconto ? "sim":"nao";
	
	System.out.println("Tem desconto?"+ resultato);
	
	
	
	
	
	
	}

}
