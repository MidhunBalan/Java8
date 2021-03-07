# Java8 New Features

## Topics covered

### Lambda Expressions

https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda

* Lambda Expressions were added in Java 8. 
* A lambda expression is a short block of code which takes in parameters and returns a value. 
* Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

### Functional Interfaces

https://github.com/MidhunBalan/Java8/tree/main/src/com/functionalInterface

* The term Java functional interface was introduced in Java 8. 
* A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. 
* A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method.

### Lambda Expression with collections

Instead of Default natural sorting order if we want customized sorting order then we should go for Comparator interface.
Comparator interface contains only one abstract method: compare() Hence it is Functional interface.

public int compare(obj1,obj2)
- returns -ve if obj1 has to come before obj2 
- returns +ve if obj1 has to come after obj2 
- returns 0 iff obj1 and obj2 are equal

https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda/collectionfrmwrk

### Lambda Expression with inner class
https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda/anonymous/innerclasses

### Default methods in Interface
https://github.com/MidhunBalan/Java8/tree/main/src/com/interfacee/defaultmethod

### Static Methods in Interfaces.

### Predicate

### Function

### Consumer

### Supplier

### Method Reference & Constructor Reference by Double Colon(::) Operator.

### Stream API

### Date & Time API ( Joda API)

### Is Java call by value or call by reference?

Java uses only call by value while passing reference variables as well. It creates a copy of references and passes them as valuable to the methods. As reference points to same address of object, creating a copy of reference is of no harm. But if new object is assigned to reference it will not be reflected.

