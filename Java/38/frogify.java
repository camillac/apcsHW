public class frogify {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String story = "";
		String next = "";
		while (sc.hasNext()) {
			next = sc.next(); 
			if (next.equals("cat"))
				story += "frog ";
			else
				story += next + " ";
		}
		System.out.println(story);
	}
}