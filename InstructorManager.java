package day3Homework;

public class InstructorManager {
	
	public void chooseCourse(Instructor myCourse) {
		
		System.out.println("Seçilen Kurs: " + myCourse.getMyCourses() );
	}
	
	public void addCourse(Instructor addCourse) {
		
		System.out.println("Yeni kurs eklendi: " + addCourse.getAddCourse());
	}
	
	public void recordCourse(Instructor recordCourses) {
		 
		System.out.println("Ders Kaydý Yüklendi: " + recordCourses.getRecordCourses());
			
		
	}
	
	
	

}
