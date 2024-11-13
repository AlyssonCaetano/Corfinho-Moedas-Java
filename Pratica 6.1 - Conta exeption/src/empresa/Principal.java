package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Kratos", 6500);
		Conta c2 = new Conta("Hades", 3000);
		
		
		try {
			c1.info();
			c1.depositar(250);
			c1.info();
			c1.sacar(67);
			c1.info();
			c2.info();
			System.out.println("-----------------------------");
			}
		catch(Exception e) {
			System.out.println("erro, coloque outro valor");
			System.out.println(e.getMessage());
			}
		finally {
			System.out.println("Fechando ..");
		}
		
		System.out.println("Transgerindo 400...");
		c1.transferir(400, c2);
		c1.info();
		c2.info();

	}
}
