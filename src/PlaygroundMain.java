import classes.Calculate;

public class PlaygroundMain {

    public static void main(String[] args) {

        // Standard out
        System.out.println("Hello World!");

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


        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        //If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        final int myConstantNum = 15;
        //myConstantNum = 20;  // will generate an error: cannot assign a value to a final variable

        System.out.println("\n String : " + myText +
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

        System.out.println("\n------- METHOD SECTION -------\n");

        myMethod();
        checkAge(20);

        // Method Overloading
        // With method overloading, multiple methods can have the same name with different parameters:
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println(" Method Overload plusMethod() int : " + myNum1);
        System.out.println(" Method Overload plusMethod() double : " + myNum2);

        System.out.println("\n------- CLASSES AND OBJECT SECTION -------\n");

        Calculate myObj1 = new Calculate();
        Calculate myObj2 = new Calculate();
        System.out.println(" The myObj1, int x = " + myObj1.x);
        System.out.println(" The myObj2, int x = " + myObj2.x);
        myObj1.x = 55;
        System.out.println(" The myObj1, int x = " + myObj1.x);


    }

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
}
