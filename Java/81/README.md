# Sort different ways, specified using polymorphism / inheritance

The `method` parameter to libraryHolmes/74_bubbleSort `Sorts.sort()`
is a ["travesty of a mockery of a sham"](https://youtu.be/8a3mk9sp0oE?t=27).
In general, parameters that specify types are unwieldy. They are the problem
that polymorphism/ inheritance was designed to fix.

`UserOfSorts` in this directory is programmed better. It relies on...

* a general `Sorter` specification
* versions of `Sorter` that implement specific sorting algorithms,
  like `SelectionSorter` and `InsertionSorter`.
  
These classes are required, to complete this skeleton. 
Compiling and running the completed work is expected
to produce something like...
```  
> javac .\UserOfSorts.java
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> java UserOfSorts

selection sort on numbers, from 67_inplaceSelectionSort/OrderedArrayList_String
[2,3,5,5,11,17,]
sorted: true

selection sort on letters
[a,b,c,d,e,g,j,m,p,]
sorted: true

insertion sort on numbers, from 69_insertionSort
[2,3,5,5,11,17,]
sorted: true

insertion sort on letters
[a,b,c,d,e,g,j,m,p,]
sorted: true
```

## compiler warnings should be heeded
Tolerating compiler warnings is poor programming,
even when the resulting code works.
The practice is bad for the same reasons that it 
is poor practice to ignore fire alarms when past alarms have been
false alarms.
Good programmers learn to work with their compilers, to produce code that passes
the compiler's checks.  

I regret that, in this case, many hours of learning and experimenting leaves me
convinced that it is not worth eliminating these compiler warnings against
un-typed `Comparable` use. My still-incomplete understanding of the Java rules
for this issue leaves me thinking they are too complicated to deal with in this
course.  The focus of this course must remain on computer science,
not Java rules, even when adhering to those rules would produce more
robust code.

Teachers I respect hold similar opinions.
