package polymorphosim;

public class Horse extends Animal {
	
	@Override
    public void sound() {
		// body changing
        System.out.println("Neigh");
    }
	
    public static void main(String args[]) {
    	
    	// Animal class type Horse class object 
    	Animal obj = new Horse();
    	
    	// method calling
    	obj.sound();
    }
}
