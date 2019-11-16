package pl.altkom.zad01;

import java.util.function.IntPredicate;
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
    private static int currentNumber =1;
    public static void main(String[] args) {

        IntPredicate isPrime = n->{
            if(n<=1) return false;
            for(int i = 2; i*i <=n; i++)
            {
                if(n%i==0)return false;
            }
            return true;
        };

        IntSupplier primesGenerator = () -> {
            do{
                currentNumber++;
            }while(!isPrime.test(currentNumber));
            return currentNumber;
        };

        IntSupplier primesGenerator2 = new IntSupplier() {
            int a;
            @Override
            public int getAsInt() {
                do{
                    a++;
                }while (!isPrime.test(a));
                return a;
            }
        };

        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator2.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator2.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator2.getAsInt());
        System.out.println(primesGenerator.getAsInt());
        System.out.println(primesGenerator2.getAsInt());
        System.out.println(primesGenerator2.getAsInt());
    }
}
