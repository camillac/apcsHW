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
		
		// for (String x: commandline)
			// System.out.println(num + x);
		/* does not work because: the command line inputs are strings and
		cannot be converted into int. for loops rewrite the previous value of
		num. This could probably be fixed but that's a lot more work than I think
		we're supposed to do, and I think we're just supposed to test this out. */
	}
}
			