public class Test {
    public static void main( String[] commandLine){
		System.out.println( 
			BigSib.greet("Simon") + " " + BigSib.greet("Theodore") );
		System.out.println(
			BigSib.greet("Alvin") );
	}
}
class BigSib {
	public static String greet(String person){
		return ("Hi, freshperson " + person + "!");
	}
}