package inheritancepackage;

// Father class inherit GrandPa class
// Grand Super or Parent Class
// Father Sub Class or Child class of GrandPa
public class Father extends GrandPa {
	
	@Override
	public void properties() {
		System.out.println("Fathers Properties from Father class");
	}
	
	public static void main(String[] args) {
		
		// GrandPa class object
		GrandPa objectGpa = new GrandPa();
		
		objectGpa.properties();
	}
	
}
