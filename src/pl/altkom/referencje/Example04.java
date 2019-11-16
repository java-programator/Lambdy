package pl.altkom.referencje;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.UnaryOperator;

public class Example04 {
    public static void main(String[] args) {
        Random r = new Random();

        IntSupplier randomGenerator1 = ()-> r.nextInt();

        //referencja na funkcje bezargumentowa
        IntSupplier randomGenerator2 = r::nextInt;

       //referacnja na funkcje z argumentem "bound"
        UnaryOperator<Integer> randomGenerator3 = r::nextInt;

    }
}
