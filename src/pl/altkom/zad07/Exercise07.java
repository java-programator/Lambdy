package pl.altkom.zad07;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.UnaryOperator;

public class Exercise07 {

    private static int getFibonacci(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
            {
            return getFibonacci(n-1) + getFibonacci(n-2);
        }
    }

    public static int fibSum(IntFunction<Double> f){
        int suma = 0;
        for (int i =0; getFibonacci(i) < 100; i++){
            suma += f.apply(getFibonacci(i));
        }
        return suma;
    }

    private static IntPredicate isPrime = n -> {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    };

    public static int primeSum(IntFunction<Integer> f){
        int suma = 0;
        for (int i = 0; i < 100; i++){
            if (isPrime.test(i)){
                suma += i;
            };
        }
        return suma;
    }



    public static void main(String[] args) {
        System.out.println(primeSum(x -> x));

    }




}
