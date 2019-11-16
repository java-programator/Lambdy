package pl.altkom.zad09;

import pl.altkom.Writer;

import java.util.Comparator;
import java.util.List;

public class SortingWriters {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();

        Comparator<Writer> comparator1 =
                (w1, w2) -> {
                    Double r1 = w1.getRank();
                    Double r2 = w2.getRank();
                    int result = r1.compareTo(r2);
                    if (result == 0) {
                        return w1.getName().compareTo(w2.getName());
                    } else {
                        return result;
                    }
                };

        Comparator<Writer> comparator2
                = Comparator.comparing(Writer::getRank);
        Comparator<Writer> comparator3
                = Comparator.comparing(Writer::getName);

        Comparator<Writer> comparator4
                = comparator2.thenComparing(comparator3).reversed();

        writers.sort(comparator1);
        writers.forEach(System.out::println);

    }
}
