package Livraria;

public class Autor {
	public String nome;
	public String cpf;
	
	public Autor (String nome, String cpf) {
		nome = getNome();
		cpf = getCpf();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

