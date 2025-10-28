public class SomeClass{ //This is the class
    public static int number1 = 1; // This is the class static var
    public int number2 = 2; // This is the instance var
    // In Java, the static variables for a class are initialized or reset whenever the class is loaded. i.e. At the start of the execution.
    // Instance var will be available for the programmer after an object of the class is created.
}

/*
    public static int number1
        - Belongs to the class, not to any specific object.
        - Shared by all instances of SomeClass.
        - You can access it directly using SomeClass.number1.

    public int number2
        - Belongs to each instance (object) of the class.
        - Every object has its own separate copy.
        - You can access it with someObject.number2.

    Summary correction:
        - number1 → class variable (static)
        - number2 → instance variable (non-static)
        - Instance variables are available after you create an object of the class. 
*/