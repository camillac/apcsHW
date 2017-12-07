public class Date {
	static int date = 2;
	static String day = "Monday";
	static String month = "October";
	static int year = 2017;
	
	public static void main(String[] args) {
		System.out.println( "American format:\n"
							+ day + ", " + month + " " + date + ", " + year
							+ "\nEuropean format:\n"
							+ day + " " + date + " " + month + " " + year);
	}
}