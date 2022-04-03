package arrayandmap;

import java.util.HashSet;

public class HashSetPlayground {

    /**
     * A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
     */

    public void doHashSetTesting() {

        HashSet<String> cars = new HashSet<String>();

        // To add into HashSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(" To add into HashSet use ad() method : " + cars);

        // To check the HashMap size
        System.out.println(" To find out how many items there are, use the size() method: " + cars.size());

        // To check whether an item exists in a HashSet, use the contains() method:
        System.out.println(" To check whether an item exists in a HashSet, use the contains() method: " + cars.contains("BMW"));

        // Remove an Item in HashSet
        System.out.println( " To remove an item  in HashSet, use remove() method and refer to its key eg: \n cars.remove(\"BMW\") = " + cars.remove("BMW"));
        System.out.println(" BMW is removed : " + cars);

        // To remove all items, use the clear() method
        System.out.println(" To remove all items, use the clear() method ");
        cars.clear();
        System.out.println(" The HashSet is now empty : " + cars);

    }
}
