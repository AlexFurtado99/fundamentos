package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//tipos numericos inteiros
		byte  anosDeEmpresa= 23;
		short numerosDeVoos= 541;
		int id= 24554;
		long pontosAcumulados= 5_245_454_878L;
		//tipos numericos reais
		
		float salario=11_445.41F;
		double vendasAcumuladas=2_354_878_395.01;
		//tipos booleanos
		boolean estaDeFerias= false;
		char status='A';
		// dias de empreas
		System.out.println(anosDeEmpresa*365);
		//numeros de viajems
		System.out.println(numerosDeVoos/2);
		//pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+":ganha ->"+ salario);
		System.out.println("ferias?"+estaDeFerias);
		System.out.println(status);
		
		
	}

}
