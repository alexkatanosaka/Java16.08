package com.generation.animal.model;

public class Cachorro extends Animal {

	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som() {
		System.out.println("AU! AU!");
	}

	@Override
	public void acao() {
		System.out.println("Correndo...");
	}

	
	
}
