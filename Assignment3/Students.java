package week2.Assignment3;

public class Students {

	public void studentinfo (int studentID) {
		
		System.out.println("Student ID is "+ studentID);
		
	}
	
	
	public void Studentinfo(int StudentID, String StudentName) {
		
		System.out.println("Student NAME " +StudentName +", Student ID is " +StudentID);
	}
	
	
	public void Studentinfo(int StudentID, String StudentName, String StudentEmail) {
		
		System.out.println("Student NAME " +StudentName +", Student ID is " +StudentID + ", StudentEmail is " +StudentEmail );
		
	}
	public void Studentinfo(int StudentID, String StudentName, String StudentEmail, int StudentPhNo) {
		
		System.out.println("Student NAME " +StudentName +", Student ID is "+StudentID + ", StudentEmail is " +StudentEmail  + ", Student Ph No -" +StudentPhNo );
	}
	
	public static void main(String[] args) {
		
		Students info = new Students ();
		
		info.studentinfo(10);
		info.Studentinfo(10, "Ramya");
		info.Studentinfo(10, "Ramya", "ramya@gmail.com");
		info.Studentinfo(10, "Ramya", "ramya@gmail.com", 1234567891);
		
		
	}
	
	
	
	
}
