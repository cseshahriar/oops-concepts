package oop; // oop package

public class MyOOP { // class

	public MyOOP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// we are in same packages, so we can make obj from Human Class
		
		// Object of Human Class 
		Human objHuman = new Human();
		
		// method calling or access
		objHuman.name("Shahriar");
		objHuman.age(27);
       //objHuman.color("Brown"); 
		objHuman.height(5.5);

	}

}
