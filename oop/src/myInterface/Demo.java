package myInterface;


public class Demo implements MyInterface, MyAnotherInterface {

	 /* This class must have to implement both the abstract methods
	 * else you will get compilation error
	 */
		
	   public void method1()
	   {
		   System.out.println("implementation of method1");
	   }
	   
	   public void method2()
	   {
		   System.out.println("implementation of method2");
	   }
	   
	   public void method3()
	   {
		   System.out.println("implementation of method3");
	   }
	   
	   public static void main(String arg[])
	   {
		   MyInterface obj = new Demo();
		   MyAnotherInterface obj2 = new Demo();
		   
		   obj.method1();
		   obj.method2();
		   
		   obj2.method3();
	   }

}
