package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University{
	private Set<DepartmentClass> departments=new TreeSet<>();
	public boolean addDepartment(DepartmentClass d) {
		return departments.add(d);
	}
	public void printdepartment() {
		departments.parallelStream().forEach(s ->System.out.println(s.getId()));
	}
	
	}



