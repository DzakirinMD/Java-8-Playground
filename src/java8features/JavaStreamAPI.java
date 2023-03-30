package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamAPI {
    public void BulkDataOperationOnCollections() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        //using lambda in forEach
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

    }
}
