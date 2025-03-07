package empresa;

import java.util.Objects;

abstract public class Moeda {

	
	double valor;
	
	
	/*CRIANDO UM COSTRUTOR PARA A CLASSE MÃE MOEDA*/
	public Moeda(double valor) {
		super();
		this.valor = valor;
		
	}
	
	 /*METODO ABSTRATO PARA IMPLEMENTAÇÃO NAS FILHAS*/
	abstract void info ();
	
	abstract double converter();

	
	
	
	/*Fazer comparação com metodo hash*/
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}	
	
	
	
	
	
}
