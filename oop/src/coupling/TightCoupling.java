package coupling;

// Tight coupling means dependent
public class TightCoupling {

	public static void main(String[] args) {
		Box b = new Box(5,5,5); 
        System.out.println(b.volume); 

	}

}

class Box  
{ 
     public int volume; 
     Box(int length, int width, int height)  
     { 
         this.volume = length * width * height; 
     } 
} 
