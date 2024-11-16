package empresa;

public class Euro extends Moeda{
	
	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	void info() {
		System.out.println("Valor em Euro: " );
	}
	 
	/*coverter valores*/
	
	@Override
	double converter() {
		double cv = valor*6;
		return cv;
		
	}


	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", converter()=" + converter() + "]";
	}
	
	

}
