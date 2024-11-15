package empresa;

abstract public class Moeda {

	
	double valor;
	
	/*CRIANDO UM COSTRUTOR PARA A CLASSE MÃE*/
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	 /*METODO ABSTRATO PARA IMPLEMENTAÇÃO NAS FILHAS*/
	abstract void info ();
	
	abstract double converter();	
	
	
	
}
