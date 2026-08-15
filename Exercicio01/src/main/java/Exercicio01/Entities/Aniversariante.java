package Exercicio01.Entities;

public class Aniversariante {

	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Aniversariante)) {
			return false;
		}
		Aniversariante outro = (Aniversariante) obj;
		return this.nome.equals(outro.nome) && this.dataAniversario.equals(outro.dataAniversario);
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.dataAniversario;
	}
}