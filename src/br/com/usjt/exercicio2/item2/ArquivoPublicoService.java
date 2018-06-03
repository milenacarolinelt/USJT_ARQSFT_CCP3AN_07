package br.com.usjt.exercicio2.item2;

public class ArquivoPublicoService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoPublicoParser();
	}

}
