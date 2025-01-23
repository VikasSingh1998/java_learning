Key Features of Abstract Classes in Java:
===========================================
1. Cannot Be Instantiated ==> 
   You cannot create objects of an abstract class directly.
   Example: 
      abstract class Shape { }
      Shape shape = new Shape(); // This is not allowed.

2. Can Have Abstract Methods ==> 
   An abstract method is a method without a body (implementation). Subclasses must implement these methods.
   Example:
      abstract class Shape {
          abstract void draw(); // Abstract method
      }

3. Can Have Concrete Methods (Fully Defined) ==> 
   Abstract classes can have methods with full implementations, unlike interfaces.
   Example:
    abstract class Shape {
        void printInfo() {
            System.out.println("This is a shape.");
        }
    }

4. Can Have Fields and Constructors ==> 
   Abstract classes can have instance variables and constructors, just like normal classes.
   Example:
   abstract class Shape {
      String color;
  
      Shape(String color) {
          this.color = color;
      }
  }

5. Used for Inheritance ==>
Abstract classes are often used as base classes in an inheritance hierarchy.

=============================================================================================================
Abstract Class vs Interface:
=============================
Feature	                         Abstract Class	                                     Interface
--------------------     -----------------------------------------          ----------------------------------
Instantiation             	 Cannot be instantiated	                           Cannot be instantiated
Abstract Methods	          Can have both abstract and concrete methods     	All methods are abstract (prior to Java 8)
Fields	                   Can have fields	                                 Can have only static final fields
Multiple Inheritance	       A class can inherit only one abstract class	      A class can implement multiple interfaces
Constructor	                Can have constructors	                           Cannot have constructors

In general, you use an abstract class when objects share common behaviors 
or states and an interface when unrelated classes need to share behavior.

