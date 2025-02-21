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

		
		
		
		
		Professor p1 = new Professor();
		//System.out.println(p1);
		
		Professor p2 = new Professor("Karina", "Skirmante", Degree.mg );
		//System.out.println(p2);
		allProfessors.addAll(Arrays.asList(p1, p2));
		System.out.println(allProfessors);
		
		Course c1 = new Course();
		//System.out.println(c1);
		
		Course c2 = new Course("JAVA Programming", 6, p2);
		//System.out.println(c2);
		
		Course c3 = new Course("6523857683275jhgasjhasfk9234732948", -4, null);
		//System.out.println(c3);
		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);
		
		Grade g1 = new Grade();
		//System.out.println(g1);
		
		Grade g2 = new Grade(4, st2, c2);//4 -> John Green -> JAVA
		//System.out.println(g2);
		
		allGrades.addAll(Arrays.asList(g1, g2));
		System.out.println(allGrades);
		
	}

}
