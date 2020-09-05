package br.com.estudos.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		System.out.println("Criando uma �rvore com as capitais...");
		TreeSet<String> treeCapitais = new TreeSet<String>();
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florian�polis");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizando");
		treeCapitais.add("Aracaju");
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da �rvore...");
		System.out.println(treeCapitais.first());
		
		System.out.println("Retorna a �ltima capital no final da �rvore...");
		System.out.println(treeCapitais.last());
		
		System.out.println(treeCapitais + "\n");
		System.out.println("Retorna a primeira capital abaixo na �rvore da capital parametrizada...");
		System.out.println(treeCapitais.lower("Florian�polis"));
		
		System.out.println("Retorna a primeira capital acima na �rvore da capital parametrizada...");
		System.out.println(treeCapitais.higher("Florian�polis"));
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da �rvore, removendo do Set...");
		System.out.println(treeCapitais.pollFirst());
		System.out.println(treeCapitais + "\n");
				
		System.out.println("Retorna a �ltima capital no final da �rvore, removendo do Set...");
		System.out.println(treeCapitais.pollLast());
		System.out.println(treeCapitais + "\n");
		
		System.out.println("\nExemplos de como percorrer os itens da �rvore...");
		System.out.println("Iterator");
		Iterator<String> iterator = treeCapitais.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor Each:");
		for (String capital : treeCapitais) {
			System.out.println(capital);
		}
		
		System.out.println("\n�rvore est� vazia? " +treeCapitais.isEmpty());
		treeCapitais.clear();
		System.out.println("�rvore est� vazia? " +treeCapitais.isEmpty());
		
	}

}