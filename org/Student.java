package week2.org;

public class Student extends Department {
	
	
	public void studentName() {
		
		System.out.println("Student name - Nick");
	}

	public void studentDept() {
		
		System.out.println("Student  department - CSE");
	}
	
	public void studentId() {
		System.out.println("Student  ID - 123");
	}
	public static void main(String[] args) {
		
		Student SD = new Student () ;
		
		SD.collegeCode();
		SD.collegeName();
		SD.collegeRank();
		SD.deptName();
		SD.studentDept();
		SD.studentId();
		SD.studentName();
		
		
		
	}
	
}
