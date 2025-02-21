package model;

public class Student extends Person{
	//1. variables
	private long stID;

	
	private static long counter = 0;
	
    //2. getters	
	public long getStID() {
		return stID;
	}

	//3. setters
	
	public void setStID() {
		stID = counter;
		counter++;
	}
	
	
	
		

	//4. default constructor
	public Student() {
		super();//no argument constructor from Person class will be called
		setStID();

	}
	
	
	//5. argument constructor
	public Student(String inputName, String inputSurname) {
		super(inputName, inputSurname);//argument constructor from person class will be called
		setStID();
	}
	

	//6. toString function	
	public String toString()
	{
		return stID + ": " + super.toString();//Person class toString function
	}
	
	
	//7. other functions (if necessary)
}
