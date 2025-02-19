package service;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1.toString());//we can use without toString() because it will be called by default here

		Student st2 = new Student("John", "Green");
		System.out.println(st2);
		
		Student st3 = new Student("7346824", "287435928753");
		System.out.println(st3);
		
		Student st4 = new Student(null, null);
		System.out.println(st4);
		
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("Karina", "Skirmante", Degree.mg );
		System.out.println(p2);
		
		
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA Programming", 6, p2);
		System.out.println(c2);
		
		Course c3 = new Course("6523857683275jhgasjhasfk9234732948", -4, null);
		System.out.println(c3);
		
		Grade g1 = new Grade();
		System.out.println(g1);
		
		Grade g2 = new Grade(4, st2, c2);//4 -> John Green -> JAVA
		System.out.println(g2);
		
	}

}
