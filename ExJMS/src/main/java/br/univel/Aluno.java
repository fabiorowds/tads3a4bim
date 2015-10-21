package br.univel;

import java.io.Serializable;

public class Aluno implements Serializable{

	private Long Matricula;
	private String nome;
	
	public Long getMatricula() {
		return Matricula;
	}
	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
