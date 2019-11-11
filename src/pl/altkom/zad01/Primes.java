package pl.altkom.zad01;

import java.util.function.IntSupplier;

/*
    Stwórz obiekt klasy IntSupplier, który będzie generował kolejne liczby pierwsze
    Oczekiwanym wyjściem z poniższego programu powinno byc:
    2
    3
    5
    7
    11
    13
    17
    19
    23

    Hint: Rozwiązanie z wykorzystaniem wyrażenia lambda jest trikowe i nieoczywiste, spróbuj inaczej
    Hint: Stwórz pomocniczy predykat, który wykorzystasz do sprawdzenia, czy liczba jest pierwsza
 */

public class Primes {
    public static void main(String[] args) {
        IntSupplier primesGenerator = null;
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator.getAsInt());
    }
}
