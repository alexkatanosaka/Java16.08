package com.generation.animal.model;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som() {
		System.out.println("Som de preguiça...");
	}

	@Override
	public void acao() {
		System.out.println("Subindo em árvores...");
	}

}
