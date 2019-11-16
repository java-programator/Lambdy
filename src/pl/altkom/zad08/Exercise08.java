package pl.altkom.zad08;

import java.util.function.DoubleUnaryOperator;

public class Exercise08 {
    public static void main(String[] args) {

        DoubleUnaryOperator f = kwota -> kwota*Math.pow(1.03,10);
        System.out.println(f.applyAsDouble(10000));

        DoubleUnaryOperator f2 = DoubleUnaryOperator.identity();
        DoubleUnaryOperator po1roku = money -> money*1.03;

        for(int i = 0; i < 10 ; i++){
            f2 = f2.andThen(po1roku);
        }

        System.out.println(f2.applyAsDouble(10000));
    }

}
