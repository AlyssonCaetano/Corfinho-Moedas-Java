package empresa;

public class Real extends Moeda{
	
	public Real(double valor) {
		super(valor);// Chama o construtor da classe mãe (Moeda)

		
	}

	
	@Override
	void info() {
		System.out.println("Valor em Real adicionado: " + valor);
	}
	 
	/*coverter valores*/
	
	@Override
	public double converter() {
		return valor*1;
		
		
	}


	@Override
	public String toString() {
		return "Real [valor=" + valor + ", converter()=" + converter() + "]";
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
