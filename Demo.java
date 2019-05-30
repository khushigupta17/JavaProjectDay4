package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student(1,"Khushi Gupta");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		Student s2=new Student(2,"Khushi","abc");
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		System.out.println(s.equals(s2));
	}

}
