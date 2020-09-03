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
		
		System.out.println("Criando uma Lista...");
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Carlos");
		nomes.add("Maria");
		nomes.add("Jo�o");
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
		
		System.out.println("Obtendo tamanho da Lista...");
		int tamanho = nomes.size();
		System.out.println(nomes);
		System.out.println("Tamanho da Lista: "+tamanho+ "!\n");
				
		System.out.println("Checando se a Lista cont�m o nome \"Anderson\"...");
		boolean temAnderson = nomes.contains("Anderson");
		System.out.println(nomes);
		System.out.println("Lista cont�m o elemento: " +temAnderson+ "\n");
		
		System.out.println("Obtendo o indice pelo valor \"Jo�o\"!");
		int posicao = nomes.indexOf("Jo�o");
		System.out.println(nomes);
		System.out.println("Jo�o est� no indice: " +posicao);
		
		System.out.println("Buscando um indice de um valor que n�o existe na Lista \"Wesley\"!");
		int posicaoNaoExiste = nomes.indexOf("Wesley");
		System.out.println(nomes);
		System.out.println("Wesley est� no indice: " +posicaoNaoExiste);
		
		System.out.println("Exemplos Como percorrer a Lista!!\n");
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
