public class Greeter {
    public static void main( String[] commandLine){
		System.out.println( 
			BigSib.greet("Simon") );
		System.out.println(
			BigSib.greet("Theodore") );
		System.out.println(
			BigSib.greet("Alvin") );
	}
}
class BigSib {
	public static void greet(String person){
	return ("hello, freshperson " + person + "! How you doon");
	}
}