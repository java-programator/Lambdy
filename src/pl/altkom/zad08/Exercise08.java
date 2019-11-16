package pl.altkom.zad08;

import java.util.function.DoubleUnaryOperator;

public class Exercise08 {
    public static void main(String[] args) {
        DoubleUnaryOperator f = DoubleUnaryOperator.identity();
        DoubleUnaryOperator po1roku = money -> 1.03*money;

        for (int i = 0; i < 10; i++) {
            f = f.andThen(po1roku);
        }

        System.out.println(f.applyAsDouble(10000));

    }
}
