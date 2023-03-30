package java8features;

import java.util.function.Consumer;

public class CustomConsumer implements Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }
}
