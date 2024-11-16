package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
				
		System.out.println("----------MENU COFRINHO----------");
		System.out.println("1-Adicionar ");
		System.out.println("2-Remover Moeda ");
		System.out.println("3-Listar Moeda");
		System.out.println("4-Calcular total convrtyido para Real");
		System.out.println("0-Encerar");
		System.out.println("Escolha uma opção (0-4): ");
		opcao = teclado.nextInt();
				
		while (opcao!=0) {
				/*VALIDANDO A OPÇÃO DE ENTRADA DO MENU*/
				if (opcao < 0 || opcao > 4  ) {
					System.out.println("*******Insira uma opção válida: ******** ");
					
				} else if (opcao == 1) {
					/*ADICIONAR MOEDA E ESCOLHER QUAL O TIPO*/
					int tipoMoeda = 0;
					while (tipoMoeda >3 || tipoMoeda < 1) {
						System.out.println("----------TIPO DE MOEDA----------");
						System.out.println("1-Dolar ");
						System.out.println("2-Real ");
						System.out.println("3-Euro");
						tipoMoeda = teclado.nextInt();
					}
					
					System.out.println("Qual o valor a ser ADICIONADO? : ");
					double valorAdicionar = teclado.nextInt();	
					Moeda moeda = null;
					
					/*VERIFICANDO A OPÇÃO DESEJADA*/
					if (tipoMoeda == 1) {
						moeda = new Dolar(valorAdicionar);						
					}	
					if (tipoMoeda == 2) {
						moeda = new Real(valorAdicionar);		
					}
					
					if (tipoMoeda == 3) {
						moeda = new Euro(valorAdicionar);					
					}				
					
					cofrinho.adicionar(moeda);
					
					
					
				} else if (opcao == 2) {
					/*REMOVER MOEDA*/
					
					int tipoMoeda = 0;
					while (tipoMoeda >3 || tipoMoeda < 1) {
						System.out.println("----------TIPO DE MOEDA----------");
						System.out.println("1-Dolar ");
						System.out.println("2-Real ");
						System.out.println("3-Euro");
						tipoMoeda = teclado.nextInt();
					}
					
					System.out.println("Qual o valor a ser REMOVIDO? : ");
					
					/*MOSTRANDO OS VALORES DISPONÍVEIS PARA REMOVER DA LISTA*/
					cofrinho.listagemMoeda();
					
					double valorRemover = teclado.nextInt();	
					Moeda moeda = null;
					
					/*VERIFICANDO A OPÇÃO DESEJADA*/
					if (tipoMoeda == 1) {
						moeda = new Dolar(valorRemover);						
					}	
					if (tipoMoeda == 2) {
						moeda = new Real(valorRemover);		
					}
					
					if (tipoMoeda == 3) {
						moeda = new Euro(valorRemover);					
					}				
					
					cofrinho.remover(moeda);
					
					
				} else if (opcao == 3) {
					System.out.println("Listando moedas....");
					System.out.println();
					
					cofrinho.listagemMoeda();
					
				} else if (opcao == 4) {
					/*CALCULAR TOTAL COVERTIDO PARA REAL*/
					
				}
				
			System.out.println("----------COFRINHO----------");
			System.out.println("1-Adicionar ");
			System.out.println("2-Remover Moeda ");
			System.out.println("3-Listar Moeda");
			System.out.println("4-Calcular total convrtyido para Real");
			System.out.println("0-Encerar");
			System.out.println("Escolha uma opção (0-4): ");
			opcao = teclado.nextInt();
			}
		System.out.println("Encerrando o programa ...");
		
		
		
		
		
	}

}
