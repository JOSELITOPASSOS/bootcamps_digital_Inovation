package br.com.estudos.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		System.out.println("Criando uma árvore com as capitais...");
		TreeSet<String> treeCapitais = new TreeSet<String>();
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizando");
		treeCapitais.add("Aracaju");
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da árvore...");
		System.out.println(treeCapitais.first());
		
		System.out.println("Retorna a última capital no final da árvore...");
		System.out.println(treeCapitais.last());
		
		System.out.println(treeCapitais + "\n");
		System.out.println("Retorna a primeira capital abaixo na árvore da capital parametrizada...");
		System.out.println(treeCapitais.lower("Florianópolis"));
		
		System.out.println("Retorna a primeira capital acima na árvore da capital parametrizada...");
		System.out.println(treeCapitais.higher("Florianópolis"));
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da árvore, removendo do Set...");
		System.out.println(treeCapitais.pollFirst());
		System.out.println(treeCapitais + "\n");
				
		System.out.println("Retorna a última capital no final da árvore, removendo do Set...");
		System.out.println(treeCapitais.pollLast());
		System.out.println(treeCapitais + "\n");
		
		System.out.println("\nExemplos de como percorrer os itens da árvore...");
		System.out.println("Iterator");
		Iterator<String> iterator = treeCapitais.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor Each:");
		for (String capital : treeCapitais) {
			System.out.println(capital);
		}
		
		System.out.println("\nÁrvore está vazia? " +treeCapitais.isEmpty());
		treeCapitais.clear();
		System.out.println("Árvore está vazia? " +treeCapitais.isEmpty());
		
	}

}