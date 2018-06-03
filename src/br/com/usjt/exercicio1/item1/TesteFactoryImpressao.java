package br.com.usjt.exercicio1.item1;

public class TesteFactoryImpressao{

	public static void imprime(String texto){
		Impressao imp;
		double random = Math.random() * 100;
//		System.out.println((int)random  % 2);
		if((int)random % 2 == 0)
			imp = new ImprimeArquivo();
		else
			imp = new ImprimeConsole();
		imp.imprime(texto);
	}
	
	public static void main(String[] args) {
		imprime("1234");
		imprime("5678");
		imprime("9101");
	}

}
