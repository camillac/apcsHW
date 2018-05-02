# Linked List ADT v1

As an illustration of Abstract Data Types, the next few assignments
replace our earlier implementation of a linked list with...

* a `List` interface to specify an API; and 
* a Linked List implementation of that `List` that uses
  a sentinel node, to avoid the need to treat element 0 of 
  the list as a special case.
* methods are to thow IndexOutOfBoundsException 
  when the API for Java's List interface demands that.
  
This skeleton accommodates adding methods to...
* `add`-at-index
* `remove`