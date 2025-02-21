package model;

public class Student {
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
		setStID();
		setName("Test");
		setSurname("Student");
	}
	
	
	//5. argument constructor
	public Student(String inputName, String inputSurname) {
		setStID();
		setName(inputName);
		setSurname(inputSurname);
	}
	

	//6. toString function	
	public String toString()
	{
		return stID + ": " + name + " " + surname;
	}
	
	
	//7. other functions (if necessary)
}
