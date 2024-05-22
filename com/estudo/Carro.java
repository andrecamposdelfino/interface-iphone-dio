package com.estudo;

public class Carro {
	
	String carroLigado = "False";
	String cambio = "P";
	double combustivel = 2.9;
	
	public void ligar() {
		
		if(carroLigado == "False") {
			carroLigado = "True";
			System.out.println("Carro ligado!");
		}else {
			carroLigado = "False";
			System.out.println("Carro desligado!");
		}
		
	}
	
	public void confereCambio() {
		if(cambio == "P") {
			cambio = "D";
			System.out.println("Cambio está no : " + cambio);
			ligar();
			acelerar();
		}
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando!!");
	}
	
	public void confereCombustivel() {
		System.out.println("Combustivel : " + combustivel);
	}

}
