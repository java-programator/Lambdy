package pl.altkom.referencje;

import java.util.function.Function;

//interface Function<T,W> {
//    W apply(T t);
//}

public class Example01 {
    public static void main(String[] args) {
        Function<Integer, String> f01 =
                i -> String.valueOf(i);
        Function<Integer, String> f02 =
                String::valueOf;

        Integer I = 6;
        System.out.println(f01.apply(I));
        System.out.println(f02.apply(I));
    }
}
