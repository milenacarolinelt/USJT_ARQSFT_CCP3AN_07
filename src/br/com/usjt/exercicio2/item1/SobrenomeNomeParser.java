package br.com.usjt.exercicio2.item1;

public class SobrenomeNomeParser implements NomeParser{
	@Override
	public String parse(Nome nome) {
		return nome.sobrenome + ", " + nome.nome + ";";
	}
}
