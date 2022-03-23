public class PlaygroundMain {

    public static void main(String[] args) {

        // Standard out
        System.out.println("Hello World!");

        /*
          Java Variables
                  Variables are containers for storing data values.

                          In Java, there are different types of variables, for example:

                  String - stores text, such as "Hello". String values are surrounded by double quotes
                  int - stores integers (whole numbers), without decimals, such as 123 or -123
                  float - stores floating point numbers, with decimals, such as 19.99 or -19.99
                  char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
                  boolean - stores values with two states: true or false
         */

        String name = "String Name";
        int myNum = 15;
        //If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        final int myConstantNum = 15;
        //myConstantNum = 20;  // will generate an error: cannot assign a value to a final variable

        System.out.println(name + " " + myNum + " " + myConstantNum);

    }
}
