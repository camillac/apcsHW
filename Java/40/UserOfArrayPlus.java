// untested code
public class UserOfArrayPlus {
    public static void main(String[] commandLine) {
		final int MAX_RANDOM = 4;
        // // problem 1
        //ArrayPlus randomness = new ArrayPlus( 16);
        //System.out.println( randomness);

        // problem 2, after commenting out above
        ArrayPlus randomness = new ArrayPlus( 16, MAX_RANDOM);
        System.out.println( randomness);
		
		// problem 3
		// ArrayPlus randomness = new ArrayPlus( 9,8);
        // System.out.println( randomness.indexOf(3));
		// System.out.println( randomness);
		
		// problem 4 --------------------------------------
		/* Construct an ArrayPlus that will be used 
		 * to garner frequency data.
		 */         
		ArrayPlus freqsForHistogram = new ArrayPlus( MAX_RANDOM);

		/* Pass freqsForHistogram to a method in the
		 * ArrayPlus class that can populate it.
		 */
		randomness.freqFill( freqsForHistogram);

		// See the histogram data:
		System.out.println( System.lineSeparator()
						  + "problem 4: frequencies");
		System.out.println( freqsForHistogram
						  + "check: is total correct?");
    }
}