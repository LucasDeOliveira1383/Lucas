package kamehameha;

public class rasengan {
	
	public static void main(String[] args) {
		int valor = 34;
		String frase = "Um programa em Java!";
		String frase_2 = "um programa java";
		
		System.out.printf("Estruturando saída com:\nTexto: %s\nValor inteiro: %d", frase, valor);
		
		System.out.printf("Características da String:\nComprimento: %d"
				+ "\nConcatenação :%s\nComparação: \"%s\" = \"%s\" -> %b",
				frase.length(), frase + " Aumentando a frase...",
				frase, frase_2, frase.compareTo(frase_2));
		System.out.printf("\nComparação 2: \"%s\" = \"%s\" -> %b",
				frase, frase_2, frase.equals(frase_2));
		
		rasengan obj = new rasengan();
		obj.repetirFrase(frase, 3);
		
	}
	
	void repetirFrase(String frase, int vezes) {
		for(int i = 0; i < vezes; i++) {
			System.out.println(frase);
		}
	}
}
