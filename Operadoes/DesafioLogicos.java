package fundamentos.Operadoes;

public class DesafioLogicos {

public static void main(String[] args) {
	
	
	boolean trabalho1=true;
	boolean trabalho2=true;
	boolean sorvete= trabalho1 &&trabalho2;
	boolean tv32=  trabalho1 ^trabalho2;
	boolean tv50= trabalho1 ||trabalho2	;	
			
	
	System.out.println(sorvete);
	System.out.println(tv32);
	System.out.println(tv50);
	
	
	boolean trabalho3=false;
	boolean trabalho4=true;
	boolean sorvete2= trabalho3 ^trabalho4;
	boolean Tv32=  trabalho3 ^trabalho4;
	boolean Tv50= trabalho3 &&trabalho4	;
	
	
	 System.out.println(sorvete2);
		System.out.println(Tv32);
		System.out.println(Tv50);
		
		boolean trabalho5=false;
		boolean trabalho6=false;
		boolean sorvete3= trabalho5 ^trabalho6;
		boolean TV32=  trabalho5 ^trabalho6;
		boolean TV50= trabalho5 &&trabalho6	;
		
		
		 System.out.println(sorvete3);
			System.out.println(TV32);
			System.out.println(TV50);
		
		
}
}
