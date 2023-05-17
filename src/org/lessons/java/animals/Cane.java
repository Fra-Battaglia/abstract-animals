package org.lessons.java.animals;

public class Cane extends Animale implements INuotante {
	public void verso() {
		System.out.println("Il cane fa Bau");
	}
	
	public void mangia() {
		System.out.println("Il cane mangia carne");
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}
