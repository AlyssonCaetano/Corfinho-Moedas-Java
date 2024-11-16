package empresa;

public class Dolar extends Moeda {
	

	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		
		System.out.println("Valor em dolar adicionado: " + valor);
			
		
	}
	 
	/*coverter valores*/
	
	@Override
	public double converter() {
		//taxa de conversão de dolar para real
		
		return 5.7*valor;
		
	}

	@Override
	public String toString() {
		return "Dolar [valor=" + valor + ", conversão =" + converter() + "]";
	}
	
	
	/*Fazer comparação com metodo hash*/
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
