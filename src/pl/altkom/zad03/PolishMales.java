package pl.altkom.zad03;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
Popraw program, tak aby wypisał pisarzy narodowości polskiej
 */
public class PolishMales {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Predicate<Writer> polish = null;
        Predicate<Writer> male = null;
        Predicate<Writer> polishMale = null;
        Consumer<Writer> printer = null;
        writers.removeIf(polishMale);
        writers.forEach(printer);

    }
}
