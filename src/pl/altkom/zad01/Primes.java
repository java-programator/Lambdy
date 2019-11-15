package pl.altkom.zad01;

import java.util.function.IntSupplier;
import java.util.function.Predicate;

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
    static int i = 2;
    public static void main(String[] args) {

        Predicate<Integer> primeChecker = x -> {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };

        IntSupplier primesGenerator = () -> {
            while(true) {
                if (primeChecker.test(i)) {
                    i++;
                    return i - 1;
                } else {
                    i++;
                }
            }
        };
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
