package id.ac.undiksha.ais.people;

public class Lecturer extends human {
	
		private String id;
		private String faculty;
		private String departement;
		private String studyProgram;
		
		public Lecturer() {
			this.id = "<please insert Lecturer ID>";
			this.faculty = "<please insert faculty>";
			this.departement = "<please insert departemen>";
			this.studyProgram = "<please insert study program>";
		}
		
		public Lecturer(String id,
				String name,
				boolean gender,
				String address,
				String birthDate,
				String faculty,
				String departement,
				String studyProgram) {
			super(name, gender, address, birthDate);
			this.id = id;
			this.faculty = faculty;
			this.departement = departement;
			this.studyProgram = studyProgram;
		}



		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFaculty() {
			return faculty;
		}
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}
		public String getDepartement() {
			return departement;
		}
		public void setDepartement(String departement) {
			this.departement = departement;
		}
		public String getStudyProgram() {
			return studyProgram;
		}
		public void setStudyProgram(String studyProgram) {
			this.studyProgram = studyProgram;
		}
		@Override
		public void printAll() {
			super.printAll();
			System.out.println(this.id);
			System.out.println(this.faculty);
			System.out.println(this.departement);
			System.out.println(this.studyProgram);
			System.out.println("");
			
		}	
	}	

