package kamehameha;

public class Aplicacao {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jose", 123, 654);
		System.out.println(pessoa);
		
		Estudante estudante = new Estudante();
		estudante.setNome("Charlinston");
		System.out.println(estudante);
		
		Estudante gustavo = new Estudante();
		System.out.println(gustavo);
	}
	
}
