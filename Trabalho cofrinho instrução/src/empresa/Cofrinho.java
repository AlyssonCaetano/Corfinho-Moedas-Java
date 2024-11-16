package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	/**/
		
	
	/*COM O CONCEITO DE POLIMORFISMO , PODEMOS ADICIONAR DIFERENTES CLASSES FILHAS*/

	public void adicionar(Moeda m) {
		listaMoeda.add(m);
		}
	
	public void remover(Moeda m) {
		listaMoeda.remove(m);
		}
	
	public void listagemMoeda() {
		for (Moeda m : listaMoeda) {
			System.out.println(m);
		}
		}
	
	public void totalConvertido() {
			
			
		}

	
	
	
	
}
