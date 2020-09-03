package br.com.estudos.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Joselito
 *
 */
public class ExampleList {

	public static void main(String[] args) {
		
		System.out.println("Criando uma lista...");
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Carlos");
		nomes.add("Maria");
		nomes.add("João");
		System.out.println(nomes + "\n");
		
		System.out.println("Ordenando...");
		Collections.sort(nomes);
		System.out.println(nomes + "\n");
		
		System.out.println("Alterando um elemento \"Juliana\" por \"Larissa\"...");
		nomes.set(2, "Larissa");
		System.out.println(nomes + "\n");
		
		System.out.println("Removendo um elemento:");
		
		System.out.println("Pelo indice \"03\"!!");
		nomes.remove(3);
		System.out.println(nomes + "\n");
		
		System.out.println("Pelo valor \"Carlos\"!!");
		nomes.remove("Carlos");
		System.out.println(nomes + "\n");
		
		System.out.println("Obtendo um elemento pelo indice \"02\"...");
		String nome = nomes.get(2);
		System.out.println(nome + "\n");
		
		System.out.println("Obtendo tamanho da lista...");
		int tamanho = nomes.size();
		System.out.println(nomes);
		System.out.println("Tamanho da lista: "+tamanho+ "!\n");
				
		System.out.println("Checando se a lista contêm o nome \"Anderson\"...");
		boolean temAnderson = nomes.contains("Anderson");
		System.out.println(nomes);
		System.out.println("Lista contêm o elemento: " +temAnderson+ "\n");
		
		System.out.println("Obtendo o indice pelo valor \"João\"!");
		int posicao = nomes.indexOf("João");
		System.out.println(nomes);
		System.out.println("João está no indice: " +posicao);
		
		System.out.println("Buscando um indice de um valor que não existe na lista \"Wesley\"!");
		int posicaoNaoExiste = nomes.indexOf("Wesley");
		System.out.println(nomes);
		System.out.println("Wesley está no indice: " +posicaoNaoExiste);
		
		System.out.println("Exemplos Como percorrer a lista!!\n");
		
		System.out.println("For Each");
		for(String valorItem : nomes) {
			System.out.println("-->" + valorItem);
		}
		
		System.out.println("\nIterator");
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println("-->" + iterator.next());	
		}
		
		System.out.println("\nLista vazia? " +nomes.isEmpty());
		nomes.clear();
		System.out.println("Lista vazia? " +nomes.isEmpty()); 
		
	}

}
