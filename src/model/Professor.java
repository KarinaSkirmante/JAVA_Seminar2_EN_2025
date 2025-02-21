package model;

public class Professor {
	//1.variables
	private long pId;

	private Degree degree;
	
	private static long counter = 10000;
	//2.getters

	public long getpId() {
		return pId;
	}



	public Degree getDegree() {
		return degree;
	}
	
	
	//3.setters
	
	public void setPID() {
		pId = counter;
		counter++;
	}
	
	
		
	
	public void setDegree(Degree inputDegree) {
		if(inputDegree!=null)
		{
			degree = inputDegree;
		}
		else
		{
			degree = Degree.other;
		}
	}

	//4.default constructor
	public Professor() {
		setPID();
		setName("Test");
		setSurname("Professor");
		setDegree(Degree.bsc);
	}
	//5.args constructor
	public Professor(String inputName, String inputSurname, Degree inputDegree)
	{
		setPID();
		setName(inputName);
		setSurname(inputSurname);
		setDegree(inputDegree);
	}
	
	//6.toString
	public String toString() {
		return pId + ": " + degree + " " + name + " " + surname ;
	}
	
	
	
	//7.other functions
	
}
