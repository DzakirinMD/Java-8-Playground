import arrayandmap.ArrayListPlayground;
import arrayandmap.HashMapPlayground;
import arrayandmap.HashSetPlayground;
import classes.Calculate;
import classes.EnumLevel;
import classes.LambdaPlayground;
import classes.ThreadPlayground;
import inheritance.child.Car;
import interfaces.impl.AnimalImpl;
import polymorphism.child.Cat;
import polymorphism.child.Dog;
import polymorphism.parent.Animal;

public class PlaygroundMain {

    // Main Method
    public static void main(String[] args) {

        // Standard out
        System.out.println("Hello World!");


//##########################################################################################################################################//
        /**
         * Java Variables
         *                   Variables are containers for storing data values.
         *
         *                           In Java, there are different types of variables, for example:
         *
         *                   String - stores text, such as "Hello". String values are surrounded by double quotes
         *                   int - stores integers (whole numbers), without decimals, such as 123 or -123
         *                   float - stores floating point numbers, with decimals, such as 19.99 or -19.99
         *                   char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
         *                   boolean - stores values with two states: true or false
         *
         *
         * */

        System.out.println("\n------- VARIABLE AND BASIC SECTION -------\n");

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        String header = "";          // String
        //If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        final int myConstantNum = 15;
        //myConstantNum = 20;  // will generate an error: cannot assign a value to a final variable

        System.out.println(" String : " + myText +
                "\n Int : " + myNum +
                "\n Constant : " + myConstantNum +
                "\n Float : " + myFloatNum +
                "\n Char : " + myLetter +
                "\n Boolean : " + myBool);

        // Casting. Type casting is when you assign a value of one primitive data type to another type.
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(" " + myDouble);   // Outputs 9.78
        System.out.println(" Casting double to int : " + myInt);      // Outputs 9

        /**
         * If-Else
         *
         * Java supports the usual logical conditions from mathematics:
         *
         * Less than: a < b
         * Less than or equal to: a <= b
         * Greater than: a > b
         * Greater than or equal to: a >= b
         * Equal to a == b
         * Not Equal to: a != b
         * You can use these conditions to perform different actions for different decisions.
         *
         * Java has the following conditional statements:
         *
         * Use if to specify a block of code to be executed, if a specified condition is true
         * Use else to specify a block of code to be executed, if the same condition is false
         * Use else if to specify a new condition to test, if the first condition is false
         * Use switch to specify many alternative blocks of code to be executed
         */


        int time0 = 22;
        if (time0 < 10) {
            System.out.println(" Good morning.");
        } else if (time0 < 20) {
            System.out.println(" Good day.");
        } else {
            System.out.println(" Good evening.");
        } // Outputs "Good evening."

        //  Ternary Operator. because it consists of three operands.
        // Normal
        int time1 = 20;
        if (time1 < 18) {
            System.out.println(" Good day.");
        } else {
            System.out.println(" Good evening.");
        }

        // Ternary Operator
        int time2 = 20;
        String result = (time2 < 18) ? " Ternary Good day." : " Ternary Good evening.";
        System.out.println(result);

        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(" Array 0 : " + cars[0]);
        System.out.println(" Array lenght is : " + cars.length);

        // Access thru for
        for (int i = 0; i < cars.length; i++) {
            System.out.println(" Array index no : " + i + ", Value : " + cars[i]);
        }

        // Access thru For-Each loop
        for (String i : cars) {
            System.out.println(" " + i);
        }

//##########################################################################################################################################//

        /**
         * Method
         *
         * A method is a block of code which only runs when it is called.
         *
         * You can pass data, known as parameters, into a method.
         *
         * Methods are used to perform certain actions, and they are also known as functions.
         *
         * Why use methods? To reuse code: define the code once, and use it many times.
         */

        header = "\n------- METHOD SECTION -------\n";
        System.out.println(header);

        // calling method in same class
        myMethod();
        checkAge(20);

        // Method Overloading
        // With method overloading, multiple methods can have the same name with different parameters:
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println(" Method Overload plusMethod() int : " + myNum1);
        System.out.println(" Method Overload plusMethod() double : " + myNum2);

//##########################################################################################################################################//

        /**
         * Classes
         */
        header = "\n------- CLASSES AND OBJECT SECTION -------\n";
        System.out.println(header);

        Calculate myObj1 = new Calculate();
        Calculate myObj2 = new Calculate();
        System.out.println(" The myObj1, int x = " + myObj1.x);
        System.out.println(" The myObj2, int x = " + myObj2.x);
        myObj1.x = 55;
        System.out.println(" The myObj1, int x = " + myObj1.x);

        // Calling method in class
        Calculate calcObj = new Calculate();
        int num1 = 5;
        int num2 = 5;
        System.out.println(" Calling method in class to calculate the total " +
                "of " + num1 + " + " + num2 + " = " + calcObj.calculateTwoInteger(num1,num2));

//##########################################################################################################################################//

        header = "\n------- ACCESS MODIFIERS ------ \n";
        System.out.println( header + "\n Accessing public attribute : " + calcObj.publicAttribute);
        System.out.println(" Accessing private attribute thru object method : " + calcObj.showPrivateAtrribute());
        // unable to access protected attribute
        System.out.println(" Static modifier can be accessed without creating an object ");
        staticMethod();


//##########################################################################################################################################//

        /**
         * Encapsulation, is to make sure that "sensitive" data is hidden from users.
         * declare class variables/attributes as private
         * provide public get and set methods to access and update the value of a private variable
         *
         * Inheritance, In Java, it is possible to inherit attributes and methods from one class to another.
         * We group the "inheritance concept" into two categories:
         *
         * subclass (child) - the class that inherits from another class
         * superclass (parent) - the class being inherited from.
         *
         *
         * Polymorphism,
         * Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
         * For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
         */

        header = "\n------- encapsulation, inheritance and polymorphism ------ \n";
        System.out.println(header.toUpperCase());

        header = "\n------- encapsulation -> Getter/Setter ------ \n";
        System.out.println(header.toUpperCase());

        System.out.println(" Using ENCAPSULATION to set a private attribute value ");
        calcObj.setPrivateAttribute(" I'm a private attribute");
        System.out.println(" Using ENCAPSULATION to retrieve a private attribute value : " + calcObj.getPrivateAttribute());

        header = "\n------- inheritance -> extends ------ \n";
        System.out.println(header.toUpperCase());

        Car carObj = new Car();

        System.out.println(" Calling parent method : " + carObj.getBrand());
        carObj.honk();
        System.out.println(" Calling child method : " + carObj.getModelName());

        header = "\n------- Polymorphism -> extends (same method but different implementation) ------ \n";
        System.out.println(header.toUpperCase());

        Animal animalObj = new Animal();
        Animal dogObj = new Dog();
        Animal catObj = new Cat();
        animalObj.animalSound();
        dogObj.animalSound();
        catObj.animalSound();

//##########################################################################################################################################//

        /**
         * Interface and Abstraction
         * Data abstraction is the process of hiding certain details and showing only essential information to the user.
         * Abstraction can be achieved with either abstract classes or interfaces.
         *
         * Why And When To Use Abstract Classes and Methods?
         * To achieve security - hide certain details and only show the important details of an object.
         */

        header = "\n------- Abstraction -> implements ------- \n";
        System.out.println(header.toUpperCase());
        AnimalImpl animalImplObj = new AnimalImpl();
        animalImplObj.animalSound();
        animalImplObj.actionSleep();

//##########################################################################################################################################//

        /**
         * Enums
         * An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
         * eg: instead of public class Level, its public enum Level
         */

        header = "\n------- enums ------- \n";
        System.out.println(header.toUpperCase());
        EnumLevel enumLevelObj = EnumLevel.LOW;
//        EnumLevel enumLevelObjLow = EnumLevel.LOW;
//        EnumLevel enumLevelObjMedium = EnumLevel.MEDIUM;
//        EnumLevel enumLevelObjHigh = EnumLevel.HIGH;
        switch(enumLevelObj) {
            case LOW:
                System.out.println("Low level");
                System.out.println(enumLevelObj);
                break;
            case MEDIUM:
                System.out.println("Medium level");
                System.out.println(enumLevelObj);
                break;
            case HIGH:
                System.out.println("High level");
                System.out.println(enumLevelObj);
                break;
        }

//##########################################################################################################################################//

        header = "\n------- Array and Map/HashMap -------";
        System.out.println(header.toUpperCase());

        System.out.println("------- Arraylist section -------");
        ArrayListPlayground arrayListPlaygroundObj = new ArrayListPlayground();
        arrayListPlaygroundObj.doArrayListTesting();

        System.out.println("\n------- HashMap section -------");
        HashMapPlayground hashMapPlaygroundObj = new HashMapPlayground();
        hashMapPlaygroundObj.doHashMapTesting();

        System.out.println("\n------- HashSet section -------");
        HashSetPlayground hashSetPlaygroundObj = new HashSetPlayground();
        hashSetPlaygroundObj.doHashSetTesting();

//##########################################################################################################################################//

        /**
         * Java Exceptions
         * When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
         * When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).
         *
         * The finally statement lets you execute code, after try...catch, regardless of the result:
         */

        header = "\n------- exception handlings -------";
        System.out.println(header.toUpperCase());

        try {

            int[] myNumbers = {1, 2, 3};
            System.out.println(" Index 2 is still in range " + myNumbers[2]);
            System.out.println(myNumbers[10]); // error!
        } catch (Exception e){
            System.out.println(" Index 10 is out of range !!!");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
//        checkAgeWithException(2);

//##########################################################################################################################################//

        /**
         * Java Threads
         * Threads allows a program to operate more efficiently by doing multiple things at the same time.
         *
         * Threads can be used to perform complicated tasks in the background without interrupting the main program.
         */

        header = "\n------- java threads -------";
        System.out.println(header.toUpperCase());

        ThreadPlayground threadPlaygroundObj = new ThreadPlayground();
        threadPlaygroundObj.start();
//        threadPlaygroundObj.run();

//##########################################################################################################################################//

        /**
         * Lambda Expressions were added in Java 8.
         *
         * A lambda expression is a short block of code which takes in parameters and returns a value.
         * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
         *
         * The simplest lambda expression contains a single parameter and an expression:
         * parameter -> expression
         * (parameter1, parameter2) -> expression
         *
         * Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for.
         * In order to do more complex operations, a code block can be used with curly braces.
         * If the lambda expression needs to return a value, then the code block should have a return statement.
         * (parameter1, parameter2) -> { code block }
          */

        header = "\n------- java lambda -------";
        System.out.println(header.toUpperCase());

        LambdaPlayground lambdaPlaygroundObj = new LambdaPlayground();
        lambdaPlaygroundObj.doLambdaTesting();


    }


//##########################################################################################################################################//

    // Basic method
    static void myMethod() {
        System.out.println(" Calling method in this class, myMethod() is executed !!");
    }

    // Method with parameters.
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println(" Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println(" Access granted - You are old enough!");
        }

    }

    // Method Overloading -> 2 method with same name
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static void staticMethod(){
        System.out.println(" Im a Static method ! and i dont need and object ! ");
    }

    // Try and Catch Method
    static void checkAgeWithException(int age){
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
