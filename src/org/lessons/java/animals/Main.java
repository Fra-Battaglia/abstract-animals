package org.lessons.java.animals;

public class Main {
	public static void main(String[] args) {
		Cane c = new Cane();
		Passerotto p = new Passerotto();
		Aquila a = new Aquila();
		Delfino d = new Delfino();
		
		Animale[] animals = {c, p, a, d};
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].verso();
			System.out.print("\n");
		}
	}
}
