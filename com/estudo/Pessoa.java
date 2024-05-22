package com.estudo;

public class Pessoa {
	String nome;
	String cpf;
	String telefone;
	
	Pessoa(String nome, String cpf, String telefone){			
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

}