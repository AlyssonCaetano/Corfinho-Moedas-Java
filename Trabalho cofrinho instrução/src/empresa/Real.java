package empresa;

public class Real extends Moeda{
	
	public Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void info() {
		System.out.println("Valor em dolar: " );
	}
	 
	/*coverter valores*/
	
	@Override
	double converter() {
		double cv = valor*1;
		return cv;
		
	}


	@Override
	public String toString() {
		return "Real [valor=" + valor + ", converter()=" + converter() + "]";
	}
	
	
}
