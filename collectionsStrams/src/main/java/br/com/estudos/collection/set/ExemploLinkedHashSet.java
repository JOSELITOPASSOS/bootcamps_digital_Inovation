package br.com.estudos.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		System.out.println("Criando uma Sequ�ncia N�merica...");
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(32);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Alterando a ordem da Sequ�ncia N�merica...");
		sequenciaNumerica.clear();
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(32);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Removendo um n�mero da Sequ�ncia N�merica...");
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica + "\n");
		
		System.out.println("Retorna a qtd de itens da Sequ�ncia N�merica...");
		System.out.println(sequenciaNumerica);
		System.out.println(sequenciaNumerica.size());
		
		System.out.println("\nExemplos de como percorrer a Sequ�ncia N�merica...");
		System.out.println("Iterator");
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor Each:");
		for (Integer numero : sequenciaNumerica) {
			System.out.println(numero);
		}
		
		System.out.println("\nSequ�ncia N�merica est� vazia? " +sequenciaNumerica.isEmpty());
		sequenciaNumerica.clear();
		System.out.println("Sequ�ncia N�merica est� vazia? " +sequenciaNumerica.isEmpty()); 	
	}

}
