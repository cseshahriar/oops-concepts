package oop; // oop package

public class MyOOP { 

	public static void main(String[] args) {
		
		// Object of Human Class 
		Human objHuman = new Human();
		
		objHuman.setName("Shahriar");
		objHuman.setAge(27);
		// objHuman.setHeight(5.5);
		objHuman.setColor("Brown");
		
		// method calling or access
		System.out.println(	objHuman.getName() +" "+ objHuman.getAge() +"  "+ objHuman.getColor());
		// System.out.println(objHuman.getHeight());

	}

}
