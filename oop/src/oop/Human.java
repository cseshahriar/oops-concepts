package oop; // oop is package name

// public is access modifier, that's means visible in the whole programs
public class Human { // class
	
	public static void main(String[] args) { // main method
		
		// Object of Human Class 
		Human objHuman = new Human();
		
		// method calling or access, object.methodName
		objHuman.name("Shahriar");
		objHuman.age(27);
		objHuman.color("Brown");
		objHuman.height(5.5);
	}
	
	// methods 
	// default, public, private, protected is access modifier
	
	/*
	 * Default: The access level of a default modifier is only within the package.
	 * It cannot be accessed from outside the package.
	 * If you do not specify any access level, it will be the default.
	 */
	void height(Double height) {
		System.out.println("The height of the Human is: "+ height);
	}
	
	/*
	 * Public: The access level of a public modifier is everywhere.
	 * It can be accessed from within the class, outside the class,
	 * within the package and outside the package.
	 */
	public void name(String name) {
		System.out.println("The name of the Human is: " + name);
	}
	
	/*
	 * Protected: The access level of a protected modifier is within the package 
	 * and outside the package through child class.
	 * If you do not make the child class, 
	 * it cannot be accessed from outside the package.
	 */
	protected void age(Integer age) {
		System.out.println("The age of the Human is: " + age);
	}
	
	/* 
	 * Private: The access level of a private modifier is 
	 * only within the class.
	 *  It cannot be accessed from outside the class.
	 */
	private void color(String color) {
		System.out.println("The Color of the Human is: " + color);
	}
	
	
}
