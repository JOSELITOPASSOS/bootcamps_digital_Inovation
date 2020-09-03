package br.com.estudos.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		System.out.println("Adicionando as notas no Set...");
		Set<Double> notasAlunos = new HashSet<Double>();
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		System.out.println(notasAlunos + "\n");
		
		System.out.println("Removendo a nota \"3.8\" do Set");
		notasAlunos.remove(3.8);
		System.out.println(notasAlunos + "\n");
		
		System.out.println("Retorna qtd de itens do Set");
		System.out.println(notasAlunos);
		System.out.println(notasAlunos.size());
		
		System.out.println("\nExemplos de como percorrer o Set");
		System.out.println("Iterator");
		System.out.println(notasAlunos);
		Iterator<Double> iterator = notasAlunos.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor Each:");
		for (Double nota : notasAlunos) {
			System.out.println(nota);
		}
		
		System.out.println("\nSet está vazio? " +notasAlunos.isEmpty());
		notasAlunos.clear();
		System.out.println("Set está vazio? " +notasAlunos.isEmpty()); 		
	}

}