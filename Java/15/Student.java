public class Student {
	public String firstname;
	public String lastname;
	public int osis;
	
	public String descrip() {
		String desc = "Student Name:\n" + firstname + " " + lastname + "\nOSIS:\n" + osis;
		return desc;
	}
		
	
	public static void main(String[] args){
		// Student # 00
		Student s0 = new Student();
		s0.firstname = "Camilla";
		s0.lastname = "Cheng";
		s0.osis = 209180538;
		
		System.out.println(s0.descrip());
		System.out.println("---------------\n");
		
		// Student #01
		Student s1 = new Student();
		s1.firstname = "Mr.";
		s1.lastname = "Meow";
		s1.osis = 666;
		
		System.out.println(s1.descrip());
		System.out.println("---------------\n");
	}
}
	