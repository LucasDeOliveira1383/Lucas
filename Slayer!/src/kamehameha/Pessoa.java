package kamehameha;

public class Pessoa {
	private String nome;
	private int rg;
	private int cpf;
	
	public Pessoa() {
		this.nome = "";
		this.rg = 0;
		this.cpf = 0;
	}
	
	public Pessoa(String nome, int rg, int cpf) {
		this.nome = nome;
		this.rg = rg;
		if(validaCpf(cpf))
			this.cpf = cpf;
	}
	
	private boolean validaCpf(int cpf) {
		if(cpf > 0)
			return true;
		return false;
	}
	
	public void setNome(String val) {
		nome = val;
	}
	
	public void setRg(int val) {
		rg = val;
	}
	
	public void setCpf(int val) {
		if(validaCpf(val))
			return;
		cpf = val;
	}

	@Override
	public String toString() {
		return nome + ", rg=";
	}
}
