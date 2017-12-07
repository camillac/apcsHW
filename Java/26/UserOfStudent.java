public class UserOfStudent {
	public static void main(String[] args) {
		Student s0 = new Student("Camilla");
		s0.setSleepHour(2);
		Student s1 = new Student("Rafael");
		s1.setSleepHour(-35);
	
		// TESTS
	
		System.out.println(s0); //return 2
		
		s0.augmentSleepHours(3);
		System.out.println(s0); //return 5
		
		s0.augmentSleepHours(-9);
		System.out.println(s0); //return "Error"
		
		// TESTING NEGATIVE HOURS
		
		System.out.println(s1); //return "Error"
		
		s0.augmentSleepHours(-9);
		System.out.println(s1); //return "Error"
		
		s0.augmentSleepHours(3);
		System.out.println(s1); //return "Error"
		
		// TESTING SLEEP CATEGORY
		Student s2 = new Student("Tim");
		
		s2.setSleepHour(0);
		System.out.println(s2); //return "dead"
		
		s2.setSleepHour(4);
		System.out.println(s2); //return "drowsy"
		
		s2.setSleepHour(6);
		System.out.println(s2); //return "fine"
		
		s2.setSleepHour(24);
		System.out.println(s2); //return "well-rested"
		
		s2.setSleepHour(1000);
		System.out.println(s2); //return "incredibly rejuvinated"
	}
}