package br.com.estudos.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {
		
		System.out.println("Adicionando os campeões mundiais no Mapa...");
		Hashtable<String, Integer> estudantes = new Hashtable<String, Integer>();
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);
		System.out.println(estudantes + "\n");
		
		System.out.println("Atualiza o valor para a chave Pedro...");
		estudantes.put("Pedro", 55);
		System.out.println(estudantes + "\n");
		
		System.out.println("Remove um estudante no índice 0...");
		estudantes.remove("Carlos");
		System.out.println(estudantes + "\n");
		
		System.out.println("Recupera um estudante no índice 2...");
		System.out.println(estudantes);
		System.out.println(estudantes.get("Mariana"));
		
		System.out.println("\nRetonra o tamanho do Mapa...");
		System.out.println(estudantes);
		System.out.println(estudantes.size());
		
		System.out.println("\nExemplos de como percorrer o Mapa");
		System.out.println("For Each 01:");
		for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("\nFor Each 02:");
		for (String key : estudantes.keySet()) {
			System.out.println(key + " - " + estudantes.get(key));
		}
		
	}

}