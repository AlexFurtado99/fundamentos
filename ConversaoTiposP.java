package fundamentos;

public class ConversaoTiposP {

	
	public static void main(String[] args) {
		
		double a=1.1234567884884;//implicita
		System.out.println(a);
		
		float b = (float)1.12345678848;//explicita (CAST)
		System.out.println(b);
		
		int c =280;
		byte d=(byte)c;
		System.out.println(d);
		
		double e=1;
		int f=(int)e;
		System.out.println(f);
	}
}
