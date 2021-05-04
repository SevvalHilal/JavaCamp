package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Þevval Hilal");
		student1.seteMail("hilal2619@gmail.com");
		student1.setPassword("1234");
		student1.setPercentageOfCompletion(30);
		
		
		
		Instructor ýnstructor1 = new Instructor();
		ýnstructor1.setId(1);
		ýnstructor1.setName("Engin Demiroð");
		ýnstructor1.seteMail("engin@gmail.com");
		ýnstructor1.setPassword("4567");
		ýnstructor1.setMyCourses("Java");
		ýnstructor1.setAddCourse("Python");
		ýnstructor1.setRecordCourses("C#");
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.percantage(student1);
		
		
		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.addCourse(ýnstructor1);
		ýnstructorManager.chooseCourse(ýnstructor1);
		ýnstructorManager.recordCourse(ýnstructor1);
	}

}
