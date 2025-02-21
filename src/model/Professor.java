package model;

public class Professor extends Person{
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
		super();//no arg.constructor from Person class
		setPID();
		setDegree(Degree.bsc);
	}
	//5.args constructor
	public Professor(String inputName, String inputSurname, Degree inputDegree)
	{
		super(inputName, inputSurname);//argument constructor from person class
		setPID();
		setDegree(inputDegree);
	}
	
	//6.toString
	public String toString() {
		return pId + ": " + degree + " " + super.toString() ;
	}
	
	
	
	//7.other functions
	
}
