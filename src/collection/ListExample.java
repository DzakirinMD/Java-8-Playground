package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListExample {
    public void arrayList() {
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
//        cars.forEach(i -> System.out.println(i));

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

    public void linkedList() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
