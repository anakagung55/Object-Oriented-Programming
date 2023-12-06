package id.ac.undiksha.ais;
import id.ac.undiksha.ais.people.human;
import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecturer;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student();
		std1.setName("Romy");
		std1.setGender(true);
		std1.setAddress("Singaraja");
		std1.setBirthDate("11 September 1999");
		std1.setStudentId("12345");
		std1.setSemester(6);
		
		std1.printAll();
		
		Student std2 = new Student(	
				"Budi",
				true,
				"Gianyar",
				"2 Januari 1998",
				"12345",
				3
				);
		std2.printAll();
		
		
		Lecturer lect1 = new Lecturer();
		
		lect1.setId("1111");
		lect1.setName("Yanto");
		lect1.setBirthDate("12 Februari 2004");
		lect1.setGender(true);
		lect1.setAddress("Singaraja");
		lect1.setFaculty("FTK");
		lect1.setDepartement("TI");
		lect1.setStudyProgram("Computer Science");
		
		System.out.println("--------");
		System.out.println("--------");
		System.out.println("LECTURER");
		System.out.println("--------");
		System.out.println("--------");
		System.out.println("");
		
		lect1.printAll();
		
		Lecturer lect2 = new Lecturer(
				"2222",
				"Mr Agung Yudhi",
				true,
				"Denpasar",
				"2 Januari 1989",
				"FTK",
				"TI",
				"ILKOM"
				);
		lect2.printAll();
		
		
		std2.prodi.setStudyProgramId(null);
		std2.prodi.setStudyProgramName(null);
		std2.prodi.setDepartementId(null);
		std2.prodi.setDepartementName(null);
		std2.prodi.getFacultyId();		
		
//		
//		std1.name = "Romy";
//		std1.StudentId= "12345";
//		std1.birthDate = "11 September 2004";
//		std1.gender = true;
//		std1.semester = "6";
//		std1.address = "Singaraja";
//		
//		System.out.println(std1.name);
//		
//		System.out.println(std1.birthDate);
//		
//		if (std1.gender)
//			System.out.println("Female");
//		else
//			System.out.println("Male");
//		
//		System.out.println(std1.semester);
//		System.out.println(std1.address);
	
	
	}

}
