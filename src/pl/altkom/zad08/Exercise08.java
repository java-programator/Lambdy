package pl.altkom.zad08;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Exercise08 {
    public static void main(String[] args) {
        //DoubleUnaryOperator start = money ->money;
        DoubleUnaryOperator f = money -> {
            for (int i = 0; i < 10; i++) {
                money=1.03*money;
            }
            return money;
        };

        System.out.println(f.applyAsDouble(10000));

        }


    }
