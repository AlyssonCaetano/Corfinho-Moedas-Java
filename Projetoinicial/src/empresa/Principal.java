package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		
		idade = idade + 12;
		
		// Variavel float com mais precisão
		double peso = 72.5;
		//float peso2 = 80.6; // deu erro
		float peso2 = 80.6f; // o f indica que a variavel e double 
		String nome = "Manolo";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso e nome");
		
		idade = teclado.nextInt();
		peso = teclado.nextFloat();
		//peso2 = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Nome" + nome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Peso: %.2f\n", peso);
		
		
		System.out.println("Hello world");
		System.out.println("Hello people");
		
		// estrutura condicional
		
		if (idade <18) {
			System.out.println("Acesso bloqueado");
			
		}
		else if (idade <65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso");
		}
		
		// laço para
		for (int i=0; i10; i++) {
			System.out.println("Valor: " +i);
		}
		
		
		// array = lista
		//arrayList
		
		int	megaSena[] = {11,14,21,30,37,56};
		megaSena[0] = 10;
		
		int numeros[] = new int [200];
		numetos[60]=50;
	}

}
