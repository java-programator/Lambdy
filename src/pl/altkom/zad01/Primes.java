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
class PrimesGenerator implements IntSupplier{
    int number = 2;
    Predicate<Integer> isPrime = x->{
        int i = 2;
        while(i*i<=x){
            if(x%i==0)
                return false;
            i++;
        }
        return true;
    };
    @Override
    public int getAsInt() {
        while(!isPrime.test(number))
            number++;
        int prime = number++;
        return prime;
    }
}
public class Primes {
    public static void main(String[] args) {
        IntSupplier primesGenerator = new PrimesGenerator();
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
