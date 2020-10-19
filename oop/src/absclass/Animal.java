package absclass;

/*
 * An abstract class can extend only one class or one abstract class at a time
 * An abstract class can extend another concrete (regular) class or abstract clas
 * An abstract class can have both abstract and concrete methods
 * An abstract class can have protected and public abstract methods
 * An abstract class can have static, final or static final variable with any access specifier
 * */
public abstract class Animal {
	
	// abs metthod
	public abstract void sound();
	
	// regular method 
	public void run() {
		System.out.println("Running");
	}
}
