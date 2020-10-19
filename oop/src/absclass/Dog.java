package absclass;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Woof");
	}
	
	public static void main(String args[]) {
		
		// Animal animal = new Animal();
		
		// Animal DogAnimal = new Dog();  
		Dog obj = new Dog();
		
		obj.sound();
	 }
}
