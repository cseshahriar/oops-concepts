package inheritancepackage;

/**
 * @author shosen
 * 
 * The process by which one class acquires the properties and functionalities
 *  of another class is called inheritance. 
 * 
 */

/**
 * Types of Inheritance:
 * 
 * Single Inheritance: refers to a child and parent class relationship where a class extends the another class.
 * 
 * Multiple Inheritance: refers to the concept of one class extending more than one classes, which means 
 * a child class has two parent classes. Java doesn’t support multiple inheritance.
 * 
 * Multilevel inheritance: refers to a child and parent class relationship where 
 * a class extends the child class. For example class A extends class B and class B extends class C.
 * 
 * Hierarchical inheritance: refers to a child and parent class relationship 
 * where more than one classes extends the same class. 
 * For example, class B extends class A and class C extends class A.
 */
public class GrandPa {
	
	// GrandPa properties(method)
	public void properties() {
		System.out.println("Father Properties from GrandPa class");
	}
}
