package arrayandmap;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPlayground {

    /**
     * The ArrayList class is a resizable array, which can be found in the java.util package.
     * ArrayList store items as an ordered collection, and you have to access them with an index number (int type).
     *
     * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
     * (if you want to add or remove elements to/from an array, you have to create a new one).
     * While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
     */

    public void doArrayListTesting() {
        ArrayList<String> cars = new ArrayList<String>();

        // To add into ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println( " The cars ArrayList consist of : " + cars);

        // To access ArrayList
        System.out.println( " To access ArrayList, use get() method and refer to the index. eg: \n cars.get(1) = " + cars.get(1));

        // To modify ArrayList
        System.out.println( " To modify ArrayList, use set() method and refer to the index. eg:");
        cars.set(1, "Perodua");
        System.out.println( " cars.get(1) = " + cars.get(1));

        // To remove an element in ArrayList
        System.out.println( " To remove an element in ArrayList, use remove() method and refer to the index.");
        cars.remove(0);
        System.out.println( " The Volvo has been removed, since its at index 1 " + cars);

        //To find the size of ArrayList
        System.out.println(" To find out how many elements an ArrayList have, use the size method: " + cars.size());

        //To print out all the element in the ArrayList
        System.out.println("\nTo loop through all the element in the ArrayList : ");
        // 2 ways to do it. by using for loop or for-each loop
        // 1. using for loop
        for (int i = 0 ; i < cars.size() ; i ++){
            System.out.println(" Array index no : " + i + ", Value : " + cars.get(i));
        }
        // 2. using for-each loop
//        for (String i : cars){
//            System.out.println(i);
//        }

        //To sort ArrayList
        System.out.println("\nThe ArrayList has been sorted using Collections.sort() : ");
        Collections.sort(cars);
        for (String i : cars){
            System.out.println(" " + i);
        }

        //To remove all the elements in the ArrayList
        System.out.println("To remove all the elements in the ArrayList, use the clear() method: ");
        cars.clear();
        System.out.println( " The cars ArrayList is now empty : " + cars);



    }
}
