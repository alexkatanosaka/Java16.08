package com.generation.animal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Preguica;

public class Main {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Bob",5);
		Cavalo cavalo = new Cavalo("Rodolfo",7);
		Preguica preguica = new Preguica("Luan",23);
		
		
		cachorro.som();
		cavalo.som();
		preguica.som();
		
	}
	
}
