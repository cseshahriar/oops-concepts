package polymorphosim;

/*
 * Polymorphism is a object oriented programming feature that allows us to perform 
 * a single action in different ways. 
 */

/**
 * Types of Polymorphism
 *	1) Static Polymorphism
 *	2) Dynamic Polymorphism
 *
 *  Method overloading can be considered as static polymorphism
 * 
 *  Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime rather,
 *  thats why it is called runtime polymorphism.
 *  (overridden method is resolved at runtime )
 */

/*
 * Method Overloading: This allows us to have more than one methods with same name in a class
 *  that differs in signature.
 */

public class Animal {
	
	// return sound
	public void sound() {
	     System.out.println("Animal is making a sound");   
	}
}
