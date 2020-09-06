package br.com.estudos.collection.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {

		System.out.println("Valor opcional que está presente...");
		Optional<String> opitionalString = Optional.of("Valor presente");
		opitionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));
		
		System.out.println("Valor opcional que não está presente...");
		Optional<String> opitionalNull = Optional.ofNullable(null);
		opitionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));
		
		System.out.println("Valor opcional que não está presente...");
		Optional<String> emptyOptional = Optional.empty();
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
		
		System.out.println("Valor opcional que lança erro NullPointerException...");
		try {
				Optional<String> optionalNullErro = Optional.of(null);
				optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}