package br.com.usjt.exercicio2.item2;

public class ArquivoConfidencialService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoConfidencialParser();
	}

}
