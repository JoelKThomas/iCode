# Core Java 2

#### * **Hashcode and equals**


| equals                                                                                                                                 | hashCode                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| **equals** is a method in Java that acts similar to the == operator, which is to test for object identity rather than object equality. | **hashCode** is a method by which a class implicitly or explicitly break down the data stored in an instance of the class into a single hash value. |
| The method equals is used to compare two objects.                                                                                      | The method is used in hashing to decide which group an object should be placed into.                                                                |

* super keyword

The super keyword in java is a reference variable that is used to refer parent class objects.
The keyword “super” came into the picture with the concept of Inheritance.
It is majorly used in the following contexts:

1. **Use of super with variables**:
   This scenario occurs when a derived class and base class has same data members.
   In that case there is a possibility of ambiguity for the JVM. We can understand it more clearly using this code snippet:

```
/* Base class vehicle */
class Vehicle
{
    int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle
{
    int maxSpeed = 180;

    void display()
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

/* Driver program to test */
class Test
{
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
```

Output:

Maximum Speed: 120

2. **Use of super with methods**: This is used when we want to call parent class method.

```
/* Base class Person */
class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
}

/* Subclass Student */
class Student extends Person
{
    void message()
    {
        System.out.println("This is student class");
    }

    // Note that display() is only in Student class
    void display()
    {
        // will invoke or call current class message() method
        message();

        // will invoke or call parent class message() method
        super.message();
    }
}

/* Driver program to test */
class Test
{
    public static void main(String args[])
    {
        Student s = new Student();

        // calling display() of Student
        s.display();
    }
}
```

Output:

This is student class
This is person class

3. **Use of super with constructors**: super keyword can also be used to access the parent class constructor. One more important thing is that, ‘’super’ can call both parametric as well as non parametric constructors depending upon the situation. Following is the code snippet to explain the above concept:

```
/* superclass Person */
class Person
{
    Person()
    {
        System.out.println("Person class Constructor");
    }
}

/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

/* Driver program to test*/
class Test
{
    public static void main(String[] args)
    {
        Student s = new Student();
    }
}

```

Output:

Person class Constructor

Student class Constructor

#### * Dependency Injection - TODO

#### * Stereotypes annotation - TODO

#### * equals and == - TODO

#### * Abstract Class - TODO
