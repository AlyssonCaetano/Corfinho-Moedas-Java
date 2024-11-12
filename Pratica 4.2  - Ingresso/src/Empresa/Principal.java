package Empresa;

public class Principal {

	public static void main(String[] args) {
		
		ingressoVip iv = new ingressoVip("Rocl in rio", 200, 100);
		
		iv.info();
		
		Ingresso ic = new Ingresso("Acustico CBJ", 500);
		ic.info();

	}

}
