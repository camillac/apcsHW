/**
  test NQueensSolver
  
  Specify the width of biggest board to test on the command line, like...
      > java NQueensSolver 4
  10 has a pause; 11 is tolerable; 12 requires patience
 */

 public class UserOfNQueensSolver {

    public static void main(String[] commandLine) {
        System.out.println();

        for( int boardSize = 1; boardSize <= Integer.parseInt( commandLine[0]); boardSize++)
            oneTest( boardSize);
    }


    /**
      run one test
     */
    private static void oneTest( int size
                               ) {
        System.out.println( size + "x" + size + " board"
                          + System.lineSeparator()
                          + new NQueensSolver( size)
                          + System.lineSeparator());
    }
}
