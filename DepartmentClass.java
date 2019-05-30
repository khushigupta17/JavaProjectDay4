package in.ac.sharda;
import java.util.ArrayList;
import java.util.List;

public class DepartmentClass implements Comparable<DepartmentClass> {
	private final int id;
	private List<Student> students=new ArrayList<>();
	public DepartmentClass(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void printStudents() {
		students.parallelStream().forEach(s ->System.out.println(s.getRollNumber()));
		/*for(Student s: students) {
			System.out.println(s.getRollNumber());
			System.out.println(s.getName());*/
		}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DepartmentClass) {
			return((DepartmentClass)obj)
					.getId()==id;
		}
		return false;
	}
	@Override
	public int compareTo(DepartmentClass o) {
		return o.getId() -id;
	}
	
}

	

