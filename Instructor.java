package day3Homework;

public class Instructor extends User{
	
	private String myCourses;
	private String recordCourses;
	private String addCourse;
	
	
	public Instructor() {
		
	}
	
	public Instructor(String myCourses) {
		this();
		this.myCourses=myCourses;
	}

	public String getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses) {
		this.myCourses = myCourses;
	}

	public String getRecordCourses() {
		return recordCourses;
	}

	public void setRecordCourses(String recordCourses) {
		this.recordCourses = recordCourses;
	}

	public String getAddCourse() {
		return addCourse;
	}

	public void setAddCourse(String addCourse) {
		this.addCourse = addCourse;
	}
	
	
	
	
	
	
	
	
	

}
