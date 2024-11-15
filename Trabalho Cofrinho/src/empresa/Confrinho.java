package empresa;

import java.util.ArrayList;

public abstract class Confrinho  {
	
	
	abstract double moedas();
	private ArrayList<String> listaMoedas = new ArrayList<String>();
	

	public void adicionar(int index, String element) {
		listaMoedas.add(index, element);
	}
	
	
	public void remover(Moeda) {
		
	}
	
	abstract void info();

	
	
	
	
}
