package service;

import model.Course;
import model.Degree;
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
		
		
	}

}
