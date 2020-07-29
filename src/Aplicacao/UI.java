package Aplicacao;

import xadrex.PecaXadrez;

public class UI {

	public static void printTabuleiro(PecaXadrez[][] peca) {
		for(int i = 0; i < peca.length; i++) {
			System.out.print((8-i) + " ");
			for(int j = 0; j < peca.length; j++) {
				PrintPeca(peca[i][j]);
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
	private static void PrintPeca(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
