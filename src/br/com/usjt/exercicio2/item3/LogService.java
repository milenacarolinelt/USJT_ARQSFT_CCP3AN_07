package br.com.usjt.exercicio2.item3;

public abstract class LogService {
	public void imprimeLog(int size){
		LogParser logParser = getParser();
		logParser.imprime(size);
	}
	
	protected abstract LogParser getParser();
}
