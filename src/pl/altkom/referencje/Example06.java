package pl.altkom.referencje;

import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class Example06 {

    private static int fibonacci(int n) {
        if (n <= 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static int countSum() {
        int sum = 0;
        for (int i = 0; fibonacci(i) <= 100; i++) {
            System.out.println(fibonacci(i));
            sum += fibonacci(i);
        }
        return sum;
    }

    public static int countSumWithProperties(IntFunction<Double> f) {
        int sum = 0;
        for (int i = 0; fibonacci(i) <= 100; i++) {
            sum += f.apply(fibonacci(i));
        }
        return sum;
    }

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

    public static int countSumWithProperties2(IntSupplier generator, IntFunction<Double> f) {
        int sum = 0;
        int temp = 0;
        while ((temp = generator.getAsInt()) <= 100) {
            System.out.println(temp);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countSum());
        System.out.println(countSumWithProperties(x -> (double) x));
        System.out.println(countSumWithProperties(x -> (double) x * x * x));

        System.out.println(countSumWithProperties2(createFibonacciGenerator(), x -> (double) x));

    }
}