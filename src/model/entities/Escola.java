package model.entities;

import java.util.List;

public class Escola {
	private Integer cnpj;
	private String nome;
	private Clube clube;
	private List<Disciplina> disciplina;
	private List<Aluno> alunos;
	
	public Escola() {}

	public Escola(Integer cnpj, String nome, Clube clube, List<Disciplina> disciplina, List<Aluno> alunos) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.clube = clube;
		this.disciplina = disciplina;
		this.alunos = alunos;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public List<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escola other = (Escola) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Escola [cnpj=" + cnpj + ", nome=" + nome + ", clube=" + clube + ", disciplina=" + disciplina
				+ ", alunos=" + alunos + "]";
	}
	
	
	
	
	
}
