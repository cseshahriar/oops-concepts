package myInterface;

/*
 * An interface is a blueprint of a class, which can be declared by using interface keyword.
 * Interfaces can contain only constants and abstract methods (methods with only signatures no body).
 * Like abstract classes, Interfaces cannot be instantiated, 
 * they can only be implemented by classes or extended by other interfaces. 
 * Interface is a common way to achieve full abstraction in Java.
 */

/* All the methods are public abstract by default
 * As you see they have no body
 * 100% Abstract class is call Interface
 * An interface can have only have public abstract methods
 * interface can only have public static final (constant) variable
 * An interface can have only abstract methods
 * An interface can only extend another interface
 * An interface can extend any number of interfaces at a time
 */

/*
 * Static:
 * In Java, a static member is a member of a class that isn’t associated with an instance of a class. 
 * Instead, the member belongs to the class itself.
 * As a result, you can access the static member without first creating a class instance.
 * */ 

/*
 * Final:
 * In Java, the final keyword can be used while declaring an entity. 
 * Using the final keyword means that the value can’t be modified in the future.
 * This entity can be - but is not limited to - a variable, a class or a method.
 */

public interface MyInterface {
	
	 public void method1();
	 public void method2();
}
