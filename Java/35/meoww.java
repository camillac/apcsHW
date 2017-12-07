public class meoww {
   public static String reverse_whileStyle(String x) {
      int len = x.length();
      String rev = "";
      while (len > 0) {
         rev += x.substring(len-1,len);
		 len -= 1;
      }
	  return rev;
   }
   
   public static void main(String[] args) {
	   System.out.println(reverse_whileStyle("meow"));
	   System.out.println(reverse_whileStyle("Camilla Cheng"));
	   System.out.println(reverse_whileStyle("hello, world"));
	   System.out.println(reverse_whileStyle("f"));
	   System.out.println(reverse_whileStyle(""));
	   }
}