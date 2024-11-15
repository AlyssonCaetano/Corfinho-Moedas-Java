package empresa;

public class Dolar extends Moeda {
	

	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		System.out.println("Valor em dolar");
	}
	 
	/*coverter valores*/
	@Override
	double converter() {
		double cv = valor*5.7;
		return cv;
		
	}
	
	
	
	
}
