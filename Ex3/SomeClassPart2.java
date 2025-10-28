public class SomeClassPart2 {
    public static void main (String[] args){
        SomeClass obj1 = new SomeClass();
        SomeClass obj2 = new SomeClass();
        // SomeClass obj3 = new SomeClass();
        
        obj1.number1 = 1;
        obj1.number2 = 1;

        obj2.number1 = 99;
        obj2.number2 = 99;

        /* Test out if it true
        obj3.number1 = 50;
        obj3.number2 = 77;
         */

        System.out.println("obj 1 number 1: " + obj1.number1);
        System.out.println("obj 1 number 2: " + obj1.number2);
        System.out.println("obj 2 number 1: " + obj2.number1);
        System.out.println("obj 2 number 2: " + obj2.number2);

        /*
        System.out.println("obj 3 number 1: " + obj3.number1);
        System.out.println("obj 3 number 2: " + obj3.number2);
         */
    }
}

/*
    The output are:
        obj 1 number 1: 99
        obj 1 number 2: 1
        obj 2 number 1: 99
        obj 2 number 2: 99

    Also we got a warning "The static field SomeClass.number1 should be accessed in a static way".
    - This is cause because static var belong to the class. Thus only one copy will exist. As the static var will be shared with all objs of the class.
    - Meaning the newsest object that able to access the static var will change to the new value and it will be seen by all object.
    - You can test it out via uncomment the code.
 */


