public class CliPractice {
	public static void main(String[] commandLine){
		if (commandLine[0].equals("sumDoubles")){
			int index = commandLine.length - 1;
			double num = 0;
			while (index > 0) {
				num += Double.parseDouble(commandLine[index]);
				index--;
				}
			System.out.println(num);	
			}
		else if (commandLine[0].equals("Bondify")){
			String last = "";
			String name = ", ";
			last = commandLine[commandLine.length - 1];
			int index = 1;
			for (name = last + ", "; index < commandLine.length; index++ )
				name += commandLine[index] + " ";
			System.out.println(name);
		}
			
				
				
		
		/* 
		Error for sumDoubles
		Exception in thread "main" java.lang.NumberFormatException: For input string: "meow"
        at sun.misc.FloatingDecimal.readJavaFormatString(Unknown Source)
        at sun.misc.FloatingDecimal.parseDouble(Unknown Source)
        at java.lang.Double.parseDouble(Unknown Source)
        at sumDoubles.main(CliPractice.java:7) 
		*/
	}
}