package encapsulation;

public class EncapsTest {
   public static void main(String args[]){
         
	   EncapsulationDemo obj = new EncapsulationDemo();
       obj.setEmpName("Mario");
       obj.setEmpAge(32);
       obj.setEmpSSN(112233);
       
       // private cannot access
       // System.out.println(obj.ssn);
       
       System.out.println("Employee Name: " + obj.getEmpName());
       System.out.println("Employee SSN: " + obj.getEmpSSN());
       System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
