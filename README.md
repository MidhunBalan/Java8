# Java8 New Features

## Topics covered

### 1. Lambda Expressions

https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda

* Lambda Expressions were added in Java 8. 
* A lambda expression is a short block of code which takes in parameters and returns a value. 
* Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

### 2. Functional Interfaces

https://github.com/MidhunBalan/Java8/tree/main/src/com/functionalInterface

* The term Java functional interface was introduced in Java 8. 
* A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. 
* A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method.

### 3.Lambda Expression with collections

Instead of Default natural sorting order if we want customized sorting order then we should go for Comparator interface.
Comparator interface contains only one abstract method: compare() Hence it is Functional interface.

public int compare(obj1,obj2)
- returns -ve if obj1 has to come before obj2 
- returns +ve if obj1 has to come after obj2 
- returns 0 iff obj1 and obj2 are equal

https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda/collectionfrmwrk

### 4. Lambda Expression with inner class
https://github.com/MidhunBalan/Java8/tree/main/src/com/lambda/anonymous/innerclasses

### 5. Default methods in Interface
https://github.com/MidhunBalan/Java8/tree/main/src/com/interfacee/defaultmethod

* Java 8 introduces a new concept of default method implementation in interfaces. 
* This capability is added for backward compatibility so that old interfaces can be used to leverage the lambda expression capability of Java 8.

### 6. Static Methods in Interfaces.
https://github.com/MidhunBalan/Java8/tree/main/src/com/interfacee/staticmethod

* From 1.8 onwards we can run the interface directly. The reason is we can keep the static method inside the interface
* we can add public static void main(String arg[]) in the interface
* Static Methods in Interface are those methods, which are defined in the interface with the keyword static. 
* Unlike other methods in Interface, these static methods contain the complete definition of the function and since the definition is complete and the method is static, therefore these methods cannot be overridden or changed in the implementation class.

### 7. Predefined Functional Interfaces
1. Predicate
2. Function
3. Consumer
4. Supplier
etc

    ### 7.1 Predicate
    
https://github.com/MidhunBalan/Java8/tree/main/src/com/predicate

* Present in java.util.function package
* Contain only one method - test(T t)
* Return type of test method is boolean

Imp Point to remember:
* Predicate contain only one abstract method and 3 default methods
* abstract method is test() and default methods are negate(), and() and or()
* Predicate join example is here
https://github.com/MidhunBalan/Java8/blob/main/src/com/predicate/Example4.java
* isEquals method available in Predicate
Refer the below oracle documentation to know more about the isEquals method. 
https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

  ### 7.2 Function
  https://github.com/MidhunBalan/Java8/tree/main/src/com/function
* Functions are exactly same as predicates except that functions can return any type of result but function should (can) return only one value and that value can be any type as per our requirement.
* To implement functions oracle people introduced Function interface in 1.8version.
* Function interface present in Java.util.function package.
* Functional interface contains only one method i.e., apply()

Function chaining
* We can combine multiple functions together to form more complex functions.For this Function interface defines the following 2 default methods:
* f1.andThen(f2): First f1 will be applied and then for the result f2 will be applied.
* f1.compose(f2): First f2 will be applied and then for the result f1 will be applied.

IMP: 
Function interface contains a static method. static <T> Function<T,T> identity()
Returns a function that always returns its input argument.

  ### 7.3 Consumer
  https://github.com/MidhunBalan/Java8/tree/main/src/com/consumer
  
  * Sometimes our requirment is we have to provide some input value, perform certain operation, but not required to return anything,then we should go for Consumer.
  * i.e Consumer can be used to consume object and perform certain operation.
  * Consumer Functional Interface contains one abstract method - void accept(T t).

  ### 7.4 Supplier
  https://github.com/MidhunBalan/Java8/tree/main/src/com/supplier
  * Supplier can be used to supply items (objects).
  * Supplier won't take any input and it will always supply objects. 
  * Supplier Functional Interface contains only one method get().


### 8.Two-Argument (Bi) Functional Interfaces
https://github.com/MidhunBalan/Java8/tree/main/src/com/twoargumentinterface

When to use BiPredicate
* If you want to accept only one argument, we can go with predicate
* if you want to accept two argument, we can go with BiPredicate
(Note: In Function interface, it can take one input and one output value as argument, BiPredicate can take two argument)

Normal Functional Interfaces (Predicate, Function and Consumer) can accept only one input argument. But sometimes our programming requirement is to accept two input arguments, then we should go for two-argument functional interfaces.

The following functional interfaces can take 2 input arguments.
* BiPredicate
* BiFunction
* BiConsumer

### 9. Premitive type functional interfaces, unary operator and binary operator


### 10. Method Reference & Constructor Reference by Double Colon(::) Operator.

### 11. Stream API

Methods of streams -

filter method

map method

collect method

count method

sorted method - natural sorting and customizable sorting

min method

max method

forEach method

toArray method

We can also apply stream for group of values and for arrays
1. for group of values, we can go with Stream.of() method
      Example
        Stream<Integer> s = Stream.of(9, 99, 99, 999);
2. For arrays
    Stream<Double> s1 = Stream.of(doubleArray)

### 12. Date & Time API ( Joda API)
LocalDate date = LocalDate.now(); // 2021-03-14
LocalTime time= LocalTime.now(); // 21:21:41.792


### Is Java call by value or call by reference?

Java uses only call by value while passing reference variables as well. It creates a copy of references and passes them as valuable to the methods. As reference points to same address of object, creating a copy of reference is of no harm. But if new object is assigned to reference it will not be reflected.

