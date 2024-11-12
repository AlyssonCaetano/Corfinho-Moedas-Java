package Empresa;

public class Ingresso {

	String nomeEvento;
	double valor;
	
	
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}



	public void info() {
		System.out.println("NOme evento: " + nomeEvento);
		System.out.println("Valor ingresso: " + valor);
	}
	
	
}
