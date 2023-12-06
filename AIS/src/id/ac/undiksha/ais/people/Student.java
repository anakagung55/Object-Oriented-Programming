package id.ac.undiksha.ais.people;

import id.ac.undiksha.ais.organization.studyProgram;

public class Student extends human  {

	private String StudentId; 
	private int semester;
	
	public Student() {
		this.StudentId = "<please insert StudentId>";
		this.semester = 3;
	}

	public Student(
			String name,
			boolean gender,
			String address, 
			String birthDate, 
			String StudentId, 
			int semester) {
		super(name, gender, address, birthDate);
		this.StudentId = StudentId;
		this.semester = semester;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println(this.StudentId);	
		System.out.println(this.semester);
		System.out.println("");
	}


	public studyProgram prodi = new studyProgram();
	
}
