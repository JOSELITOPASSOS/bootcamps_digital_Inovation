package br.com.estudos.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		System.out.println("Crieando coleção de estudantes...");
		List<String> estudantes = new ArrayList<>();
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		System.out.println(estudantes + "\n");
		
		System.out.println("Retorna a contagem de elementos da stream...");
		System.out.println(estudantes);
		System.out.println("Contagem: " + estudantes.stream().count());

		System.out.println("\nRetorna o elemento com o maior número de letras...");
		System.out.println(estudantes);
		System.out.println("Maior número de letras: \n" + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		System.out.println("\nRetorna o elemento com o menor número de letras...");
		System.out.println(estudantes);
		System.out.println("Maior número de letras: \n" + estudantes.stream().min(Comparator.comparingInt(String::length)));
				
		System.out.println("\nRetorna elementos que tem a letra \"R\" no nome...");
		System.out.println(estudantes);
		System.out.println("Com letra \"r\" no nome: \n" + estudantes.stream().filter((estudante) -> 
				estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println("\nRetorna uma nova coleção com os nomes concatenador a qtd de letras de cada um...");
		System.out.println(estudantes);
		System.out.println("Nomes e suas qtd letras: \n" + estudantes.stream().map((estudante) -> 
				estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("\nRetorna somente os primeiros 3 elementos da coleção...");
		System.out.println(estudantes);
		System.out.println("Retorna os primeiros 3 elementos: \n" + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("\nExibe cada elemento no console e depois retorna a mesma coleção...");
		System.out.println("Retorna os elementos: \n" + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("\nRetorna os elementos usando forEach...");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("\nRetorna true se todos elementos possuem a letra \"W\" no nome...");
		System.out.println(estudantes);
		System.out.println("A letra \"W\" aparece em todos os nomes?\n" + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
		
		System.out.println("\nRetorna true se algum elemento possue a letra \"a\" no nome...");
		System.out.println(estudantes);
		System.out.println("Tem algum elemento com a letra \"a\" no nome?\n" + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
		
		System.out.println("\nRetorna true se nenhum elemento possue a letra \"a\" no nome...");
		System.out.println(estudantes);
		System.out.println("Não tem elemento com a letra \"a\" no nome?\n" + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		System.out.println("\nRetorna o primeiro elemento da coleção...");
		System.out.println(estudantes);
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("\nExemplosde operações encadeadas...");
		
		System.out.println("\nRetornando uma lista...");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter(estudante -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.toList())
		);
		
		System.out.println("\nRetornando uma String...");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter(estudante -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.joining(", "))
		);
		
		System.out.println("\nRetornando uma Set...");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter(estudante -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.toSet())
		);
		
		System.out.println("\nRetornando um Agrupamento...");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
//				.filter(estudante -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)))
		);
	}

}