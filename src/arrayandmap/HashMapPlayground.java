package arrayandmap;

import java.util.HashMap;

public class HashMapPlayground {

    /**
     * HashMap, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
     */

    public void doHashMapTesting() {

        HashMap<String, String > capitalCities = new HashMap<String, String>();

        // To add into HashMap
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(" To add into HashMap use put() method : " + capitalCities);

        // To check the HashMap size
        System.out.println(" To find out how many items there are, use the size() method: " + capitalCities.size());



        // To access HashMap
        System.out.println( " To access HashMap, use get() method and refer to its key eg: \n capitalCities.get(\"USA\") = " + capitalCities.get("USA"));

        //To print out all the element in the HashMap
        System.out.println(" To print out all the element in the HashMap ");
        for (String i : capitalCities.keySet()) {
            System.out.println(" key: " + i + " value: " + capitalCities.get(i));
        }

        // Remove an Item in HashMap
        System.out.println( " To remove an item  in HashMap, use remove() method and refer to its key eg: \n capitalCities.remove(\"USA\") = " + capitalCities.remove("USA"));
        System.out.println(" USA is removed : " + capitalCities);

        // To remove all items, use the clear() method
        System.out.println(" To remove all items, use the clear() method ");
        capitalCities.clear();
        System.out.println(" The Hashmap is now empty : " + capitalCities);
    }

}
