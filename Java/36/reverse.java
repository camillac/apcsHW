public class ForeachDemo {
	private static String reverse_recursive(String x) {
		String rev = "";
		int len = x.length();
		if (x.equals(""))
			return rev;
		else
			rev += x.substring(len - 1, len);
			return rev + reverse_recursive(x.substring(0,len - 1));
	}
	
	public static void main(String[] commandline) {
		// System.out.println(reverse_recursive("meow"));
		// System.out.println(reverse_recursive("Camilla Cheng"));
		// System.out.println(reverse_recursive(""));
		
		// for (String x: commandline)
			// System.out.println(reverse_recursive(x));
		
		int num = 0;
		// for (String meow: commandline)
			// System.out.println(num++ + ": " + meow);
		
		for (String x: commandline)
			System.out.println(num + x);
		
	}
}
			