/**
  Represent an nxn chess board for use with the n-queens problem.

  Since each rank needs exactly 1 queen, represent the state of the
  board by a one-dimensional array, where the element at index @rank
  is the file number that holds a queen in that rank.
  */

public class BoardForNQueens {

    private int[] filesForQueens; /* filesForQueens[ rank] holds the
       file number for the queen in that rank */
    public int minEmptyRank;  /* the smallest-numbered rank that
       lacks a queen, or the board size if all ranks have been populated.

       Values in filesForQueens are meaningless for ranks >= minEmptyRank.

       This field should be private, since NQueensSover should not
       use it. It is public here only for testing in UserOfBoard. */


    /**
      A "copy constructor" 
     */
    public BoardForNQueens( BoardForNQueens given ) {
		filesForQueens = new int[given.filesForQueens.length];
		for (int x = 0; x < given.filesForQueens.length; x++) {
			filesForQueens[x] = given.filesForQueens[x];
		}
		minEmptyRank = given.minEmptyRank;
    }


    // --------- skeletal code below here needs no modification ---------
    /**
      Construct an instance for a board of the given @size.
     */
    public BoardForNQueens( int size) {
        filesForQueens = new int[ size];
        minEmptyRank = 0;
    }


    /**
      @return the size of the board
     */
    public int size() {
        return filesForQueens.length;
    }


    /**
      @return the boolean value of the statement...
                "The board is full"
              Equivalently, "No more queens are required."
     */
    public boolean isFull() {
        return minEmptyRank == filesForQueens.length;
    }


    /**
      Populate the next rank with a queen in position @file
     */
    public void populate( int file) {
        filesForQueens[ minEmptyRank++] = file;
        /* recall that minEmptyRank++ increases the value
           in minEmptyRank after using it as an index */
    }


    /**
      Reset the board to have no queen in the last-populated rank.
      @precondition: Some rank(s) have been populated.
     */
    public void depopulate() {
        minEmptyRank--;
    }


    /**
      @return the boolean value of the statement
              "the last-added queen attacks no other"
      We can limit checking to the last-added queen because...

      @precondition: the board was ok before the last addition,
      with no queen attacking another.
     */
    public boolean lastIsOk() {
        int rankOfLast = minEmptyRank - 1;
        int fileOfLast = filesForQueens[ rankOfLast];

        // check each previously-added queen
        for(int rankOfPrev = 0; rankOfPrev < rankOfLast; rankOfPrev++) {
            int fileOfPrev = filesForQueens[ rankOfPrev];
            if(    fileOfLast == fileOfPrev  // same file
                || /* on same diagonal if difference in ranks ==
                      difference in files or its negative
                    */
                      rankOfLast - rankOfPrev  // always positive
                   == Math.abs( fileOfLast - fileOfPrev)
               ) return false;
        }
        return true;
    }


    /**
      @return a string representation of this board
     */
    public String toString() {
        int n = filesForQueens.length; // just for shorthand

        /* Make a header containing file numbers like
               files
               0  1  2  3 ...
               __________ ...
         */
        String indent = "         ";
        String pic =   indent + "files" + System.lineSeparator()
                     + indent;
        String underscores = "";

        // append a file number, in a 3-column field
        for( int file = 0; file < n; file++) {
            pic += String.format("%-3d", file);
            underscores += "___"; // there's gotta be a better way
        }

        pic+=   System.lineSeparator()
              + indent + underscores + System.lineSeparator();

        // picture each rank
        for( int rank = 0; rank < n; rank++){
            pic += // right-justified rank number:
                   String.format("rank %2d|", rank);
            for( int file = 0; file < n; file++)
                if(    rank >= minEmptyRank      // no queen in this rank yet
                    || filesForQueens[rank] != file) // no queen in this file
                     pic += " _ ";
                else pic += " Q ";
            pic += System.lineSeparator();
        }
        return pic;
    }
}
