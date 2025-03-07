package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	// Lista para armazenar as moedas
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	
	/**/
		
	
	/*COM O CONCEITO DE POLIMORFISMO , PODEMOS ADICIONAR DIFERENTES CLASSES FILHAS*/

	public void adicionar(Moeda m) {
		listaMoeda.add(m);
		m.info();
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
		
		double total = 0.0;
		for (Moeda m: listaMoeda) {
			total += m.converter(); // Soma os valores convertidos
		}
		System.out.println("O total convertido em Real é de: R$ " + total);
		
			
		}

	
	
	
	
}
