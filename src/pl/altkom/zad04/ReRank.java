package pl.altkom.zad04;

import pl.altkom.Gender;
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
        Consumer<Writer> printer = x -> System.out.println(x);
        UnaryOperator<Writer> updater = x -> {
            if ((x.getGender() == Gender.MALE)) {
                x.setRank(x.getRank() - 1);
            } else {
                x.setRank(x.getRank() + 1);
            }
            ; return x;};

        writers.replaceAll(updater);
        writers.forEach(printer);
    }
}
