package pl.altkom.referencje;

import java.util.Date;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example05 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Supplier<Date> dataGenerator =
                Date::new;

        Function<Long, Date> dateFunction = Date::new;
    }
}
