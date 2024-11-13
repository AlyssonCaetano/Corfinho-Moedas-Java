package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luige", 2000);
		
		try {
			c1.info();
			c1.depositar(300);
			c1.info();
			c1.sacar(800);
			c1.info();
			c2.info();
			System.out.println("-----------------------------");
			}
		catch(Exception e) {
			System.out.println("Ocorreu um erro, coloque outro valor");
			System.out.println(e.getMessage());
			}
		finally {
			System.out.println("Fechando o problema");
		}
		
		System.out.println("Transgerindo 400...");
		c1.transferir(400, c2);
		c1.info();
		c2.info();

	}
}
