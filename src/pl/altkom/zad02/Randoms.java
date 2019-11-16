package pl.altkom.zad02;

import java.util.Random;
import java.util.function.IntSupplier;

/*
 Stwórz obiekt IntSupplier, który bedzie generował losowy numer buta,
 czyli liczbę całkowitą z przedziału 35-48
 */
//
public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier randomGenerator = () -> {
            return random.nextInt(48 - 35 + 1) + 35;
        };
        IntSupplier nextRandomGenerator =
                () -> random.nextInt(48 - 35 + 1) + 35;
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
    }
}
