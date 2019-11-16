package pl.altkom.referencje;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

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
    public static long countSumWithProperties(IntFunction<Double> f){
        long sum = 0L;
        for (int i = 0; fibonacci(i) <= 100; i++) {
            sum+=f.apply(fibonacci(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(countSum());
        System.out.println(countSumWithProperties(x->(double)x));
        System.out.println(countSumWithProperties(x->(double)x*x*x));

        


    }
}