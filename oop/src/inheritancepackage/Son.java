package inheritancepackage;

// Father is Super or Parent class
// MyClass is Sub or Child class of Father class
public class Son extends Father {
	
	@Override
	public void properties() {
		System.out.println("Fathers Properties from Son class");
	}
	
	// Overloading
	public void properties(String text) {
		System.out.println("Fathers Properties from " + text);
	}
	
	public static void main(String[] args) {
		
		// father class object
		Father ObjFather = new Father();
		ObjFather.properties(); // we got properties
	}
}
