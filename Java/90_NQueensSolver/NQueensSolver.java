/** 
  Represent the set of solutions to the n-queens problem.
  
  Count two solutions as distinct even if one is a
  straightforward transformation of the other.

  For example, if one solution looks like a quarter-turn rotation 
  of another, consider those to be two distinct solutions.
 */
import java.util.ArrayList;

public class NQueensSolver {

    ArrayList< BoardForNQueens> solutions;
    BoardForNQueens inProgress; // for finding the next solution

    /** 
      Augment @solutions with all n-queens solutions that start with
      the @inProgress board.
      
      That is, complete the rest of the board all the legal ways,
      and record those solutions. Leave the board as you found it.
      
      The phrase "all the legal ways" includes, for example,...
      o  starting with an empty 4x4 board, record the 2 solutions;
      o  starting with a 4x4 board with this one queen
                      files
                      0  1  2  3
                      ____________
             rank  0| _  Q  _  _
             rank  1| _  _  _  _
             rank  2| _  _  _  _
             rank  3| _  _  _  _
         record the 1 solution;

      o  starting with a 4x4 board with these 2 queens
                      files
                      0  1  2  3
                      ____________
             rank  0| Q  _  _  _
             rank  1| _  _  Q  _
             rank  2| _  _  _  _
             rank  3| _  _  _  _
         record the zero solutions; (Specifying these instructions
         is simplified by a willingness to understand "recording" to
         include "a null recording of zero solutions".)

      o  starting with an empty 2x2 board, record the 0 solutions;

      o  starting with a queen on a 1x1 board, record the 1 solution
         that starts -- and ends -- with that board.
     */
    private void recordSolutionsStarted() {
		if (inProgress.isFull())
			solutions.add(new BoardForNQueens(inProgress));
		else {
			for (int file = 0; file < inProgress.size(); file++){
				inProgress.populate(file);
				if (inProgress.lastIsOk()){
					recordSolutionsStarted();
				}
				inProgress.depopulate();
			}
		}
		
    }


    // --------- skeletal code below here needs no modification ---------
    /** 
      Create a list of all solutions to the n-Queens problem for 
      a board of the requested @size. 
     */
    public NQueensSolver( int size) {
        solutions = new ArrayList<>();
            // shorthand in NEW with generics: omit the type!
            // The compiler assumes the same type as the variable.
            // The authors of the compiler support NTTSTT !
            
        inProgress = new BoardForNQueens( size);
        recordSolutionsStarted(); // "started" with an empty board
    }


    /**
      @return a string representation of all solutions
     */
    public String toString() {
        String pic = "count of solutions found: " + solutions.size()
                   + System.lineSeparator();
        for( BoardForNQueens b : solutions)
            pic += b;
        return pic;
    }
}
