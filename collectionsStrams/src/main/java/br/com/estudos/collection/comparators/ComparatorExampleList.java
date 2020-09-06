package br.com.estudos.collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

	public static void main(String[] args) {

		System.out.println("--- Criando lista: Ordem de inserção ---");
		List<Estudante> estudantes = new ArrayList<Estudante>();
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		System.out.println(estudantes + "\n");

		System.out.println("--- Ordem natural dos números - idade ---");
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		System.out.println(estudantes + "\n");
		
		System.out.println("--- Ordem reversa dos números - idade ---");
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println(estudantes + "\n");
		
		System.out.println("--- Ordem natural dos números - idade (method reference) ---");
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		System.out.println(estudantes + "\n");
		
		System.out.println("--- Ordem reversa dos números - idade (method reference) ---");
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println(estudantes + "\n");
		
		System.out.println("--- Ordem natural dos números - idade (interface Comparable) ---");
		Collections.sort(estudantes);
		System.out.println(estudantes + "\n");
		
		System.out.println("--- Ordem reversa dos números - idade (interface Comparable) ---");
		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
		System.out.println(estudantes + "\n");
		
	}

}