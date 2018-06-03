package br.com.usjt.exercicio2.item3;

public class ArquivoLogService extends LogService{

	@Override
	protected LogParser getParser() {
		return new ArquivoLogParser();
	}

}
