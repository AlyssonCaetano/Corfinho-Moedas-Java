package empresa;

public class Conta {
	
	String nome;
	double saldo;
	
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	
	void depositar(int valor) {
		if (valor<0) {
			throw new RuntimeException("Valor inválido");
		}
		saldo += valor;
	}
	
	void sacar(double valor)  {
		
		if(valor > saldo) {
			throw new RuntimeException("Saldo insuficiente");
		}
		
		if (valor<0) {
			throw new RuntimeException("Valor inválido");
		}
		saldo -= valor;
	}
	
	
	
	void transferir(double valor, Conta destino) {
		
		if(valor > saldo) {
			throw new RuntimeException("Saldo insuficiente");
		}
		
		if (valor<0) {
			throw new RuntimeException("Valor inválido");
		}
		
		saldo-=valor;
		destino.saldo+=valor;
		
	}
	
	/*SIMPLIFICANDO O CODIGO E EVITANDO DUPLICIDADE
	 * void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}*/
	
	void info() {
		System.out.println("-----------");
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
	}
	
	

}
