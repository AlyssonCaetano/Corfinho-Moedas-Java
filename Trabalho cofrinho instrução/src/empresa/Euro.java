package empresa;

public class Euro extends Moeda{
	
	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void info() {
		System.out.println("Valor em Euro adicionado: " + valor);
	}
	 
	/*coverter valores*/
	
	@Override
	public double converter() {
		return valor*6;
		
		
	}


	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", convertersão=" + converter() + "]";
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	

}
