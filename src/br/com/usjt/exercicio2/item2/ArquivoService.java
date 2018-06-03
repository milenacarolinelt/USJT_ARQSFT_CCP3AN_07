package br.com.usjt.exercicio2.item2;

public abstract class ArquivoService {
	public void gerarArquivo() {
		ArquivoParser arquivoParser = getParser();
		arquivoParser.parse();
	}
	
	protected abstract ArquivoParser getParser();

}
