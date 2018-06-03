package br.com.usjt.exercicio2.item3;

public class ConsoleLogService extends LogService {

	@Override
	protected LogParser getParser() {
		return new ConsoleLogParser();
	}

}
