package br.com.usjt.exercicio2.item1;

public class NomeSobrenomeParser implements NomeParser {

	@Override
	public String parse(Nome nome) {
		return nome.nome + " " + nome.sobrenome + ";";
	}
}
