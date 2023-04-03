package collection;

/**
 * "Collections is a utility classes". Iterating, sorting, and searching are most widelyy used collections functions
 * Below are some Popular Collections:
 * Map      ---> HashMap
 * List     ---> ArrayList, LinkedList
 * Set      ---> HashSet, TreeSet
 * Queue    ---> PriorityQueue
 * Iterator
 */
public class Collections {
    public static void main(String[] args) {

        // Set example
        System.out.println("\n------- Set Example -------");
        SetExample setExample = new SetExample();
        setExample.hashSet();
        setExample.treeSet();

        // List example
        System.out.println("\n------- List Example -------");
        ListExample listExample = new ListExample();
        listExample.arrayList();
        listExample.linkedList();
    }
}