/** Practice operations on 2-D arrays.
 *  Based on work by Mr. Brown Mykolyk
 */
 public class TwoDimArray {

    /** postcondition: fill the array @a with consecutive values
     *  from @startingAt, in row-major order
     */
    private static void fill( int[][] a, int startingAt) {
		for (int x = 0; x < a.length; x++) {
			for (int n = 0; n < a[x].length; n++) {
				a[x][n] = startingAt;
				startingAt++;
			}
		}
    }

    /** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a "simple FOR" loop  (not a for-each)
     */
    public static String toString_2d_simpleFor( int[][] a ) {
		String meow = "";
		for (int x = 0; x < a.length; x++) {
			meow = "[";
			for (int n = 0; n < a[x].length; n++) {
				meow += a[x][n] + " ,";
			}
			meow += "]";
			System.out.println(meow);
		}
				
        return "a better representation " + System.lineSeparator()
             + "than this one";
    }

    /** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a for-each loop
     *  Declared public because it is used in PascalsTriangle.java
     *  (PascalsTriangle coming soon!)
     */
    private static String toString_2d_forEach( int[][] a ) {
		String woof = "";
		for (int[] x: a) {
			woof = "[";
			for (int n: x) {
				woof += n + ", ";
			}
			woof += "]";
			System.out.println(woof);
		}
				
        return "a better representation " + System.lineSeparator()
             + "than this one";
    }

    /** @return the sum of all items in 2D int array @a
     *  computed using nested loops.
     */
    private static int sumAll( int[][] a ) {
		int sum = 0;
		for (int[] x: a) {
			for (int n: x) {
				sum += n;
			}
		}
		return sum;
    }

    /** @return the sum of all items in 2D int array @a,
     *  computed using helper methods.
     */
    private static int sumWithHelp( int [][] a ) { 
        // Sum half the rows using sumRow_simpleFor.
        // Intepret "half" in the sense of integer division.
        // sum half the rows using sumRow_forEach
		int sum = 0;
		int simpleHalf = (int) (a.length / 2);
		int forEachHalf = a.length - simpleHalf;
		for (int x = 0; x < a.length; x++) {
			if (x < simpleHalf - 1)
				sum += sumRow_simpleFor (x, a);
			else
				sum += sumRow_forEach(x, a);
		}
		return sum;
    }

    /** @return the sum of all items in row rowNumber of 2D integer array @a,
     *  computed using a "simple FOR" loop (not a for-each)
     */
    private static int sumRow_simpleFor( int rowNumber, int[][] a ) {
		int sumRow = 0;
		for (int n = 0; n < a[rowNumber].length; n++)
			sumRow += a[rowNumber][n];
		return sumRow;
    }

    /** @return the sum of all items in row rowNumber of 2D integer array @a,
     *  computed using a for-each
     */
    private static int sumRow_forEach( int rowNumber, int[][] a){
		int sumRow = 0;
		for (int n: a[rowNumber]){
			sumRow += n;
		}
		return sumRow;
    }


    public static void main(String [] args) {
        int [][] m0 = new int[3][5];
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        fill( m0, 100);
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        /* expecting...
               100 101 102 103 104
               105 106 107 108 109
               110 111 112 113 114
         */       

        int [][] m1 = { {2,4,6}, {3,5,7} };
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m1));
        int [][] m2 = { {2}, {4,6}, {1,3,5} };
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m2));
        
        System.out.println( System.lineSeparator() + toString_2d_forEach( m0));
        System.out.println( System.lineSeparator() + toString_2d_forEach( m1));
        System.out.println( System.lineSeparator() + toString_2d_forEach( m2));
        
        System.out.println( System.lineSeparator() 
                           + "testing sumAll...");
        System.out.println("sum m0 : " + sumAll(m0) + " expecting 1605");
        System.out.println("sum m1 : " + sumAll(m1));
        System.out.println("sum m2 : " + sumAll(m2));
		System.out.println(sumRow_forEach(0, m2));

        System.out.println( System.lineSeparator() 
                           + "testing sumWithHelp...");
        System.out.println("sum m0 : " + sumWithHelp(m0) 
                          + " still expecting 1605");
        System.out.println("sum m1 : " + sumWithHelp(m1));
        System.out.println("sum m2 : " + sumWithHelp(m2));
	}
}//end class TwoDimArray 