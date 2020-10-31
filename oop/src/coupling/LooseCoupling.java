package coupling;

// interface
interface Topic 
{ 
    void understand(); 
} 

// topic class
class Topic1 implements Topic { 
	public void understand() 
    { 
        System.out.println("Python");
    } 
} 

// topic2 class
class Topic2 implements Topic { 
	public void understand() 
    { 
        System.out.println("Django"); 
    } 
} 

// Loose coupling means independent
public class LooseCoupling {

	public static void main(String[] args) {
		 Topic topic = new Topic1(); 
	     topic.understand(); 
	     
	     Topic2 topic2 = new Topic2();
	     topic2.understand();

	}

}


