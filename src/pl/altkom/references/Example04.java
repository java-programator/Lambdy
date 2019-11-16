package pl.altkom.references;

import java.util.Random;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Example04 {

    public static void main(String[] args) {
        Random r = new Random();

        IntSupplier randomGenerator1 = () -> r.nextInt();

        IntSupplier randomGenerator2 = r::nextInt;

        UnaryOperator<Integer> randomGenerator3 = r::nextInt; //albo:
        IntUnaryOperator randomGenerator4 = r::nextInt;

        System.out.println(randomGenerator3.apply(5));
        System.out.println(randomGenerator4.applyAsInt(9));

    }

}
