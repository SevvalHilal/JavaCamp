package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Şevval Hilal");
		student1.seteMail("hilal2619@gmail.com");
		student1.setPassword("1234");
		student1.setPercentageOfCompletion(30);
		
		
		
		Instructor ınstructor1 = new Instructor();
		ınstructor1.setId(1);
		ınstructor1.setName("Engin Demiroğ");
		ınstructor1.seteMail("engin@gmail.com");
		ınstructor1.setPassword("4567");
		ınstructor1.setMyCourses("Java");
		ınstructor1.setAddCourse("Python");
		ınstructor1.setRecordCourses("C#");
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.percantage(student1);
		
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.addCourse(ınstructor1);
		ınstructorManager.chooseCourse(ınstructor1);
		ınstructorManager.recordCourse(ınstructor1);
	}

}
