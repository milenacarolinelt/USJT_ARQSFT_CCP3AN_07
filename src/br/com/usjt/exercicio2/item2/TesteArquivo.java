package br.com.usjt.exercicio2.item2;

public class TesteArquivo {
	public static void main(String[] args) {
		ArquivoService service = new ArquivoConfidencialService();
		service.gerarArquivo();
		
		service = new ArquivoPublicoService();
		service.gerarArquivo();
	}
}
