package polymorphosimanother;

class TestPolymorphism{  
	public static void main(String args[]) {  
		
		// shape class object
		Shape shape;  
		
		shape = new Rectangle();  
		shape.draw();  
		
		shape = new Circle();  
		shape.draw();  
		
		shape = new Triangle();  
		shape.draw();  
	}  
}  