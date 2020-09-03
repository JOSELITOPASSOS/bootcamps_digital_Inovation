package br.com.estudos.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		System.out.println("Criando uma Sequência Númerica...");
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(32);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Alterando a ordem da Sequência Númerica...");
		sequenciaNumerica.clear();
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(32);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Removendo um número da Sequência Númerica...");
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Retorna a qtd de itens da Sequência Númerica...");
		System.out.println(sequenciaNumerica);
		System.out.println(sequenciaNumerica.size());
		
		System.out.println("\nExemplos de como percorrer a Sequência Númerica...");
		System.out.println("Iterator");
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor Each:");
		for (Integer numero : sequenciaNumerica) {
			System.out.println(numero);
		}
		
		System.out.println("\nSequência Númerica está vazia? " +sequenciaNumerica.isEmpty());
		sequenciaNumerica.clear();
		System.out.println("Sequência Númerica está vazia? " +sequenciaNumerica.isEmpty()); 	
	}

}
