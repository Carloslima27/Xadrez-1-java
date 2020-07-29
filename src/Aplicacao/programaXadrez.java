package Aplicacao;

import xadrex.PartidaXadrez;

public class programaXadrez {

	public static void main(String[] args) {
			
		PartidaXadrez x = new PartidaXadrez();
		UI.printTabuleiro(x.getPeca());

	}

}
