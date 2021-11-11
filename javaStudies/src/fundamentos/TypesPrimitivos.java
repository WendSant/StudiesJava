package fundamentos;

public class TypesPrimitivos {
	public static void main(String[] args) {
	
		//Tipos numéricos inteiros
		byte anosdeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 1_132_845_223L;
		
		//Tipos números reais
		
		float salario = 11_445.44F; 
		double vendasAcumuladas = 2_999_148_103.01;
		
		//Boolean
		boolean estaDeFerias = true; //or false
		//String
		
		String ferias = "";
		
		if(estaDeFerias == true) {
			ferias = "Está de férias";
		}else{
			ferias = "Não está de Férias";
		}
		
		//Tipo caracterer
		char status = 'A';
		String statusTwo = "";
		if(status== 'A') {
			statusTwo = "Funcionario ativo";
		}else{
			statusTwo = "Funcionario não está ativo";
		}
		
		//Dias de empresa
		System.out.println("Dias de empresa: "+ (anosdeEmpresa * 365));
		
		//Número de viagens
		System.out.println("Numero de voos: "+ (numeroDeVoos / 2));
		
		//Pontos por real
		System.out.println("Pontos acumulados: "+ (pontosAcumulados * vendasAcumuladas));
		System.out.println("O id: "+id+" ganha : R$"+salario);
		System.out.println("Status das férias: "+estaDeFerias+", Está de férias? "+ferias);
		System.out.println("Status é "+status+", Ativo: "+statusTwo);
		
	}
}
