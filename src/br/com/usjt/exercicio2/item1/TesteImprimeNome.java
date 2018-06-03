package br.com.usjt.exercicio2.item1;

import java.util.ArrayList;

public class TesteImprimeNome {
	public void imprime(ArrayList<Nome> nomes) {
		NomeService nomeService;
		for (Nome nome : nomes) {
			switch (nome.tipo) {
			case NOMESOBRENOME:
				nomeService = new NomeSobrenomeService();
				nomeService.display(nome);
				break;
			case SOBRENOMENOME:
				nomeService = new SobrenomeNomeService();
				nomeService.display(nome);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Nome> nome = new ArrayList<>();
		nome.add(new Nome("Milena", "Caroline", Tipo.NOMESOBRENOME));
		nome.add(new Nome("Milena", "Caroline", Tipo.SOBRENOMENOME));
		nome.add(new Nome("Isabella", "Cristina", Tipo.SOBRENOMENOME));
		nome.add(new Nome("Isabella", "Cristina", Tipo.NOMESOBRENOME));
		
		TesteImprimeNome imprimeNome = new TesteImprimeNome();
		imprimeNome.imprime(nome);
	}
}
