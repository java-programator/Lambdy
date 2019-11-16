package pl.altkom.zad06;

import org.w3c.dom.ls.LSOutput;
import pl.altkom.Writer;

import java.util.Comparator;
import java.util.List;

public class WriterSort {

    public static void main(String[] args) {

        List<Writer> writers = Writer.generateListOfWriters();
        Comparator<Writer> comparator = (w1, w2) ->
        {
            Double d1 = w1.getRank();
            Double d2 = w2.getRank();
            int result = d1.compareTo(d2);
            if (result ==0){
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
                = comparator2.thenComparing(comparator3);

        writers.sort(comparator4);
        writers.forEach(System.out::println);

    }


}
