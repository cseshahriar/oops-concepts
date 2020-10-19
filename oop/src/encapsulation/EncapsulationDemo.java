package encapsulation;

public class EncapsulationDemo {
	
	/*
	 * Make the instance variables private so that they cannot be accessed directly from outside the class. 
	 * You can only set and get values of these variables through the methods of the class.
	 * Have getter and setter methods in the class to set and get the values of the fields.
	 * */
	
	private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
    
}
