package br.com.usjt.exercicio2.item1;

public class SobrenomeNomeService extends NomeService{
	@Override
	protected NomeParser getParser() {
		return new SobrenomeNomeParser(); 
	}
}
