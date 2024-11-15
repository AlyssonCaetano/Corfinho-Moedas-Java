package empresa;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		
		System.out.println("----------COFRINHO----------");
		System.out.println("1-Adicionar ");
		System.out.println("2-Remover Moeda ");
		System.out.println("3-Listar Moeda");
		System.out.println("4-Calcular total convrtyido para Real");
		System.out.println("0-Encerar");
		System.out.println("Escolha uma opção (0-4): ");
		
		int q = 0;
		while (q == 0) {
			int opcao = teclado.nextInt();
			if (opcao < 0 || opcao > 4  ) {
				System.out.println("Insira uma opção válida: ");
				q = 0;
			} else { 
				System.out.println("Voce digitou" + opcao);
				q = 1;}
			}
		
			
		
		
		
		
		
		
		
		

	}

}
