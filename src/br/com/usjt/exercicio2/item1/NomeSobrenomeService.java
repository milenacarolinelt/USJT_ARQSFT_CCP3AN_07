package br.com.usjt.exercicio2.item1;

public class NomeSobrenomeService extends NomeService{

	@Override
	protected NomeParser getParser() {
		return new NomeSobrenomeParser(); 
	}

}
