package polymorphosim;

public class Dog extends Animal{

	@Override
	public void sound(){
		 System.out.println("woof");
	}
	 
	public static void main(String args[]) {
		
		// Animal class type Dog class object
		Animal obj = new Cat();
		
		// method calling
		obj.sound();
	}
}
