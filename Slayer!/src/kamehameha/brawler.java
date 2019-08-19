package kamehameha;

public class brawler {
	
	static void mostrarAoContrario(String frase){
		for(int i = 1; i <= frase.length(); i++);
		System.out.printf("%c", frase.charAt(frase.length()-1));
	}
}
