package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luige", 2000);
		
		c1.info();
		c1.depositar(300);
		c1.info();
		c1.sacar(800);
		c1.info();
	}

}
