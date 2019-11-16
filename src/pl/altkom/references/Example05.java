package pl.altkom.references;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example05 {
    public static void main(String[] args) {
        Date d = new Date();

        Supplier<Date> dateGenerator
                = Date::new;

        Function<Long, Date> dateGenerator2
                = Date::new;
        System.out.println(dateGenerator2.apply(679061347525l));

    }
}
