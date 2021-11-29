package tr.edu.sehir.basics;

public class Main {



    public static void main(String[] args) {

	    Dog karabas, anotherkarabas,yetanotherkarabas;
	    //Animal pet=null;



		karabas = new Dog();
		anotherkarabas = new Dog();
		yetanotherkarabas = new Dog();



		System.out.println("number of dogs:"+Dog.getNumberOfDogs());

		//System.out.println("id of anotherkarabas is:"+yetanotherkarabas.getID());

		/*
		karabas.speak();
		karabas.bark();

	    pet =karabas;
	    pet.speak();
*/
	   // pet.bark(); //???? pet does not know how to bark

		// dynamically pet points to Dog at run-time but compiler does not know

		// in a statically type oo lang, the legality of message passing expression is determined at compile
		// time based on the static class of the receiver

        /*
		if ( pet  instanceof Dog)
			((Dog)pet).bark();



        karabas =  (Dog) pet;
        karabas.bark();

        pet = new Bird();
        pet.speak();
        */

    }
}
