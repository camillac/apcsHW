# represent a solver for the *n*-queens puzzle

## structure of the skeleton
uses BoardForNQueens from 
[libraryHolmes89_BoardForNQueens](https://github.com/stuyvesant-cs/libraryHolmes/tree/master/89_BoardForNQueens),
augmented with a partial signature for the copy constructor
that is discussed below.

`toString` is provided

## statement of the problem / What will the program do?
Create a list of all solutions to the *n*-queens problem
for a board of size *n*. Count two solutions as distinct even if one is a  
straightforward transformation of the other. 

For example, if one solution looks like a quarter-turn 
rotation of another, consider those to be two distinct solutions.

## recursive abstraction
Since a solution must have a queen in every rank, recurse on rank.

### in English
When I am asked for a list of the solutions that start with a legal board,

the recursive abstraction can provide a list of the solutions that start with

that board augmented with the next rank populated legally.

### in math-speak
Some people found it helpful to introduce a variable,
called `ranksPopulated` here,
so they could say something like...

When I am asked for a list of the solutions that start with a board
that has the first `ranksPopulated` ranks legally populated,

the recursive abstraction can provide a list of the solutions that start with

that board augmented to have the first `ranksPopulated +1` ranks populated legally.

## base case 
Don’t confuse describing the base case with 
answering "How can we tell when we are done?" 
(I succumbed to that confusion in period 6.)

The base case, as always, answers

> What is the smallest version of this problem,
which the method can solve without recourse to any smaller version?

More loosely, "Where do the recursive calls stop?"

Answer: The smallest version of this problem, with the least left to do, is 
a request for the solutions that start with a board that is already filled
(that is, a board in which every rank has a queen).

## pseudocode
```
recordSolutionsStarted():
    if the board is full
        // base case is called "trivial" because no problem needs solving
        record the solution
    else // recursive case
        for each file in the rank to be populated
            place a queen in this file
            if legal board
                invoke recursive abstraction via this method
            remove queen
    return
```

## recursive backtracking
See [Wikipedia's lede](https://en.wikipedia.org/wiki/Backtracking)
for a discussion that I found helpful.

My favorite part of recursive backtracking solutions is a consequence of 
having the recursive abstraction clean up after itself ("remove queen" 
in this case): when the routine returns, it leaves no
[cruft](https://en.wikipedia.org/wiki/Cruft)
from its processing. The invoker of the recursive abstraction can simply 
continue its processing. Sweet, huh? 

## no parameters and no return in the recursive method
Unlike many recursive solutions, `recordSolutionsStarted` in `NQueensSolver`...

* takes no parameters and 
* returns no value.

That's ok, because all that information is communicated via
the state of an instance of `NQueensSolver`:

* No parameters are required because
the `inProgress` board "knows" which rank `recordSolutionsStarted` 
should work on, namely, the smallest-numbered rank that lacks a queen.

* No return value is required  because 
an invocation of `recordSolutionsStarted` communicates its results
by updating the `solutions` collection.

We have seen this kind of communication elsewhere: 

* No parameters are required
when handing in papers. That is, you pass no parameter information
to the next person in the file of seats. 
Rather, the file instance that you share holds the information
of who is next. Looking at that file
tells a person whether they are the base case.

* No return value is required 
in the Towers of Hanoi puzzle, when you call on  Monk3 to 
move 3 platters. Monk3 returns nothing to you. Rather,
Monk3 communicates their results to you by updating
the towers / disks instance.

## save references to *copies* of `inProgress`
A filled `inProgress` board represents a solution.
It is crucial that `recordSolutionsStarted` record

> a reference to **a copy** of the board,

rather than

> a reference to the board.

That difference matters because of backtracking. 
In the sequence of recursive calls, previous calls are 
still active. 
Each is in the midst of processing a previous rank
and each will change the `inProgress` board, moving the queen in that 
rank to the next file.
If there were only a single board and  `solutions`  stored a reference to it,
later looks at the referred-to
board would show the latest version, not the old, filled version!

 The `BoardForNQueens` skeleton includes the signature for a
 "copy constructor", that is, a constructor that accepts an existing instance 
of its class as an argument, and creates a new instance that is a copy 
of it. 

A copy constructor for a class requires careful programming
when a class field *has-A* reference to an object that can 
change. In that case, the new instance typically needs its own copy of 
the contained object, and your copy constructor must create it.

The copy constructor for `BoardForNQueens` provides an example of this 
situation, because the `filesForQueens` field refers to an array
that will be changed. If I err by making the new instance refer 
to the same `filesForQueens` array
as the original, I achieve nothing, because changes to 
the single `filesForQueens` array would be reflected in both
`BoardForNQueens` instances. `UserOfBoard` tests for this problem.

## testing via `UserOfNQueensSolver`
The number of solutions is given in
[this table](https://oeis.org/A000170/b000170.txt)
in N. J. A. Sloane's amazing
[*The On-Line Encyclopedia of Integer Sequences*](https://oeis.org)
   
To see just the counts of solutions from `UserOfNQueensSolver`:
```
      > java UserOfNQueensSolver 10 | grep x --after-context 1
```

