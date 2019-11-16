package pl.altkom.zad08;

import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;

public class Exercise08 {


    public static void main(String[] args) {
        DoubleUnaryOperator f = DoubleUnaryOperator.identity();
        DoubleUnaryOperator po1roku = x -> x*1.03;

        for (int i = 0; i < 10; i++){
            f = f.andThen(po1roku);
        }



    }
}
