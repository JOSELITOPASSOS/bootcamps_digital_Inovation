package br.com.estudos.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		System.out.println("Criando uma Fila...");
		Queue<String> filaBanco = new LinkedList<String>();
		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		System.out.println(filaBanco + "\n");
		
		System.out.println("Atendendo primeiro cliente da fila...");
		String clienteASerAtendido = filaBanco.poll();
		System.out.println(clienteASerAtendido);
		System.out.println(filaBanco + "\n");
				
		System.out.println("Verificando quem é o primeiro cliente da fila...");
		String primeiroCliente = filaBanco.peek();
		System.out.println(primeiroCliente);
		System.out.println(filaBanco + "\n");
		
		System.out.println("Exemplos Como percorrer a fila!!\n");
		
		System.out.println("For Each:");
		for (String cliente : filaBanco) {
			System.out.println(cliente);
		}
		
		System.out.println("\nIterator");
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("-->" + iteratorFilaBanco.next());
		}
		
		System.out.println("\nFila vazia? " +filaBanco.isEmpty());
		filaBanco.clear();
		System.out.println("Fila vazia? " +filaBanco.isEmpty()); 		
		
		System.out.println("\nRetornando erro quando a fila for vazia...");		
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		System.out.println(filaBanco + "\n");
		
	}

}