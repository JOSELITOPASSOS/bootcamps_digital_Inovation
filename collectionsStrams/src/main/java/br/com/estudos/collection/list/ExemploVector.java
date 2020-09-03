package br.com.estudos.collection.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		
		System.out.println("Criando uma lista...");
		List<String> esportes = new Vector<String>();
		esportes.add("Futebol");
		esportes.add("Basquetebol");
		esportes.add("Tênis de Mesa");
		esportes.add("Handebol");
		System.out.println(esportes + "\n");
		
		System.out.println("Altera o valor da posição 2 do vetor");
		esportes.set(2, "Ping Poong");
		System.out.println(esportes + "\n");
		
		System.out.println("Remove o esporte da posição 2");
		esportes.remove(2);
		System.out.println(esportes + "\n");
		
		System.out.println("Remove o esporte HAndebol do vetor");
		esportes.remove("Handebol");
		System.out.println(esportes + "\n");
		
		System.out.println("Navega nos esportes usando for each");
		for (String esporte : esportes) {
			System.out.println(esporte);
		}
		
		System.out.println("\nObetendo o primeiro item do vetor");
		System.out.println(esportes.get(0));
		
	}

}