package aula11;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String[] palavras = new String[10];

		palavras[5] = "Optional";

		Optional<String> verificaNulo = Optional.ofNullable(palavras[5]);

		if (verificaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.print(palavra);
		} else
			System.out.println("A palavra é nula!");

	}

}