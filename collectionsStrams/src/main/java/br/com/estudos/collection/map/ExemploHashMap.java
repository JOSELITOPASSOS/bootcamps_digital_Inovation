package br.com.estudos.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		System.out.println("Adicionando os campe�es mundiais no Mapa...");
		Map<String, Integer> campeoesMudialFifa = new HashMap<String, Integer>();
		campeoesMudialFifa.put("Brasil", 5);
		campeoesMudialFifa.put("Alemaha", 4);
		campeoesMudialFifa.put("It�lia", 4);
		campeoesMudialFifa.put("Uruguai", 2);
		campeoesMudialFifa.put("Argentina", 2);
		campeoesMudialFifa.put("Fran�a", 2);
		campeoesMudialFifa.put("Inglaterra", 1);
		campeoesMudialFifa.put("Espanha", 1);
		System.out.println(campeoesMudialFifa + "\n");
		
		System.out.println("Atualiza o valor para a chave Brasil...");
		campeoesMudialFifa.put("Brasil", 6);
		System.out.println(campeoesMudialFifa + "\n");
		
		System.out.println("Retorna a Argentina...");
		System.out.println(campeoesMudialFifa.get("Argentina"));
		
		
		System.out.println("\nRetorna se existe ou n�o um campe�o Fran�a...");
		System.out.println(campeoesMudialFifa);
		System.out.println(campeoesMudialFifa.containsKey("Fran�a"));
		
		System.out.println("\nRemove o campe�o Fran�a...");
		campeoesMudialFifa.remove("Fran�a");
		System.out.println(campeoesMudialFifa + "\n");
		
		System.out.println("\nRetorna se existe ou n�o um campe�o Fran�a...");
		System.out.println(campeoesMudialFifa);
		System.out.println(campeoesMudialFifa.containsKey("Fran�a"));
		
		System.out.println("\nRetorna se existe ou n�o uma sele��o hexa(6) campe�...");
		System.out.println(campeoesMudialFifa);
		System.out.println(campeoesMudialFifa.containsValue(6));
		
		
		System.out.println("\nRetonra o tamanho do Mapa...");
		System.out.println(campeoesMudialFifa);
		System.out.println(campeoesMudialFifa.size());
		
		System.out.println("\nExemplos de como percorrer o Mapa");
		System.out.println("\nFor each usando Map.Entry");
		for (Map.Entry<String, Integer> entry : campeoesMudialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		System.out.println("\nFor each usando keySet");
		for (String key : campeoesMudialFifa.keySet()) {
			System.out.println(key + " -- " + campeoesMudialFifa.get(key));
		}
		
		System.out.println("\nMapa est� vazio? " +campeoesMudialFifa.isEmpty());
		System.out.println("Tamanho: " + campeoesMudialFifa.size());
		campeoesMudialFifa.clear();
		System.out.println("Mapa est� vazio? " +campeoesMudialFifa.isEmpty());
		System.out.println("Tamanho: " + campeoesMudialFifa.size());
		
	}

};