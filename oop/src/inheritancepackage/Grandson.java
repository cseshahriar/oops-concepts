package inheritancepackage;

public class Grandson extends Son {

	public static void main(String[] args) {
		
		Son father =  new Son();
		father.properties();
		
		// overloading
		father.properties("Overloading method");
	}

}
