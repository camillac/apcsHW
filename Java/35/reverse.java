public class meoww {
   public static void main(String[] args) {
	  String x = "meow";
      int len = x.length();
      String rev = "";
      while (len > 1) {
         rev += x.substring(len-1);
		 len -= 1
      }
      System.out.println(rev);
   }
}