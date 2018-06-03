package br.com.usjt.exercicio2.item1;

public abstract class NomeService {
	
	public void display(Nome nome){
		NomeParser parser = getParser();
		System.out.println(parser.parse(nome));
	}
	
	protected abstract NomeParser getParser();

}
