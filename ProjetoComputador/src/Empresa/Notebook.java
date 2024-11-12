package Empresa;

public class Notebook extends Computador {
	int polegadasTela;

	@Override
	double calculaValor() {
		double total = 250*gbMemoria + 500*numProcessadores + polegadasTela;
		return total;
	}

	public Notebook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}
	
	
	
}
