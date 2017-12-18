# SuperArray: implement list operations by encapsulating an array

The point of a SuperArray instance is its utility as a list. That use justifies the complications that you are 
asked to program, and should guide your design decisions.
Practice thinking like a programmer who helps 
other programmers, not just a student who does what they are told. That is, answer the question...

> What does a user-programmer want from 
SuperArray, when the programmer needs a list structure without programming it 
themself?

Such thinking helps. For example, to add an item to the end of a list, SuperArray must locate the 
current end of the list in `_data`. Lots of solid students in this course originally thought that 
SuperArray should identify the already-used elements of `_data` by their values: since Java initializes
arrays like `_data` to all zeros, perhaps the end of the list could be identified by
the highest-indexed value that is non-zero.

Others pointed out, however, that such a scheme precludes the 
user-programmer from storing zero as a usable value in the SuperArray! No user-programmer wants that 
restriction in a class that is supposed to help them  by implementing a list, eh?

based on work by Mr. Brown Mykolyk and others in csStuy