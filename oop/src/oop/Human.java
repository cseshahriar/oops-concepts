package oop; // oop is package name

/* @author shosen
 * 
 * Class:
 * A class can be considered as a blueprint using which you can create as many objects as you like.
 * Custom or User defined data type
 * Object type class
 */

/*
 * Types of class :
 * 
 * Concrete Class
 * Abstract Class
 * 
 * Static Class 
 * Final Class
 * Inner class
 * Nested Inner class
 * Meta class(Py) 
 */

// public is access modifier, that's means visible in the whole programs
public class Human { 
	
	//fields (or instance variable)
	public String name, color;
	public Integer age;
	public Double height;
	
	// =============== constructors ================
	
	/* If you do not implement any constructor in your class, 
	 * Java compiler inserts a default constructor into your code on your behalf. 
	 * This constructor is known as default constructor. 
	 */
	
	// no-arg constructor
	public Human() {
		
	}
	
	//parameterized constructor with one parameters
	public Human(String name) {
		this.name = name;
	}
	
	//parameterized constructor with two parameters
	public Human(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	//parameterized constructor with three parameters
	public Human(String name, Integer age, Double height) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	//parameterized constructor with four parameters
	public Human(String name, Integer age, Double height, String color) {
		this.name = name;
		this.color = color;
		this.height = height;
		this.age = age;
	}
	
	// ================== getter methods ================
	String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	protected Integer getAge() {
		return this.age;
	}
	
	private Double getHeight() {
		return this.height;
	}
	
	
	// ================== setter methods ================
	
	// default, public, private, protected are access modifiers

	/*
	 * Default: The access level of a default modifier is only within the package.
	 * It cannot be accessed from outside the package.
	 * If you do not specify any access level, it will be the default.
	 */
	
	void setName(String nameString) {
		this.name = nameString;
	}
	
	/*
	 * Public: The access level of a public modifier is everywhere.
	 * It can be accessed from within the class, outside the class,
	 * within the package and outside the package.
	 */
	public void setColor(String colorString) {
		this.color = colorString;
	}
	
	/*
	 * Protected: The access level of a protected modifier is within the package 
	 * and outside the package through child class.
	 * If you do not make the child class, 
	 * it cannot be accessed from outside the package.
	 */
	protected void setAge(Integer ageInteger) {
		this.age = ageInteger;
	}
	
	/* 
	 * Private: The access level of a private modifier is 
	 * only within the class.
	 *  It cannot be accessed from outside the class.
	 */
	private void setHeight(Double heightDouble) {
		this.height = heightDouble;
	}
	

	public static void main(String[] args) { // main method
		
		//Creating objects 
		Human objHuman = new Human();
		Human objHuman2 = new Human("Shosen", 27);
		Human objHuman3 = new Human("Salpin", 27, 5.5);
		Human objHuman4 = new Human("Salpin", 27, 5.5, "Brown");
		
		
		//Accessing object data through reference
		// objHuman.name = "Shahriar";
		// objHuman.age = 27;
		// objHuman.height = 5.5;
		//objHuman.color = "Brown";
		
		objHuman.setName("Shahriar");
		objHuman.setAge(27);
		objHuman.setHeight(5.5);
		objHuman.setColor("Brown");
		
		// obj1
		System.out.println(objHuman.name);
		System.out.println(objHuman.getName() + "\n");
		
		// obj2
		System.out.println(objHuman2.name +" "+objHuman2.age+ "\n");
		
		// obj3
		System.out.println(objHuman3.name +" "+objHuman3.age+" "+objHuman3.height+"\n");
		
		// obj4
		System.out.println(objHuman4.getName() + " " + objHuman4.age +" "+objHuman4.height+" "+ objHuman4.color);
		
	}
	
}
