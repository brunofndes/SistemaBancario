package teste;

import java.util.Objects;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String faculdade;
	
	public Pessoa(String nome, int idade, String faculdade) {
		this.nome = nome;
		this.idade = idade;
		this.faculdade = faculdade;
	}
	
	public Pessoa() {
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(faculdade, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(faculdade, other.faculdade) && idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + ", faculdade=" + faculdade + "]";
	}
	
	
}
