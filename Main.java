package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("�evval Hilal");
		student1.seteMail("hilal2619@gmail.com");
		student1.setPassword("1234");
		student1.setPercentageOfCompletion(30);
		
		
		
		Instructor �nstructor1 = new Instructor();
		�nstructor1.setId(1);
		�nstructor1.setName("Engin Demiro�");
		�nstructor1.seteMail("engin@gmail.com");
		�nstructor1.setPassword("4567");
		�nstructor1.setMyCourses("Java");
		�nstructor1.setAddCourse("Python");
		�nstructor1.setRecordCourses("C#");
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.percantage(student1);
		
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addCourse(�nstructor1);
		�nstructorManager.chooseCourse(�nstructor1);
		�nstructorManager.recordCourse(�nstructor1);
	}

}
