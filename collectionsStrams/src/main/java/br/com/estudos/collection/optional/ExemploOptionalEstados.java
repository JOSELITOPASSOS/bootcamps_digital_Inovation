package br.com.estudos.collection.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {

		System.out.println("Valor opcional que est� presente...");
		Optional<String> opitionalString = Optional.of("Valor presente");
		opitionalString.ifPresentOrElse(System.out::println, () -> System.out.println("n�o est� presente"));
		
		System.out.println("Valor opcional que n�o est� presente...");
		Optional<String> opitionalNull = Optional.ofNullable(null);
		opitionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = n�o est� presente"));
		
		System.out.println("Valor opcional que n�o est� presente...");
		Optional<String> emptyOptional = Optional.empty();
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = n�o est� presente"));
		
		System.out.println("Valor opcional que lan�a erro NullPointerException...");
		try {
				Optional<String> optionalNullErro = Optional.of(null);
				optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("empty = n�o est� presente"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}