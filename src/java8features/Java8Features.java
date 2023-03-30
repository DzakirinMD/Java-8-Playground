package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Some of the important Java 8 features are;
 * <p>
 * -> forEach() method in Iterable interface
 * -> default and static methods in Interfaces
 * -> Functional Interfaces and Lambda Expressions
 * -> Java Stream API for Bulk Data Operations on Collections
 * -> Java Time API
 * -> Collection API improvements
 * -> Concurrency API improvements
 * -> Java IO improvements
 */

public class Java8Features {

    public static void main(String[] args) {
        // forEach() method in Iterable interface
        System.out.println("\n------- forEach() method in Iterable interface ------ \n");
        forEachSample();

        // Java Stream API for Bulk Data Operations on Collections
        System.out.println("\n------- Java Stream API for Bulk Data Operations on Collections ------ \n");
        JavaStreamAPI javaStreamAPI = new JavaStreamAPI();
        javaStreamAPI.BulkDataOperationOnCollections();
    }

    static void forEachSample() {
        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        //traversing using Iterator (OLD WAY)
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });

        //traversing with Consumer interface implementation
        CustomConsumer action = new CustomConsumer();
        myList.forEach(action);
    }
}