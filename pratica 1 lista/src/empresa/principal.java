package empresa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class principal {

	public static void main(String[] args) {
		
		//ArrayList<Integer> megaSena = new ArrayList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		String nome;
		
		for (int i =0;i<qtd;i++ ) {
			nome = teclado.next();
			listaNomes.add(nome);
					
		}
		
		/*for (int i=listaNomes.size()-1; i>=0; i--) {
			System.out.print(listaNomes.get(i));
		*/
		
		System.out.println("Ordem normal");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa");
		System.out.println(listaNomes);
		

	}

}
