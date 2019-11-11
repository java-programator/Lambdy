package pl.altkom.zad04;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/*
Popraw program, aby wypisał pisarzy z zaktualizowaną oceną:
- mężczyznom odejmij punkt
- kobietom dodaj punkt
 */
public class ReRank {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Consumer<Writer> printer = null;
        UnaryOperator<Writer> updater = null;
        writers.replaceAll(updater);
        writers.forEach(printer);
    }
}
