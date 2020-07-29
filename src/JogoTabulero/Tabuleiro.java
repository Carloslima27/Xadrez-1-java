package JogoTabulero;

public class Tabuleiro {
	private int linha;
	private int coluna;
	protected Peca[][] peca;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		peca = new Peca[linha][coluna];
		
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public Peca peca(int linha, int coluna) {
		return peca[linha][coluna];
		
	}
}
