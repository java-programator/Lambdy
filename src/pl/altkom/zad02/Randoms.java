package pl.altkom.zad02;

import java.util.function.IntSupplier;

/*
 Stwórz obiekt IntSupplier, który bedzie generował losowy numer buta,
 czyli liczbę całkowitą z przedziału 35-48
 */

public class Randoms {
    public static void main(String[] args) {
        IntSupplier randomGenerator = null;
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
        System.out.println(randomGenerator.getAsInt());
    }
}
