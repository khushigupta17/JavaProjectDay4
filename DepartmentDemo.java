package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		DepartmentClass d=new DepartmentClass(1);
		for (int i=1;i<26;i++) {
			d.addStudent(new Student(i,"Khushi Gupta "+ i));
		}
		d.printStudents();

	}

}

