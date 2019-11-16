package pl.altkom.referencje;

import java.util.concurrent.CompletionService;
import java.util.function.Consumer;

public class Example02 {
    public static void main(String[] args) {
        Consumer<String > printer01 = s-> System.out.println(s);
        Consumer<String> printer02 = System.out::println;

        printer01.accept("Paweł");
        printer02.accept("Andrzej");
    }
}
