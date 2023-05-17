package org.lessons.java.animals;

public class Delfino extends Animale implements INuotante {
	public void verso() {
		System.out.println("Il delfino fa Boh");
	}
	
	public void mangia() {
		System.out.println("Il delfno mangia pesciolini");
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}
