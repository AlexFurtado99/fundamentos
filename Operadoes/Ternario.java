package fundamentos.Operadoes;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media=3.8;
		String Recuperacao= media>=5.0 ? "Recuperação":"Reprovado";
		String resultado= media>=7.0 ?"Aprovado":Recuperacao;
		System.out.println("O aluno esta:"+resultado);
		
	}

}
