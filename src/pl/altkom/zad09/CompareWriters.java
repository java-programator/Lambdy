package pl.altkom.zad09;

import org.w3c.dom.ls.LSOutput;
import pl.altkom.Writer;

import java.util.Comparator;
import java.util.List;

public class CompareWriters {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();

        Comparator<Writer> comparator =
                (w1, w2)->{
            Double r1 = w1.getRank();
            Double r2 = w2.getRank();
            int result = r1.compareTo(r2);

            /*if (w1.getRank() - w2.getRank() == 0){
                return w1.getName().compareTo(w2.getName());
            }else{
                if (w1.getRank() - w2.getRank() > 0){
                    return 1;
                }else{
                    return -1;
                }
            }*/
            return result;
                };

        writers.sort(comparator);
        writers.forEach(System.out::println);

    }
}
