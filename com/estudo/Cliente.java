package com.estudo;

public class Cliente {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("André Campos", "98952137353","991450209");
		System.out.println("Nome :" + pessoa.nome);
		System.out.println("Cpf :" + pessoa.cpf);
		System.out.println("Telefone :" + pessoa.telefone);
	}

}
