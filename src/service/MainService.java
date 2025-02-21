package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses =  new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	
	
	public static void main(String[] args) {
		
		System.out.println("-------------------STUDENTS------------------");
		Student st1 = new Student();
		//System.out.println(st1.toString());//we can use without toString() because it will be called by default here

		Student st2 = new Student("John", "Green");
		//System.out.println(st2);
		
		Student st3 = new Student("7346824", "287435928753");
		//System.out.println(st3);
		
		Student st4 = new Student(null, null);
		//System.out.println(st4);
		
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4));
		System.out.println(allStudents);

		
		
		System.out.println("-------------------PROFESSORS------------------");
		
		Professor p1 = new Professor();
		//System.out.println(p1);
		
		Professor p2 = new Professor("Karina", "Skirmante", Degree.mg );
		//System.out.println(p2);
		allProfessors.addAll(Arrays.asList(p1, p2));
		try
		{
			createProfessor("Estere", "Vitola", Degree.mg);
			//createProfessor("Estere", "Vitola", Degree.mg);//exception will be throw
			createProfessor("Karlis", "Immers", Degree.mg);//if there will be a duplicate before, this code line will be skipped
			System.out.println(allProfessors);//Test Karina Estere Karlis
			System.out.println("Retrieve example: " + retrieveProfessorById(10001));//Karina
			updateProfessorById(10000, "Vairis", "Caune", Degree.dr);
			System.out.println("Arrayslist after update: " + allProfessors );//Vairis Karina Estere Karlis
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		//System.out.println(allProfessors);
		
		System.out.println("-------------------COURSE------------------");
		
		Course c1 = new Course();
		//System.out.println(c1);
		
		Course c2 = new Course("JAVA Programming", 6, p2);
		//System.out.println(c2);
		
		Course c3 = new Course("6523857683275jhgasjhasfk9234732948", -4, null);
		//System.out.println(c3);
		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);
		
		
		System.out.println("-------------------GRADE------------------");
		
		Grade g1 = new Grade();
		//System.out.println(g1);
		
		Grade g2 = new Grade(4, st2, c2);//4 -> John Green -> JAVA
		//System.out.println(g2);
		
		allGrades.addAll(Arrays.asList(g1, g2));
		System.out.println(allGrades);
		
	}
	
	//CRUD - C - create; R - retrieve; U - update; D - delete
	//C - create
	public static void createProfessor(String name, String surname, Degree degree) throws Exception {
		if(name == null || surname == null || degree == null) {
			throw  new Exception("Input params can not be null");
		}
		
		
		for(Professor tempP : allProfessors) {
			if(tempP.getName().equals(name)
					&& tempP.getSurname().equals(surname)
					&& tempP.getDegree().equals(degree))
			{
				throw new Exception("This professor is already registered in the system");
			}
		}
		
		allProfessors.add(new Professor(name, surname, degree));
		
		
	}
	
	//R - retrieve
	public static Professor retrieveProfessorById(long id) throws Exception{
		if(id < 10000)
		{
			throw new Exception("Id should be positive and larger or equals that 10000");
		}
		
		for(Professor tempP : allProfessors )
		{
			if(tempP.getpId() == id) {
				return tempP;
			}
		}
		
		throw new Exception("Professor is not found");
		
	}
	
	//U - update
	//function declaration
	public static void updateProfessorById
	(int id, String name, String surname, Degree degree) throws Exception
	{
		Professor foundProfessor = retrieveProfessorById(id);
		if(name != null && !foundProfessor.getName().equals(name))
		{
			foundProfessor.setName(name);
		}
		
		if(surname != null && !foundProfessor.getSurname().equals(surname))
		{
			foundProfessor.setSurname(surname);
		}
		
		if(degree != null && !foundProfessor.getDegree().equals(degree)) {
			foundProfessor.setDegree(degree);
		}
		
	}

	//check id
	//need to find professor
	//set the new values for name, surname, degree
	

}
