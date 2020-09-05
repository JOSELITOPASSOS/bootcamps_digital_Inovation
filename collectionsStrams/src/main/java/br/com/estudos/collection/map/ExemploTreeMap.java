package br.com.estudos.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {

		System.out.println("Criando uma �rvore com as capitais...");
		TreeMap<String, String> treeCapitais = new TreeMap<String, String>();
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florian�polis");
		treeCapitais.put("SP", "S�o Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizando");
		treeCapitais.put("SE", "Aracaju");
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da �rvore...");
		System.out.println(treeCapitais.firstKey());
		
		System.out.println("Retorna a �ltima capital no final da �rvore...");
		System.out.println(treeCapitais.lastKey());
		
		System.out.println(treeCapitais + "\n");
		System.out.println("Retorna a primeira capital abaixo na �rvore da capital parametrizada \"SC\"...");
		System.out.println(treeCapitais.lowerKey("SC"));
		
		System.out.println("Retorna a primeira capital acima na �rvore da capital parametrizada \"SC\"...");
		System.out.println(treeCapitais.higherKey("SC"));
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da �rvore...");
		System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
		
		System.out.println("Retorna a �ltima capital no final da �rvore...");
		System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
		System.out.println(treeCapitais + "\n");
		
		System.out.println("Retorna a primeira capital no topo da �rvore, removendo do Map...");
		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
				
		System.out.println("Retorna a �ltima capital no final da �rvore, removendo do Map...");
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());
		System.out.println(treeCapitais + "\n");
		
		System.out.println("\nExemplos de como percorrer os itens da �rvore...");
		System.out.println("Iterator");
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " - " + treeCapitais.get(key));
		}
		
		System.out.println("\nFor Each 01:");
		for (String capital : treeCapitais.keySet()) {
			System.out.println(capital + " - " + treeCapitais.get(capital));
		}
		
		System.out.println("\nFor Each 02:");
		for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + " - " + capital.getValue());
		}
	}
}