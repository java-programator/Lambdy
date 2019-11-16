package pl.altkom.zad07;

/*
Napisz funkcję, który policzy sumę liczb Fibonacciego mniejszych od 100.

Dodaj do programu, aby liczył sumę ich kwadratów
Dodaj do programu, aby liczył sumę ich sześcianów

Popraw program, aby liczył sumę liczb pierwszych mniejszych od 100
 */

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Exercise07 {

    private static IntSupplier createFibonacciGenerator() {
        return new IntSupplier() {
            int a = 0;
            int b = 1;

            @Override
            public int getAsInt() {
                int c = a + b;
                b = a;
                a = c;
                return c;
            }
        };
    }

    static IntPredicate isPrime = n -> {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    };

    private static IntSupplier createPrimesGenerator() {
        return new IntSupplier() {
            int a=1;
            @Override
            public int getAsInt() {
                do {
                    a++;
                } while (!isPrime.test(a));
                return a;
            }
        };
    }


    private static int fibonacci(int n) {
        if (n<=1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int countSum(IntSupplier generator, IntFunction<Double> f) {
        int sum = 0;
        int temp = 0;
        while ((temp = generator.getAsInt()) <= 100) {
            System.out.println(temp);
            sum += f.apply(temp);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countSum(createPrimesGenerator(), x -> (double)x));
        System.out.println(countSum(createPrimesGenerator(), x -> (double)x*x));
        System.out.println(countSum(createPrimesGenerator(), x -> (double)x*x*x));
        System.out.println(countSum(createPrimesGenerator(), Math::sqrt));
    }
}
