package polymorphosim;

public class Cat extends Animal {

	@Override
	public void sound() {
		 System.out.println("Meow");
	}
	 
	public static void main(String args[]) {
		
		// Animal class type Cat class object
		Animal obj = new Cat();
		
		// method calling
		obj.sound();
	}
}
