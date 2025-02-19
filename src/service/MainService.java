package service;

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
		
	}

}
