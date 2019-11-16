package pl.altkom.zad09;

import pl.altkom.Writer;

import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class WritersSort{

    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();

        Comparator<Writer> comparator = (w1,w2 ) ->{
            if(w1.getRank() - w2.getRank() ==0){
                return w1.getName().compareTo(w2.getName());
            }else{
                if(w1.getRank() - w2.getRank()>0){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Comparator<Writer> comparator2 = (w1,w2 ) ->{
            Double r1 = w1.getRank();
            Double r2 = w2.getRank();
            int result = r1.compareTo(r2);
            if(result ==0){
                return w1.getName().compareTo(w2.getName());
            }else{
                return result;
            }
        };

        Comparator<Writer> comparator3 = Comparator.comparing(Writer::getRank);

        Comparator<Writer> comparator4 = Comparator.comparing(Writer::getName);

        Comparator<Writer> comparator5 = comparator2.thenComparing(comparator3).reversed();

        writers.sort(comparator5);
        writers.forEach(System.out::println);
    }
}
