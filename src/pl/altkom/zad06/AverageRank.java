package pl.altkom.zad06;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
Popraw poniższy program, aby wypisał średnią (arytmetyczną) ocen wszystkich pisarzy (kobiet i mężczyzn)
 */

public class AverageRank {

    public static double getAverageRank(List<Writer> writers) {
        Function<List<Writer>, Double> average = (lista->{
            double sum = 0.0;
            for(Writer w : lista){
                sum += w.getRank()/lista.size();
            }
                return sum;
        });
        return average.apply(writers);
    }
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        System.out.println(getAverageRank(writers));
    }
}
