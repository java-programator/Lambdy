package pl.altkom.referencje;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Example04 {
    public static void main(String[] args) {
        Random r = new Random();

        IntSupplier randomRenerator1 =
                () -> r.nextInt();
        IntSupplier randomGenerator2 =
                r::nextInt;
        IntUnaryOperator randomGenerator3 =
                r::nextInt;
    }
}
