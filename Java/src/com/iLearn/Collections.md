Collections(I)
---------------
It is a interface, represents group of objects into single entity
Iterable is the root of collections
object is the root of iterable

1. List - arraylist, linked list, vector, stack
2. Queue - priority queue, dequeue
3. Set - hashset, linked hashset, sorted set, navigable set, tree set

List vs Set
-----------
list - allow duplicates,
preserves insertion order,
adding elements index based,
allow null values

set -  not allow duplictes,
no insertion order,
based in hash code,
one null allow

ArrayList vs LinkedList
-----------------------

ArrayList  - dynamicArray,
get() because it implements randomAccess
(marker interface - anonoyumus interfaces with no body and implementation
eg; serialization - convert object to bytestream
deserialization- bytestream to object,
cloneable - copy the exact object,
random access)
LinkedList - double linked list,
insertion and deletion is easy

ArrayList vs stack
------------------
ArrayList: Asynchronous,
Multiple Thread can be allowed
Data inconsistency issue
Performance high

Stack- Synchronous,
Single Thread
No Data inconsistency
Performance low


Comparable vs Comparator
---------------------------
Both are used for sorting
Compariable:
single field sorting,
compareTo method
java.lang package
Comparitor:    
multiple field sorting
compare method
java.util package

Collection vs Collections
-------------------------
collection - interface
collections - class, predefined methods

reverse a list:

    List<Integer> test = Arrays.asList(1,2,3,4);
    Collections.reverse(test);

Hashset vs LinkedHashSet
------------------------
hashset has no order, uses a Hashtable to store the elements.
linkedhashset has insertion order, ses a HashTable and doubly linked list to store and maintain the insertion order of the elements

https://www.javatpoint.com/hashset-vs-linkedhashset-in-java#:~:text=HashSet%20is%20an%20unordered%20%26%20unsorted,insertion%20order%20of%20the%20elements.


Cursors

Enumeration vs Iterator vs ListIterator in Java
-------------------------------------------------
Enumeration: interface
legacy collection like stack, vector, Hashtable
one by one read at a time
only read operation/ no remove
Enumeration enum = v.elements();

Iterator: universal cursor that can be applied to any collection object.
single direction
read/remove operation/ no replace
all collections- list, set, queue
Iterator itr = c.iterator();

ListIterator: list interface - arraylist, linkedlist,vector
both direction forward and backward
add, read, remove, replace
ListIterator ltr = l.listIterator();


HashSet vs Treeset
---------------------

Hashset - no order
data structure: hash table
Treeset - ascending order
data structure: red black tree
------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------
Map
------------        

storing elements in key- value

Hashmap, linkedhashmap, sortedmap, treemap, concurrenthashmap, hash table


HashSet and Hashmap
--------------------

hashset - set store only value, not keys
set Interface
no duplicate values
one null value


hashmap- store key and value
map interface
allow duplicate values
multiple null value

Hashmap vs treemap
-----------------
hashmap - no order
null key

treemap - ascending order map
no null key


Hashmap vs Hash table
---------------------
Hashmap - ASynchronous
one null key and multiple null values
multiple thread
HashTable - Synchronous
doesn’t allow any null key or value.
Single thread